package Principal;

public class Dvd {
	
	private String tituloDvd;
	private double precoVenda;
	private double precoAluguelDia;
	private double aluguelDevido;
	
	public Dvd(String tituloDvd, double precoVenda, double precoAluguelDia) {
		super();
		this.tituloDvd = tituloDvd;
		this.precoVenda = precoVenda;
		this.precoAluguelDia = precoAluguelDia;
	}
	
	public Dvd(double aluguelDevido) {
		this.aluguelDevido = aluguelDevido;
	}

	public String getTituloDvd() {
		return tituloDvd;
	}

	public void setTituloDvd(String tituloDvd) {
		this.tituloDvd = tituloDvd;
	}

	public double getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}

	public double getPrecoAluguelDia() {
		return precoAluguelDia;
	}

	public void setPrecoAluguelDia(double precoAluguelDia) {
		this.precoAluguelDia = precoAluguelDia;
	}
	
	public double getAluguelDevido(double aluguelDevido) {
		this.aluguelDevido = aluguelDevido;
		
		if(aluguelDevido > 2) {
			aluguelDevido = precoAluguelDia * aluguelDevido;
			
		}
		
		return aluguelDevido;
	}
	
	public void setAluguelDevido(double aluguelDevido) {
		this.aluguelDevido = aluguelDevido;
	}
		
		
	public void status() {
		
		System.out.println("Titulo do Filme: " + getTituloDvd());
		System.out.println("Preço de venda: " + getPrecoVenda());	
		System.out.println("preço Aluguel por dia: " + getPrecoAluguelDia() );
		System.out.println("Valor do aluguel total: " + getPrecoAluguelDia());
		System.out.println();
		
		
	}

}
