package training.day2;

public class Student implements Comparable<Student> {

	private int sId;
	private String sName;
	private double sMarks;

	public Student(int sId, String sName, double sMarks) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sMarks = sMarks;
	}

	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", sMarks=" + sMarks + "]";
	}

	protected int getsId() {
		return sId;
	}

	protected void setsId(int sId) {
		this.sId = sId;
	}

	protected String getsName() {
		return sName;
	}

	protected void setsName(String sName) {
		this.sName = sName;
	}

	protected double getsMarks() {
		return sMarks;
	}

	protected void setsMarks(double sMarks) {
		this.sMarks = sMarks;
	}

	@Override
	public int compareTo(Student o) {
//		return o.sId - this.sId;
		
		
		return this.sName.compareTo(o.getsName()); 
	}

}









