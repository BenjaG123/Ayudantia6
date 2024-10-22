public class Producto {

	private String codigo;
	private String descripcion;
	private int precio;
	private Categoria categoria;

	public Producto(String codigo, String descripcion, int precio, Categoria categoria) {
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precio = precio;
		this.categoria = categoria;
	}

	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getPrecio() {
		return this.precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public Categoria getCategoria() {
		return this.categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return descripcion + " (Código: " + codigo + ", Precio: " + precio + ")";
	}
}