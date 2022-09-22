import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CurrentUser {
	Person user;

	// 기본 생성자
	public CurrentUser() { // Menu item 1
		// TODO: 1. 너의 정보를 적어라. 기본생성자.
		this.user = new Person("박승찬".toCharArray(), 20161822, 90.50, false, "지산동".toCharArray());
	}

	void display() {
		this.user.println();
	}

	// TODO: 2. System.out.printf(~~~) 로 한번 해보아라
	// name:박승찬 id:20161822 weight:90.0 married:false address:지산동 출력 예시
	// 여기에 당신의 정보를 get함수를 이용해서 써라
	void getter() { // Menu item 2
		System.out.printf("name:%s id:%d weight:%.2f married:%b address:%s", String.valueOf(user.getName()),
				user.getId(), user.getWeight(), user.isMarried(), String.valueOf(user.getAddress()));
	}

	// TODO: 3. set함수를 이용해서 ps의 객체에 정보를 넣어라.
	void setter() { // Menu item 3
		Person ps = new Person("ps".toCharArray());
		ps.setName(ps.getName());
		ps.setId(user.getId());
		ps.setWeight(user.getWeight());
		ps.setMarried(user.isMarried());
		ps.setAddress(user.getAddress());
		System.out.print("ps.setMembers():");
		ps.println();
	}

	// TODO: 4. set() 메서드는
	// Person클래스의 set함수를 call 하는 것이다.
	void set() { // Menu item 4
		Person ps = new Person("ps".toCharArray());
		ps.set(ps.getName(), user.getId(), user.getWeight(), !user.isMarried(), user.getAddress());
		System.out.print("ps.set():");
		ps.println();
	}

	void whatAreYouDoing() { // Menu item 5
		user.whatAreYouDoing();
	}

	void isSame() { // Menu item 6
		user.println();
		Person ps = new Person("user".toCharArray());
		ps.setId(1);
		System.out.println("user.isSame(): " + user.isSame(ps.getName(), ps.getId()));
	}

	private <T> Method getMethod(String name, Class<T> tClass) {
		// TODO: 5. Optional객체에 대해서 찾아 보고 설명해보아라.
		// 자바의 정석
		// https://www.youtube.com/watch?v=W_kPjiTF9RI
		// null을 다룰때는 Optional을 사용하라하여 사용하는데...Method는 아닌듯?합니다.
//		Optional<Method> optVal = Optional.<Method>empty();
//		Method method = optVal.orElseThrow(NullPointerException::new);
		Method method = null;

		// .
		// TODO: 6. try-catch을 해보아라
		try {
			method = tClass.getDeclaredMethod(name, null);

		} catch (NoSuchMethodException e) {
			System.out.println("Class: CurrentUser 69번줄 method에 null이 들어갔어요 확인하세요.");
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		if (method == null) {
			System.out.println("Class: CurrentUser 69번줄 method에 null이 들어갔어요 확인하세요.");
		}
		return method;
	}

	public void run() {
		// 함수의 이름을 수기로 작성해서 methodNameArr 배열에 할당
		String[] methodNameArr = new String[] { "CurrentUser", "getter", "setter", "set", "whatAreYouDoing", "isSame" };
		// 가져온 함수를 담는 배열
		Method[] func_arr = new Method[methodNameArr.length];
		// CurrentUser클래스를 Class 객체에 선언.
		Class<CurrentUser> currentuser = CurrentUser.class; // ClassAndObject 클래스 가져오기

		// menu의 Count를 선언한다.
		int menuCount = 0;

		// func_arr[] 에 클래스의 함수를 할당한다.
		for (int index = 0; index < methodNameArr.length; index++) {
			// 함수의 이름을 가져온다.
			String methodName = methodNameArr[index]; // 메서드의 함수의 이름을 가져와서
			// getMethod(name, Class정보가 있는 class객체)
			func_arr[index] = this.getMethod(methodName, currentuser); // getMethod함수를 methodArr에 넣어라
		}

		// menuCount는 func_arr의 길이
		menuCount = func_arr.length;

		// 화면에 보여 줄 메뉴
		String menuStr = "+++++++++++++++++++++ Current User Menu ++++++++++++++++++++++++\n+ 0.Logout 1.Display 2.Getter 3.Setter 4.Set 5.WhatAreYouDoing +\n+ 6.IsSame 7.InputPerson                                       +\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n";
//		ClassAndObject target = (ClassAndObject) this.getInstance(new ClassAndObject());                                               make_instance
		ClassAndObject target = new ClassAndObject();

		// ui의 인스턴스 할당
		UI ui = new UI();
		while (true) {
			int menuItem = ui.selectMenu(menuStr, menuCount);
			if (menuItem == 0) {
				return;
			}
			try {
				func_arr[menuItem].invoke(target); // target의 클래스안의 함수를 실행한다.
			} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
				// 만약에 func_arr배열의 함수를 잘못 할당하면 =>
				// http://cris.joongbu.ac.kr/course/java/api/java/lang/IllegalArgumentException.html
				// IllegalAccessException 잘못된 접근?
				// IllegalArgumentException 부적절한 인수를 할당?
				// InvocationTargetException 정리하면 InvocationTargetException 의 cause 는 null 이 될 수
				// 있으므로, getCause() 의 스택 트레이스를 찍으려면 반드시 null 체크를 해야 한다
				System.out.println("CurrentUser func_arr[menuItem].invoke(target)의 함수가 잘못됨");
			}
		}
	}

	public static void main(String[] args) {
		CurrentUser currentUser = new CurrentUser();
		currentUser.run();

	}
}
