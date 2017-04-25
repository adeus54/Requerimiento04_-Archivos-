package clases;

import java.util.ArrayList;

/**
 *
 * @authores Cristhian Apolo, Nelson Aranda y Fernando León
 */
public class LineItems {

    public int Cantidad;
    private ArrayList<Productos> prod = new ArrayList<>();

    public LineItems(int cantidad) {
        this.Cantidad = cantidad;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void agregarProductos(Productos pr) {
        this.prod.add(pr);
    }

    public String getProductos() {
        String descripcion = "";
        for (Productos pr : prod) {
            descripcion += pr.toString();
        }

        return descripcion;
    }

    public double getPrecioTotal() {
        double total = 0;
        for (Productos pr : prod) {
            total += pr.getPrecio();
        }
        total *= getCantidad();
        return total;
    }

    @Override
    public String toString() {

        return String.format("Cantidad: %d \nProductos : %s \nPrecio Total: %.2f \n"
                + "", getCantidad(), getProductos(), getPrecioTotal());
    }

}
