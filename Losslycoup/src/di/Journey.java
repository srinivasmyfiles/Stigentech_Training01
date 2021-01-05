package di;

public class Journey {

	public static void main(String[] args) {
     Traveler tr= new Traveler();
    		 tr.setV(new car());  //inject car dependency
             tr.statjourney(); 
             tr.setV(new bike());
             tr.statjourney();
	}

}
