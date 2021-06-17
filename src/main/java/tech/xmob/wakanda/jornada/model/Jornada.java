package tech.xmob.wakanda.jornada.model;

import java.util.List;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Jornada {
	private String codigo;
	private String nome;
	private List<Tribo> tribos;
}