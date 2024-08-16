package pizzarianicks.com.br.delivery.cliente.application.service;

import java.util.List;

import pizzarianicks.com.br.delivery.cliente.application.api.ClienteListResponse;
import pizzarianicks.com.br.delivery.cliente.application.api.ClienteRequest;
import pizzarianicks.com.br.delivery.cliente.application.api.ClienteResponse;

public interface ClienteService {
	ClienteResponse criaCliente(ClienteRequest clienteRequest);

	List<ClienteListResponse> buscaTodosClientes();
}