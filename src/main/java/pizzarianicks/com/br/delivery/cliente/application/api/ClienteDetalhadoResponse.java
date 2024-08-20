package pizzarianicks.com.br.delivery.cliente.application.api;

import java.time.LocalDateTime;
import java.util.UUID;

import lombok.Value;
import pizzarianicks.com.br.delivery.cliente.domain.Cliente;

@Value
public class ClienteDetalhadoResponse {
	private UUID idCliente;
	private String nomeCompleto;
	private String email;
	private String telefone;
	private LocalDateTime dataHoraDoCadastro;
	
	public ClienteDetalhadoResponse(Cliente cliente) {
		this.idCliente = cliente.getIdCliente();
		this.nomeCompleto = cliente.getNomeCompleto();
		this.email = cliente.getEmail();
		this.telefone = cliente.getTelefone();
		this.dataHoraDoCadastro = cliente.getDataHoraDoCadastro();
	}
}