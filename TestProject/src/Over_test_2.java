
public class Over_test_2 {

	static void temp(TestClass2 x) {
		x.temp();
	}

	public static void main(String[] args) {
		TestClass2 m = new TestClass2();
		m.temp();
		m.temp(10);
		temp(m);
	}
}
