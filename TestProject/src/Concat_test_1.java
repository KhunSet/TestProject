
public class Concat_test_1 {
	public static void main(String[] args) {

		String s1 = "あいう--";
		String s2 = "++えお";
		String s3 = s1.concat(s2);
		System.out.println(s3);

		String s4 = "あいう--";
		String s5 = "++えお";
		String s6 = s5.concat(s4);
		System.out.println(s6);

		String s7 = "あいう--".concat("++えお");
		System.out.println(s7);
	}
}
