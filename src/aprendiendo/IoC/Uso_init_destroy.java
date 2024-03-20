package aprendiendo.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Uso_init_destroy {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext-init-destroy.xml");

		DirectorEmpleado dir = contexto.getBean("crearDirector", DirectorEmpleado.class);
		System.out.println(dir);
		
		contexto.close();
	}

}
