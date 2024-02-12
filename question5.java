import java.util.Scanner;

public class CotationEtudiants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Déclaration et initialisation des points maximaux pour chaque cours
        int pointsMaxAlgo = 100;
        int pointsMaxPOO = 120;
        int pointsMaxRO = 80;
        int pointsMaxPedagogie = 80;
        int pointsMaxOS = 120;
        int pointsMaxJava = 100;

        // Saisie des points obtenus par l'étudiant dans chaque cours
        System.out.println("Entrez le nombre de points obtenus dans l'Algorithme (sur " + pointsMaxAlgo + " points) :");
        int pointsAlgo = scanner.nextInt();

        System.out.println("Entrez le nombre de points obtenus en Programmation Orientée Objet (sur " + pointsMaxPOO + " points) :");
        int pointsPOO = scanner.nextInt();

        System.out.println("Entrez le nombre de points obtenus en Recherche Opérationnelle (sur " + pointsMaxRO + " points) :");
        int pointsRO = scanner.nextInt();

        System.out.println("Entrez le nombre de points obtenus en Pédagogie Comparée (sur " + pointsMaxPedagogie + " points) :");
        int pointsPedagogie = scanner.nextInt();

        System.out.println("Entrez le nombre de points obtenus en Système d'Exploitation (sur " + pointsMaxOS + " points) :");
        int pointsOS = scanner.nextInt();

        System.out.println("Entrez le nombre de points obtenus en Langage Java (sur " + pointsMaxJava + " points) :");
        int pointsJava = scanner.nextInt();

        // Calcul du pourcentage pour chaque cours
        double pourcentageAlgo = ((double) pointsAlgo / pointsMaxAlgo) * 100;
        double pourcentagePOO = ((double) pointsPOO / pointsMaxPOO) * 100;
        double pourcentageRO = ((double) pointsRO / pointsMaxRO) * 100;
        double pourcentagePedagogie = ((double) pointsPedagogie / pointsMaxPedagogie) * 100;
        double pourcentageOS = ((double) pointsOS / pointsMaxOS) * 100;
        double pourcentageJava = ((double) pointsJava / pointsMaxJava) * 100;

        // Calcul de la moyenne générale
        double moyenneGenerale = (pourcentageAlgo + pourcentagePOO + pourcentageRO + pourcentagePedagogie + pourcentageOS + pourcentageJava) / 6;

        // Affichage des pourcentages
        System.out.println("Pourcentage en Algorithme : " + pourcentageAlgo + "%");
        System.out.println("Pourcentage en Programmation Orientée Objet : " + pourcentagePOO + "%");
        System.out.println("Pourcentage en Recherche Opérationnelle : " + pourcentageRO + "%");
        System.out.println("Pourcentage en Pédagogie Comparée : " + pourcentagePedagogie + "%");
        System.out.println("Pourcentage en Système d'Exploitation : " + pourcentageOS + "%");
        System.out.println("Pourcentage en Langage Java : " + pourcentageJava + "%");

        // Affichage de la moyenne générale
        System.out.println("Moyenne Générale : " + moyenneGenerale);

        // Détermination de la mention
        String mention = "";
        if (moyenneGenerale >= 55 && moyenneGenerale < 70) {
            mention = "Satisfaction";
        } else if (moyenneGenerale >= 70 && moyenneGenerale < 80) {
            mention = "Distinction";
        } else if (moyenneGenerale >= 80 && moyenneGenerale < 90) {
            mention = "Grande Distinction";
        } else if (moyenneGenerale >= 90 && moyenneGenerale <= 100) {
            mention = "Très Grande Distinction";
        }

        // Affichage de la mention
        System.out.println("Mention : " + mention);
    }
}
