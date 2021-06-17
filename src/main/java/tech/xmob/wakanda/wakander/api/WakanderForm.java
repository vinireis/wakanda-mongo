package tech.xmob.wakanda.wakander.api;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Value;
import tech.xmob.wakanda.wakander.model.Email;
import tech.xmob.wakanda.wakander.model.Wakander;

@Value
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class WakanderForm {
	private String nome;
	private String email;
	
	public Wakander paraWakanderModel() {
		return Wakander.builder()
				.nome(this.nome)
				.email(Email.builder().email(this.email).build())
				.build();
	}
}
