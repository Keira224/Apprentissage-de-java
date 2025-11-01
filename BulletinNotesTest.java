public class BulletinNotesTest
{
    private String nom;
    public static void main(String[]args)
    
    {

        BulletinNotes monBulletin = new BulletinNotes();
        // System.out.println("Veuillez entre le nom du cours");
        // java.util.Scanner input = new java.util.Scanner(System.in);
        

        // String nom = input.nextLine();
        monBulletin.setNomCours(nom);
        System.out.println();
        monBulletin.afficheMessage(nom);
    }
    

   


}