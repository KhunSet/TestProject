package Encapsulation;

public class E1_Encaps_Test {
	public static void main(String[] args) {
		E1_EncapsulationDemo obj = new E1_EncapsulationDemo();
		obj.setEmpName("Mario");
		obj.setEmpAge(32);
		obj.setSsn(112233);
		System.out.println("Employee Name:" + obj.getEmpName());
		System.out.println("Employee Age:" + obj.getEmpAge());
		System.out.println("Employee SSN:" + obj.getSsn());

	}

}
