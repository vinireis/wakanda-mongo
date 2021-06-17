package tech.xmob.wakanda.wakander.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import tech.xmob.wakanda.jornadaWakander.model.JornadaWakander;

@Document
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
public class Wakander {
	@Id
	private String codigo;
	private String nome;
	private Email email;
	
	private JornadaWakander jornadaWakander;
	
	public String getEmail() {
		return this.email.getEmail();
	}
}