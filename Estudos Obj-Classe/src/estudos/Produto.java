package estudos;

public class Produto {
		
		//atributos
	String nome;
	String marca;
	float valor; //armazenar um valor com ponto flutuante
	
		//construtores
		// Usamos o "this" para fazer a relacao entre os dois NOME, MARCA.(Relacao do atributo com a variavel que recebera um valor)
	 Produto () {
		
	}
	
	 Produto(String nome){
		this.nome = nome;
	}
	 Produto(String nome, String marca) {
		this.nome = nome;
		this.marca = marca;	
	}
	Produto(String nome, String marca, float valor) {
		this.nome = nome;
		this.marca = marca;
		this.valor = valor;
	}
	}

	


