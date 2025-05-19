package poo.almacen;

import java.util.ArrayList;


public class Venta{
	private String codigoVenta;
	private ArrayList<Producto> productos;
	
		
	public Venta(String codigoVenta) {
		this.codigoVenta=codigoVenta;
		this.productos = new ArrayList<>();
	}
	
	public void agregarProducto(Producto producto) {
		productos.add(producto);
	}
	
	
	public String getCodigoVenta() {
		return codigoVenta;
	}


	public float calcTotal() {
		float total=0;
		for (Producto producto : productos) {
			total += producto.getPrecio();
		}
		return total;
	}
	public String getCodigoBarras() {
        return "Venta-" + getCodigoVenta();
    }
}
