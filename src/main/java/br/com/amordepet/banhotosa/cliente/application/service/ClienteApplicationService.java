package br.com.amordepet.banhotosa.cliente.application.service;

import org.springframework.stereotype.Service;

import br.com.amordepet.banhotosa.cliente.application.api.ClienteRequest;
import br.com.amordepet.banhotosa.cliente.application.api.ClienteResponse;
import br.com.amordepet.banhotosa.cliente.domain.Cliente;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class ClienteApplicationService implements ClienteService {

	@Override
	public ClienteResponse criaCliente(ClienteRequest clienteRequest) {
		log.info("[inicia] ClienteApplicationService - criaCliente");
		Cliente cliente = clienteRepository.salva(new Cliente(clienteRequest));
		log.info("[inicia] ClienteApplicationService - criaCliente");
		return null;
	}

}
