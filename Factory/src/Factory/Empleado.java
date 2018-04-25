package Factory;

public class Empleado {
String nombre;
String apellido;
int cuil;
String estado;
int sueldo;
int cantHorasTrabajadas;
TipoCobro tipoCobro;

public Empleado(String n, String a, int c, String e, int h, TipoCobro t) {
	this.nombre = n;
	this.apellido = a;
	this.cuil = c;
	this.estado = e;
	this.cantHorasTrabajadas = h;
	this.tipoCobro =  t;
}
}
