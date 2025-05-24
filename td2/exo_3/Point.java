public class Point {
    private double x; // abscisse
    private double y; // ordonnée

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void deplace(double dx, double dy) {
        x += dx;
        y += dy;
    }

    public double abscisse() {
        return x;
    }

    public double ordonnee() {
        return y;
    }

    // --- Méthode homothétie : multiplie x et y par un facteur donné
    public void homothetie(double facteur) {
        x *= facteur;
        y *= facteur;
    }

    // --- Méthode rotation : fait tourner le point autour de l'origine d'un angle donné (en radians)
    public void rotation(double angle) {
        double newX = x * Math.cos(angle) - y * Math.sin(angle);
        double newY = x * Math.sin(angle) + y * Math.cos(angle);
        x = newX;
        y = newY;
    }

    // --- Coordonnée polaire rho : distance à l’origine
    public double rho() {
        return Math.sqrt(x * x + y * y);
    }

    // --- Coordonnée polaire theta : angle en radians
    public double theta() {
        return Math.atan2(y, x);
    }

    // --- Affiche les coordonnées cartésiennes
    public void afficheCart() {
        System.out.println("Coordonnées cartésiennes : (" + x + ", " + y + ")");
    }

    // --- Affiche les coordonnées polaires
    public void affichePol() {
        System.out.println("Coordonnées polaires : (ρ = " + rho() + ", θ = " + theta() + " rad)");
    }
}
