public class Temperature {

	double celc;
	double fahrenTotal;
	

	//constructor

public Temperature(){
	
	
	celc=0;
	fahrenTotal=0;
	
	}

//setmethods

public void setNumCelc(double celc){
	this.celc = celc;
}

public void computeTotalFahren(){
	fahrenTotal = (celc*1.8) + 32;
}

public double getFahrenTotal(){
	return fahrenTotal;
}


}


