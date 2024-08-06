package pizzarianicks.com.br.delivery.cliente.domain;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Cliente {
	@Id
	private UUID idCliente;
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
	
	private LocalDateTime dataHoraDoCadastro;
    private LocalDateTime dataHoraUltimaAlteracao;
    
	private Cliente(UUID idCliente, @NotBlank String nomeCompleto, @Email @NotBlank String email,
			@NotBlank String telefone, LocalDateTime dataNascimento) {
		this.idCliente = UUID.randomUUID();
		this.nomeCompleto = nomeCompleto;
		this.email = email;
		this.telefone = telefone;
		this.dataNascimento = dataNascimento;
		this.dataHoraDoCadastro = LocalDateTime.now();
	}
}