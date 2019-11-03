package training.day3;


class SomeClass{}

class MyBusinessLogic extends SomeClass implements Runnable{

	Thread t; 
	
	
	public MyBusinessLogic() {}
	
	
	
	public MyBusinessLogic(String name, int priority) {
		t = new Thread(this); 
		t.setName(name);
		t.setPriority(priority);
		
		// the OS level thread is created and the call is given to 
		// run() 
		t.start(); 
	}
	
	
	@Override
	public void run() {
		System.out.println("The Thread Name in run() is " + Thread.currentThread().getName());

		// simulating to kill some time 
		
		for(int i=0; i<1000; i++) {
			System.out.println("Value of i is : " + i +" in Thread " + 
					Thread.currentThread().getName());
			
			try {
				Thread.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("Exiting : " + Thread.currentThread().getName());
	}

	 
}
public class ThreadEx02 {
	public static void main(String[] args) {
		
		
		MyBusinessLogic mbl = new MyBusinessLogic("Desktop", 6); 
		MyBusinessLogic mbl2 = new MyBusinessLogic("Laptop", 8); 


		MyBusinessLogic mbl3 = new MyBusinessLogic(); 
		
		Thread tt1 = new Thread(mbl3); 
		tt1.start(); 
		
		Thread tt2 = new Thread(mbl3);
		tt2.start(); 
		
		Thread tt3 = new Thread(mbl3); 
		tt3.start();
		
		try {
			tt1.join();
			tt2.join();
			tt3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		
		
		System.out.println("hi i'm last line in main ");
	}
}





















