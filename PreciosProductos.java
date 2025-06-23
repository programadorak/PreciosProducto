public class PreciosProductos {
    public static void main(String[] args) {
        double[] precios = {
            10.50, 15.75, 8.99, 20.00, 13.45,
            9.99, 18.30, 22.10, 11.25, 17.80,
            14.00, 16.99, 12.60, 19.40, 7.85
        };

        System.out.println("Lista de precios de los productos:");
        for (int i = 0; i < precios.length; i++) {
            System.out.println("Producto " + (i + 1) + ": $" + precios[i]);
        }
    }
}