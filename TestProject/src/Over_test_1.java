
public class Over_test_1 {

	private static void temp() {
		System.out.println("引数のないtempメソッド");
	}

	private static void temp(int i) {
		System.out.println("int--型の引数をひとつ持つ--temp--メソッド");
	}

	public static void main(String[] args) {
		temp();
		temp(10);

	}
}
