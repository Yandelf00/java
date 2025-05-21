public class Tableaux{
	static double calculerMoyenneGenerale(double noteMaths, double notePhysique, 
double coefMaths, double coefPhysique) {
		double moyenneGeneral = ((noteMaths * coefMaths) + (notePhysique * coefPhysique))/(coefPhysique + coefMaths);
		return moyenneGeneral;
	} 

	static int trouverMeilleurEtudiant(double[] notesMaths, double[]
notesPhysique, double coefMaths, double coefPhysique) {
		int meilleureNoteIndex = 0;
		double meilleureNote = 0;
		double tmp;
		for (int i = 0; i < 5; i++) {
			tmp = calculerMoyenneGenerale(notesMaths[i], notesPhysique[i], coefMaths, coefPhysique);
			if (tmp > meilleureNote) {
				meilleureNote = tmp;
				meilleureNoteIndex = i;
			}
		}
		return meilleureNoteIndex;
	}

	public static void main(String[] args) {
		double[] notesMaths = {14.5, 9.0, 12.0, 16.5, 10.0};
		double[] notesPhysique = {8.5, 15.0, 11.5, 13.0, 17.5};
		double[] coefficients = {3.0, 2.0};

		System.out.println("les notes de maths");
		for (int i = 0; i < 5; i++) {
			System.out.println(notesMaths[i]);
		}

		System.out.println("les notes de physique");
		for (int i = 0; i < 5; i++) {
			System.out.println(notesPhysique[i]);
		}
		
		//retourne la moyenne general du premier eleve
		double result = calculerMoyenneGenerale(notesMaths[0], notesPhysique[0], coefficients[0], coefficients[1]);
		System.out.println(result);


		//retourne l'index de la meilleures moyenne general
		int res = trouverMeilleurEtudiant(notesMaths, notesPhysique, coefficients[0], coefficients[1]);
		System.out.println(res);
	}
}
