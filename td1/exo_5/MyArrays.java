import java.util.Arrays;

public class MyArrays {
	public static void main(String[] args) {
		int[] tableauNotes = {15, 9, 18, 12, 7}; 
		int[] copieNotes = {15, 9, 18, 12, 7}; 
		int[] autreCopieNotes = tableauNotes;

		//afficher les elements du premier tableau
		for (int i = 0; i < 5; i++) {
			System.out.println(tableauNotes[i]);
		}

		//afficher les elements de la premiere copie
		for (int i = 0; i < 5; i++) {
			System.out.println(copieNotes[i]);
		}

		//afficher les elements de la copie
		for (int i = 0; i < 5; i++) {
			System.out.println(autreCopieNotes[i]);
		}
		
		//premiere comparaison 
		boolean fc = tableauNotes == copieNotes;
		System.out.println(fc); //false pck c'est pas le mm objet
		boolean sc = tableauNotes == autreCopieNotes;
		System.out.println(sc);//true pck c'est le mm objet

		//seconde comparaison
		System.out.println(Arrays.equals(tableauNotes, copieNotes)); //cette methode compare just les elements donc vrai
		System.out.println(Arrays.equals(tableauNotes, autreCopieNotes)); //pareil ici
	}
}
