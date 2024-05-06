package Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

//1. Realiza un programa que pida 6 números por teclado y nos diga cuál es el máximo. Si el usuario introduce un dato erróneo
//   (algo que no sea un número entero) el programa debe indicarlo, lanzar una excepción y debe pedir de nuevo el número.
public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int max=0;
		int numero;
		int count = 1;
		
		do {
			try {
				System.out.println("Introduce el numero " + count + ": ");
				numero = sc.nextInt();
				if (count == 1 || numero > max) {		
					max = numero;
				}
				count++;
			} catch (InputMismatchException e) {
				System.out.println("Error, se debe introducir un numero entero");
				sc.next();
			}
		}while (count < 7);
		
		System.out.println("El numero maximo es igual a : " + max);
	}
}
