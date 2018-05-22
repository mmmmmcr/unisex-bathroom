package concurrent.unisexbathroom;

/**
 * 
 * @author Gabriela Cavalcante and Irene Ginani
 * @version 20/05/2018
 */
public class Main {

	private static final int total = 10;

	public static void main(String[] args) {  

		BathroomLine line = new BathroomLine(total);
		Bathroom bathroom = new Bathroom(line);
	    Person[] folk = new Person[total];
	    
	    for (int i = 0; i < 10; i++) { 
	    		folk[i] = new Person("person " + i, bathroom); 
	    		folk[i].start();
	    }
	    
	    /*for (int i = 0; i < 10; i++) {   
	        try {
	        		folk[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	    }*/
	} 
}