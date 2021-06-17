package tech.xmob.mongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Document
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
public class Wakander {
	@Id
	private String codigo;
	private String nome;
	private Email email;
	
	public String getEmail() {
		return this.email.getEmail();
	}
}