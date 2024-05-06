package estudos;


public class Carro {
	//criacao da estrutura de dados para o objeto carro -> objetivo da aula
	
	//NESSA CLASSE SE CRIA O OBJETO CARRO COMO UM MOLDE, NADA ESPECIFICO, NAO ESTAMOS CRIANDO CARRO A OU B AINDA; APENAS A CLASSE CARRO(GENERAL)
	
	
	//atributos
	String nome;
	String marca;
	int ano;
	int vel;
	
	//metodos
	void acelerar(int aceleracao) {
		vel+=aceleracao;
	}
	
	void freiar(int reduzir) {
		vel-=reduzir;
	}
	
	void buzinar() {
		System.out.println("bibibi");
	}
}
