package pizzarianicks.com.br.delivery.cliente.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import pizzarianicks.com.br.delivery.cliente.application.api.ClienteAlteracaoRequest;
import pizzarianicks.com.br.delivery.cliente.application.api.ClienteRequest;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", name = "id", updatable = false, unique = true, nullable = false)
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
	private LocalDate dataNascimento;
	
	private LocalDateTime dataHoraDoCadastro;
    private LocalDateTime dataHoraUltimaAlteracao;

	public Cliente(ClienteRequest clienteRequest) {
		this.nomeCompleto = clienteRequest.getNomeCompleto();
		this.email = clienteRequest.getEmail();
		this.telefone = clienteRequest.getTelefone();
		this.dataNascimento = clienteRequest.getDataNascimento();
		this.dataHoraDoCadastro = LocalDateTime.now();
	}

	public void altera(ClienteAlteracaoRequest clienteRequest) {
		this.nomeCompleto = clienteRequest.getNomeCompleto();
		this.telefone = clienteRequest.getTelefone();
		this.dataNascimento = clienteRequest.getDataNascimento();
		this.dataHoraUltimaAlteracao = LocalDateTime.now();	
	}
}