package Polymorphism;

public class P2_Animal_Sound {
	public static void main(String[] args) {
		P2_Animal myanimal = new P2_Animal();
		P2_Animal mypig = new P2_Pig();
		P2_Animal mydog = new P2_Dog();
		myanimal.animalsound();
		mypig.animalsound();
		mydog.animalsound();

	}
}
