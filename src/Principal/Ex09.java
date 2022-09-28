package Principal;

public class Ex09 {

	public static void main(String[] args) {
		
				
		Pessoa pessoa = new Pessoa();
		
		pessoa.setNome("Adriano Gomes da Silva");
		pessoa.setIdade(33);
		pessoa.setPeso(60f);
		pessoa.setAltura(1.71f);
		
		pessoa.setImc(60f, 1.71f);
		
			
		pessoa.caracteristica();
		

	}

}
