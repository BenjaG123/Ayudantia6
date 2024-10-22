public class Empleado {

	private String nombre;
	private String numeroIdentificacion;
	private String cargo;

	public Empleado(String nombre, String numeroIdentificacion, String cargo) {
		this.nombre = nombre;
		this.numeroIdentificacion = numeroIdentificacion;
		this.cargo = cargo;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumeroIdentificacion() {
		return this.numeroIdentificacion;
	}

	public void setNumeroIdentificacion(String numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}

	public String getCargo() {
		return this.cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

}