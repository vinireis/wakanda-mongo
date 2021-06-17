package tech.xmob.wakanda.jornada.model;

import java.util.List;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Tribo {
	private String codigo;
	private String nome;
	private List<Habilidade> habilidades;
}
