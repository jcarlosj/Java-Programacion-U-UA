package enumeracion;

public class StartEnumeracion {
    public static void main( String[] args ) throws Exception {
        //System.out.println( Dias .DOMINGO );
        //indicarDiaSemana( Dias .DOMINGO );

        System.out.println( "No. paises de " + Continentes .EUROPA + " es: " + Continentes .EUROPA .getPaises() );
        System.out.println( "No. paises de " + Continentes .AMERICA + " es: " + Continentes .AMERICA .getPaises() );
    }

    private static void indicarDiaSemana( Dias dias ) {

        // Switch es capar de hacer uso de una enumeracion
        switch( dias ) {
            case LUNES:
                System.out.println( "Primer dia de la semana" );
                break;
            case MARTES:
                System.out.println( "Segundo dia de la semana" );
                break;
            case MIERCOLES:
                System.out.println( "Tercer dia de la semana" );
                break;
            case JUEVES:
                System.out.println( "Cuarto dia de la semana" );
                break;
            case VIERNES:
                System.out.println( "Quinto dia de la semana" );
                break;
            case SABADO:
                System.out.println( "Sexto dia de la semana" );
                break;
            case DOMINGO:
                System.out.println( "Septimo dia de la semana" );
                break;
            default:
                System.out.println( "Dia de la semana desconocido" );
                break;
        }
    }
}
