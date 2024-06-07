package ex12inheritance;

/* static(정적) 타입의 멤버도 상속이 되고,
하위 클래스에서 접근 시 멤버변수의 이름만으로 접근이 가능하다.
단, 클래스 외부에서 접근할 경우 인스턴스 생성 없이 클래스명을 통해서 접근할 수 있다.
즉, static이 가진 기본 규칙을 따른다. */

// 부모 클래스
class Adder {
	
	/* static으로 선언된 멤버변수는 실제로는 클래스 외부(= Method 영역)에
	생성되어 있으므로 클래스명을 통한 접근이 허용된다.
	코드 레벨에서 보면 해당 클래스의 멤버변수이므로 변수명만으로 접근하는 것도 가능하다. */
	public static int val = 0;
	
	public void add(int num) {
		val += num;				// 변수명만으로 선언할 수 있지만
		Adder.val += num;		// 클래스명을 통해 선언하는 것을 권장한다.
	}
	
}

// 자식 클래스
class AdderFriend extends Adder {
	
	/* 부모의 멤버변수가 public이므로 접근의 제한이 없다.
	따라서 자식 클래스에 작성된 모든 코드는 문제 없이 실행된다. */

	public void friendAdd(int num) {
		val += num;
		Adder.val += num;
	}
	public void showVal() {
		System.out.println("val = " + val);
		System.out.println("val = " + Adder.val);
	}
	
}

public class E03StaticInheritance {

	public static void main(String[] args) {
		
		// 부모 클래스를 통한 인스턴스 생성
		Adder ad = new Adder();
		// 자식 클래스를 통한 인스턴스 생성
		AdderFriend adFriend = new AdderFriend();
		
		ad.add(1);						// 1 + 1 = 2
		adFriend.friendAdd(3);			// 2 + 3 + 3 = 8
		Adder.val += 5;					// 8 + 5 = 13
		AdderFriend.val += 7;			// 13 + 7 = 20
		
		/* 앞에서 호출한 메서드는 모두 Method 영역에 생성된
		정적 변수 val에 더해지게 되므로 출력 결과는 20이 된다. */
		adFriend.showVal();

	}

}
