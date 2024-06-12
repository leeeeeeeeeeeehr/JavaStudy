package ex15usefulclass;

/* Object 클래스
- 자바에서는 최상위 클래스이다.
- 별도의 선언 없이 Object 클래스에 정의된 모든 메서드를 호출할 수 있다.
- 개발자가 정의한 모든 클래스는 Object의 참조 변수로 참조할 수 있다.
	ex) Object obj = new Person() 또는 void myFn(Object obj) {} */

/* toString() 메서드
- Object에 정의된 메서드로 print()문의 문자열을 출력하기 전에 자동으로 호출한다.
- 인스턴스 변수를 문자열 형태로 변환하여 반환한다.
- 필요한 경우 클래스 정의 시 적절히 오버라이딩하여 재정의하는 것이 좋다.
  단, 필수사항은 아니다. */

// 해당 클래스는 toString()을 오버라이딩하여 멤버변수를 반환하도록 정의하였다.
class myFriends extends Object {
	String myName;
	public myFriends(String name) {
		myName = name;
	}
	@Override
	public String toString() {
		return "이름: " + myName;
	}
}
// toString()을 오버라이딩하지 않는다.
class yourFriends extends Object {
	String myName;
	public yourFriends(String name) {
		myName = name;
	}
}

public class E04Object1toString {

	public static void main(String[] args) {
		// 인스턴스 생성
		myFriends fnd1 = new myFriends("나의 친구");
		yourFriends fnd2 = new yourFriends("너의 친구");
		
		// toString()을 오버라이딩 했으므로 이름이 출력된다.
		System.out.println(fnd1);
		// 인스턴스의 참조값이 출력된다.
		System.out.println(fnd2);
	}

}
