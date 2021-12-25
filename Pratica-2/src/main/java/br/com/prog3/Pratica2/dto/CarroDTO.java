package br.com.prog3.Pratica2.dto;

import br.com.prog3.Pratica2.domain.Carro;

public class CarroDTO {
	private Long id;
	private String placa;
	private String cor;
	private Integer ano;
	private Integer anomodelo;
	private String marca;
	private String modelo;
	// private Cliente cliente;
	// private Oficina oficina;
	
	public CarroDTO(Carro Carro) {
		this.id = Carro.getId();
		this.placa = Carro.getPlaca();
		this.cor = Carro.getCor();
		this.ano = Carro.getAno();
		this.anomodelo = Carro.getAnomodelo();
		this.marca = Carro.getMarca();
		this.modelo = Carro.getModelo();
		// this.cliente = Carro.getCliente();
		// this.oficina = Carro.getOficina();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public Integer getAnomodelo() {
		return anomodelo;
	}

	public void setAnomodelo(Integer anomodelo) {
		this.anomodelo = anomodelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
}
