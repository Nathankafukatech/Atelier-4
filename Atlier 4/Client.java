public class Client extends Personne {

    public Client(String nom, int age, String adresse) {
        super(nom, age, adresse);
    }

    public void passerCommande() {
        System.out.println(nom + " passe une commande...");
    }

    public void presenterOrdonnance() {
        System.out.println(nom + " présente une ordonnance.");
    }
}
