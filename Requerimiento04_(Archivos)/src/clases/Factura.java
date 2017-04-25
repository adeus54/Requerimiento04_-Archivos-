package clases;

import java.util.ArrayList;

/**
 *
 * @authores Cristhian Apolo, Nelson Aranda y Fernando León
 */
public class Factura {

    private Domicilio dom;
    public ArrayList<LineItems> Items = new ArrayList<>();

    public Factura(Domicilio dom) {
        this.dom = dom;
    }

    public void agregarLineItems(LineItems pr) {
        this.Items.add(pr);
    }

    public String getLineItems() {
        String descripcion = "";
        for (LineItems pr : Items) {
            descripcion += pr.toString();
        }

        return descripcion;
    }

    public double getCantidadPago() {
        double cantidad = 0;
        for (LineItems pr : Items) {
            cantidad += pr.getPrecioTotal();
        }

        return cantidad;
    }

    public Domicilio getDom() {
        return dom;
    }

    @Override
    public String toString() {
        return String.format("\t\t=====================Factura==================="
                + "\nDomicilio: %s \nLineItems: \n\t%s", getDom(), getLineItems());
    }
}
