package es.iespuerto.ets;

/**
 * esta es mi clase del examen de recuparacion
 *
 */
public class Jonathan 
{
    /**
     * @param nombre = nombre de usuarui
     * @param apellido1 = primer apellido
     * @param apellido2 = segundo apellido
     */
    public String nombre;
    public String apellido1;
    public String apellido2;
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    /**
     * contructor vacio
     */
    public Jonathan() {
    }
    /**
     * contructor con un parametro
     */
    public Jonathan (String nombre) {

    }
    /**
     * contructor con tres parametros
     */

    public Jonathan(String nombre, String apellido1, String apellido2) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
    }
    /**
     * constructor con dos parametros
     */
    public Jonathan(String nombre, String apellido1) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
    
    }
    /**
     * metodo que sireve para validar el usuario
     */
    public void Validar (String nombre, String apellido2) {

    }
}
