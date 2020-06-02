package exercicis;

public class Fase2 {

	public static void main(String[] args) {
		final int traspas = 1948; // constant
		int cada = 4; // guarda cada quan hi ha 1 any de traspàs
		int naixement = 1987;
				
		int calcul = (naixement - traspas) / cada +1; //+1 perquè comptem també el 1948 com any de traspàs
		
		System.out.println(calcul); // mostrem per consola

	}

}
