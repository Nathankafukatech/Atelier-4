import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pharmacie pharmacie = new Pharmacie("Pharmant", "123 Rue Principale");
        Administrateur admin = new Administrateur("Nathan", 30, "Lubumbashi");

        System.out.println("---Bienvenue dans le système de gestion de pharmacie-- !");
        admin.seConnecter();
        admin.gererPharmacie();

        System.out.print("Entrer le nom du client : ");
        String nomClient = sc.nextLine();
        System.out.print("Son âge : ");
        int ageClient = sc.nextInt();
        sc.nextLine(); // Consommer retour
        System.out.print("Son adresse : ");
        String adresseClient = sc.nextLine();

        Client client = new Client(nomClient, ageClient, adresseClient);
        client.presenterOrdonnance();
        client.passerCommande();

        Medicament med1 = new MedicamentOrdonnance("Amoxicilline", "01/01/2024", "01/01/2026");
        Medicament med2 = new MedicamentLibre("Paracétamol", "01/03/2024", "01/03/2026");
     
       



        pharmacie.gererMedicaments(med1);
        pharmacie.gererMedicaments(med2);

        pharmacie.enregistrerCommande();
        pharmacie.faireFacture();
        pharmacie.afficherMedicaments();

        Facture facture = new Facture("Facture #001");
        facture.afficherFacture();

        sc.close();
    }
}
