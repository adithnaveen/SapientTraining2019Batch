package training.lambda;

public class PriorityCustomer {
	private int custId; 
	private String custName; 
	private boolean isPriority;
	
	public PriorityCustomer() {
	}

	
	@Override
	public String toString() {
		return "PriorityCustomer [custId=" + custId + ", custName=" + custName + ", isPriority=" + isPriority + "]";
	}
	public PriorityCustomer(int custId, String custName, boolean isPriority) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.isPriority = isPriority;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public boolean isPriority() {
		return isPriority;
	}
	public void setPriority(boolean isPriority) {
		this.isPriority = isPriority;
	} 
	
	
}
