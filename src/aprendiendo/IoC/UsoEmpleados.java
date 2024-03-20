package aprendiendo.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {
		/*
		IEmpleados Empleado1 = new DirectorEmpleado();
		
		System.out.println(Empleado1.getTareas());
		*/
		
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		DirectorEmpleado Pepe = contexto.getBean("crearDirector", DirectorEmpleado.class);
		IEmpleados emp = contexto.getBean("crearJefe", IEmpleados.class);
		SecretarioEmpleado secreta = contexto.getBean("crearSecretario", SecretarioEmpleado.class);
		contexto.close();

		System.out.println(Pepe.getTareas());
		System.out.println(Pepe.getInforme());
		System.out.println(Pepe.getEmail());
		System.out.println(Pepe.getEmpresa());
		
		emp.setNombre("Juan");

		System.out.println(emp.getNombre());
		System.out.println(emp.getInforme());

		System.out.println(secreta.getNombre());
		System.out.println(secreta.getInforme());
		System.out.println(secreta.getEmail());
		System.out.println(secreta.getEmpresa());
		
	}

}
