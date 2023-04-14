public class MainBank {
    public static void main(String[] args) {
        // Création d'une banque
        Banque banque = new Banque("Ma Banque");

        // Ajout de clients à la banque
        Client client1 = new Client("Dupont", "Jean", "10 Rue de la Paix");
        Client client2 = new Client("Martin", "Paul", "20 Avenue des Champs-Elysées");
        banque.ajouterClient(client1);
        banque.ajouterClient(client2);

        // Création de comptes bancaires pour les clients
        CompteCourant compteCourant1 = new CompteCourant(1, 1000, -500);
        CompteEpargne compteEpargne1 = new CompteEpargne(2, 5000, 0.02);
        client1.ajouterCompte(compteCourant1);
        client1.ajouterCompte(compteEpargne1);

        CompteCourant compteCourant2 = new CompteCourant(3, 2000, -1000);
        client2.ajouterCompte(compteCourant2);

        // Affichage des clients et des comptes de la banque
        banque.afficherClients();
        banque.afficherComptes();

        // Effectuer des opérations sur les comptes
        banque.deposer(1, 500);
        banque.retirer(1, 200);
        banque.deposer(3, 1000);

        // Affichage de la synthèse des comptes
        banque.afficherSynthese();

        // Effectuer un virement
        ServiceBancaire serviceBancaire = new ServiceBancaire(banque);
        serviceBancaire.effectuerVirement(1, 3, 300);

        // Affichage de la synthèse des comptes après le virement
        banque.afficherSynthese();
    }
}
