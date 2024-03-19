package aprendiendo.IoC;

public class SecretarioEmpleado implements IEmpleados {
	
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
	
	public void setInformeNuevo(ICreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	public String getNombre() {
		if(nombre != null)
			return nombre;
		return "Este empleado no tiene Nombre";
	}
	
	public void setNombre(String valor) {
		if(valor.length() > 3)
			nombre = valor;
	}

	@Override
	public String getTareas() {
		return "Gestiono agendas";
	}

	@Override
	public String getInforme() {
		return "Esta informe se ha generado con un Setter" + informeNuevo.getInforme();
	}

}
