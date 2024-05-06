package ejercicioEmpleado;


public final class Directivo extends Empleado {

	@Override
	protected void aumentarSalario(double valor) {
		salario -= valor;
		
	}
	

}
