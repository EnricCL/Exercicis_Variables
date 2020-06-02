package exercicis;

public class Fase4 {

	public static void main(String[] args) {
		
		String nom, cognom1, cognom2;
		nom = "Enric";
		cognom1 = "Comes";
		cognom2 = "Lefler";
		
		int dia, mes, any;
		dia = 12;
		mes = 1;
		any = 1987;
		
		String nomComplet = nom+' '+cognom1+' '+cognom2;
		String dataCompleta = Integer.toString(dia)+'/'+Integer.toString(mes)+'/'+Integer.toString(any);
		
		System.out.println("El meu nom és "+nomComplet);
		System.out.println("Vaig néixer el "+dataCompleta);
		
		String fraseCerta ="El meu any de naixement és de traspàs.";
		String fraseFalsa ="El meu any de naixement no és de traspàs.";
		
		if((any % 4 == 0) && ((any % 100 != 0) || (any % 400 == 0))){
			System.out.println(fraseCerta);
		}else {
			System.out.println(fraseFalsa);			
		}
		

	}

}
