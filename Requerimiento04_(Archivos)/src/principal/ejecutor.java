package principal;

import clases.*;

/**
 *
 * @author alexa
 */
public class ejecutor {

    public static void main(String[] args) {
        Manejo_de_Registro registro = new Manejo_de_Registro();
        registro.AbrirArchivo();
        Domicilio domicilio = new Domicilio("Lojana", "AV.Pablo Placios", "Loja", "------", "------");
        Productos prod = new Productos("PATATAS", 0.60);
        Productos prod2 = new Productos("ARROZ", 0.80);
        LineItems items = new LineItems(3);
        items.agregarProductos(prod);
        items.agregarProductos(prod2);
        Factura fact = new Factura(domicilio);
        fact.agregarLineItems(items);
        System.out.println(fact.toString());
        registro.Agregar_Registros(fact.toString());
    }
}
