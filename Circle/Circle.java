/*
 *Circle.java
 *@author Frances Sheridan
 *24th Sept 2012
 */

 public class Circle{
	 private double radius;
	 private double area;
	 private double circ;

	 public Circle(){
		 radius = 0.0;
		 area = 0.0;
		 circ = 0.0;
	 }

	 public double computeArea(double radius){
		 area = 3.14*(Math.pow(radius, 2));
		 return area;
	 }

	 public double computeCirc(double radius){
		 circ = 2 * 3.14*radius;
		 return circ;
	 }
 }