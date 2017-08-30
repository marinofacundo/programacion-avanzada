package Main;

public class Calculadora implements Icalcular{
    private Number numAux;
	@Override
	public Double sumar(Number num1, Number num2) {
		numAux = num1 + num2;
		return numAux;
	}

	@Override
	public Double restar(Number num1, Number num2) {
		numAux = num1 - num2;
		return numAux;
	}

	@Override
	public Double multiplicar(Number num1, Number num2) {
		numAux = num1 * num2;
		return numAux;
	}

	@Override
	public Double dividir(Number num1, Number num2) {
		numAux = num1 / num2;
		return null;
	}

}
