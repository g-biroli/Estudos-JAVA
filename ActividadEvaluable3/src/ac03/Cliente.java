package ac03;

import java.sql.Date;
import java.util.ArrayList;

public class Cliente extends Usuario implements MetodosAbstractos{

	public Cliente(int id, String nombre, String correo, String contrasena) {
		super(id, nombre, correo, contrasena);
	}	
	
	@Override
	public void iniciarSesion() {
		System.out.println("Cliente iniciando sesión ");
	}
	
	@Override 
	public void cerrarSesion() {
		System.out.println("Cliente cerrando sesión");
	}
	
	public void reservarHabitacion(Habitacion habitacion, Date fechaInicio, Date fechaFin, ArrayList<Reserva> reservas) {
		Reserva nuevaReserva = new Reserva(this, habitacion, fechaInicio, fechaFin);
		reservas.add(nuevaReserva);
		System.out.println("Reserva realizada: " + nuevaReserva.toString());
	}
	public void verReservas(ArrayList<Reserva>reservas) {
		for (Reserva reserva : reservas) {
			if (reserva.getCliente().equals(this)) {
				System.out.println(reserva.toString());
			}
		}
	}
}
