package br.com.prog3.Pratica2.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.prog3.Pratica2.domain.Carro;
import br.com.prog3.Pratica2.dto.CarroDTO;
import br.com.prog3.Pratica2.repository.CarroRepository;

@Service
public class CarroService {
	@Autowired
    private CarroRepository carroRepository;

	public Carro save(Carro carro) { 
		return carroRepository.save(carro);
	}

	public List<CarroDTO> findAll(){
		return carroRepository.findAll().stream().map(carro -> new CarroDTO(carro))
			.collect(Collectors.toList());
	}
	
	public Optional<Carro> findById(Long id) { 
		return carroRepository.findById(id);
	}
	
	public Carro update(Carro carro) { 
		return carroRepository.save(carro);
	}
	
	public void deleteById(Long id) { 
		carroRepository.deleteById(id);
	}
	
	public List<Carro> findByModelo(String modelo){
		return (List<Carro>) carroRepository.findByModelo(modelo);
	}
}