package aula11;

public class Aula11 {

	public static void main(String[] args) {
		
		//Visitante v1 = new Visitante();
		//v1.setNome("Justo");
		//v1.setIdade(24);
		//v1.setSexo("M");
		//System.out.println(v1.toString());
		
		Aluno a1 = new Aluno();
		a1.setNome("Cláudio");
		a1.setIdade(22);
		a1.setCurso("Programação");
		a1.setMatricula(1111);
		a1.setSexo("M");
		a1.pagarMensalidade();
		System.out.println(a1.toString());
		
		Bolsista b1 = new Bolsista();
		b1.setBolsa(12.5f);
		b1.setNome("Beto");
		b1.setMatricula(2222);
		b1.setSexo("M");
		b1.pagarMensalidade();
		
		Professor p1 = new Professor(null, 0, 0);
		p1.receberAumento();
	}

}
