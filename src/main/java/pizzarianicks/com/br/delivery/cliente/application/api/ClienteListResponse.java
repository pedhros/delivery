package pizzarianicks.com.br.delivery.cliente.application.api;

import java.util.List;
import java.util.UUID;

import pizzarianicks.com.br.delivery.cliente.domain.Cliente;

public class ClienteListResponse {
	private UUID idCliente;
	private String nomeCompleto;
	private String email;
	private String telefone;
	public static List<ClienteListResponse> converte(List<Cliente> clientes) {
		return null;
	}
}