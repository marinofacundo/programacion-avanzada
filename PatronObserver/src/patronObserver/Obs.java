package patronObserver;

public class Obs implements IObserver{

	@Override
	public void Update(Double d) {
		System.out.println("Se modifico el valor" + d);		
	}

}
