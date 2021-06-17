package tech.xmob.wakanda.wakander.api;

import javax.validation.Valid;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Value;
import tech.xmob.wakanda.wakander.model.Wakander;

@Value
@Valid
@AllArgsConstructor(access = AccessLevel.PACKAGE)
public class WakanderDTO {
	private String codigo;
	private String nome;
	private String email;

	public WakanderDTO(Wakander wakander) {
		this.codigo = wakander.getCodigo();
		this.nome = wakander.getNome();
		this.email = wakander.getEmail();
	}
}