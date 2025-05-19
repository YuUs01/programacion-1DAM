package poo.almacen;

public class TestVentas {
	public static void main(String[] args) {

		Producto pizza = new Producto("Pizza", "001", 3.5f);
		Producto pijama = new Producto("Pijama", "002", 30.0f);
		Producto mp3 = new Producto("Reproductor MP3", "003", 80.0f);


		Venta venta = new Venta("V001");


		venta.agregarProducto(pizza);
		venta.agregarProducto(pijama);
		venta.agregarProducto(mp3);


		float total = venta.calcTotal();

		total += 8.5f;
		System.out.println("El total de la compra es: " + total);
	}
}