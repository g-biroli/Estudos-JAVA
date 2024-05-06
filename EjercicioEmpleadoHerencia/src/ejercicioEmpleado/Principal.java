package ejercicioEmpleado;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		Empleado emp;
		
		operario op = new operario();
		
		ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();
			
		emp = new operario();		//crio operario
		listaEmpleados.add((operario)emp);	//guardo operario na array
		
		emp = new Directivo();
		listaEmpleados.add((Directivo)emp);
		
		for(Empleado emp1: listaEmpleados) {
			if (emp1 instanceof Directivo) {
				
			}
		}

	}

}
