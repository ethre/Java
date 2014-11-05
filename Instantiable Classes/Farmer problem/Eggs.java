public class Eggs {

	//Data Members

	private int numEggs;
	private int spare;
	private final int DOZEN;
	private int boxes;

	//Constructor

	public Eggs(){
		numEggs=0;
		spare=0;
		DOZEN=12;
		boxes=0;
}
	//Methods
	public void setNumEggs(int numEggs){
		this.numEggs=numEggs;
	}
	public void computeSpare(){
		spare=numEggs%DOZEN;
	}
	public int getBoxes(){
		return boxes;
	}

	public int getSpare(){
		return spare;
	}
	public void computeBoxes(){
		boxes=numEggs/DOZEN;
	}

}
