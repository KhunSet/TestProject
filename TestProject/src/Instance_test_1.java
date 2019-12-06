
public class Instance_test_1 {
	static int i = 10;
	static int j;

	static void temp() {
		System.out.println("インスタンスメソッドです。");
	}

	public static void main(String[] args) {

		System.out.println(i);
		Instance_test_1 m = new Instance_test_1();
		System.out.println(m.j);
		temp();
	}

}
