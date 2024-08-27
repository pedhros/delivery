package pizzarianicks.com.br.delivery.pedido.application.api;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
@RequestMapping
public interface PedidoAPI {
	@PostMapping("/criaEndereco/{idCliente}")
	@ResponseStatus(code = HttpStatus.CREATED)
	PedidoResponse postClienteRealizaPedidoCriandoEndereco(@PathVariable UUID idCliente,
	@Valid @RequestBody PedidoRequestCriandoEndereco pedidoRequest);
}