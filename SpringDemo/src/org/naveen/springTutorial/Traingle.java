package org.naveen.springTutorial;

import java.util.List;

public class Traingle {
//Use collection - Tutorail 9
	private List<Point>points;
	
	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}
	
	/*Instead of the seperate use list...
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
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
	}*/

	//--------------------------------------------------------------------	
//	private String type;
//	private int height;
//	
//	public int getHeight() {
//		return height;
//	}
//
//	/**
//	 * Step 2, Added Getters and setters
//	 */
//	public String getType() {
//		return type;
//	}
////	public void setType(String type) {
////		this.type = type;
////	}
//	
//	/**
//	 * Step 3, create constructor,
//	 * Now Spring will pass value to the const instead of setters
//	 */
//	public Traingle(String type){
//		this.type = type;
//	}
//	
//	public Traingle(int height){
//		this.height = height;
//	}
//	
//	public Traingle(String type, int height){
//		this.type = type;
//		this.height = height;
//	}
	
	

	public void draw() {
//		System.out.println(getType() + " Triangle drawn of heigh " + getHeight());
//		System.out.println("Point A = " + getPointA().getX() +", "+getPointA().getY());
//		System.out.println("Point B = " + getPointB().getX() +", "+getPointB().getY());
//		System.out.println("Point C = " + getPointC().getX() +", "+getPointC().getY());
	
		for(Point pt: points){
			System.out.println("Triangle Point = (" + pt.getX() +", "+ pt.getY() + ")");
		}
	}
}
