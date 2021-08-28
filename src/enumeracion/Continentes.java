package enumeracion;

// Define una enumeracion con elementos que poseen atributos
public enum Continentes {
    AMERICA( 34, "43.316.000 km2" ),
    AFRICA( 53, "30.370.000 km2" ),
    ASIA( 44, "44.010.000 km2" ),
    EUROPA( 46, "10.180.000 km2" ),
    OCEANIA( 14, "9.008.500 km2" );

    // Atributos de las enumeraciones
    private final int numeroPaises;
    private final String infoSuperficie;

    // Constructor
    Continentes( int nPaises, String infoSuperficie ) {
        this .numeroPaises = nPaises;      // Se asocia a cada uno de los elementos de la enumeracion
        this .infoSuperficie = infoSuperficie;
    }

    // Getters
    public int getNumeroPaises() {
        return this .numeroPaises;
    }

    public String getInfoSuperficie() {
        return this .infoSuperficie;
    }

}
