package ejemplosHerencia;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Principal {
// Exercicio escondido aqui
	public static void main(String[] args) {

		//Ejercicio Ejemplo		
		//	Persona p = new Persona(null, null);
		//	System.out.println("Tu dni es: " +p.getDni());
		//	p.setDni("4328J");
		//	System.out.println("Tu dni ahora es: "+p.getDni());
			
		//	Persona p1 = new Persona("987", "Gabriel");
		//	System.out.println("Tu dni es: "+p1.getDni());
			
		//	Alumna a = new Alumna("875967J", "Beto", "00000");
		//	System.out.println("Tu dni es: "+a.getDni());
		//	System.out.println("Tu nombre es: "+a.getNombre());
		//	System.out.println("Tu expediente es: "+a.getNumExp());
			
		//	Profesor pr = new Profesor("sdr", "Luigi", 5879.90);
		
	}
		String dni;
		int opcion; 
		Scanner sc = new Scanner(System.in);
		ArrayList<Persona>listaPersonas = new ArrayList<Persona>();
		Persona p = new Persona(dni, dni) ;
		do  {
			mostrarMenu();
			opcion=sc.nextInt();
			switch (opcion) {
				case 1: System.out.println("Dime tu dni: ");
						dni=sc.next();
						if(existePersona(dni, listaPersonas)) {			//metodo para comprovar se a alumna 
							darAltaAlumna(dni, listaPersonas, sc,p);	//ja existe no cadastro na base de dados
						} else {
							System.out.println("La alumna ya existe");
						break;
			
				case 2: System.out.println("Dime tu dni: ");
						dni=sc.next();
						if(existePersona(dni, listaPersonas)) {			 
							darAltaAlumna(dni, listaPersonas, sc,p);	
						} else {
							System.out.println("La alumna ya existe");
						break;
				case 3: System.out.println("Dime tu dni: ");
						dni=sc.next();
						if(existePersona(dni, listaPersonas)) {			 
							darBajaPersona(dni, listaPersonas);	
						} else {
						System.out.println("La alumna no existe");
						break;
				case 4: System.out.println("Dime tu dni: ");
						dni=sc.next();
						if(!existePersona(dni, listaPersonas)) {			 
							darBajaPersona(dni, listaPersonas);	
						} else {
							System.out.println("El profesor no existe");
						break;
				case 5: System.out.println("Dime tu dni: ");
						dni=sc.next();
						if(!existePersona(dni, listaPersonas)) {			 
							mostrarSalario(dni, listaPersonas);	
						} else {
							System.out.println("El profesor no existe");
						break;

		}while(opcion!=6);

		public void mostrarMenu() {
			System.out.println("Menu de opciones");
			System.out.println("1. Dar alta alumna");
			System.out.println("2. Dar alta profesor");
			System.out.println("3. Dar baja alumna");
			System.out.println("4. Dar baja profesor");
			System.out.println("5. Mostrar salario de un profesor");
			System.out.println("6. Salir");
		}
		public static boolean existePersona(String dni, ArrayList<Persona> listaPersonas) {
			boolean existe=false;
			for(Persona per: listaPersonas) {
				if(per.getDni().equals(dni)) {
					existe=true;
					break;
				}
			}
			}
			return existe;

		public static void darAltaAlumna(String dni, ArrayList<Persona>listaPersonas, Scanner sc, Persona p) {
			System.out.println("Dime tu nombre: ");
			String nombre=sc.next();
			System.out.println("Dime tu expediente: ");
			String expe=sc.next();
			p = new Alumna(dni, nombre, expe);
			listaPersonas.add((Alumna)p); //pedindo para a Arraylist(listaPersonas) adicione o dado pessoa P.
		}
		public static void darAltaProfesor(String dni, ArrayList<Persona>listaPersonas, Scanner sc, Persona p) {
			System.out.println("Dime tu nombre: ");
			String nombre=sc.next();
			System.out.println("Dime tu salario: ");
			Double salario =sc.nextDouble();
			p = new Profesor(dni, nombre, salario);
			listaPersonas.add(p); 
		}	
		public static void darBajaPersona (String dni, ArrayList<Persona>listaPersonas) {
			for(Persona per:listaPersonas) {
				if(per.getDni().equals(dni)) {
					listaPersonas.remove(per);
					break;
				}
			}
		}
		public static void mostrarSalario (String dni, ArrayList<Persona>listaPersonas) {
			for (Persona per: listaPersonas) {
				if (per instanceof Profesor) {
					if (per.getDni().equals(dni)) {
						System.out.println(per.toString());
					}
				}
					
				}
			}
		
}

