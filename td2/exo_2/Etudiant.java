public class Etudiant
{
	private String nom;
	private int age;
	private int etudiantId;
	private static int totalEtudiants = 0; 

	private void incrementerTotalEtudiants()
	{
		totalEtudiants++;
	}

	public static int getTotalEtudiants() {
		return totalEtudiants;
	}

	public String getName(){
		return this.nom;
	}

	public int getAge() {
		return this.age;
	}

	public int getEtudiantId(){
		return this.etudiantId;
	}

	public static void main(String[] args) {

	}
}
