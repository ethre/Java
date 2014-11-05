import java.util.Scanner;
// importing a scanner
public class CircleApp {
	public static void main (String args[]) {

double radius;
double area;
double circumference;

Scanner keyboard;
keyboard = new Scanner (System.in);

Circle myCircle;
myCircle = new Circle ();


System.out.println("Enter Radius: ");
radius = keyboard.nextDouble();
area = myCircle.computeArea(radius);
circumference = myCircle.computeCirc(radius);

System.out.print("A circle of radius " + radius);
System.out.print(" has an area of " + area);
System.out.println(" and a circumference of " + circumference);



	}
}