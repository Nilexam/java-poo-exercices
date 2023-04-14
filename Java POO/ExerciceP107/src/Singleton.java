public class Singleton {
    private static Singleton instance;

    private Singleton() {
        // Constructeur privé pour empêcher l'instanciation depuis l'extérieur de la classe
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
