
public class Programador extends Empleado {		//herencia del Empleado
	int lineasDeCodigoPorHora;					// nuevos atributos
	String lenguajeDominante;
	
	protected Programador(String nombre, String apellido, String dni, int edad, boolean casado, double salario,
			int lineasDeCodigoPorHora, String lenguajeDominante) {
		super(nombre, apellido, dni, edad, casado, salario);
		this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
		this.lenguajeDominante = lenguajeDominante;
	}

	protected int getLineasDeCodigoPorHora() {
		return lineasDeCodigoPorHora;
	}

	protected void setLineasDeCodigoPorHora(int lineasDeCodigoPorHora) {
		this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
	}

	protected String getLenguajeDominante() {
		return lenguajeDominante;
	}

	protected void setLenguajeDominante(String lenguajeDominante) {
		this.lenguajeDominante = lenguajeDominante;
	}

	
}
