package aula11;

public class Professor extends Pessoa{
	private String especialidade;
	private int salario;
	private float aumento;
	
	public void receberAumento() {
		System.out.println("Parabens você recebeu um aumento, agora seu salário passa a ser " + this.getSalario());
	}

	public Professor(String especialidade, int salario, float aumento) {
		super();
		this.especialidade = especialidade;
		this.salario = 2500;
		this.aumento = 0.125f;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public float getSalario() {
		return salario + (salario * aumento);
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public float getAumento() {
		return aumento;
	}

	public void setAumento(float aumento) {
		this.aumento = aumento;
	}
	
}
