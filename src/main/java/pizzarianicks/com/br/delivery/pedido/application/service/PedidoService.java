package pizzarianicks.com.br.delivery.pedido.application.service;

import java.util.UUID;

import pizzarianicks.com.br.delivery.pedido.application.api.PedidoRequestCriandoEndereco;
import pizzarianicks.com.br.delivery.pedido.application.api.PedidoResponse;

public interface PedidoService {
	PedidoResponse clienteRealizaPedidoCriandoEndereco(UUID idCliente, PedidoRequestCriandoEndereco pedidoRequest);
}