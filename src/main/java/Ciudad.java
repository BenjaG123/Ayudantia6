import java.util.ArrayList;
import java.util.List;

public class Ciudad {

	private String nombre;
	private String codigoPostal;
	private List<Tienda> tiendas;

	public Ciudad(String nombre, String codigoPostal) {
		this.nombre = nombre;
		this.codigoPostal = codigoPostal;
		this.tiendas = new ArrayList<Tienda>();
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigoPostal() {
		return this.codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public List<Tienda> getTiendas() {
		return this.tiendas;
	}

	public void setTiendas(List<Tienda> tiendas) {
		this.tiendas = tiendas;
	}

	public void agregarTienda(Tienda tienda){
		this.tiendas.add(tienda);
	}

}