import java.util.ArrayList;
import java.util.Scanner;

import javax.sql.rowset.CachedRowSet;

import ejemplosHerencia.Alumna;
import ejemplosHerencia.Persona;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String dni;
		int opcion, edad;
		double salario;
		ArrayList<Programador> listaProgramador = new ArrayList<Programador>();
		
		Programador p = new Programador(null, null, null, 0, false, 0, 0, null);
		listaProgramador.add(p);
		
		do {
			mostrarMenu();
			opcion=sc.nextInt();
			switch (opcion) {
			case 1: 
					System.out.println("Dime tu dni: ");
					dni=sc.next();
					if(existePersona(dni, listaProgramador)) {			 
					darAltaProgramador(dni, listaProgramador, sc, p);	
					} else {
					System.out.println("El Programador ya existe");
					}break;
					
			case 2: System.out.println("Dime tu dni: ");
					dni=sc.next();
					if(existePersona(dni, listaProgramador)) {			 
						darBajaProgramador(dni, listaProgramador);	
					} else {
					System.out.println("El Programador no existe");
					}break;
					
			case 3: System.out.println("Dime tu edad: ");
					edad=sc.nextInt();
					if(edad == 21) {
						System.out.println("Principiante");					//ayuda del chatGpt, no se si esto es correcto
					}														//pero pude comprender
					if (edad >=22 && edad <=35) {
						System.out.println("Intermedio");
					}
					if (edad > 35) {
						System.out.println("Senior");
					}	
			
			case 4: System.out.println("Dime tu salario");
					salario=sc.nextDouble();
					if (salario > 1000) {
						salario += (salario * 0.10);
					}	else {
						salario += (salario * 0.40);
					}
					System.out.println("Tu nuevo salario es: "+salario);
				
				}
			} while(opcion!=5);
			
			
	}

	
		public static void mostrarMenu() {
			System.out.println("Menu de opciones");
			System.out.println("1. Dar alta Programador");
			System.out.println("2. Dar baja Programador");
			System.out.println("3. Comprobar tipo de programador");
			System.out.println("4. Aumentar salario de un Programador");
			System.out.println("5. Salir");
	}
		
		public static boolean existePersona(String dni, ArrayList<Programador>listaProgramador) {
			boolean existe=false;
			for(Programador p: listaProgramador) {
				if(p.getDni().equals(dni)) {
					existe=true;
					break;
				} else {
					System.out.println("Esta persona ya existe.");
				}
			}
				return existe;
		}
		
		public static void darAltaProgramador(String dni, ArrayList<Programador>listaProgramador, Scanner sc, Programador p) {
			System.out.println("Dime tu nombre: ");
			String nombre=sc.next();
			System.out.println("Dime tu apellido: ");
			String apellido=sc.next();
			p = new Programador(dni, nombre, apellido, 0, false, 0, 0, null);
			listaProgramador.add((Programador)p); 
	}
		
		public static void darBajaProgramador(String dni, ArrayList<Programador> listaProgramador) {
			for(Programador p:listaProgramador) {
				if(p.getDni().equals(dni)) {
					listaProgramador.remove(p);
					break;
				}
			}
		}		
		
}
