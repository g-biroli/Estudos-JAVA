package ejercicioTablets;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String codigo, marca, modelo, color, dni, nombre, apellidos, movil;
		double precio;
		int opcion;
		
		// Depois de colocar todas as informacoes do exercicio, com info dos clientes e tablets. Agr preciso armazenar 
		// os dados, entao sem segredo, ArrayList
		
		ArrayList<Tablets>listaTablets = new ArrayList<Tablets>();
		ArrayList<Clientes>listaClientes = new ArrayList<Clientes>();
		do {
			mostrarMenu();
			opcion=sc.nextInt();
			switch(opcion) {
			case 1:System.out.println("Introduzca el codigo");
				   codigo=sc.next();
				   if(!comprobarTablet(codigo, listaTablets)) {
					   insertarTablet(codigo, sc, listaTablets);
					   System.out.println("Tablet insertada correctamente");
				   }
				   System.out.println("Introduzca la marca");
				   marca=sc.next();
				   System.out.println("Introduzca el modelo");
				   modelo=sc.next();
				   System.out.println("Introduzca el color");
				   color=sc.next();
				   System.out.println("Introduzca el precio");
				   precio=sc.nextInt();
				   Tablets t = new Tablets(codigo, marca, modelo, color, precio);
				   listaTablets.add(t);
				
				break;
			case 2: 
				break;
			case 3:
				break;
			case 4: System.out.println("Introduzca el codigo");
					codigo=sc.next();
					if (comprobarTablet(codigo, listaTablets)) {
						mostrarTablet(codigo, listaTablets);
					}
				break;
			case 5:
				break;
			case 6: System.out.println("Hasta Pronto");
				break;
			default: System.out.println("Opcion Incorrecta");
			}
	} while (opcion!=6);
	
	}
	
		private static void mostrarTablet(String codigo, ArrayList<Tablets> listaTablets) {
		// TODO Auto-generated method stub
		
	}

		public static void mostrarMenu() {
		//Criacao de um menu para que o cliente selecione a acao.
		System.out.println("Menu Principal");
		System.out.println("1.- Dar de alta tablet");
		System.out.println("2.- Dar de alta client");
		System.out.println("3.- Vender um tablet");
		System.out.println("4.- Mostrar tablets disponibles");
		System.out.println("5.- Mostrar tablets de un cliente");
		System.out.println("6.-Salir");
	}
		//Fazendo um mecanismo para comprovar que o dado que o cliente mande, seja igual a base de dados do item (codigo)
		// hardcore este aqui, precisa ser estudado e praticado. Sinceramente eu entendi a logica, mas nao o meio.
		public static boolean comprobarTablet(String codigo, ArrayList<Tablets>listaTablets) {
			boolean existe=false;
			for(Tablets t1:listaTablets) {
				if(t1.getCodigo().equals(codigo)) {
					System.out.println("La tablet ya existe");
					existe=true;
					break;
				} 
			}
			return existe;
		}
		public static void insertarTablet(String codigo, Scanner sc, ArrayList<Tablets>listaTablets) {
			System.out.println("Introduzca el marca");
			String marca=sc.next();
			System.out.println("Introduzca el modelo");
			String modelo=sc.next();
			System.out.println("Introduzca el color");
			String color=sc.next();
			System.out.println("Introduzca el precio");
			double precio=sc.nextDouble();
			Tablets t = new Tablets(codigo, marca, modelo, color, precio);
			listaTablets.add(t);
		}
}
