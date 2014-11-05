import java.util.Scanner;

public class TemperatureApp {

	public static void main (String args[]){
		
		//variables
			
		double celc;
		double fahrenTotal;
			
		//declare and create objects
		
		
		Scanner keyboard;
		Temperature myTemperature;
		
		keyboard = new Scanner (System.in);
		myTemperature = new Temperature();
		
		//ask user for input
		
		System.out.println("Input Celsius: ");
		celc = keyboard.nextDouble();
				
		//import methods
		
		myTemperature.setNumCelc(celc);
		myTemperature.computeTotalFahren();
		fahrenTotal = myTemperature.getFahrenTotal();
		System.out.println("Your Fahren "+ fahrenTotal);
		
		
	}
	
	
}
