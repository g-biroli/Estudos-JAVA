package ac03;

import java.sql.Date;

public class Reserva {
	
	private Cliente cliente;
	private Habitacion habitacion;
	private Date fechaInicio;
	private Date fechaFin;
	
	public Reserva(Cliente cliente, Habitacion habitacion, Date fechaInicio, Date fechaFin) {
		this.cliente = cliente;
		this.habitacion = habitacion;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Habitacion getHabitacion() {
		return habitacion;
	}

	public void setHabitacion(Habitacion habitacion) {
		this.habitacion = habitacion;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	@Override
	public String toString() {
		return "Reserva [Cliente=" + cliente.nombre + ", Habitación=" + habitacion.toString() + ", Desde: " + fechaInicio
				+ ", Hasta:" + fechaFin + "]";
	}
	
	
}
