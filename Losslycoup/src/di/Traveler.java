package di;

public class Traveler {
	
	public vehicle getV() {
		return v;
	}


	public void setV(vehicle v) {
		this.v = v;
	}


	private vehicle v;
	
	
public	void statjourney() {
		v.move();
	}

}
