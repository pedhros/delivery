package pizzarianicks.com.br.delivery.cliente.application.repository;

import java.util.List;
import java.util.UUID;

import pizzarianicks.com.br.delivery.cliente.domain.Cliente;

public interface ClienteRepository {
	Cliente salva(Cliente cliente);
	List<Cliente> buscaTodosClientes();
	Cliente buscaClienteAtravesId(UUID idCliente);
	void deletaCliente(Cliente cliente);
}