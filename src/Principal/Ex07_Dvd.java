package Principal;

public class Ex07_Dvd {

	public static void main(String[] args) {
		
		Dvd dvd = new Dvd("Duro de Matar 4.0", 25.00, 6.00);
		Dvd dvdAluguel = new Dvd(3); 
		
		dvd.status();
		
		dvdAluguel.setAluguelDevido(3);
		
		System.out.println(dvdAluguel.getAluguelDevido(3));
		
		
	}

}
