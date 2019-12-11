
public class Local_test1 {

	private static void myAdd(int x, int y) {
		System.out.println(x + y);
		x = 5;
		y = 6;
		System.out.println(x + y);
	}

	private static void myAdd_1(int x, int y) {
		System.out.println(x + y);
	}

	private static void myAdd_2(int a_1, int b_1) {
		System.out.println(a_1 + b_1);
	}

	private static void Temp() {
		int a = 4;
	}

	private static int myRet() {
		return 3;
	}

	static void ABC() {
		System.out.println("ˆ—A");
		System.out.println("ˆ—B");
		System.out.println("ˆ—C");
	}

	public static void main(String[] args) {
		int q = 0;
		System.out.println(q);
		myAdd(3, 4);
		int a = 3;
		Temp();
		System.out.println(a);
		double d = 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1;
		System.out.println(d);

		int w;
		w = myRet();
		System.out.println(w);

		ABC();
		ABC();
		ABC();

		myAdd_1(3, 4);
		int a_1 = 3;
		int b_1 = 4;
		myAdd_2(a_1, b_1);
	}

}
