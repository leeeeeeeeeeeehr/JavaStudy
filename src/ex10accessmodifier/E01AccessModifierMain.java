package ex10accessmodifier;

// 이 클래스는 sub 패키지에 정의되었으므로 사용을 위해선 반드시 import 해야 한다.
import ex10accessmodifier.sub.E01AccessModifier2;

public class E01AccessModifierMain {

	public static void main(String[] args) {
		
		System.out.println("E01AccessModifier1 객체 생성 및 접근");
		
		// 동일한 패키지에 선언된 클래스이므로 import 없이 인스턴스를 생성할 수 있다.
		E01AccessModifier1 one = new E01AccessModifier1();
		
		/* private으로 선언된 멤버는 동일한 패키지에 선언하더라도 접근할 수 없다.
		동일한 클래스 내에서만 접근을 허용한다. */
//		System.out.println("one.privateVar = " + one.privateVar);
		// 동일한 패키지이므로 접근이 가능하다.
		System.out.println("one.defaultVar = " + one.defaultVar);
		// 접근 범위가 없으므로 어디서든 접근이 가능하다.
		System.out.println("one.publicVar = " + one.publicVar);
		
		// 멤버메서드의 접근 범위는 멤버변수의 접근 범위와 동일하다.
//		one.privateMethod();
		one.defaultMethod();
		one.publicMethod();
		
		// 동일한 패키지에 선언된 클래스이므로 import 없이 인스턴스 생성이 가능하다.
		System.out.println("DefaultClass 객체 생성 및 접근");
		new DefaultClass1().myFunc();
		
		///////////////////////////////////////////////////////////
		
		System.out.println("E01AccessModifier2 객체 생성 및 접근");
		
		E01AccessModifier2 two = new E01AccessModifier2();
		
		/* 다른 패키지에 선언된 클래스이므로 인스턴스 생성을 위해 import 선언을 해야 한다.
		import 선언 시 public은 접근할 수 있고, private과 default는 접근할 수 없다. */
		
		// private는 동일한 클래스 내에서만 접근을 허용한다.
//		System.out.println("two.privateVar = " + two.privateVar);		// 에러 발생
		// default는 동일한 패키지 내에서만 접근을 허용한다.
//		System.out.println("two.defaultVar = " + two.defaultVar);		// 에러 발생
		System.out.println("two.publicVar = " + two.publicVar);
		
//		two.privateMethod();		// 에러 발생
//		two.defaultMethod();		// 에러 발생
		two.publicMethod();
		
		/* 다른 패키지에서 선언된 default 클래스이므로 인스턴스 생성이 불가능하다.
		또한, import 자체도 불가능하므로 아예 사용할 수 없는 클래스가 된다. */
		System.out.println("DefaultClass 객체 생성 및 접근");
//		new DefaultClass2().myFunc();		// 에러 발생

	}

}
