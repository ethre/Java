public class Practice {

	//declaring data members

	private int hp, mp;
	private int shieldhpmp;

	//constructor

	public Practice(){
		hp=0;
		mp=0;
}

	//methods

	public void setHP(int hp) {
		this.hp=hp;
	}
	public void setMP(int mp) {
		this.mp=mp;
	}
	public void computeShieldhpmp(){
		shieldhpmp = hp + mp;
	}
	public int getShieldhpmp() {
		return shieldhpmp;
	}
}