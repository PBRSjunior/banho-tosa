package br.com.amordepet.banhotosa.cliente.application.service;

import br.com.amordepet.banhotosa.cliente.application.api.ClienteRequest;
import br.com.amordepet.banhotosa.cliente.application.api.ClienteResponse;

public interface ClienteService {

	ClienteResponse criaCliente(ClienteRequest clienteRequest);

}
