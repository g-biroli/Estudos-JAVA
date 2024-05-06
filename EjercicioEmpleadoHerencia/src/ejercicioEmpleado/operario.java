package ejercicioEmpleado;

public class operario extends Empleado{
	protected String ciudadAsig;
	
	@Override
	protected void aumentarSalario(double valor) {
		salario += valor;		//mais um metodo que possivelmente sera usado na classe principal
		
	}
	
	public String toString() {
		return super.toString() + " esta asignado en "+ciudadAsig;
	}
	
}
