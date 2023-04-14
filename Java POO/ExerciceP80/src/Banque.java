import java.util.ArrayList;

public class Banque {
    private String nom;
    private ArrayList<Client> clients;

    public Banque(String nom) {
        this.nom = nom;
        this.clients = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public void ajouterClient(Client client) {
        clients.add(client);
    }

    public void afficherClients() {
        System.out.println("Clients de la banque " + nom + " :");
        for (Client client : clients) {
            System.out.println("  " + client.getNom() + ", " + client.getAdresse());
        }
    }

    public void afficherComptes() {
        System.out.println("Comptes de la banque " + nom + " :");
        for (Client client : clients) {
            client.afficherComptes();
        }
    }

    public CompteBancaire trouverCompte(int numeroCompte) {
        for (Client client : clients) {
            for (CompteBancaire compte : client.getComptes()) {
                if (compte.getNumero() == numeroCompte) {
                    return compte;
                }
            }
        }
        System.out.println("Le compte " + numeroCompte + " n'existe pas.");
        return null;
    }

    public void deposer(int numeroCompte, double montant) {
        CompteBancaire compte = trouverCompte(numeroCompte);
        if (compte != null) {
            compte.deposer(montant);
            System.out.println("Le montant de " + montant + " € a été déposé sur le compte " + numeroCompte);
        }
    }

    public void retirer(int numeroCompte, double montant) {
        CompteBancaire compte = trouverCompte(numeroCompte);
        if (compte != null) {
            compte.retirer(montant);
        }
    }

    public void virement(int numeroCompteSource, int numeroCompteDest, double montant) {
        CompteBancaire compteSource = trouverCompte(numeroCompteSource);
        CompteBancaire compteDest = trouverCompte(numeroCompteDest);

        if (compteSource != null && compteDest != null) {
            if(compteSource.getSolde() > montant)
            {
                compteSource.retirer(montant);
                compteDest.deposer(montant);
                System.out.println("Le montant de " + montant + " € a été viré du compte " + numeroCompteSource + " au compte " + numeroCompteDest);
            }
            else
            {
                System.out.println("Le montant de " + montant + " € depuis le compte " + numeroCompteSource + " au compte " + numeroCompteDest + "n'a pas été effectué pour cause : Solde insuffisant.");
            }
        }
    }

    public void afficherSynthese() {
        for (Client client : clients) {
            System.out.println("Client : " + client.getNom() + " " + client.getPrenom());
            for (CompteBancaire compte : client.getComptes()) {
                if (compte instanceof CompteCourant) {
                    System.out.println("    Compte Courant - solde : " + compte.getSolde() + " €");
                } else if (compte instanceof CompteEpargne) {
                    System.out.println("    Compte Epargne - solde : " + compte.getSolde() + " €");
                } else {
                    System.out.println("    Compte - solde : " + compte.getSolde() + " €");
                }
            }
        }
    }

}

