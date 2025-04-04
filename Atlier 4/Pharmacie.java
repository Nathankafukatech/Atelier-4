import java.util.ArrayList;
import java.util.List;

public class Pharmacie {
    private String nom;
    private String adresse;
    private List<Medicament> medicaments = new ArrayList<>();

    public Pharmacie(String nom, String adresse) {
        this.nom = nom;
        this.adresse = adresse;
    }

    public void gererMedicaments(Medicament med) {
        medicaments.add(med);
        System.out.println("Médicament ajouté à la pharmacie.");
    }

    public void enregistrerCommande() {
        System.out.println("Commande enregistrée.");
    }

    public void scannerOrdonnance() {
        System.out.println("Ordonnance scannée.");
    }

    public void faireFacture() {
        System.out.println("Facture générée.");
    }

    public void afficherMedicaments() {
        System.out.println("Liste des médicaments :");
        for (Medicament m : medicaments) {
            m.afficherInfo();
        }
    }
}
