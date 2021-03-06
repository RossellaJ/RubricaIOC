package it.alfasoft.rossella;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring.xml");

		Rubrica r = (Rubrica) context.getBean("rubrica");

		Voce v = r.getVoceByName("Martina");
		System.out.println(v.getNome()+" "+v.getCognome()+" "+v.getTelefono());

	}

}
