package ejemplosHerencia;

public class Alumna extends Persona{
	protected String numExp;
	protected String nombre;
	
	protected Alumna(String dni, String nombre, String numExp) {
		super(dni, nombre);
		this.numExp = numExp;
	}
	

	public String getNumExp() {
		return numExp;
	}
	
	public void setNumExp(String numExp) {
		this.numExp = numExp;
	}
	
	public void getNombre (String nombre) {
		this.nombre = nombre;
	}
//metodo com void é um metodo sem retorno, o valor nao é tao importante, é um valor que nao precisa ser armazenado
//já um metodo com return, é um metodo que o resultado da variavel string, int, ... será armazenado e possivelmente usado futuramente.
}
