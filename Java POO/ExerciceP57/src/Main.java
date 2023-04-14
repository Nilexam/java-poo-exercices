import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Demande à l'utilisateur de rentrer une phrase et de lui afficher à l'envers
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez une phrase :");
        String phrase = scanner.nextLine();
        System.out.println("Voici la chaine de caractères renversées : " + renverserChaine(phrase));

        // Créer une pyramide de hauteur 5, soit la valeur passée en paramètre
        pyramide(5);

        // Calcule le total des nombres jusqu'à 10 000
        System.out.println("Total des nombres jusqu'à 10000 = " + calculerNombresJusqua1000());

        // Vérifie si un nombre est pair/impair et/ou premier
        System.out.println("Entrez un nombre entier :");
        Integer nombre = Integer.parseInt(scanner.nextLine());
        verifierNombre(nombre);

        // Fermer le scanner
        scanner.close();
    }

    // Méthode renverser une chaine de caractère
    public static String renverserChaine(String chaine) {
        StringBuilder sb = new StringBuilder(chaine);
        sb.reverse();
        return sb.toString();
    }

    // Méthode créer une pyramide prenant en paramètre la hauteur de la pyramide
    public static void pyramide(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Méthode calculer les nombres de 1 jusqu'à 10000
    public static int calculerNombresJusqua1000()
    {
        int total = 0;
        for(int i = 1; i < 10000+1; i++) {
            total += i;
        }
        return total;
    }

    // Méthode qui vérifie si un nombre est pair, impair et/ou premier
    public static void verifierNombre(int n)
    {
        // Vérifier si le nombre est pair ou impair
        if (n % 2 == 0) {
            System.out.println(n + " est pair.");
        } else {
            System.out.println(n + " est impair.");
        }

        // Vérifier si le nombre est premier
        boolean estPremier = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                estPremier = false;
                break;
            }
        }
        if (estPremier) {
            System.out.println(n + " est premier.");
        } else {
            System.out.println(n + " n'est pas premier.");
        }
    }

}