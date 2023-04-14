import java.util.ArrayList;

public class Client {
    private String nom;
    private String prenom;
    private String adresse;
    private ArrayList<CompteBancaire> comptes;

    public Client(String nom, String prenom, String adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.comptes = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public ArrayList<CompteBancaire> getComptes() {
        return comptes;
    }

    public void ajouterCompte(CompteBancaire compte) {
        comptes.add(compte);
    }

    public void afficherComptes() {
        System.out.println("Comptes de " + nom + " :");
        for (CompteBancaire compte : comptes) {
            String typeCompte = "";
            if (compte instanceof CompteCourant) {
                typeCompte = "Compte Courant";
            } else if (compte instanceof CompteEpargne) {
                typeCompte = "Compte Epargne";
            } else {
                typeCompte = "Compte Inconnu";
            }
            System.out.println("  " + typeCompte + " : " + compte.getSolde() + " €");
        }
    }
}