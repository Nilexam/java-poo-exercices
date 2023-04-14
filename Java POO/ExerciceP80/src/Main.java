public class Main {
    public static void main(String[] args) {

        Rectangle r = new Rectangle(3, 5);
        r.afficher();

        Voiture voiture = new Voiture("Toyota", "Corolla", 2021);
        System.out.println("Description de la voiture : " + voiture.getDescription());

        Square carré = new Square(4);
        double surface = carré.calculerSurface();
        System.out.println("Surface du carré : " + surface);

        voiture.demarrer();
    }
}