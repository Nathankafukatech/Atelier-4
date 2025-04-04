public class Medicament {
    protected String nom;
    protected String dateFabrication;
    protected String dateExpiration;

    public Medicament(String nom, String fabrication, String expiration) {
        this.nom = nom;
        this.dateFabrication = fabrication;
        this.dateExpiration = expiration;
    }

    public void afficherInfo() {
        System.out.println("Nom: " + nom + ", Fabriqué le: " + dateFabrication + ", Expire le: " + dateExpiration);
    }
}
