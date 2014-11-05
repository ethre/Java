//importing stuff

import java.util.Scanner;
public class MakingChange {
	public static void main (String args[]) {

		// variables
		int a,b,c,d,e,f;
		int amount;
		int cost;

		a=50;
		b=20;
		c=10;
		d=5;
		e=2;
		f=1;

//fine shiny objects

Scanner keyboard;
keyboard = new Scanner(System.in);

System.out.println("Amount customer gave us: ");
amount = keyboard.nextInt();

System.out.println("How much it costs: ");
cost = keyboard.nextInt();

cost =amount-cost;
System.out.println("Change is: " + cost);

//such nice outputs o-ó

System.out.println("Your change in 50s : "+ (cost / a) );
System.out.println("Your change in 20s: "+ (cost % a) /b );
System.out.println("Your change in 10s: "+ ((cost % a) %b)/c);
System.out.println("Your change in 5s: "+ (((cost % a) %b)%c)/d);
System.out.println("Your change in 2s: "+ ((((cost % a) %b)%c )%d)/e);
System.out.println("Your change in 1s: "+ (((((cost % a) %b)%c )%d)%e)/f);



	}
}

