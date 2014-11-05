import java.util.Scanner;

public class ProductsApp{
	public static void main(String args[]){


	//variables

	int oranges,apples;
	double totalvalue;

	//declare and create objects

	Scanner keyboard;
	Products myProducts;

	keyboard = new Scanner(System.in);
	myProducts = new Products();

	//asking for input

	System.out.println("Please enter the amount of oranges");
	oranges = keyboard.nextInt();

	System.out.println("Please enter the amount of apples");
	apples = keyboard.nextInt();

	//sets gets and compute

	myProducts.setNumOranges(oranges);
	myProducts.setNumApples(apples);
	myProducts.computeTotalValue();

	totalvalue = myProducts.getTotalValue();

	System.out.println("The total value of your oranges and apples is: " + totalvalue);





	}
}

