import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//this is an example of one thread:

/*
 * 
public class examples {

	public static void main(String[] args) {
		
		Thread thread1 = new Thread(new Task());
		thread1.start();
		System.out.println("Thread Being Run:" + Thread.currentThread().getName());
		

	}

}
*/


//this is an example of multiple threads in a for loop:
/*
 * 
public class examples {
	
	public static void main(String[] args) {
		
		for (int i = 0; i<150; i++) {
			
			Thread thread2 = new Thread(new Task());
			thread2.start();
			
		}
		
		System.out.println("Thread Name: " + Thread.currentThread().getName());
	}
}
*/

//this is an example of the executor service running:
/*
public class examples {
	public static void main(String[] args) {
		
		//create pool which creates a queue for all threads.
		ExecutorService service = Executors.newFixedThreadPool(20);
		
		//a loop for creating threads.
		for (int i = 0; i<150; i++) {
			
			Thread thread2 = new Thread(new Task());
			thread2.start();
			
		}
		
		System.out.println("Thread Name: " + Thread.currentThread().getName());
	}
}
*/

//this is an example of seeing what cores are being used.
public class examples {
	public static void main(String[] args) {
		
		//get count of available cores
		int coreCount = Runtime.getRuntime().availableProcessors();
		ExecutorService service = Executors.newFixedThreadPool(coreCount);
		
		for (int i = 0;i<100; i++) {
			
			service.execute(new CpuIntensiveTask());
			
		}
		
		System.out.println("Number of cores: " + coreCount);
	}
}























