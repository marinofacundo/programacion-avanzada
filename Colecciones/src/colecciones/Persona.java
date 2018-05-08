package colecciones;

public class Persona implements Comparable<Persona>{
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
public int compareTo(Persona o) {
    Persona p = o;
	return this.apellido.compareTo(p.apellido);
}

}
