/**
 * 
 */
package com.example.projectspring.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Properties;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.projectspring.dao.DisqueraDAO;

/**
 * @author
 * Clase de prueba unitaria que permite realizar pruebas con el framework spring
 */
class SpringTest {

	@Test
	void testContext() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		assertNotNull(context);
		
		DisqueraDAO disqueraDAO = (DisqueraDAO) context.getBean("disqueraDAO");
		assertNotNull(disqueraDAO);
		
		DisqueraDAO disqueraDAO2 = (DisqueraDAO) context.getBean("disqueraDAO");
		
		System.out.println("Contexto cargado");
		System.out.println(disqueraDAO);
		System.out.println(disqueraDAO2);
		
		// properties
		Properties properties = (Properties) context.getBean("properties");
		System.out.println(properties.get("spring-username"));
	}

}
