import java.util.Scanner;
	public class PracticeApp{
		public static void main (String args[]){

			//declaring variables


	int hp, mp;
	int shieldhpmp;

			//getting the objects


	Scanner keyboard;
	Practice myPractice;

	keyboard = new Scanner(System.in);
	myPractice = new Practice();

	//do computations and return answers


	System.out.println("Please enter amount of your Health Points: ");
	hp=keyboard.nextInt();


	System.out.println("Enter amount of your Mana Points: ");
	mp=keyboard.nextInt();

	myPractice.setHP(hp);
	myPractice.setMP(mp);
	myPractice.computeShieldhpmp();
	shieldhpmp = myPractice.getShieldhpmp();

	System.out.println("Your combined amount of Points are: " + shieldhpmp);


	}
}


