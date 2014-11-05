import java.util.Scanner;
	public class EggsApp {
		public static void main (String args[]){

			//declaring variables

				int numEggs;
				int spare;
				final int DOZEN;
				int boxes;

				//deckare /create objectss

				Scanner keyboard;
				Eggs  myEggs;

				keyboard = new Scanner(System.in);
				myEggs = new Eggs();

				//prompt user for input

				System.out.println("How many eggs: ");
				numEggs=keyboard.nextInt();

				//set inputs, do computations, return answers


				myEggs.setNumEggs(numEggs);
				myEggs.computeSpare();
				myEggs.computeBoxes();
				spare = myEggs.getSpare();
				boxes = myEggs.getBoxes();

				System.out.println("The number of boxes is: " + boxes);
				System.out.println("The spare is: " + spare);

			}
		}