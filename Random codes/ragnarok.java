import java.util.Scanner;


public class ragnarok {

	public static void main(String[] args) {
		
	//Importing Scanner	
	Scanner userInput = new Scanner(System.in);
	double StoneBuckler;
	
	//Calculate the SB
	System.out.println("How many Stone Bucklers have you got?");
	StoneBuckler = userInput.nextDouble();

	System.out.println("How many Hoods have you got?");
	StoneBuckler = userInput.nextDouble();
	
	System.out.println("How many Mufflers have you got?");
	StoneBuckler = userInput.nextDouble();
	
	
	//Cost of SB
	double costofsb = 700000*StoneBuckler;
	System.out.printf("The total value of Stone Bucklers is: %.0f", costofsb);	

		//Cost of Hood
		double costofhood = 11000*StoneBuckler;
		System.out.printf(" The total value of Hoods is: %.0f", costofhood);	
		
			//Cost of Hood
				double costofmuffler = 500000*StoneBuckler;
				System.out.printf(" The total value of Muffler is: %.0f", costofmuffler);	
		
		
	}

}
