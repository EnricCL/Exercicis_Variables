package exercicis;

public class Fase3 {

	public static void main(String[] args) {
		int traspas = 1948;
		int naixement = 1987;
		boolean esTraspas;
		String fraseCerta ="És any de traspàs.";
		String fraseFalsa ="No és any de traspàs.";
		
		for(int i = traspas; i < naixement + 1 ; i++) {
			
			//Si és múltiple de 4 i múltiple de 400 , o múltiple de 4 i no múltiple de 100, és cert, sinó és fals
			if((i % 4 == 0) && ((i % 100 != 0) || (i % 400 == 0))){
				esTraspas = true;
			}else esTraspas = false;
			
			System.out.print(i+": "); //imprimir any per consola
			
			//Si és cert, imprimir frase certa, sinó imprimir frase falsa
			if(esTraspas) System.out.print(fraseCerta); 
			else System.out.print(fraseFalsa);
			
			if (i != naixement) System.out.print("\n"); //per a fer salts de línia fins a l'últim resultat
	
		}
	}
}