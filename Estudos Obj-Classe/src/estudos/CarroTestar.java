package estudos;

public class CarroTestar {

	public static void main(String[] args) {
		// AGORA É HORA DE CRIAR UM CARRO ESPECIFICO COM BASE NAS INFOS DA OUTRA CLASSE CRIADA (CLASSE MOLDE)
		// criacao dos atributos desse carro especifico
		
		Carro c1 = new Carro();
		
		c1.nome = "Uno";
		c1.marca = "Fiat";
		c1.ano = 2015;
		c1.vel = 60;
		
		//metodos agora - acao do carro
		
		c1.acelerar(10);
		
		System.out.println("A velocidade atual do carro é de: " +c1.vel + "km/hr");
		
		c1.freiar(30);
		
		System.out.println("A velocidade do carro é de: " +c1.vel + "km/hr");
			
	}

}
