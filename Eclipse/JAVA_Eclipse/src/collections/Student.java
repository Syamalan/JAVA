package collections;

public class Student {
	private int rno;
	private String name;
	private String branch;
	private double gpa;
	private static String university ="C-DAC";
	
	public Student(int rno, String name, String branch, double gpa ) {
		super();
		this.rno = rno;
		this.name = name;
		this.branch = branch;
		this.gpa = gpa;
	}
	@Override
	public String toString() {
		return "Student [rno=" + rno + ", name=" + name + ", branch=" + branch + ", gpa=" + gpa + ", university="
				+ university + "]";
	}
	public int getRno() {
		return rno;
	}
	public String getName() {
		return name;
	}
	public String getBranch() {
		return branch;
	}
	public double getGPA() {
		return gpa;
	}
	
	
	
	

}
