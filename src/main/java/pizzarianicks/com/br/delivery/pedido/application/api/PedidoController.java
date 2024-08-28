package pizzarianicks.com.br.delivery.pedido.application.api;

import java.util.UUID;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import pizzarianicks.com.br.delivery.pedido.application.service.PedidoService;

@Validated
@RestController
@Log4j2
@RequiredArgsConstructor
public class PedidoController implements PedidoAPI {
	
	private PedidoService pedidoService;

	@Override
	public PedidoResponse postClienteRealizaPedidoCriandoEndereco(UUID idCliente, PedidoRequestCriandoEndereco pedidoRequest) {
		log.info("[inicia] PedidoController - postClienteRealizaPedidoCriandoEndereco");
        PedidoResponse pedido = pedidoService.clienteRealizaPedidoCriandoEndereco(idCliente, pedidoRequest);
		log.info("[finaliza] PedidoController - postClienteRealizaPedidoCriandoEndereco");
		return pedido;
	}
}