package training.lambda;

public class WorkerInterfaceTest {
	public static void main(String[] args) {
		Runner1 runner = new Runner1();

		WorkerInterface.imStatic(); 
		
		
		runner.execute(new WorkerInterface() {

			@Override
			public void doSomeWork() {

				this.imConcrete();
				
				System.out.println("Worker invoked using Anonymous Class.. ");

			}
		});

		// in java 8 way

		runner.execute(() -> System.out.println("Worker invoked using  lambda"));

		runner.execute(() -> {
			System.out.println("Worker invoked using  lambda1");
			System.out.println("Worker invoked using  lambda2");
			System.out.println("Worker invoked using  lambda3");
		});

	}
}
