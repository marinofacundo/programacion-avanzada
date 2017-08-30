package Main;

import java.lang.Character.Subset;

public class ManejoString {
	private int num;
	
	public void cantidadCaracteres(String s)throws Exception {
		if (s.equals("")) {
			throw new Exception("CadenaVacia");
		}
		System.out.println(s.length());
	}
	
	public void mitadcarac(String s){
    if (s == null) {
	throw NullPointerException();	
	}
	num = s.length();
	num = num/2;
	System.out.println(s.substring(0,num));
	}
}
