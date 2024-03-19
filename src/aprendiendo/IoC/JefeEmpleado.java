package aprendiendo.IoC;

public class JefeEmpleado implements IEmpleados {
	
	private String nombre;
	private ICreacionInformes informeNuevo;
	
	public JefeEmpleado(ICreacionInformes informe) {
		this.informeNuevo = informe;
	}
	
	public String getNombre() {
		if(nombre != null)
			return nombre;
		return "Este jefe no tiene Nombre";
	}
	
	public void setNombre(String valor) {
		if(valor.length() > 3)
			nombre = valor;
	}
	
	public String getTareas() {
		return "Gestiono cosas de mis empleados";
	}

	@Override
	public String getInforme() {
		return "Informe creado por el jefe: " + informeNuevo.getInforme();
	}
	
}
