package aep;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class Juridica extends Pessoa{
	private String cnpj;
	private double capitalSocial;
	private HashSet<CotaSociedade> cotasSociedade;

	public Set<CotaSociedade> getCotasSociedade() {
		return cotasSociedade;
	}
	
	public Juridica(String nome, String cnpj, double capitalSocial) {
		super(nome);
		this.cnpj = cnpj;
		this.capitalSocial = capitalSocial;
	}

	public Juridica(UUID id, String nome, String cnpj, double capitalSocial) {
		super(id, nome);
		this.cnpj = cnpj;
		this.capitalSocial = capitalSocial;
	}
	
	public String getCnpj() {
		return this.cnpj;
	}
	
	public double getCapitalSocial() {
		return this.capitalSocial;
	}
	
	public void adicionarSócio(Pessoa socio, double percentualParticipacão) {
		CotaSociedade cota = new CotaSociedade();
		cota.socio = socio;
		cota.percentualDeParticipação = percentualParticipacão;
		cotasSociedade.add(cota);
	}

	public void removerSócio(Pessoa socio) {
		cotasSociedade.remove(socio);
	}
	
	private class CotaSociedade {
		private Pessoa socio;
		private double percentualDeParticipação;

		@Override
		public String toString() {
			return socio + " + " + percentualDeParticipação;
		}
	}
}
