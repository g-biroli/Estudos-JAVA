package ac03;

public abstract class Usuario { //Hacer la clase abstracta para que sólo pueda ser utilizada como molde de ejemplo para las otras clases 
	
	protected int id;
	protected String nombre;
	protected String correo;
	protected String contrasena;
	
	public Usuario(int id, String nombre, String correo, String contrasena) {
		this.id = id;
		this.nombre = nombre;
		this.correo = correo;
		this.contrasena = contrasena;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	
	
	
	
		
}
