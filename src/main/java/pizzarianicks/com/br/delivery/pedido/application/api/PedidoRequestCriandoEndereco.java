package pizzarianicks.com.br.delivery.pedido.application.api;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Value;

@Value
public class PedidoRequestCriandoEndereco {
	@NotBlank
	private String produto;
	@NotBlank
	private String detalhesPedido;
	@NotNull
	private EnderecoRequest enderecoEntrega;

}
