package training.day3;



class BusinessLogic extends Thread{
	
	public void run() {
		System.out.println("The Thread Name in run() is " + Thread.currentThread().getName());

		// simulating to kill some time 
		
		for(int i=0; i<1000; i++) {
			System.out.println("Value of i is : " + i +" in Thread " + 
					Thread.currentThread().getName());
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("Exiting : " + Thread.currentThread().getName());
	
	}
} 

public class ThreadEx01 {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		// if you invoke run() then it is single threaded model 
//		new BusinessLogic().run(); 
		
		// ctrl 2 + l 
		BusinessLogic businessLogic = new BusinessLogic(); 
		
		// the method start() will create an os level thread and give the 
		// control to run method of the class
		businessLogic.setName("Desktop");
		businessLogic.start(); 
		
		BusinessLogic businessLogic2 = new BusinessLogic();
		
		// MIN_PRIORITY - 1 
		// MAX_PRIORITY - 10 
		// NORM_PRIORITY - 5 (by default) 
		
//		businessLogic2.setPriority(Thread.NORM_PRIORITY + 1);
		
		businessLogic2.setPriority(businessLogic.getPriority() + 1);
		businessLogic2.setName("Laptop");
		businessLogic2.start(); 
		
		
		
		for(int i=0; i<1000; i++) {
			System.out.println("Value of i is : " + i +" in Thread " + 
					Thread.currentThread().getName());
		}
		
		
		
		try {
			businessLogic.join();
			businessLogic2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		System.out.println("Main Thread Exiting... ");
	}
}
