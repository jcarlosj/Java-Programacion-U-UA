package foreach;

public class StartForEach {
    public static void main( String[] args ) throws Exception {
        String frutas [] = { "Mango", "Manzana", "Melon", "Mandarina", "Maracuya" };

        for( String fruta : frutas ) {
            System.out.println( " - " + fruta );
        }
    }
}

/* ForEach:
    Simplifica la forma como recorremos los arreglos, listas y colecciones en Java.
*/
