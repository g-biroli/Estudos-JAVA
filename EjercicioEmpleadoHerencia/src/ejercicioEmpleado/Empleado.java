package ejercicioEmpleado;

public abstract class Empleado {
		protected String codigo, nombre;
		protected double salario;
		protected Empleado() {
			
		}
		protected Empleado(String codigo, String nombre, double salario) {
			this.codigo = codigo;
			this.nombre = nombre;
			this.salario = salario;
		}
		protected String getCodigo() {
			return codigo;
		}
		protected void setCodigo(String codigo) {
			this.codigo = codigo;
		}
		protected String getNombre() {
			return nombre;
		}
		protected void setNombre(String nombre) {
			this.nombre = nombre;
		}
		protected double getSalario() {
			return salario;
		}
		protected void setSalario(double salario) {
			this.salario = salario;
		}
		
		protected abstract void aumentarSalario (double valor);		//apenas mostrando que será usado esse metodo.
		
		public String toString () {
			return "El empleado con codigo " +codigo;
		}
		
}
