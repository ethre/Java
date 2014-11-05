import java.util.Scanner;

public class SUnionApp {
	public static void main (String args[]){

		int shirts,hoodies,caps;
		int totalcost;

		Scanner keyboard;
		SUnion mySUnion;

		keyboard = new Scanner(System.in);
		mySUnion = new SUnion();


		System.out.println("Please enter the amount of shirts you want: ");
		shirts = keyboard.nextInt();


		System.out.println("Please enter the amount of hoodies you want: ");
		hoodies = keyboard.nextInt();


		System.out.println("Please enter the amount of caps you want: ");
		caps = keyboard.nextInt();


		mySUnion.setNumShirts(shirts);
		mySUnion.setNumHoodies(hoodies);
		mySUnion.setNumCaps(caps);
		mySUnion.computeTotalCost();


		totalcost = mySUnion.getTotalCost();

		System.out.println("The total price for your goods is: "+ totalcost);

	}
}
