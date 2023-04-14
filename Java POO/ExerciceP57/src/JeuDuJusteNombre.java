import java.util.Random;
import java.util.Scanner;

public class JeuDuJusteNombre {
    public static void main(String[] args) {
        // Initialiser le générateur de nombres aléatoires et le scanner
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        // Choisir un nombre aléatoire entre 1 et 100
        int nombreADeviner = rand.nextInt(100) + 1;

        // Initialiser le compteur de coups
        int nombreDeCoups = 0;

        // Demander à l'utilisateur de deviner le nombre
        System.out.println("Devinez un nombre entre 1 et 100 :");
        int proposition = scanner.nextInt();

        // Tant que le nombre à deviner n'a pas été trouvé
        while (proposition != nombreADeviner) {
            // Indiquer si le nombre à deviner est plus grand ou plus petit que la proposition de l'utilisateur
            if (proposition < nombreADeviner) {
                System.out.println("Plus grand.");
            } else {
                System.out.println("Plus petit.");
            }

            // Demander une nouvelle proposition
            proposition = scanner.nextInt();

            // Incrémenter le compteur de coups
            nombreDeCoups++;
        }

        // Afficher le message de victoire et le nombre de coups nécessaires
        System.out.println("Bravo, vous avez trouvé le nombre à deviner en " + nombreDeCoups + " coups !");

        // Fermer le scanner
        scanner.close();
    }
}
