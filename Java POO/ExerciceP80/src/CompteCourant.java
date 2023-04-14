public class CompteCourant extends CompteBancaire {
    private double decouvertAutorise;

    public CompteCourant(int numero, double solde, double decouvertAutorise) {
        super(numero, solde, "Courant");
        this.decouvertAutorise = decouvertAutorise;
    }

    public double getDecouvertAutorise() {
        return decouvertAutorise;
    }

    public void setDecouvertAutorise(double decouvertAutorise) {
        this.decouvertAutorise = decouvertAutorise;
    }

    @Override
    public void retirer(double montant) {
        if (getSolde() + decouvertAutorise >= montant) {
            super.retirer(montant);
        } else {
            System.out.println("Le montant de " + montant + " € ne peut pas être retiré du compte " + getNumero() + " pour cause : Découvert dépassé.");
        }
    }
}
