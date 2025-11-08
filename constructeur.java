class Personne 
{
    String nom;
    String prenom;
    int age ;
    // Le constructeur sans parametre
    Personne ()
    {
        age = 0;

    }
    //Le constructeur avec parametre
    Personne (String leNom, String lePrenom, int lAge)
    {
        nom = leNom;
        prenom = lePrenom;
        age = lAge;


Personne p1 = new Personne();
Personne p2 = new Personne("Dupont", "Jean", 30);
    }
}