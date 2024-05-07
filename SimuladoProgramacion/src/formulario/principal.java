package formulario;

import java.util.ArrayList;
import java.util.Scanner;
// Comentario professor: Muito bem, Gabriel, há vários aspectos que você deve levar em conta. 1 - O nome da classe do formulário, que deveria ser usuário. 2 - Você tem erros na classe principal. 3 - Você não verifica se todas as seções foram concluídas antes de sair. A estrutura não é ruim, mas você precisa praticá-la. Atenciosamente.
public class principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String nombre, apellido, email, dni;
		int opcion;
		
		do {
			mostrarMenu();
			opcion=sc.nextInt();
			switch (opcion) {
			case 1: 
					rellenarNombre(sc, nombre);
					break;
			case 2: 
					rellenarApellido(sc, apellido);
					break;
					
			case 3: 
					rellenarDni(sc, dni);
					break;
			
			case 4: 
					rellenarEmail(sc, email);
					break;
			case 5:
                 if (datosCompletos(nombre, apellido, dni, email)) {
                     System.out.println("Gracias por relenar el formulario.");
                     return; 
                 } else {
                     System.out.println("Faltan datos por rellenar.");
                 }
                 break;
			} while (opcion != 5);
	}	
			
			public static void mostrarMenu() {
				System.out.println("Menu de opciones");
				System.out.println("1. Rellenar nombre");
				System.out.println("2. Rellenar apellidos");
				System.out.println("3. Rellenar DNI");
				System.out.println("4. Rellenar e-mail");
				System.out.println("5. Finalizar");
			}
			
			private static void rellenarNombre(Scanner sc, String nombre) {
		        System.out.print("Introduzca tu nombre: ");
		        String nombre = sc.next();
		    }
			public static void rellenarApellido(Scanner sc, String apellido) {
		        System.out.print("Introduzca tu apellido: ");
		        String apellido = sc.next();
		    }
			private static void rellenarDni(Scanner sc, String dni) {
		        System.out.print("Introduzca tu dni: ");
		        String dni = sc.next();
		    }
			private static void rellenarEmail(Scanner sc, String email) {
		        System.out.print("Introduzca tu email: ");
		        String email = sc.next();
		    }
			
			private static boolean datosCompletos(String nombre, String apellido, String dni, String email) {
			    return nombre.length() > 0 && apellido.length() > 0 && dni.length() > 0 && email.length() > 0;
			}

}
