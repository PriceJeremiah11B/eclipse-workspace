//part 1: create the class without the thread.
//part 2: add the extension
class Fruit extends Thread {
	
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("Fruit");
			
			//this is where we call the function to a thread.
			//this will cause a 1/2 second delay
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {
				
			}
		}
	}
}

/*class Veggies {
	
	public void show() {
		for(int i=1;i<=5;i++) {
			System.out.println("Veggies");
		}
		try {
			Thread.sleep(500);
		}
		catch(Exception e) {
			
		}
	}
	
}
*/

public class SimpleThreadDemo {

	public static void main(String[] args) {
		
		Fruit obj1 = new Fruit();
		//Veggies obj2 = new Veggies();
		
		//start calls the "run" of this object.
		//order in which is run is random.
		obj1.start();
		//obj1.show();
		//obj2.show();
	}
	
}