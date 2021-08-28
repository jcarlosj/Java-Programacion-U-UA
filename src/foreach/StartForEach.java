package foreach;

public class StartForEach {
    public static void main( String[] args ) throws Exception {
        String frutas [] = { "Mango", "Manzana", "Melon", "Mandarina", "Maracuya" };

        for( String fruta : frutas ) {
            System.out.println( " - " + fruta );
        }
        System.out.println( "" );

        Persona personas[] = {
            new Persona( "Manuela" ),
            new Persona( "Juan" ),
            new Persona( "Carlos" )
        };

        for( Persona persona : personas ) {
            System .out .println( persona );
        }
        System.out.println( "" );

    }
}

/* ForEach:
    Simplifica la forma como recorremos los arreglos, listas y colecciones en Java.
*/
