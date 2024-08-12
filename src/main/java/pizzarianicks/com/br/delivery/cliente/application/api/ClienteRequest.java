package pizzarianicks.com.br.delivery.cliente.application.api;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Value;

@Value
public class ClienteRequest {
	@NotBlank
	private String nomeCompleto;
	@Email
	@NotBlank
	@Column(unique = true)
	private String email;
	@NotBlank
	private String telefone;
	@NotNull
	private LocalDateTime dataNascimento;
}