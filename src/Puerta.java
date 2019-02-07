/**
 * Implementa el partr�n de dise�o Singleton
 * // TODO Documentar clase Puerta
 *
 * @author Juan Pablo Garc�a Plaza P�rez
 * @author Jos� �ngel Concha Carrasco
 */

public class Puerta {

    /**
     * Instancia Singleton de la puerta
     */
    private static Puerta instancia = null;

    /**
     * Constructor por defecto. Inicializa la instancia Singleton
     */
    private Puerta() {
        instancia = new Puerta();
    }

    /**
     * // TODO Documenar m�todo entrar()
     *
     * @param barco
     */
    public void entrar(Barco barco) {
        mostrarMensaje("El barco con ID: " + barco.getIdentificador() + " entra");
    }

    /**
     * // TODO Documentar m�todo salir()
     *
     * @param barco
     */
    public void salir(Barco barco) {
        mostrarMensaje("El barco con ID: " + barco.getIdentificador() + " sale");
    }

    /**
     * @return la instancia Singleton de la clase Puerta
     */
    public static Puerta recuperarInstancia() {
        if (instancia != null)
            return instancia;
        else
            instancia = new Puerta();

        return instancia;
    }

    /**
     * Muestra un mensaje en una l�nea por consola
     *
     * @param mensaje Mensaje a mostrar
     */
    private void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}