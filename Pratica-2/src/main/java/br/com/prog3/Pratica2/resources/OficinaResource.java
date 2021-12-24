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

import br.com.prog3.Pratica2.domain.Oficina;
import br.com.prog3.Pratica2.dto.OficinaDTO;
import br.com.prog3.Pratica2.enums.CodigoOficina;
import br.com.prog3.Pratica2.service.OficinaService;

@RestController
@RequestMapping("/api/v1/oficinas")

public class OficinaResource {
	@Autowired
    private OficinaService oficinaService;
	
	@PostMapping
	public Oficina save(@RequestBody Oficina oficina){
	     return oficinaService.save(oficina);
	}
	
	@GetMapping
	public ResponseEntity<List<OficinaDTO>> findAll() {
		List<OficinaDTO> oficinas = oficinaService.findAll(); 
		if (oficinas == null || oficinas.isEmpty()) {
			return new ResponseEntity<List<OficinaDTO>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<OficinaDTO>>(oficinas, HttpStatus.OK);
	}
	
	@GetMapping(path = {"/{id}"})
	public Optional<Oficina> findById(@PathVariable("id") Long id){
       return oficinaService.findById(id);
    }
	
	@PutMapping(value="/{id}")
	public Oficina update(@PathVariable("id") Long id, @RequestBody Oficina oficina) {
		Optional<Oficina> optional = oficinaService.findById(id); 
		if(optional.isPresent()) {
			Oficina c = optional.get();
			c.setCodigoOficina(oficina.getCodigoOficina());
			c.setNome(oficina.getNome());
			c.setEspecialidade(oficina.getEspecialidade());
			c.setEndereco(oficina.getEndereco());
			c.setCarro(oficina.getCarro());
			oficinaService.update(c);
			return c;
	    } else {
	    	throw new RuntimeException("Não foi possível alterar registro");
	    }
	}
	
	@DeleteMapping(path ={"/{id}"})
	public void delete(@PathVariable("id") Long id) {
		oficinaService.deleteById(id);
    }
	
	@GetMapping(path = {"/codigoOficina/{codigoOficina}"})
	public ResponseEntity<?> findByCodigoOficina(@PathVariable("codigoOficina") CodigoOficina codigoOficina){ 
		List<Oficina> oficinas = oficinaService.findByCodigoOficina(codigoOficina); 
		return oficinas.isEmpty() 
			? ResponseEntity.noContent().build() 
			: ResponseEntity.ok(oficinas);
	}

}