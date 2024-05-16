package ejemplos;

import java.util.List;
import java.util.Objects;

public abstract class Muniemon implements Atacable {
	private int vida;
	protected String nombre;
	private List<Poder> listaPoderes;
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return "Muniemon [vida=" + vida + ", nombre=" + nombre + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(nombre, vida);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Muniemon other = (Muniemon) obj;
		return Objects.equals(nombre, other.nombre);
	}
	@Override
	public void atacar(Object o) throws IllegalArgumentException{
		if(o instanceof Muniemon) {
			Muniemon m = (Muniemon)o;
			m.setVida(m.getVida() - 5);
		}else {
			throw new IllegalArgumentException();
		}
		
	}
	
	
	
	
	
	

}
