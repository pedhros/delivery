package pizzarianicks.com.br.delivery.cliente.application.api;

import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Value;

@Value
public class ClienteAlteracaoRequest {
	@NotBlank
	private String nomeCompleto;
	@NotBlank
	private String telefone;
	@NotNull
	private LocalDate dataNascimento;
}