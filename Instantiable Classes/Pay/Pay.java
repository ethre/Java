public class Pay{


//Data Members

private double basicPay;
private double regularHours;
private double overtimeHours;

private double overtimePayRate;
private double totalBasicPay;
private double overtimePay;
private double totalPay;

//Constructor

public Pay(){
	basicPay = 0;
	regularHours = 0;
	overtimeHours = 0;
	overtimePayRate = 1.5;
}
//Methods
	public void setBasicPay(double basicPay){
		this.basicPay=basicPay;
	}
	public void setOvertimePayRate(double overtimePayRate){
			this.overtimePayRate=overtimePayRate;
	}
		public void setRegularHours(double regularHours){
			this.regularHours=regularHours;
	}
			public void setOverTimeHours(double overtimeHours){
				this.overtimeHours=overtimeHours;
	}

//compute

public void computeTotalBasicPay(){
	totalBasicPay=(basicPay*regularHours);
}
public void computeOvertimePay(){
	overtimePay=((basicPay*overtimePayRate)*overtimeHours);
}
public void computeTotalPay(){
	totalPay=totalBasicPay+overtimePay;
}

//gets

public double getTotalBasicPay(){
	return totalBasicPay;
}

public double getOvertimePay(){
	return overtimePay;
}
public double getTotalPay(){
	return totalPay;

	}
}