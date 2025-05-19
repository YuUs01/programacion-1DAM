package poo.almacen;

public class Electronica extends Producto{
	private int garantia;
	private boolean garantiaActiva;
	public Electronica(String name, String codigoBarras, float precio, int garantia) {
		super(name, codigoBarras, precio);
		this.garantia = garantia;
		this.garantiaActiva=false;
	}
	public int getGarantia() {
		return garantia;
	}
	public void setGarantia(int garantia) {
		this.garantia = garantia;
	}
	
	public void plusGarantia (float extra) {
		if (garantia>=3 && garantiaActiva==false) {
			setPrecio(getPrecio()+ extra);
			garantiaActiva=true;
		}else if (garantia>=3 && garantiaActiva==true) {
			throw new IllegalArgumentException ("No se puede añadir la garantia, ya que está ya activa");
		}
	}	
}