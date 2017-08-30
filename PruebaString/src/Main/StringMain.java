package Main;

public class StringMain {
	
public static void main(String[] args) {
	
ManejoString ms = new ManejoString();

String str = null;

ms.mitadcarac(str);

try {
	ms.cantidadCaracteres(str);
} catch(NullPointerException e){
	
}
  catch (Exception e) {
  System.out.println("error");
}

}
}
