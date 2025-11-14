//La structure selon cas 
public class Cas {
    public static void main(String [] args)
    {
        Cas.temps("soleil");

    }
    public static void temps(final String temps)
    {
        switch (temps)
        {
            case "soleil" -> System.out.println("Il fait beau");
            case "pluie"-> System.out.println("Il pleut");
            case "neige" -> System.out.println("Il neige");
            default -> System.out.println ("Je ne sais pas ");
        }
    }

}
