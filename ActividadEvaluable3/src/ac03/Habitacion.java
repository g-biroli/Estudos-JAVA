package ac03;

public class Habitacion {
	
	private int id;
	private String tipo;
	private double precioNoche;
	private boolean disponible;
	
	public Habitacion(int id, String tipo, double precioNoche, boolean disponible) {
		this.id = id;
		this.tipo = tipo;
		this.precioNoche = precioNoche;
		this.disponible = disponible;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPrecioNoche() {
		return precioNoche;
	}

	public void setPrecioNoche(double precio) {
		this.precioNoche = precio;
	}

	public boolean getDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	@Override
	public String toString() {
		return "Habitacion [Id=" + id + ", Tipo=" + tipo + ", Precio por noche: €" + precioNoche + ", disponible=" + disponible
				+ "]";
	}
	
}
