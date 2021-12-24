package br.com.prog3.Pratica2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.prog3.Pratica2.domain.Oficina;
import br.com.prog3.Pratica2.enums.CodigoOficina;

@Repository
public interface OficinaRepository extends JpaRepository<Oficina, Long>{
	List<Oficina> findByCodigoOficina(CodigoOficina codigoOficina); 
}