package aprendiendo.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class usoDemoSingletonPrototipe {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext-singleton-prototipe.xml");
		
		SecretarioEmpleado sec1 = contexto.getBean("crearSecretario", SecretarioEmpleado.class);
		SecretarioEmpleado sec2 = contexto.getBean("crearSecretario", SecretarioEmpleado.class);

		System.out.println(sec1);
		System.out.println(sec2);
		System.out.println(sec1.getInforme());
		
		contexto.close();	
	}

}
