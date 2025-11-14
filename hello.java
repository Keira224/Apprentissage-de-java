public class hello{
    public static void main(String[] args){
        System.out.println("Hello les developpeurs java !");

        //Appel de la fonction 
        int somme = addition(5, 10);
        System.out.println("La somme de 5 et 10 est : " + somme);
    }
    //Declaration de la fonction 
    public static int addition(final int a, final int b){
        return a + b;
    }
    
}