package br.com.prog3.Pratica2.dto;

import br.com.prog3.Pratica2.domain.Oficina;
import br.com.prog3.Pratica2.enums.CodigoOficina;

public class OficinaDTO {
	private Long id;
	private CodigoOficina codigoOficina;
	private String nome;
	private String especialidade;
	private String endereco;
	
	public OficinaDTO(Oficina Oficina) {
		this.id = Oficina.getId();
		this.codigoOficina = Oficina.getCodigoOficina();
		this.nome = Oficina.getNome(); 
		this.especialidade = Oficina.getEspecialidade(); 
		this.endereco = Oficina.getEndereco();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public CodigoOficina getCodigoOficina() {
		return codigoOficina;
	}

	public void setCodigoOficina(CodigoOficina codigoOficina) {
		this.codigoOficina = codigoOficina;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
}