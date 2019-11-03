package training.lambda;

public class Runner1 {

	public void execute(WorkerInterface worker) {
		System.out.println("hi i'm in Execute function ");
		worker.doSomeWork(); 
	}
}
