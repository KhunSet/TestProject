package Polymorphism;

public class P1_VirtualDemo {
	public static void main(String[] args) {
		P1_Salary s = new P1_Salary("Mohd Mohashim", "Ambehta,Up", 3, 3600.0);
		P1_Employee e = new P1_Salary("John Adams", "Boston,MA", 2, 2400.00);
		System.out.println("Call mailCheck using Salary referce--");
		s.mailCheck();
		System.out.println("\n Call mailCheck using Employee referce-]");
		e.mailCheck();

	}

}
