package colecciones;

public class Persona implements Comparable{
public String nombre;
public String apellido;

public Persona(String nom, String apell) {
	this.nombre = nom;
	this.apellido = apell;
}

@Override
	public String toString() {
	    String cadena = this.nombre + " " + this.apellido;
		return cadena.toString();
	}

@Override
public int compareTo(Object o) {
    Persona p = (Persona) o;
	return this.apellido.compareTo(p.apellido);
}

}
