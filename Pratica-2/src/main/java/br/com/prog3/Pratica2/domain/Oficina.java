package br.com.prog3.Pratica2.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import br.com.prog3.Pratica2.enums.CodigoOficina;

@Entity
public class Oficina {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id;
	private CodigoOficina codigoOficina;
	private String nome;
	private String especialidade;
	private String endereco;
	
	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name = "id_carro", nullable = true, updatable = true) 
	private Carro carro;
	    public Oficina() {
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
	public Carro getCarro() {
		return carro;
	}
	public void setCarro(Carro carro) {
		this.carro = carro;
	}
}