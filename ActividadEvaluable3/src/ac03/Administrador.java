package ac03;

import java.util.ArrayList;

public class Administrador extends Usuario implements MetodosAbstractos {	//herdando los atributos del Usuario y ademas usando los metodos abstractos de la interface

	public Administrador(int id, String nombre, String correo, String contrasena) {
		super(id, nombre, correo, contrasena);
		}
	
	@Override
	public void iniciarSesion() {
		System.out.println("Administrador iniciando sesion ");
	}

	@Override
	public void cerrarSesion() {
		System.out.println("Adeministrador cerrando sesion ");	
	}
  
	public void darAltaHabitacion(Habitacion habitacion, ArrayList<Habitacion>habitaciones) {
		habitaciones.add(habitacion);
		System.out.println("Habitación añadida: " + habitacion.toString());
	}
	public void darBajaHabitacion(Habitacion habitacion, ArrayList<Habitacion>habitaciones) {
		habitaciones.remove(habitacion);
		System.out.println("Habitación eliminada: " + habitacion.toString());
	}
	public void modificarDados (Habitacion habitacion, String tipo, double precioNoche) {
		habitacion.setTipo(tipo);
		habitacion.setPrecioNoche(precioNoche);
		System.out.println("Habitación modificada: " + habitacion.toString());
	}
}
