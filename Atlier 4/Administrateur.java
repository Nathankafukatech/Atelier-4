public class Administrateur extends Personne {

    public Administrateur(String nom, int age, String adresse) {
        super(nom, age, adresse);
    }

    public void seConnecter() {
        System.out.println(nom + " s'est connecté avec succès.");
    }

    public void gererPharmacie() {
        System.out.println("Gestion de la pharmacie en cours...");
    }
}
