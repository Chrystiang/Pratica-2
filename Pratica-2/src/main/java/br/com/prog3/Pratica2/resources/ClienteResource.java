package br.com.prog3.Pratica2.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.prog3.Pratica2.domain.Cliente;
import br.com.prog3.Pratica2.dto.ClienteDTO;
import br.com.prog3.Pratica2.service.ClienteService;

@RestController
@RequestMapping("/api/v1/clientes")

public class ClienteResource {
	@Autowired
    private ClienteService clienteService;
	
	@PostMapping
	public Cliente save(@RequestBody Cliente cliente){
	     return clienteService.save(cliente);
	}
	
	@GetMapping
	public ResponseEntity<List<ClienteDTO>> findAll() {
		List<ClienteDTO> clientes = clienteService.findAll(); 
		if (clientes == null || clientes.isEmpty()) {
			return new ResponseEntity<List<ClienteDTO>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<ClienteDTO>>(clientes, HttpStatus.OK);
	}
	
	@GetMapping(path = {"/{id}"})
	public Optional<Cliente> findById(@PathVariable("id") Long id){
       return clienteService.findById(id);
    }
	
	@PutMapping(value="/{id}")
	public Cliente update(@PathVariable("id") Long id, @RequestBody Cliente cliente) {
		Optional<Cliente> optional = clienteService.findById(id); 
		if(optional.isPresent()) {
			Cliente c = optional.get();
			c.setCpf(cliente.getCpf());
			c.setNome(cliente.getNome());
			c.setDataNascimento(cliente.getDataNascimento());
			c.setCarro(cliente.getCarro());
			clienteService.update(c);
			return c;
	    } else {
	    	throw new RuntimeException("Não foi possível alterar registro");
	    }
	}
	
	@DeleteMapping(path ={"/{id}"})
	public void delete(@PathVariable("id") Long id) {
		clienteService.deleteById(id);
    }
	
	@GetMapping(path = {"/cpf/{cpfCliente}"})
	public ResponseEntity<?> findByCpf(@PathVariable("cpfCliente") String cpf){ 
		List<Cliente> clientes = clienteService.findByCpf(cpf); 
		return clientes.isEmpty() 
			? ResponseEntity.noContent().build() 
			: ResponseEntity.ok(clientes);
	}

}