package Factory;

import java.awt.List;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class Aplicación {

	public static void main(String[] args) {
		LinkedList<Empleado> empleados = new LinkedList<Empleado>();
		
		empleados.add(new Empleado("Matias","Perez", 1254679870, "Soltero", 10, TipoCobro.Mensual));
		empleados.add(new Empleado("Facundo","Perez", 1254679870, "Soltero", 40, TipoCobro.PorHora));
		empleados.add(new Empleado("Raul","Alba", 1254679870, "Casado", 120, TipoCobro.Mensual));
		empleados.add(new Empleado("Juan","Perez", 1254679870, "Soltero", 12, TipoCobro.Mensual));
		empleados.add(new Empleado("Pedro","Perez", 1254679870, "Soltero", 90, TipoCobro.PorHora));
		
		Fabrica miFabrica = new Fabrica();
		
		 
		 for (Empleado e : empleados) {
			 int i = miFabrica.CrearSueldo(e.tipoCobro).calcular(e);
			 System.out.println(i);
		}
	}

}
