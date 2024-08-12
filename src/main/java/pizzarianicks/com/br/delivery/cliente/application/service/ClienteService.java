package pizzarianicks.com.br.delivery.cliente.application.service;

import pizzarianicks.com.br.delivery.cliente.application.api.ClienteRequest;
import pizzarianicks.com.br.delivery.cliente.application.api.ClienteResponse;

public interface ClienteService {
	ClienteResponse criaCliente(ClienteRequest clienteRequest);
}
