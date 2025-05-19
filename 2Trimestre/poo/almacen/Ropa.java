package poo.almacen;

public class Ropa extends Producto{
	
	private String material;
	
	public Ropa(String name, String codigoBarras, float precio, String material) {
		super (name, codigoBarras, precio);
		this.material = material;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}	
}