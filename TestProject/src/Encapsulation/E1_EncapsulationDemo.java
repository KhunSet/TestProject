package Encapsulation;

public class E1_EncapsulationDemo {
	private int ssn;
	private String empName;
	private int empAge;

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int newValue) {
		this.ssn = newValue;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String newValue) {
		this.empName = newValue;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int newValue) {
		this.empAge = newValue;
	}

}
