package br.com.amordepet.banhotosa.cliente.application.infra;

import org.springframework.stereotype.Repository;

import br.com.amordepet.banhotosa.cliente.application.repository.ClienteRepository;
import br.com.amordepet.banhotosa.cliente.domain.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
@RequiredArgsConstructor
public class ClienteInfraRepository implements ClienteRepository {
	private final ClienteSpringdataJPARepository clienteSpringdataJPARepository;
	@Override
	public Cliente salva(Cliente cliente) {
		log.info("[inicia] ClienteInfraRepository - salva");
		clienteSpringdataJPARepository.save(cliente);
		log.info("[finaliza] ClienteInfraRepository - salva");
		return cliente;
	}

}
