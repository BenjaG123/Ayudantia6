import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Compra {

	private String numeroCompra;
	private Date fecha;
	private String formaPago;
	private int total;
	private List<Producto> productos;

	public Compra(String numeroCompra, Date fecha, String formaPago) {
		this.numeroCompra = numeroCompra;
		this.fecha = fecha;
		this.formaPago = formaPago;
		this.productos = new ArrayList<Producto>();
	}

	public String getNumeroCompra() {
		return this.numeroCompra;
	}

	public void setNumeroCompra(String numeroCompra) {
		this.numeroCompra = numeroCompra;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getFormaPago() {
		return this.formaPago;
	}

	public void setFormaPago(String formaPago) {
		this.formaPago = formaPago;
	}

	public int getTotal() {
		total=0;
		for (Producto producto : productos) {
			total+=producto.getPrecio();
		}
		return this.total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public List<Producto> getProductos() {
		return this.productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	public void agregarProducto(Producto producto, int cantidad) {
		for (int i = 0; i < cantidad; i++){
			productos.add(producto);
		}
		System.out.println("Se agregaron "+cantidad+" unidades de "+producto.getDescripcion()+" a la compra n° "+numeroCompra);
	}

	@Override
	public String toString() {
		return "Compra n° " + numeroCompra + " - Total: " + getTotal();
	}
}