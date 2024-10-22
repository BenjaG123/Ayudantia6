import java.util.ArrayList;
import java.util.List;

public class Region {

	private String nombre;
	private List<Ciudad> ciudades;

	public Region(String nombre) {
		this.nombre = nombre;
		ciudades = new ArrayList<Ciudad>();
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Ciudad> getCiudades() {
		return this.ciudades;
	}

	public void setCiudades(List<Ciudad> ciudades) {
		this.ciudades = ciudades;
	}

	public void agregarCiudad(Ciudad ciudad) {
		this.ciudades.add(ciudad);
	}
}