package vendingmachine.view;

public class UI {
	private UI() {

	}

	public static void ErrPositiveCall(String msg) {
		System.out.println("msg: " + msg + ":: 양수를 입력해주세요.");
	}

	public static void ErrNotPickValue(String msg) {
		System.out.println("msg: " + msg + ":: 찾고자하는 것이 없습니다.");
	}

	public static void ErrNotPickStock(String msg) {
		System.out.println("msg: " + msg + ":: 재고가 없네요.");
	}

	public static void ErrNotString(String msg) {
		System.out.println("msg: " + msg + ":: 문자만넣어주세요.");

	}
}