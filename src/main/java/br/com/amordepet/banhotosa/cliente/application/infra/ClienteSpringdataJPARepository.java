package br.com.amordepet.banhotosa.cliente.application.infra;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.amordepet.banhotosa.cliente.domain.Cliente;

public interface ClienteSpringdataJPARepository extends JpaRepository<Cliente, UUID>{

}
