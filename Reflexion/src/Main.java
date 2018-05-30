import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import otro.Persona;

public class Main {

	public static void main(String[] args) {
		Persona persona = new Persona();
		persona.setNombre("Facundo");
		persona.setApellido( "Mariño");;
		
		Class clase = persona.getClass();
		
		Object[] attrs = new Object[1];
		attrs[0] = "Facundo";
		//System.out.println(clase.getName());    //da el package completo
		//System.out.println(clase.getSimpleName());    //da solo el nombre

		// getFields devuelve solo los atributos que se puedan leer desde afuera
		// getDeclaredFields solo devuelve los atributos para la clase con la que estoy trabajando
		// getMethod devuelve todos los metodos de la clase y hasta los heredados. Si es private no lo trae
		// getDeclaredMethods Devuelve los metodos declarados en la clase
		for (Method m : clase.getDeclaredMethods()) {
			//System.out.println(m.getName()); //+ "  " + f.getType());	
			
			if (m.getName().startsWith("set")) {
			
					Object o;
					try {
						o = m.invoke(persona, attrs);
					} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					//System.out.println(o);

			}			
		}
		for (Method m : clase.getDeclaredMethods()) {
			//System.out.println(m.getName()); //+ "  " + f.getType());	
			
			if (m.getName().startsWith("get")) {
			
					Object o;
					try {
						o = m.invoke(persona, null);
						System.out.println(o);
					} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
						e.printStackTrace();
					}
					//

			}	
		}
	}

}
