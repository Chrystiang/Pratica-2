package br.com.prog3.Pratica2.dto;

import java.time.LocalDate;

import br.com.prog3.Pratica2.domain.Cliente;

public class ClienteDTO {
	private Long id;
	private String cpf;
	private String nome;
	private LocalDate dataNascimento;
	
	public ClienteDTO(Cliente Cliente) {
		this.id = Cliente.getId();
		this.nome = Cliente.getNome(); 
		this.cpf = Cliente.getCpf(); 
		this.dataNascimento = Cliente.getDataNascimento();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
}
