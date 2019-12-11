package Polymorphism;

//Java program for Operator overloading 
public class P5_OperatorOverDDN {

	 void operator(String str1, String str2) {
		String s = str1 + str2;
		System.out.println("Concatinated String-" + s);
	}

	 void operator(int a, int b) {
		int c = a + b;
		System.out.println("Sum=" + c);
	}

}
