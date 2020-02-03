package entrada.blog.gbm;

/**
 * Clase para manejar las entradas de un blog.
 *
 * @since 03/02/2020
 * @version 3.0
 * @author Gabriel Blanca Montes
 *
 */
public class EntradaBlogGBM
{
    /**
     * Separador es el carácter que separa ENTRADA DE del nombre del autor
     */
    public static char separador = ':';
    private int id;
    private String texto;
    private String autor;

    /**
     * Constructor de la clase.
     *
     * @param id Número de entrada.
     * @param autor Nombre del autor de la entrada.
     * @param texto Texto que contiene la entrada.
     * @throws IllegalArgumentException Si el número de entrada es negativo,
     *                                  lanza una excepción.
     */
    EntradaBlogGBM(int id, String autor, String texto) throws IllegalArgumentException
    {
        if (id <= 0)
            throw new IllegalArgumentException("El id no puede ser negativo");
        this.id = id;
        this.autor = autor;
        this.texto = texto;
    }

    @Override public String toString()
    {
        String cad = "";
        cad += "\nENTRADA DE" + separador + autor;
        cad += "\n " + texto;
        return cad;
    }

    /**
     * Getter para EntradaBlogGBM.id.
     *
     * @return el número de la entrada.
     */
    public int getId()
    {
        return this.id;
    }

    /**
     * Getter para EntradaBlogGBM.texto.
     *
     * @return el texto completo de la entrada.
     */
    public String getTexto()
    {
        return this.texto;
    }

    /**
     * Getter para EntradaBlogGBM.autor.
     *
     * @return el nombre del autor de la entrada en mayúsculas.
     */
    public String getAutor()
    {
        return this.autor.toUpperCase();
    }

    /**
     * Getter para EntradaBlogGBM.autor. Ya no se usa.
     *
     * @deprecated Reemplazado por {@link #getAutor()}.
     * @return el nombre del autor.
     * @see getAutor()
     */
    @Deprecated public String devuelveAutor()
    {
        return this.autor;
    }

    /**
     * Bootstrap
     *
     * @param args no tiene porqué tener argumentos.
     */
    public static void main(String[] args)
    {
        EntradaBlogGBM e1 = new EntradaBlogGBM(-3, "ana", "Últimas noticias, está disponible BixBy 2.0");
        System.out.println(e1);
    }
}
