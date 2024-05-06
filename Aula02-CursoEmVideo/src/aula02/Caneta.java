package aula02;

public class Caneta {
	String modelo;
	String cor;		//atributos para caneta
	float ponta;
	int carga;
	boolean tampada;
	
	void status() {
		System.out.println("Modelo: "+ this.modelo);
		System.out.println("Cor: "+ this.cor);			//metodo status para a caneta
		System.out.println("Ponta: "+ this.ponta);
		System.out.println("Carga atual em: "+ this.carga);
		System.out.println("Ela está tampada? "+ this.tampada);
	}

	
	void rabiscar() {
		if (this.tampada == true) {
			System.out.println("Erro! Nao posso rabiscar");
		} else {
			System.out.println("Estou rabiscando");
		}
	}
	
	void tampar () {
		this.tampada = true;
	}
	
	void destampar () {
		this.tampada = false;
	}
}
