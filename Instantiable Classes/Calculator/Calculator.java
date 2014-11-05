public class Calculator {

	//Data Members

	private int x,y;
	private int sum;
	private int difference;

	//Constructor

	public Calculator(){
		x=0;
		y=0;
	}

	//Methods
	public void setX(int x){
		this.x =x;
	}
	public void setY(int y){
		this.y =y;
	}
	public void computeSum(){
		sum =x+y;
	}
	public void computeDifference(){
		difference =x-y;
	}
	public int getSum(){
		return sum;
	}
	public int getDifference(){
		return difference;
	}
}
