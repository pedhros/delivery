package pizzarianicks.com.br.delivery.cliente.infra;

import org.springframework.stereotype.Repository;

import lombok.extern.log4j.Log4j2;
import pizzarianicks.com.br.delivery.cliente.application.repository.ClienteRepository;
import pizzarianicks.com.br.delivery.cliente.domain.Cliente;

@Repository
@Log4j2
public class ClienteInfraRepository implements ClienteRepository {

	@Override
	public Cliente salva(Cliente cliente) {
		log.info("[inicia] ClienteInfraRepository - salva");
		log.info("[finaliza] ClienteInfraRepository - salva");
		return cliente;
	}
}
