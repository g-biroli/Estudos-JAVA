import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		int edad = 0;;
		int dificultad = 0;;
		int opcion;;
		double puntuacion = 0, puntuacionfinal;
		boolean salir = false;
		ArrayList<Equipo>listaEquipo = new ArrayList<Equipo>();
		
		Scanner sc = new Scanner(System.in);
		
		Equipo p = new Equipo(null, null, edad, puntuacion, dificultad);
		listaEquipo.add(p);

		do  {
			mostrarMenu();
			opcion=sc.nextInt();
			switch (opcion) {
				case 1: System.out.println("Dime tu puntuación: ");
						puntuacion=sc.nextDouble();
						System.out.println("Dime la dificultad del ejercicio, 1 para ejercicios fáciles, 2 para medios y 3 para difíciles: .");
						dificultad = sc.nextInt();
						double puntuacionFinal = CalcularPuntuación(puntuacion, dificultad);
						System.out.println("Puntuacion Final es: " +puntuacionFinal);		
						
						break;
				
				case 2: System.out.println("Dime tu edad: ");
						edad=sc.nextInt();
						verificarEdad(edad);
						break;
				case 3: salir = true;
                    	System.out.println("Salindo");
                    	break;
                    		
			}
		}while(opcion!=3);
	}

		public static void mostrarMenu() {
			System.out.println("Menu de opciones");			
			System.out.println("1. Calcular la puntuación del equipo");
			System.out.println("2. Comprobar si estoy en condiciones de participar en la prueba");
			System.out.println("3. Salir");
		}		
		
		public static int CalcularPuntuacion (double puntuacion, int dificultad) {
			return (int) (puntuacion * dificultad);
		}
		
		public static void verificarEdad(int edad) {
				if(edad >= 18) {
					System.out.println("Mira, eres mayor de edad, puedes participar en la prueba. Buena suerte. ");					
				}	else {
					System.out.println("Desafortunadamente no tienes edad para participar en la prueba.");
				}
		}
		

}


