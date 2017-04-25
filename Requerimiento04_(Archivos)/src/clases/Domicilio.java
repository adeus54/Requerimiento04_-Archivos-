package clases;

/**
 *
 * @authores Cristhian Apolo, Nelson Aranda y Fernando León 
 */
public class Domicilio {

    private String Nombre;
    private String Calle;
    private String Ciudad;
    private String Estado;
    public String toString;

    public Domicilio(String Nombre, String Calle, String Ciudad, String Estado, String toString) {
        this.Nombre = Nombre;
        this.Calle = Calle;
        this.Ciudad = Ciudad;
        this.Estado = Estado;
        this.toString = toString;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getCalle() {
        return Calle;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public String getEstado() {
        return Estado;
    }

    public String getToString() {
        return toString;
    }

    @Override
    public String toString() {

        return String.format("\n\tNombre: %s \n\tCiudad: %s \n\tCalle: %s \n\tEstado: %s \n\ttoString: %s",
                getNombre(), getCiudad(), getCalle(), getEstado(), getToString());
    }
}
