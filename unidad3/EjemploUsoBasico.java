package unidad3;

public class EjemploUsoBasico {
    public static void main(String[] args) {
        System.out.println("hola estoy en el main");
        for (String parametro : args) {
            System.out.println("Parametro " + parametro);
        }

        int edad;
        String nombre;
        Producto gta6 = new Producto();
        Producto gta5 = gta6;

        gta6.nombre = "Grand Theft Auto";
        gta6.precio = 89.99;
        gta6.stock = 10;
        gta6.categoria = "Free roam";
        gta5.nombre = "Gta5 es mas chuli";
        System.out.println("El precio es: " + gta6.precio);
        System.out.println("El nombre es " + gta6.nombre);

        gta6.aplicarDescuento(10);

        System.out.println("El precio es " + gta6.precio);

        int nuevoStock = gta6.recibirStock(100);
        System.out.println("El stock es " + gta6.stock);
    }
}
