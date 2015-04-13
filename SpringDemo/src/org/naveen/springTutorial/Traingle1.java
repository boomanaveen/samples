package org.naveen.springTutorial;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

//BeanNameAware will give you the name of the bean from the ApplicationContext.xml
public class Traingle1 implements ApplicationContextAware, BeanNameAware{
	//Tutorial 11 - Scope - prototype
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	private ApplicationContext appContext = null;
	
	@Override
	public void setApplicationContext(ApplicationContext context)
			throws BeansException {
		this.appContext = context;
	}
	
	@Override
	public void setBeanName(String beanName) {
		System.out.println("Triangle1 Bean Name is : " + beanName);
		
	}
	
	public Point getPointA() {
		return pointA;
	}
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	public Point getPointB() {
		return pointB;
	}
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	public Point getPointC() {
		return pointC;
	}
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public void draw() {
		System.out.println("Triangle1 Parent Point A = " + getPointA().getX() +", "+getPointA().getY());
		if(getPointB()!= null){
			System.out.println("Triangle1 Child 1 Point B = " + getPointB().getX() +", "+getPointB().getY());			
		}
		if(getPointC()!= null){		
			System.out.println("Triangle1 Child2 Point C = " + getPointC().getX() +", "+getPointC().getY());
		}
	}

}
