import java.util.Scanner;
// importing a scanner
public class CircleApp2 {
	public static void main (String args[]) {

double radius;
double area;
double circumference;
int diameter;

Scanner keyboard;
keyboard = new Scanner (System.in);

Circle myCircle;
myCircle = new Circle ();


System.out.println("Enter Diameter: ");
diameter = keyboard.nextInt();
area = myCircle.computeArea(diameter);
circumference = myCircle.computeCirc(diameter);
radius = (double) diameter / 2;

System.out.print("A circle of diameter " + diameter);
System.out.print(" has an area of " + area);
System.out.println(" and a circumference of " + circumference);
System.out.println(" on top of that, the radius is " + radius);


	}
}