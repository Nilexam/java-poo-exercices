public class Rectangle {
    private double longueur;
    private double largeur;

    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public double calculerSurface() {
        return longueur * largeur;
    }

    public void afficher() {
        for (int i = 0; i < longueur; i++) {
            for (int j = 0; j < largeur; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
