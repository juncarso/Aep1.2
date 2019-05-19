package aep;

import java.util.UUID;

public abstract class Pessoa {
	private UUID id;
	private String nome;
	
	public Pessoa(String nome){
		this.nome = nome;
	}
	
	public Pessoa(UUID id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public UUID getId() {
		return this.id; 
	}

}
