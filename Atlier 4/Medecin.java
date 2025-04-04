public class Medecin extends Personne {

    public Medecin(String nom, int age, String adresse) {
        super(nom, age, adresse);
    }

    public void consulterClient() {
        System.out.println("Consultation du client...");
    }

    public void prescrireOrdonnance() {
        System.out.println("Ordonnance prescrite.");
    }
}
