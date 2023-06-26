import java.util.Scanner;

public class Salsamentaria {
    public static void main(String Args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        Salsamentaria miSalsamentaria = new Salsamentaria("123456", "Mi Salsamentaria", "Calle Principal");

        String codigo, nombre;
        double precio;

        System.out.println("Digite el número de productos C: ");
        int numProductosC = sc.nextInt();
        for (int i = 0; i < numProductosC; i++) {
            System.out.println("Digite el código del producto C: ");
            codigo = sc.next();
            System.out.println("Digite el nombre del producto C: ");
            nombre = sc.next();
            System.out.println("Digite el precio del producto C: ");
            precio = sc.nextDouble();
            miSalsamentaria.adicionarProductoC(new ProductoC(codigo, nombre, precio));
        }

        System.out.println("Digite el número de productos L: ");
        int numProductosL = sc.nextInt();
        for (int i = 0; i < numProductosL; i++) {
            System.out.println("Digite el código del producto L: ");
            codigo = sc.next();
            System.out.println("Digite el nombre del producto L: ");
            nombre = sc.next();
            System.out.println("Digite el precio del producto L: ");
            precio = sc.nextDouble();
            miSalsamentaria.adicionarProductoL(new ProductoL(codigo, nombre, precio));
        }

        System.out.println("Digite el número de productos S: ");
        int numProductosS = sc.nextInt();
        for (int i = 0; i < numProductosS; i++) {
            System.out.println("Digite el código del producto S: ");
            codigo = sc.next();
            System.out.println("Digite el nombre del producto S: ");
            nombre = sc.next();
            System.out.println("Digite el precio del producto S: ");
            precio = sc.nextDouble();
            miSalsamentaria.adicionarProductoS(new ProductoS(codigo, nombre, precio));
        }

        double promedio = miSalsamentaria.calcularPromedioPrecios();
        System.out.println("\nEl promedio de precios es: " + promedio);
    }
}
