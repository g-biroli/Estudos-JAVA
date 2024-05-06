package ActividadEntornos;

import static org.junit.jupiter.api.Assertions.*;

import java.security.Principal;
import java.util.Arrays;
import java.util.Collection;

import javax.management.loading.PrivateClassLoader;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

public class Test {
	
	private double puntuacion;
	private int dificultad;
    
    public void testCalcularPuntuacion (double puntuacion, int dificultad) {
    	this.puntuacion = puntuacion;
    	this.dificultad = dificultad;
    	}
    
    public static Collection<Object[]> datos(){
    	return Arrays.asList(new Object [][] {
    	{10,2}, {5,3}, {0,1}
    	}
    	);
    }
    
    @org.junit.jupiter.api.Test
    public void TestCalcularPuntuación () {
    	assertEquals(20, Principal.CalcularPuntuacion(10, 2));
        assertEquals(15, Principal.CalcularPuntuacion(5, 3));
        assertEquals(0, Principal.CalcularPuntuacion(0, 1));
  	
 }
    public void testVerificarEdad() {
        assertEquals("Mira, eres mayor de edad, puedes participar en la prueba. Buena suerte. ", Principal.verificarEdad(20));
        assertEquals("Desafortunadamente no tienes edad para participar en la prueba.", Principal.verificarEdad(15));
    }


}
