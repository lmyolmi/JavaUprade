package entidad;

public class PlacaBase {
	private String marca;
	private double precio;
	private String tipo;
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public String toString() {
		return "PlacaBase [marca=" + marca + ", precio=" + precio + ", tipo=" + tipo + "]";
	}
	
	
}
