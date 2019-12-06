
public class Concat_test_1 {
	public static void main(String[] args) {

		String s1 = "‚ ‚¢‚¤--";
		String s2 = "++‚¦‚¨";
		String s3 = s1.concat(s2);
		System.out.println(s3);

		String s4 = "‚ ‚¢‚¤--";
		String s5 = "++‚¦‚¨";
		String s6 = s5.concat(s4);
		System.out.println(s6);

		String s7 = "‚ ‚¢‚¤--".concat("++‚¦‚¨");
		System.out.println(s7);
	}
}
