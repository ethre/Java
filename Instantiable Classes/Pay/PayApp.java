import java.util.Scanner;

public class PayApp {
public static void main(String args[]){

	//declaring variables

	double basicPay;
	double regularHours;
	double overtimeHours;

	double totalBasicPay;
	double overtimePay;
	double totalPay;
	// declare / create objects

	Scanner keyboard;
	Pay myPay;

	keyboard = new Scanner(System.in);
	myPay = new Pay();

	//prompt user for input

	System.out.println("Bobs Basic PayRate per hour: ");
	basicPay=keyboard.nextDouble();

	System.out.println("Bobs hours: ");
	regularHours=keyboard.nextDouble();

	System.out.println("Bobs overtime hours: ");
	overtimeHours=keyboard.nextDouble();

	//computations etc

	myPay.setBasicPay(basicPay);
	myPay.setOverTimeHours(overtimeHours);
	myPay.setRegularHours(regularHours);

	myPay.computeTotalBasicPay();
	myPay.computeOvertimePay();
	myPay.computeTotalPay();

	totalBasicPay = myPay.getTotalBasicPay();
	overtimePay = myPay.getOvertimePay();
	totalPay = myPay.getTotalPay();

	//outputs

	System.out.println("Total pay/week: " + totalBasicPay);
	System.out.println("Overtime pay/week: " + overtimePay);
	System.out.println("Total pay/week: " + totalPay);

	}

}