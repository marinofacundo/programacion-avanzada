package colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class App {

	public static void main(String[] args) {
		
//		Persona pers = new Persona();
//		ArrayList<Persona> per = new ArrayList<Persona>();
//		per.add(pers);
//		Persona pers2 = new Persona();
//		pers2 = per.get(per.size()-1);
//		if (per.isEmpty()) {
//			
//		}
//		
//		for (Persona persona : per) {
//			
//		}
//		
//		LinkedList<Persona> l = new LinkedList<Persona>();
//		Set<Persona> lista = new HashSet<Persona>();
		Set<Persona> lista = new TreeSet<Persona>();
		
		
		lista.add(new Persona("facu","mar"));
		lista.add(new Persona("juan","perez"));
		lista.add(new Persona("pablo","lopez"));

//		for (Persona p : l) {
//			System.out.println(p.toString());
//		}
		
		Map mapa = new HashMap();
		
		mapa.put("nombre", "Facundo");
		mapa.put("apellido", "Mariño");
		
//		Object o = mapa.get("nombre");
//		System.out.println(o.toString());
		
		Set claves = mapa.keySet();
		
		for (Object obj : claves) {
			System.out.println(mapa.get(obj).toString());
		}
//		Collections.sort(l);
//		
//		for (Persona p : l) {
//			System.out.println(p.toString());
//		}
	}

}
