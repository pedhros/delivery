package pizzarianicks.com.br.delivery.pedido;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import pizzarianicks.com.br.delivery.entrega.Entrega;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class Pedido {
	@Id
	private UUID idPedido;
	@NotBlank
	private UUID idCliente;
	@NotBlank
	private UUID idEnderecoEntrega;
	@NotBlank
	private String produto;
	@NotBlank
	private String detalhesPedido;
	@NotBlank
	private Entrega entrega;
	private LocalDateTime dataHoraDoPedido;
	private LocalDateTime dataHoraAlteracaoDoPedido;
		
	private Pedido(UUID idPedido, @NotBlank UUID idCliente, @NotBlank UUID idEnderecoEntrega, @NotBlank String produto,
			@NotBlank String detalhesPedido, Entrega entrega, LocalDateTime dataHoraDoPedido) {
		this.idPedido = idPedido;
		this.idCliente = idCliente;
		this.idEnderecoEntrega = idEnderecoEntrega;
		this.produto = produto;
		this.detalhesPedido = detalhesPedido;
		this.entrega = entrega;
		this.dataHoraDoPedido = dataHoraDoPedido;
	}
}