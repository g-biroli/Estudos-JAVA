package ac03;

import java.sql.Date;
import java.util.ArrayList;

public class Hotel {

	public static void main(String[] args) {
		
		ArrayList<Habitacion>habitaciones = new ArrayList<Habitacion>();
		ArrayList<Reserva>reservas = new ArrayList<Reserva>();	
	
		Administrador a = new Administrador(11, "Gabriel", "gabrielhyj@hotmail.com", "12345678");
		a.setCorreo("gabrielbiroli@yahoo.com");
		a.setContrasena("123");
		a.iniciarSesion();
		Cliente c = new Cliente(12, "Luigi", "luigifgh@hotmail.com", "12345");
		
		Date fechaInicio = new Date(16);
		Date fechaFin = new Date(fechaInicio.getTime() + (1000 * 60 * 20 * 24));
		c.reservarHabitacion(null, null, null, reservas); //perguntar ao professor, como adicionar essas respotas de data
		a.darAltaHabitacion(null, habitaciones);
		a.darBajaHabitacion(null, habitaciones);
		//Tarea enviada
	}

}
