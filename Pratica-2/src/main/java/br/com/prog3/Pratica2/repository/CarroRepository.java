package br.com.prog3.Pratica2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.prog3.Pratica2.domain.Carro;
import br.com.prog3.Pratica2.domain.Cliente;

@Repository
public interface CarroRepository extends JpaRepository<Carro, Long>{
	List<Carro> findByModelo(String modelo); 
}
