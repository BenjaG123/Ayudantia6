import java.util.ArrayList;
import java.util.List;

public class Territorio {

	private String nombre;
	private List<Region> regiones;

	public Territorio(String nombre) {
		this.nombre = nombre;
		this.regiones = new ArrayList<Region>();
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Region> getRegiones() {
		return this.regiones;
	}

	public void setRegiones(List<Region> regiones) {
		this.regiones = regiones;
	}

	public void agregarRegion(Region region) {
		this.regiones.add(region);
	}
}