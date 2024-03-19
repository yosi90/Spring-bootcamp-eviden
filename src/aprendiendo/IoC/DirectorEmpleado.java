package aprendiendo.IoC;

public class DirectorEmpleado implements IEmpleados {
	
	private String nombre;
	private String email;
	private String empresa;
	private ICreacionInformes informeNuevo;

	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	
	public DirectorEmpleado(ICreacionInformes informe) {
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

	@Override
	public String getTareas() {
		return "Gestionar plantilla";
	}

	@Override
	public String getInforme() {
		return "Informe creado por el director: " + informeNuevo.getInforme();
	}

}
