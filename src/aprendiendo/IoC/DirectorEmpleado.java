package aprendiendo.IoC;

public class DirectorEmpleado implements IEmpleados {
	
	private String nombre;
	private String email;
	private String empresa;
	private ICreacionInformes informeNuevo;


	//Inyección por setter
	public String getEmail() {
		return email;
	}
	//Inyección por setter
	public void setEmail(String email) {
		this.email = email;
	}
	//Inyección por setter
	public String getEmpresa() {
		return empresa;
	}
	//Inyección por setter
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	
	//Inyección por constructor
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
	
	//Método init. Tareas anteriores a disponibilidad. (puede tener cualquier nombre)
	public void Init() {
		System.out.println("Tareas previas a entregar el bean, recibir dependencias por ejemplo");
	}
	
	//Método destroy. Tareas posteriores al uso. (puede tener cualquier nombre)
	public void Destroy() {
		System.out.println("Tareas posteriores a usar el bean, eliminarlo de memoria por ejemplo");
	}

}
