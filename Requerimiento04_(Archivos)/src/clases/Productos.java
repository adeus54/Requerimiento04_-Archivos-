package clases;

/**
 *
 * @authores Cristhian Apolo, Nelson Aranda y Fernando León 
 */
public class Productos {
    public String Descripcion;
    public double precio;

    public Productos(String Descripcion, double precio) {
        this.Descripcion = Descripcion;
        this.precio = precio;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public double getPrecio() {
        return precio;
    }
    
    @Override
    public String toString(){
    return String.format("\n\tDescripcion: %s  Precio: %.2f",getDescripcion(),getPrecio());
    }
    
    
}
