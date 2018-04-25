package Factory;

public class SueldoMensual extends CalculoSueldo{

	@Override
	public int calcular(Empleado e) {
		return (e.cantHorasTrabajadas * 20);
	}
}
