
public class Empleado {
	String nombre, apellido, dni;		//Atributos
	int edad;
	boolean casado; //duvida no metodo desse(nao sei qual metodo usar)
	double salario;
	
	 public Empleado(String nombre, String apellido, String dni, int edad, boolean casado, double salario) {
		 this.nombre = nombre;					// hacendo el constructor del Empleado
		 this.apellido = apellido;	
		 this.dni = dni;
		 this.edad = edad;
		 this.casado = casado;
		 this.salario = salario;
	 }

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected String getApellido() {
		return apellido;
	}

	protected void setApellido(String apellido) {
		this.apellido = apellido;
	}

	protected String getDni() {
		return dni;
	}

	protected void setDni(String dni) {
		this.dni = dni;
	}

	protected int getEdad() {
		return edad;
	}

	protected void setEdad(int edad) {
		this.edad = edad;
	}

	protected boolean isCasado() {
		return casado;
	}

	protected void setCasado(boolean casado) {
		this.casado = casado;
	}

	protected double getSalario() {
		return salario;
	}

	protected void setSalario(double salario) {
		this.salario = salario;
	}
	 
	
	 
	 // duvida se no enunciado da tarefa "metodo da idade, se for menor ou 21 principiante, maior q 22 e menor q 35
	 // intermedio. A duvida é se esse metodo eu faco na propria aba do empleado ou no principal.
	 // nao sei qual o metodo do BOOLEAN, na minha cabeca nao faz sentido ser getBoolean e setBoolean. Ver na aula.
	 
	 
}