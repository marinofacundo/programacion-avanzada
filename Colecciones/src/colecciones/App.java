package colecciones;

//import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

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
		List<Persona> l = new LinkedList<Persona>();
		l.add(new Persona("facu","mar"));
		l.add(new Persona("juan","perez"));
		l.add(new Persona("pablo","lopez"));

		for (Persona p : l) {
			System.out.println(p.toString());
		}
		
		Collections.sort(l);
		
		for (Persona p : l) {
			System.out.println(p.toString());
		}
	}

}
