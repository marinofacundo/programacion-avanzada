package patronState;

public class Alta extends Estado {

	@Override
	public void siguienteEstado(Empleado e) {
		e.estado = new Baja();
	}

	@Override
	public String estadoNombre() {
		// TODO Auto-generated method stub
		return "Alta";
	}

}
