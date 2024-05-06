package estudos;

public class ProdutoTestar {

	public static void main(String[] args) {
		
		//terstar os produtos da parte 1
		//Construtor padrao
		Produto p1 = new Produto();
		p1.nome = "Caneta Preta";
		p1.marca = "Bic";
		p1.valor = 1.50f;
				
		//construtor de dois parametros:
		Produto p2 = new Produto("Caneta Vermelha", "Faber");
		p2.valor = 1.69f;
		
		
		//construtor de tres paramentros:
		Produto p3 = new Produto("Borracha","Mercur", 1.89f);
		
		//objeto p1
		System.out.println("Nome: " + p1.nome + ", Marca: " + p1.marca + ", Valor: " + p1.valor);
		
		//objeto p2
		System.out.println("Nome: " + p2.nome + ", Marca: " + p2.marca + ", Valor; " + p2.valor);
				
		//objeto p3
		System.out.println("Nome: " + p3.nome + ", Marca: " + p3.marca + ", Valor; " + p3.valor);
		
		

	}

}
