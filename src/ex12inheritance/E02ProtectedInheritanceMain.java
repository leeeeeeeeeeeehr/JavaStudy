package ex12inheritance;

/* 부모 클래스와 다른 패키지에 선언되었으므로 import 해야 한다.
단, 부모 클래스는 반드시 public으로 선언해야 한다.
만약 default로 선언하면 접근 자체가 불가능하므로 import도 할 수 없게 된다. */
import ex12inheritance.map.Korea;

// 자식 클래스에서 Korea를 상속한다.
class Seoul extends Korea {
	
	private String city;
	
	/* 자식 클래스에서는 반드시 부모 클래스의 생성자 호출을 통해 먼저 인스턴스를 생성해야 한다.
	그 후 자식 인스턴스가 메모리에 생성된다. */
	public Seoul(String name, String city) {
		super(name);		// 부모 생성자 호출
		this.city = city;		// 자식 생성자 초기화
	}
	/* 4개의 접근지정자를 통해 정의한 메서드를 호출한다.
	단, 부모 클래스가 다른 패키지에 선언되었으므로
	default, private 멤버는 호출할 수 없다. */
	public void callMethod() {
		super.publicMethod("callMethod => ");
		super.protectedMethod("callMethod => ");
//		super.defaultMethod();		// 에러 발생
//		super.privateMethod();		// 에러 발생
		
		/* 직접 호출할 수 없는 메서드(= default 메서드, private 메서드)는
		접근 가능한 멤버메서드를 통해 간접 호출하면 된다. */
		
	}
	
}

public class E02ProtectedInheritanceMain {

	public static void main(String[] args) {
		
		Seoul seoul = new Seoul("대한민국", "서울");
		seoul.callMethod();

	}

}
