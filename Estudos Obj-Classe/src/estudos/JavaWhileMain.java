package estudos;

public class JavaWhileMain {

	public static void main(String[] args) {
		// TRUE ou False
		// Sempre que o valor da funcao for "TRUE", tudo que esta dentro da funcao sera executado.
		// while nada mais é que uma funcao criada para funcionar com uma condicao.
		// primeiro se cria a variavel da condicao, assim o codigo verificará se é verdadeiro ou falso e dará continuidade
		int n = 0;
		int x = 2;
		while(n < 3) { 	
	
			System.out.println("Teste");
			n++; // n++ = soma de n+1, assim a funcao funcionara 3 vezes e depois encerrara, devido 3 ser igual a 3.
			
		do {
			System.out.println("palmeirasssssss");
		} while (x > 3);
		  x++;
		}
	}// while -> pode ser que seja executado nenhuma vez ou muitas vezes
}	 // enquanto que o DO WHILE -> é garantido que será executado pelo menos uma vez



