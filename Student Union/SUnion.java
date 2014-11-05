public class SUnion {

	//data members

	private int shirts,hoodies,caps;
	private int totalcost;

	//constructor

	public SUnion(){

		shirts = 0;
		hoodies = 0;
		caps = 0;
	}
	//set methods

	public void setNumShirts(int shirts){
		this.shirts = shirts;
	}

	public void setNumHoodies(int hoodies){
		this.hoodies = hoodies;

	}

	public void setNumCaps(int caps){
		this.caps = caps;
	}

	public void computeTotalCost(){
		totalcost = (10 * shirts) + (20 * hoodies) + (5 * caps);
	}

	public int getTotalCost(){
		return totalcost;

	}

}