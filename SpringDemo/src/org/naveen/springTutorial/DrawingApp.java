package org.naveen.springTutorial;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {
	public static void main(String[] args){
		/**
		 * Scenario 1
		 * By creating a new instance
		 */
		/*Traingle triangle = new Traingle();
		triangle.draw();*/
		
		/**
		 * Scenario 2 - Using BeanFactory, FileSystemResource
		 * You use BeanFactory only when the resources are crutial, So use ApplicationContext.xml
		 */
		/*BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		Traingle triangle = (Traingle) factory.getBean("triangle");
		triangle.draw();*/
		
		/**
		 * Scenario 3 - Using ApplicationContext.xml
		 */
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Traingle triangle = (Traingle) context.getBean("triangle");
		triangle.draw();
		
		Traingle1 triangle1 = (Traingle1) context.getBean("parentTriangle");
		triangle1.draw();
		
		Traingle1 Childtriangle1 = (Traingle1) context.getBean("childTraiangle1");
		Childtriangle1.draw();
		
		Traingle1 Childtriangle2 = (Traingle1) context.getBean("childTraiangle2");
		Childtriangle2.draw();
		
		/**
		 * Scenario 4 - Will have to initialize pointA, pointB, pointC, instead we are using applicationContext.xml
		 */
	}
	
}
