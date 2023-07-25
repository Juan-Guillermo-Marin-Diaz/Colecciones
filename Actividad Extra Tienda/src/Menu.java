public class Menu {

    public static void main(String[] args) {

        ProductoService pdt = new ProductoService();

        pdt.crearProducto();
        pdt.mostrarProducto();

        pdt.updateProducto("galleta", 4);
        pdt.mostrarProducto();

    }
}
