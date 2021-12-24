package br.com.prog3.Pratica2.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.prog3.Pratica2.domain.Cliente;
import br.com.prog3.Pratica2.dto.ClienteDTO;
import br.com.prog3.Pratica2.repository.ClienteRepository;

@Service
public class ClienteService {
	@Autowired
    private ClienteRepository clienteRepository;

	public Cliente save(Cliente cliente) { 
		return clienteRepository.save(cliente);
	}

	public List<ClienteDTO> findAll(){
		return clienteRepository.findAll().stream().map(cliente -> new ClienteDTO(cliente))
			.collect(Collectors.toList());
	}
	
	public Optional<Cliente> findById(Long id) { 
		return clienteRepository.findById(id);
	}
	
	public Cliente update(Cliente cliente) { 
		return clienteRepository.save(cliente);
	}
	
	public void deleteById(Long id) { 
		clienteRepository.deleteById(id);
	}
	
	public List<Cliente> findByCpf(String cpf){
		return (List<Cliente>) clienteRepository.findByCpf(cpf);
	}
}