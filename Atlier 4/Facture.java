public class Facture {
    private String nomFacture;

    public Facture(String nomFacture) {
        this.nomFacture = nomFacture;
    }

    public void afficherFacture() {
        System.out.println("Facture: " + nomFacture);
    }
}
