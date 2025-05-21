public class Point {
	private int x;
	private int y;

	//constructeur
	public Point(int i, int j) {
		this.x = i;
		this.y = j;
	}

	//method the translation
	public void translation(int dx, int dy){
		this.x += dx;
		this.y += dy;
	}

	public boolean sameAs(Point other) {
		return this.x == other.x && this.y == other.y; 
	}

	public static void main(String[] args){
		//Créer un point et le désigner par deux références p1 et p2.
		Point p1 = new Point(1, 1);
		Point p2 = p1; //ici p1 et p2 font reference au mm objet 

		//Comparer p1 et p2 avec l'opérateur ==
		boolean premiere_comparaison = p1 == p2; //retourne true
		System.out.println(premiere_comparaison);
		
		//Comparer p1 et p2 avec la méthode sameAs
		boolean seconde_comparaison = p1.sameAs(p2); //retourne true 
		System.out.println(seconde_comparaison);

		//Effectuer une translation de p1
		p1.translation(2, 3);

		//refaire les comparaisons.
		//Comparer p1 et p2 avec l'opérateur ==
		boolean troisieme_comparaison = p1 == p2; //toujours mm objet donc retourne true
		System.out.println(troisieme_comparaison);
		
		//Comparer p1 et p2 avec la méthode sameAs
		boolean quatrieme_comparaison = p1.sameAs(p2); 
		System.out.println(quatrieme_comparaison);//retourne true pck c toujours le mm objet
		
		Point p3 = new Point(1, 1);
		Point p4 = new Point(1, 1); //p3 et p4 font reference à deux objets differents
		//faire les comparaisons
		boolean cinquiem_comparaison = p3 == p4; //ça va retourner faux, pck les objets sont differents
		System.out.println(cinquiem_comparaison);
		
		//Comparer p1 et p2 avec la méthode sameAs
		boolean sixieme_comparaison = p3.sameAs(p4); 
		System.out.println(sixieme_comparaison);//retourne vrai pck mm si ils sont differents les
		//deux points ont les mm coordonnées

	}
}
