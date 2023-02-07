package Execute;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecuteDemo {
	
	public static void main(String[] args) {
		
	/*	ExecutorService executeservice=Executors.newFixedThreadPool(10);
		
		for (int i = 0; i < 10; i++) {
			executeservice.submit(new Runnable() {
				
				@Override
				public void run() {
					
					System.out.println("Hello from"+Thread.currentThread().getName());
					
				}
			});
		}
		
	 */
		
       ScheduledExecutorService executeservice=Executors.newScheduledThreadPool(2);
		
		for (int i = 0; i < 2; i++) {
			executeservice.scheduleAtFixedRate(new Runnable() {
				
				@Override
				public void run() {
					
					System.out.println("Hello from"+Thread.currentThread().getName());
					
				}
			},3,5,TimeUnit.SECONDS);
		}
		
	}



}
