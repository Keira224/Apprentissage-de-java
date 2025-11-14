
//Ce programe permet de calculer la sommme des qu 100 premiers nombres premiers.
public class les100 {

    public static void main(String[] args) {
        // int count = 0; // Compteur de nombres premiers trouvés
        // int number = 2; // Nombre à tester pour la primalité
        // int sum = 0; // Somme des nombres premiers

        // while (count < 100) {
        //     if (isPrime(number)) {
        //         sum += number; // Ajouter le nombre premier à la somme
        //         count++; // Incrémenter le compteur de nombres premiers
        //     }
        //     number++; // Passer au nombre suivant
        // }

        // System.out.println("La somme des 100 premiers nombres premiers est : " + sum);

        // on demande a l'utilisateur de saisir un nombre et on lui donne la somme de ces nombres en contrallant la saisie

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = 0;
        boolean saisieValide = false;
        while (!saisieValide) {
            try {
                System.out.print("Entrez un nombre entier positif: ");
                if (scanner.hasNextInt()) {
                    n = scanner.nextInt();
                    if (n > 0) {
                        saisieValide = true;
                    } else {
                        System.out.println("Erreur: Veuillez entrer un nombre entier positif.");
                    }
                } else {
                    System.out.println("Erreur: Veuillez entrer un nombre entier valide.");
                    scanner.next(); 
                }
            } catch (Exception e) {
                System.out.println("Erreur de saisie. Veuillez réessayer.");
                scanner.next(); 
    }
        }

        scanner.close();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("La somme des nombres de 1 à " + n + " est : " + sum);
    }
}