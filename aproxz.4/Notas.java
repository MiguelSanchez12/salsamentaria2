
/**
 * Write a description of class z here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class Notas {
    public static void main(String Args[]) {
        Scanner sc = new Scanner(System.in);
        int numProductos;
        Tienda miTienda = new Tienda("123456", "Salsamentaria", "Suba");
        String codigo, nombre;
        double precio;
        int cantidad;
        double promedio = 0;

        System.out.println("Digite el número de productos: ");
        numProductos = sc.nextInt();

        for (int i = 0; i < numProductos; i++) {
            System.out.println("Digite el código del producto: ");
            codigo = sc.next();
            System.out.println("Digite el nombre del producto: ");
            nombre = sc.next();
            System.out.println("Digite el precio del producto: ");
            precio = sc.nextDouble();
            System.out.println("Digite la cantidad a llevar: ");
            cantidad = sc.nextInt();

            miTienda.adicionarProducto(codigo, nombre, precio, cantidad);
        }

        promedio = miTienda.calcularPromedioPrecios();
        System.out.println("\nEl promedio de precios es: " + promedio);

        sc.close();
    }
}
