package Principal;

public class Candidato {
	
	private int numeroCandidato;
	private String nomeCandidato;
	private int numeroVotos;
	
	
	
	public Candidato(int numeroCandidato, String nomeCandidato, int numeroVotos) {
		
		this.nomeCandidato = nomeCandidato;
		this.numeroCandidato = numeroCandidato;
		this.numeroVotos = numeroVotos;
		
	}
	
	public int getNumeroVotos() {
		return numeroVotos;
	}
	
	public void setNumeroVotos(int numeroVotos) {
		this.numeroVotos = numeroVotos;
		
	}
	
	public void status() {
		System.out.println("Sobre o Candidato");
		System.out.println("Nome do candidato: " + this.nomeCandidato);
		System.out.println("Numero candidato: " + this.numeroCandidato);
		System.out.println("Quantidade de votos: " + this.numeroVotos);		
		
	}
	
	
}
