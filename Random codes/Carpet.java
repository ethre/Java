import java.util.Scanner;
// importing my scanner
public class Carpet {
	public static void main (String args[]) {

int lenght, width;


Scanner keyboard;
keyboard = new Scanner (System.in);

System.out.println("Please enter the lenght of the carpet in meters:");
lenght = keyboard.nextInt();

System.out.println("Please enter the width of the carpet in meters:");
width = keyboard.nextInt();

System.out.println("The cost of your carpet is:" + lenght * width);
System.out.println("Your carpet costs:" + (lenght*width) * 25);

	}
}