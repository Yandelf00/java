import java.util.Arrays;

public class CompteBancaire {
	private String nom;
	private double solde;
	private double interet;
	private OperationBancaire[] operations;
	private int cmpt;

	public CompteBancaire(String a, double b, double c) {
		this.nom = a;
		this.solde = b;
		this.interet = c;
		this.operations = new OperationBancaire[10];
		this.cmpt = 0;
	}

	private void ajouterOperation(OperationBancaire opt) {
		if (this.cmpt >= this.operations.length) {
			this.operations = Arrays.copyOf(this.operations, this.operations.length*2);
		}
		this.operations[this.cmpt++] = opt;
	}


	public void depot(double montant, String date) {
		if (montant > 0) {
			this.solde += montant;
			OperationBancaire op = new OperationBancaire(montant, date);
			ajouterOperation(op);
		}
	}

	public void retrait(double montant, String date) {
		if (montant > 0 && this.solde > montant) {
			this.solde -= montant;
			OperationBancaire op = new OperationBancaire(montant, date);
			ajouterOperation(op);
		}
	}
	
	public double getSolde() {
		return this.solde;
	}

	public double calcul_interets() {
		return this.solde * this.interet;
	}

	public OperationBancaire[] getOperations() {
		return Arrays.copyOf(this.operations, this.cmpt);  
	}

	public void affiche() {
			System.out.println("Titulaire du compte : " + this.nom);
			System.out.println("Solde actuel : " + this.solde + " DH");
			System.out.println("Taux d'intérêt annuel : " + this.interet + " %");
	}

	public static void main(String[] args) {
	}
}

class OperationBancaire{
	private String date;
	private double montant;
	public OperationBancaire(double a, String b) {
		this.montant = a;
		this.date = b;
	}
}
