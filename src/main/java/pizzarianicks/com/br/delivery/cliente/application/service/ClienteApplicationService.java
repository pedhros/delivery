package pizzarianicks.com.br.delivery.cliente.application.service;

import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j2;
import pizzarianicks.com.br.delivery.cliente.application.api.ClienteRequest;
import pizzarianicks.com.br.delivery.cliente.application.api.ClienteResponse;

@Service
@Log4j2
public class ClienteApplicationService implements ClienteService {

	@Override
	public ClienteResponse criaCliente(ClienteRequest clienteRequest) {
		log.info("[inicia] ClienteApplicationService - criaCliente");
		Cliente cliente = clienteRepository.salva(new Cliente(clienteRequest));
		log.info("[finaliza] ClienteApplicationService - criaCliente");
		return null;
	}

}
