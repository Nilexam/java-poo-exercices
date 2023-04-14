public class ServiceBancaire {
    private Banque banque;

    public ServiceBancaire(Banque banque) {
        this.banque = banque;
    }

    public void effectuerVirement(int numeroCompteSource, int numeroCompteDest, double montant) {
        banque.virement(numeroCompteSource, numeroCompteDest, montant);
    }
}
