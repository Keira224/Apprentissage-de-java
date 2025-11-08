public class age {
    public static void main(String[] args) {
        int age = 19;
        if (age < 18) {
            System.out.println("Je suis mineur.");
        } else {
            System.out.println("Je suis majeur.");
        }

    }
    //avec les ternaires
    public static void main(String[] args) {
        int age = 18;
        String statut = (age < 18) ? "Vrai" : "Faux";
        System.out.println(statut);
    }

    
}