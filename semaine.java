public class semaine {
    public static void main (String[] args) {
        
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // System.out.print("Entrez un jour de la semaine:  ");
        // int jour = scanner.nextInt();
        // // tant qu'il ne saisit pas un entier entre 1 et 7 et tant que c'est pas un nombre

        // while (jour < 1 || jour > 7 ) {
        //     System.out.print("Veuillez entrer un entier entre 1 et 7: ");
        //     jour = scanner.nextInt();
        // }
        System.out.print("Entrez un jour de la semaine (1-7): ");
        int jour = 0;
        boolean saisieValide = false;

        while (!saisieValide) {
            try {
                if (scanner.hasNextInt()) {
                    jour = scanner.nextInt();
                    if (jour >= 1 && jour <= 7) {
                        saisieValide = true;
                    } else {
                        System.out.print("Veuillez entrer un nombre entre 1 et 7: ");
                    }
                } else {
                    System.out.print("Erreur: Veuillez entrer un nombre: ");
                    scanner.next(); 
                }
            } catch (Exception e) {
                System.out.print("Erreur de saisie. Veuillez entrer un nombre entre 1 et 7: ");
                scanner.next(); 
            }
        }

        scanner.close();

        String nomJour = "";  

        switch (jour) {
            case 1:
                nomJour = "Lundi";
                break;
            case 2:
                nomJour = "Mardi";
                break;
            case 3:
                nomJour = "Mercredi";
                break;
            case 4:
                nomJour = "Jeudi";
                break;
            case 5:
                nomJour = "Vendredi";
                break;
            case 6:
                nomJour = "Samedi";
                break;
            case 7:
                nomJour = "Dimanche";
                break;
            
        }
        System.out.println("Le jour est : " + nomJour);
    }   
} 
