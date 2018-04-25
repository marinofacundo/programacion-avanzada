package patronObserver;

public class App {

	public static void main(String[] args) {
		Dolar d = new Dolar();
		Obs o = new Obs();
		
		d.add(o);
		d.setValor(20d);
		
	}

}
