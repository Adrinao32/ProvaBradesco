package Principal;

public class Ex06 {

	public static void main(String[] args) {
		
		Candidato cand = new Candidato(22, "Jair Messias Bolsonaro", 6100000);
		
		cand.status();
		
		cand.setNumeroVotos(7800000);
		
		cand.status();

	}

}
