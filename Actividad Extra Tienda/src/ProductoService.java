import java.util.ArrayList;
import java.util.Scanner;

public class ProductoService {

   private ArrayList<Producto> inventario = new ArrayList<>();

    public ArrayList<Producto> getInventario() {
        return inventario;
    }

    public void setInventario(ArrayList<Producto> inventario) {
        this.inventario = inventario;
    }

    Scanner scan = new Scanner(System.in);

    public void crearProducto() {

        Producto producto = new Producto();

        System.out.println("Por favor ingrese un producto");
        producto.setNombre(scan.next());

        System.out.println("Por favor ingrese la categoria del producto");
        producto.setCategoria(scan.next());

        System.out.println("Por favor ingrese el precio del producto");
        producto.setPrecio(scan.nextDouble());

        System.out.println("Por favor ingrese la cantidad de producto");
        producto.setCantidad(scan.nextInt());

        inventario.add(producto);

    }

    public void mostrarProducto() {

        for (Producto producto : inventario) {

            System.out.println(producto);

        }

    }



    public void updateProducto(String nombre, int cantidad) {

        for (Producto p1 : inventario
             ) {
            if (p1.getNombre().equalsIgnoreCase(nombre)) {

                p1.setCantidad(cantidad);
                break;
            }

        }
    }

    public void deleteProducto(String nombre) {

        for (Producto p1 : inventario
        ) {
            if (p1.getNombre().equalsIgnoreCase(nombre)) {

                inventario.remove(p1);
                break;
            }
        }
    }
}
