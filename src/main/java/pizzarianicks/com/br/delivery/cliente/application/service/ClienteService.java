package pizzarianicks.com.br.delivery.cliente.application.service;

import java.util.List;
import java.util.UUID;

import pizzarianicks.com.br.delivery.cliente.application.api.ClienteAlteracaoRequest;
import pizzarianicks.com.br.delivery.cliente.application.api.ClienteDetalhadoResponse;
import pizzarianicks.com.br.delivery.cliente.application.api.ClienteListResponse;
import pizzarianicks.com.br.delivery.cliente.application.api.ClienteRequest;
import pizzarianicks.com.br.delivery.cliente.application.api.ClienteResponse;

public interface ClienteService {
	ClienteResponse criaCliente(ClienteRequest clienteRequest);
	List<ClienteListResponse> buscaTodosClientes();
	ClienteDetalhadoResponse buscaClienteAtravesId(UUID idCliente);
	void deletaClienteAtravesId(UUID idCliente);
	void patchAlteraCliente(UUID idCliente, ClienteAlteracaoRequest clienteAlteracaoRequest);
}