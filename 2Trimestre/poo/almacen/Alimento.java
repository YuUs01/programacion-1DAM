package poo.almacen;
import poo.fecha.*;
public class Alimento extends Producto{
	private Fecha fecha;
	public Alimento(String name, String codigoBarras, float precio, Fecha fecha) {
		super(name, codigoBarras, precio);
		this.fecha = fecha;
	}
	public Fecha getFecha() {
		return fecha;
	}
	public void setFecha(Fecha fecha) {
		this.fecha = fecha;
	}
}
