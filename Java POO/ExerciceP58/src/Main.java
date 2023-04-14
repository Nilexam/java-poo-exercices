import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Exercice n°1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez une phrase :");
        String phrase = scanner.nextLine();
        System.out.println("Vous avez entré : " + phrase);
        String[] mots = phrase.split("\\s+");
        System.out.println("Il y a " + mots.length + " mots dans la phrase.");

        // Exercice n°2
        String nomFichier = "fichier.txt";
        try {
            FileWriter fichier = new FileWriter(nomFichier);
            fichier.write(phrase);
            fichier.close();
            System.out.println("La phrase a été écrite dans le fichier.");
        } catch (IOException e) {
            System.out.println("Une erreur est survenue : " + e.getMessage());
        }

        // Exercice n°3
        System.out.println("Entrez le chemin du fichier à lire :");
        String path = scanner.nextLine();

        try {
            FileReader file = new FileReader(path);
            BufferedReader reader = new BufferedReader(file);
            String line;
            int nbWords = 0;
            while ((line = reader.readLine()) != null) {
                nbWords += line.split(" ").length;
            }
            reader.close();

            System.out.println("Le fichier contient " + nbWords + " mots.");
        } catch (IOException e) {
            System.out.println("Le fichier n'a pas pu être ouvert : " + e.getMessage());
        }
    }
}