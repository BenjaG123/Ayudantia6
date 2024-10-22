import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Tienda {

	private String nombre;
	private String direccion;
	private String horarioAtencion;
	private List<Empleado> empleados;
	private Inventario inventario;

	public Tienda(String nombre, String direccion, String horarioAtencion) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.horarioAtencion = horarioAtencion;
		empleados = new ArrayList<>();
		inventario = new Inventario();
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getHorarioAtencion() {
		return this.horarioAtencion;
	}

	public void setHorarioAtencion(String horarioAtencion) {
		this.horarioAtencion = horarioAtencion;
	}

	public List<Empleado> getEmpleados() {
		return this.empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}

	public Inventario getInventario() {
		return this.inventario;
	}

	public void setInventario(Inventario inventario) {
		this.inventario = inventario;
	}

	public void agregarEmpleado(Empleado empleado) {
		this.empleados.add(empleado);
	}

	public void agregarProducto(Producto producto, int cantidad) {
		inventario.agregarProducto(producto, cantidad);
		System.out.println("Se agregaron "+cantidad+" unidades de "+producto);
	}

	public void realizarVenta(Producto producto, int cantidad) {
		inventario.restarProducto(producto, cantidad);
	}

	public Map<Producto, Integer> consultarInventario() {
		return inventario.getProductos();
	}
}