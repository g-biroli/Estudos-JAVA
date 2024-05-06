package ejemplosHerencia;

public class Persona {
	protected String dni, nombre;

	public Persona(String dni, String nombre) {
		this.dni = dni;
		this.nombre = nombre;
	}
	
	public String getDni()  {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public String getNombre() {
		return nombre;
	}
}



