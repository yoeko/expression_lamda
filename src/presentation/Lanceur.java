package presentation;

import metier.Fatimata;
import service.Imanga;

public class Lanceur {

	public static void main(String[] args) {
		
		Fatimata fati = new Fatimata();
				
		fati.liremanga(new Imanga() {
			
			@Override
			public void liremanga() {
				System.out.println("je suis les manga");
			}
			
		});
		
		
		fati.liremanga(() -> System.out.println("je suis les manga en dimenssion lamda") );

	}

}
