package Factory;

public class SueldoPorHora extends CalculoSueldo{

	@Override
	public int calcular(Empleado e) {
		return (e.cantHorasTrabajadas * 100);				
	}

}
