import org.junit.Before;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GestionTest {
    private Tienda tienda;
    private Producto producto;
    private Cliente cliente;
    private Compra compra;

    @Before
    public void setUp() {
        // Configuración inicial para las pruebas
        Categoria categoria = new Categoria("Comida");
        producto = new Producto("123", "Manjarate", 500, categoria);
        tienda = new Tienda("Jumbo", "Av. Alemania", "9 AM - 10 PM");
        cliente = new Cliente("Benja", "321");
        compra = new Compra("123", new Date(), "Efectivo");
    }

    @Test
    public void testAgregarProducto() {
        tienda.agregarProducto(producto, 20);
        Map<Producto, Integer> inventario = tienda.consultarInventario();
        assertEquals(Integer.valueOf(20), inventario.get(producto));
    }

    @Test
    public void testRestarProducto() {
        tienda.agregarProducto(producto, 20);
        tienda.realizarVenta(producto, 5);
        Map<Producto, Integer> inventario = tienda.consultarInventario();
        assertEquals(Integer.valueOf(15), inventario.get(producto));
    }

    @Test
    public void testAgregarCompra() {
        tienda.agregarProducto(producto, 20);
        compra.agregarProducto(producto, 2);
        cliente.agregarCompra(compra);
        assertEquals(1, cliente.getCompras().size());
        assertEquals(compra.getNumeroCompra(), cliente.getCompras().get(0).getNumeroCompra());
    }

    @Test
    public void testTotalCompra() {
        tienda.agregarProducto(producto, 20);
        compra.agregarProducto(producto, 2);
        double total = compra.getTotal();
        assertEquals(1000, total);
    }

    @Test
    public void testInventarioVacio() {
        Map<Producto, Integer> inventario = tienda.consultarInventario();
        assertTrue(inventario.isEmpty());
    }

    @Test
    public void testReducirProductoMasDeLaCantidad() {
        tienda.agregarProducto(producto, 5);
        tienda.realizarVenta(producto, 10);
        Map<Producto, Integer> inventario = tienda.consultarInventario();
        assertFalse(inventario.containsKey(producto));
    }
}
