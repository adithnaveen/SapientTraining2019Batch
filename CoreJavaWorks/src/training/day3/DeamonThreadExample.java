package training.day3;


class CounterThread extends Thread{
	public void run() {
		while(true) {
			System.out.println("i'm here to track counter ");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


class Q {
	private String question; 
	private String optionA; 
	private String optionB; 
	private String optionC; 
	private String optionD; 
	private String correctChoice;
	public Q(String question, String optionA, String optionB, String optionC, String optionD, String correctChoice) {
		super();
		this.question = question;
		this.optionA = optionA;
		this.optionB = optionB;
		this.optionC = optionC;
		this.optionD = optionD;
		this.correctChoice = correctChoice;
	}
	protected String getQuestion() {
		return question;
	}
	protected void setQuestion(String question) {
		this.question = question;
	}
	protected String getOptionA() {
		return optionA;
	}
	protected void setOptionA(String optionA) {
		this.optionA = optionA;
	}
	protected String getOptionB() {
		return optionB;
	}
	protected void setOptionB(String optionB) {
		this.optionB = optionB;
	}
	protected String getOptionC() {
		return optionC;
	}
	protected void setOptionC(String optionC) {
		this.optionC = optionC;
	}
	protected String getOptionD() {
		return optionD;
	}
	protected void setOptionD(String optionD) {
		this.optionD = optionD;
	}
	protected String getCorrectChoice() {
		return correctChoice;
	}
	protected void setCorrectChoice(String correctChoice) {
		this.correctChoice = correctChoice;
	}
	
	
	
	
	
}

class Question extends Thread{
	
	public void run() {
		
		for(int i=0; i<5; i++) {
			System.out.println("-----------------------------------------");
			System.out.println("I'm in Question shwoing "+ i +" question "); 
			System.out.println("my Name is " + Thread.currentThread().getName());
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class DeamonThreadExample {

	static Q [] questionBank; 
	
	static {
		questionBank =  new Q[]{
				new Q("Capital of India", "Delhi", "Mumbai", "Bengaluru", "kolata", "Delhi"), 
				new Q("Founter of Java ", "James Gosling", "Dennis Ritchie", "Steve Jobs ", "Bill Gates", "James Gosling"), 
				new Q("CEO Of Sapient", "Niguel Vaz", "Me", "You", "Other", "Niguel Vaz"), 
				new Q("Next Off ?? ", "Delhi", "Mumbai", "Bengaluru", "kolata", "Delhi"), 
		};  
		
	}

	
	
	public static void main(String[] args) {
		CounterThread counterThread = new CounterThread();
		counterThread.setDaemon(true); 
		counterThread.start(); 
		
		
		
		for(int i=0; i< questionBank.length; i++) {
			
			System.out.println(questionBank[i].getQuestion()); 
			
		}
		
		
		Question q = new Question(); 
		q.setName("myFirst Thread" );
		q.start(); 
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Question q1 = new Question(); 
		q1.setName("mySecond Thread" );
		q1.start(); 
		
		
	}
}
