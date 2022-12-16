package br.com.amordepet.banhotosa.cliente.domain;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.validator.constraints.br.CPF;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Cliente {
	@Id
	private UUID idCliente;
	@NotBlank
	private String nomeCompleto;
	@NotBlank
	private String celular;
	@NotBlank
	private String endereco;
	@CPF
	private String cpf;

	private LocalDateTime dataHoraDoCadastro;
	private LocalDateTime dataHoraDaUltimaAlteracao;

	public Cliente(@NotBlank String nomeCompleto, @NotBlank String celular, @NotBlank String endereco,
			@CPF String cpf) {
		this.idCliente = UUID.randomUUID();
		this.nomeCompleto = nomeCompleto;
		this.celular = celular;
		this.endereco = endereco;
		this.cpf = cpf;
		this.dataHoraDoCadastro = LocalDateTime.now();
	}

}
