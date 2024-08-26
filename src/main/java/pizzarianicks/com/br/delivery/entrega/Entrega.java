package pizzarianicks.com.br.delivery.entrega;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Entrega {
	
	private Boolean pedidoEntregue;
	private LocalDateTime dataHoraDaEntrega;

	public Entrega (boolean pedidoEntregue, LocalDateTime dataHoraDaEntrega) {
	        this.pedidoEntregue = pedidoEntregue;
	        this.dataHoraDaEntrega = dataHoraDaEntrega;
     }
}