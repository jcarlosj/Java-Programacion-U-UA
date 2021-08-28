package argumentos.variables;

public class StartArgumentosVariables {
    public static void main( String[] args ) {
        int [] digitos = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        imprimirNumeros( 3, 4, 5 );
        imprimirNumeros( 9, 18 );
        imprimirNumeros( digitos );

        imprimirDatos( "Juan", 3, 4, 5 );
        imprimirDatos( "Juan", digitos );

    }

    // Argumentos variables (Equivalente al Spread en JavaScript)
    private static void imprimirNumeros( int... numeros ) {
        System .out .println( "imprimirNumeros" );

        for( int i = 0; i < numeros .length; i++ ) {
            System .out .println( i + ". " + numeros[ i ] );
        }
        System .out .println( "" );

    }

    // Cuando se pasan varios argumentos incluido uno o mas argumentos variables,
    // este ultimo debe ser el ultimo en se pasado al metodo que lo requiera
    public static void imprimirDatos( String nombre, int ... numeros ) {
        System .out .println( "imprimirDatos" );
        System .out .println( nombre );
        imprimirNumeros( numeros );
    }

}
