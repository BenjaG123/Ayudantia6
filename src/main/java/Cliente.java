import java.util.ArrayList;
import java.util.List;

public class Cliente {

	private String nombre;
	private String numeroCliente;
	private List<Compra> compras;

	public Cliente(String nombre, String numeroCliente) {
		this.nombre = nombre;
		this.numeroCliente = numeroCliente;
		this.compras = new ArrayList<Compra>();
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumeroCliente() {
		return this.numeroCliente;
	}

	public void setNumeroCliente(String numeroCliente) {
		this.numeroCliente = numeroCliente;
	}

	public List<Compra> getCompras() {
		return this.compras;
	}

	public void setCompras(List<Compra> compras) {
		this.compras = compras;
	}

	public void agregarCompra(Compra compra) {
		this.compras.add(compra);
		System.out.println("Compra registrada por: "+compra);
	}
}