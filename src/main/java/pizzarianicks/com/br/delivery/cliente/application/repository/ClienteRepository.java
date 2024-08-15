package pizzarianicks.com.br.delivery.cliente.application.repository;

import pizzarianicks.com.br.delivery.cliente.domain.Cliente;

public interface ClienteRepository {
	Cliente salva(Cliente cliente);
}