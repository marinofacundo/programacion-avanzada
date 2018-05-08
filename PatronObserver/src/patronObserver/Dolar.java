package patronObserver;

public class Dolar extends Subject{
	Double valor;
	
	public void setValor(Double valor) {
		this.valor = valor;
		super.notifyObs(valor);
	}
}
