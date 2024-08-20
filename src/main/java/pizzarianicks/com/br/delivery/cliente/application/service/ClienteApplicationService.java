package pizzarianicks.com.br.delivery.cliente.application.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import pizzarianicks.com.br.delivery.cliente.application.api.ClienteDetalhadoResponse;
import pizzarianicks.com.br.delivery.cliente.application.api.ClienteListResponse;
import pizzarianicks.com.br.delivery.cliente.application.api.ClienteRequest;
import pizzarianicks.com.br.delivery.cliente.application.api.ClienteResponse;
import pizzarianicks.com.br.delivery.cliente.application.repository.ClienteRepository;
import pizzarianicks.com.br.delivery.cliente.domain.Cliente;

@Service
@Log4j2
@RequiredArgsConstructor
public class ClienteApplicationService implements ClienteService {
	private final ClienteRepository clienteRepository;

	@Override
	public ClienteResponse criaCliente(ClienteRequest clienteRequest) {
		log.info("[inicia] ClienteApplicationService - criaCliente");
		Cliente cliente = clienteRepository.salva(new Cliente(clienteRequest));
		log.info("[finaliza] ClienteApplicationService - criaCliente");
		return ClienteResponse.builder()
				.idCliente(cliente.getIdCliente())
				.build();
	}

	@Override
	public List<ClienteListResponse> buscaTodosClientes() {
		log.info("[inicia] ClienteApplicationService - buscaTodosCliente");
		List<Cliente> clientes = clienteRepository.buscaTodosClientes();
		log.info("[finaliza] ClienteApplicationService - buscaTodosCliente");
		return ClienteListResponse.converte(clientes);
	}

	@Override
	public ClienteDetalhadoResponse buscaClienteAtravesId(UUID idCliente) {
		log.info("[inicia] ClienteApplicationService - buscaClienteAtravesId");
		log.info("[finaliza] ClienteApplicationService - buscaClienteAtravesId");
		return null;
	}
}