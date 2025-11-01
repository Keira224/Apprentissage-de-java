public class BulletinNotes {
    
    private String nom;
    private String nomEnseignant;
     public void setNomCours (String nom)
    {
        this.nom = "Maths";
    }
    public String  getNomCours()
    {
        return nom;
    }
    public void afficheMessage(String nom)
    {
        System.out.println("Bienvenue dans le bulletin de notes "+ nom);
    }

    public BulletinNotes(String nom , String nomEnseignant)
    {
        
    }
    BulletinNotes bulletinNote = new BulletinNotes(
        "CS101 Introduction "
    )
    
}
