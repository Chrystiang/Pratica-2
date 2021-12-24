package br.com.prog3.Pratica2.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.prog3.Pratica2.domain.Oficina;
import br.com.prog3.Pratica2.dto.OficinaDTO;
import br.com.prog3.Pratica2.enums.CodigoOficina;
import br.com.prog3.Pratica2.repository.OficinaRepository;

@Service
public class OficinaService {
	@Autowired
    private OficinaRepository oficinaRepository;

	public Oficina save(Oficina oficina) { 
		return oficinaRepository.save(oficina);
	}

	public List<OficinaDTO> findAll(){
		return oficinaRepository.findAll().stream().map(oficina -> new OficinaDTO(oficina))
			.collect(Collectors.toList());
	}
	
	public Optional<Oficina> findById(Long id) { 
		return oficinaRepository.findById(id);
	}
	
	public Oficina update(Oficina oficina) { 
		return oficinaRepository.save(oficina);
	}
	
	public void deleteById(Long id) { 
		oficinaRepository.deleteById(id);
	}
	
	public List<Oficina> findByCodigoOficina(CodigoOficina codigoOficina){
		return (List<Oficina>) oficinaRepository.findByCodigoOficina(codigoOficina);
	}
}

