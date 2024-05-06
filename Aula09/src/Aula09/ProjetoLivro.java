package Aula09;

public class ProjetoLivro {

	public static void main(String[] args) {
		Pessoa[] p = new Pessoa[2];
		Livro[] l = new Livro[3];

		p[0] = new Pessoa("Gabriel", "M", 24);
		p[1] = new Pessoa ("Julia", "F", 23);
		
		l[0] = new Livro ("Aprendendo Java", "José da Silva", 300, p[0]);
		l[1] = new Livro ("POO para Iniciantes", "Luigi Amaral", 400, p[1]);
		l[2] = new Livro ("Java avançado", "Maria Candido", 200, p[0]);
		
		
		l[0].abrir();
		l[0].folhear(27);
		System.out.println(l[0].detalhes());
	}

}
