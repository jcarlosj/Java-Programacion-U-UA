package enumeracion;

// Define una enumeracion con elementos que poseen atributos
public enum Continentes {
    AMERICA( 34 ),
    AFRICA( 53 ),
    ASIA( 44 ),
    EUROPA( 46 ),
    OCEANIA( 14 );

    private final int paises;

    // Constructor
    Continentes( int paises ) {
        this .paises = paises;      // Se asocia a cada uno de los elementos de la enumeracion
    }

    // Getter
    public int getPaises() {
        return this .paises;
    }

}
