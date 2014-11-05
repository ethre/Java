public class Products {

	// data members
	private	int oranges,apples;
	private	double totalvalue;

	//constructor

	public Products(){

		oranges = 0;
		apples = 0;
		totalvalue = 0;

	}

	// methods
	// sets
	public void setNumOranges(int oranges){
			this.oranges=oranges;
		}

	public void setNumApples(int apples){
			this.apples=apples;
		}

	//process
	//compute

	public void computeTotalValue(){
		totalvalue = (1.25*apples) + (2.25*oranges);
	}

	public double getTotalValue(){
		return totalvalue;

	}
}