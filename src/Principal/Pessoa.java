package Principal;

public class Pessoa {
	
	private String nome;
	private int idade;
	private float altura;
	private float peso;
	private float imc;
		
		
	public void caracteristica () {
		
		if(this.imc <= 18.5) {
			System.out.println(getNome());
			System.out.println("Idade: " + getIdade());
			System.out.println("Altura: " + getAltura());
			System.out.println("Peso: " + getPeso());
			System.out.printf("Abaixo do peso normal e seu IMC é: %.2f", getImc());
		}
		if(this.imc > 18.5 & this.imc <= 25) {
			System.out.println(getNome());
			System.out.println("Idade: " + getIdade());
			System.out.println("Altura: " + getAltura());
			System.out.println("Peso: " + getPeso());
			System.out.printf("Peso Normal e seu IMC é: %.2f ", getImc());
		}
		if(this.imc > 25 & this.imc <= 30) {
			System.out.println(getNome());
			System.out.println("Idade: " + getIdade());
			System.out.println("Altura: " + getAltura());
			System.out.println("Peso: " + getPeso());
			System.out.printf("Acima do peso normal e seu IMC é: %.2f", getImc());
		}
		if(this.imc > 30) {
			System.out.println(getNome());
			System.out.println("Idade: " + getIdade());
			System.out.println("Altura: " + getAltura());
			System.out.println("Peso: " + getPeso());
			System.out.printf("Obesidade e seu IMC é: %.2f", getImc());
		}
		
		
	}

	public double getImc() {
		return imc;
	}

	public void setImc(float x, float y) {
		this.imc = x / (y * y); 
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	
}
