package Factory;

public class Fabrica {
	
	public CalculoSueldo CrearSueldo(TipoCobro tipo){
	if (tipo.equals(TipoCobro.Mensual)) {
		return new SueldoMensual();
	}else if (tipo.equals(TipoCobro.PorHora)) {
		return new SueldoPorHora();
	}
	return null;	
	}
}
