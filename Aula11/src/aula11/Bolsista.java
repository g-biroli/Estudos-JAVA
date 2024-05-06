package aula11;

public class Bolsista extends Aluno{
	private float bolsa;
	
	public void renovarBolsa() {
		System.out.println("Renovando bolsa de " + this.getNome());
	}
	@Override	
	public void pagarMensalidade() {	//criando o mesmo metodo herdado, porem subscrito para que funcione. Assim o programa roda os dois metodos, com condicoes e acoes diferntes.
		System.out.println(this.getNome() + " é bolsista! Pagamento facilitado");
	}
	public float getBolsa() {
		return bolsa;
	}
	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}
	
}
