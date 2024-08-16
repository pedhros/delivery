package pizzarianicks.com.br.delivery.cliente.infra;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import pizzarianicks.com.br.delivery.cliente.domain.Cliente;

public interface ClienteSpringDataJPARepository extends JpaRepository<Cliente, UUID> {
	
}