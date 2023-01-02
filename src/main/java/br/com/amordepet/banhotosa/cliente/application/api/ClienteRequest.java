package br.com.amordepet.banhotosa.cliente.application.api;

import org.hibernate.validator.constraints.br.CPF;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Value;

@Value
public class ClienteRequest {
	@NotBlank
	private String nomeCompleto;
	@NotBlank
	private String celular;
	@NotBlank
	private String endereco;
	@CPF
	private String cpf;
	@NotNull
	private Boolean aceitaTermos; 
}
