package generics;

public class Calculadora <T extends Number>{
	public T num1;
	public T num2;
	
	public Calculadora(T n1, T n2) {
		this.num1 = n1;
		this.num2 = n2;
	}
	public Number sumar(T n1, T n2){
		return n1.intValue() + n2.intValue();
		
	}
}
