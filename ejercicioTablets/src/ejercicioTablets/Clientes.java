package ejercicioTablets;

public class Clientes {
	protected String dni, nombre, apellidos, movil;

	protected Clientes(String dni, String nombre, String apellidos, String movil) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.movil = movil;
	}

	protected String getDni() {
		return dni;
	}

	protected void setDni(String dni) {
		this.dni = dni;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected String getApellidos() {
		return apellidos;
	}

	protected void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	protected String getMovil() {
		return movil;
	}

	protected void setMovil(String movil) {
		this.movil = movil;
	}
}
