package poo.almacen;

public class Producto {
	private String name, codigoBarras;
	private float precio;
	
	public Producto(String name, String codigoBarras, float precio) {
		this.name = name;
		this.codigoBarras = codigoBarras;
		this.precio = precio;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}	
}