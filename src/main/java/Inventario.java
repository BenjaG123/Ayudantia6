import java.util.HashMap;
import java.util.Map;

public class Inventario {

	private Map<Producto, Integer> productos;

	public Inventario() {
		this.productos = new HashMap<Producto, Integer>();
	}

	public Map<Producto, Integer> getProductos() {
		return this.productos;
	}

	public void setProductos(Map<Producto, Integer> productos) {
		this.productos = productos;
	}

	public void agregarProducto(Producto producto, int cantidad) {
		this.productos.put(producto, productos.getOrDefault(producto, 0) + cantidad);
	}

	public void restarProducto(Producto producto, int cantidad) {
		if (this.productos.containsKey(producto)) {
			int nuevaCantidad = this.productos.get(producto) - cantidad;
			if (nuevaCantidad <= 0) {
				this.productos.remove(producto);
			} else {
				this.productos.put(producto, nuevaCantidad);
			}
		}
	}

}