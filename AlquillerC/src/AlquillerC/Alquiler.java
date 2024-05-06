package AlquillerC;

//criando os atributos
public class Alquiler {
	private int PrecioDiario;
	private int Descuento;
	
//Acoes do exercício (Reservar e alugar o carro) 2 procedimentos:
	public Alquiler ( int PrecioDiario, int Descuento) {
		this.PrecioDiario = PrecioDiario;
		this.Descuento = Descuento;	
	}
public int ReservarCoche(int NumeroDias) {
	if (NumeroDias >0) {
		int precio = ((NumeroDias*PrecioDiario)-Descuento);
		return precio;	
	}
	else {
		return -1;
	}
}
}
