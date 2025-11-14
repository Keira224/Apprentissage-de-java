public class hello{
    public static void main(String[] args){
        System.out.println("Hello les developpeurs java !");

        //Appel de la fonction 
        int somme = addition(5, 10);
        System.out.println("La somme de 5 et 10 est : " + somme);

        //Appel de la fonction de verification
        verifiNombre(-3);
    }
    //Declaration de la fonction 
    public static int addition(final int a, final int b){
        return a + b;
    }
    // les instruction if et else
    public static void verifiNombre(final int nombre)
    {
        if (nombre > 0){
            System.out.println("le nombre est positif");

        }
        else if (nombre < 0){
            System.out.println("le nombre est negatif");
        } else {
            System.out.println("le nombre est zero");
        }
    }
}
    
