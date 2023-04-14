public class CompteEpargne extends CompteBancaire {
    private double tauxInteret;

    public CompteEpargne(int numero, double solde, double tauxInteret) {
        super(numero, solde, "Épargne");
        this.tauxInteret = tauxInteret;
    }

    public double getTauxInteret() {
        return tauxInteret;
    }

    public void setTauxInteret(double tauxInteret) {
        this.tauxInteret = tauxInteret;
    }

    public void appliquerInterets() {
        double interets = getSolde() * tauxInteret;
        deposer(interets);
        System.out.println("Les intérêts de " + interets + " € ont été ajoutés au compte " + getNumero());
    }

    @Override
    public String toString() {
        return "Compte épargne n°" + getNumero() + " - solde : " + getSolde() + " € - taux d'intérêt : " + tauxInteret + "%";
    }
}
