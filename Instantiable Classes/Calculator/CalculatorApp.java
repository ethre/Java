import java.util.Scanner;
	public class CalculatorApp{
		public static void main (String args[]){

			//declaring variables
			int x,y;
			int sum;
			int difference;

			//declare /create objects

			Scanner keyboard;
			Calculator myCalc;

			keyboard = new Scanner(System.in);
			myCalc = new Calculator();

			//prompt user for input
			System.out.println("Enter first number: ");
			x=keyboard.nextInt();
			System.out.println("Enter second number: ");
			y=keyboard.nextInt();

			//set inputs, do computations, return answers

			myCalc.setX(x);
			myCalc.setY(y);
			myCalc.computeSum();
			myCalc.computeDifference();
			sum = myCalc.getSum();
			difference = myCalc.getDifference();

			System.out.println("The sum of " + x + " and " + y + " is " + sum);
			System.out.println("The difference of " + x + " and " + y + " is " + difference);

		}
	}