package br.com.amordepet.banhotosa.cliente.application.api;

import java.util.UUID;

import org.hibernate.validator.constraints.br.CPF;

import jakarta.validation.constraints.NotBlank;

public class ClienteListResponse {
	private UUID idCliente;
	@NotBlank
	private String nomeCompleto;
	@NotBlank
	private String celular;
	@NotBlank
	private String endereco;
	@CPF
	private String cpf;

}
