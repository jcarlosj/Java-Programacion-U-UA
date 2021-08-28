package bloques.inicializacion;

public class Persona {
    // Atributos
    private final int idPersona;
    private static int cantidad;

    // Bloques de inicializacion estatico:
    //  - Se ejecuta antes de cualquier bloque no estatico y del Constructor
    //  - Se ejecuta una sola ves cada que se carga en memoria la clase
    static {
        System.out.println( "1. Bloque estatico" );
        ++Persona .cantidad;    // Podemos inicializar atributos estaticos de la clase.
    }

    // Bloque de inicializacion no estatico:
    //  - Se ejecuta antes del Constructor
    //  - Se ejecuta cada vez que se instancie un nuevo objeto
    {
        System.out.println( "2. Bloque NO estatico" );
        this .idPersona = Persona .cantidad ++;
    }

    // Constructor
    public Persona () {
        System.out.println( "3. Constructor" );
    }

    // Getters
    public int getIdPersona() {
        return this .idPersona;
    }


    @Override
    public String toString() {
        return
            "Persona [ " +
            "\n  idPersona: " + idPersona +
            "\n]";
    }

}

/* Bloques de inicializacion
    - Hay de dos tipos: Estaticos y NO estaticos (o Contexto Dinamico)
    - Siempre se ejecutan primero que el Constructor
    - Se usan para inicializar atributos fuera del Constructor
*/