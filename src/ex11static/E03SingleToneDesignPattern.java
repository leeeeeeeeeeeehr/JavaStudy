package ex11static;

/* 싱글턴 디자인 패턴
: 클래스를 설계하는 디자인 패턴의 하나로써
하나의 인스턴스(= 하나의 메모리)를 할당한 후,
이를 프로그램 전체에서 공유해서 사용할 때 쓰는 패턴이다. */

// 일반적인 클래스
class NoSingleTone {
	
	int instVar;
	
	/* 생성자는 대부분 public으로 선언한다.
	만약 private으로 선언하면 외부에서는 접근할 수 없어
	인스턴스를 생성할 수 없기 때문이다. */
	public NoSingleTone() {
		
	}
	
}

// 싱글턴 패턴이 적용된 클래스
class SingleTone {
	
	int shareVar;
	
	/* 정의한 클래스와 동일한 타입으로 선언된 정적 멤버변수로,
	JVM에 의해 프로그램이 시작될 때 미리 Method 영역에 로드되어 사용할 준비를 마치게 된다. */
	private static SingleTone single = new SingleTone();
	
	/* 생성자를 private으로 선언하면 외부 접근이 안되므로 new를 통해 인스턴스를 생성할 수 없다.
	하지만 클래스 내부에서는 호출할 수 있다. */
	private SingleTone() {
		
	}
	
	// 정적 메서드로 선언된 메서드를 통해 해당 인스턴스의 참조값을 외부로 반환한다.
	public static SingleTone getInstance() {
		return single;
	}
	
	// 멤버변수 출력
	void print() {
		System.out.println(String.format("shareVar = %d", shareVar));
	}
	
}

public class E03SingleToneDesignPattern {

	public static void main(String[] args) {
		
		/* 일반적인 방식의 인스턴스 생성이므로
		new를 생성할 때마다 새로운 참조값(주소값)을 할당 받는다. */
		NoSingleTone nst1 = new NoSingleTone();
		nst1.instVar = 100;
		System.out.println("nst1 = " + nst1);
		
		NoSingleTone nst2 = new NoSingleTone();
		nst2.instVar = 200;
		System.out.println("nst2 = " + nst2);
		
		System.out.println("========================================");
		
		/* 생성자가 private으로 선언되어 새로운 인스턴스를 생성할 수 없다.
		생성자가 not visible(= 보이지 않는다)는 에러가 발생한다. */
//		SingleTone st1 = new SingleTone();		// 에러 발생
		
		/* 정적 메서드로 정의된 이 함수를 호출하여
		이미 생성되어있는 싱글턴 인스턴스의 참조값을 얻어올 수 있다. */
		SingleTone st2 = SingleTone.getInstance();
		st2.shareVar = 100;
		st2.print();
		
		SingleTone st3 = SingleTone.getInstance();
		st3.shareVar = 200;
		st3.print();
		
		System.out.println("========================================");
		
		// 위에서 얻어온 참조값은 결국 하나의 값으로 출력된다.
		System.out.println(String.format("st2의 주소: %s", st2));
		System.out.println(String.format("st3의 주소: %s", st3));
		
		System.out.println("========================================");
		
		// 결국 동일한 인스턴스를 사용한 것이므로 마지막에 할당된 200이 출력된다.
		System.out.println(String.format("st2의 shareVar: %d", st2.shareVar));		// 200
		System.out.println(String.format("st3의 shareVar: %d", st3.shareVar));		// 200

	}

}
