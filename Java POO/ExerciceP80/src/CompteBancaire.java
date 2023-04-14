public abstract class CompteBancaire {
    private int numero;
    private double solde;
    private String type;

    public CompteBancaire(int numero, double solde, String type) {
        this.numero = numero;
        this.solde = solde;
        this.type = type;
    }

    public int getNumero() {
        return numero;
    }

    public double getSolde() {
        return solde;
    }

    public String getType() { return type; }

    public void deposer(double montant) {
        solde += montant;
        System.out.println(montant + " € ont été ajouté au solde du compte " + this.type + " " + this.numero);
    }

    public void retirer(double montant) {
        if (montant <= solde) {
            solde -= montant;
            System.out.println("Le retrait de " + montant + " € a été effectué sur le compte " + this.type + " " + this.numero);
        } else {
            System.out.println("Erreur ! Solde insuffisant.");
        }
    }
}