package ex14innerclass;

/* 익명 클래스 (Anonymous class)
- 이름이 없는 클래스를 말한다.
- 내부 클래스처럼 이벤트 기반의 프로그래밍에서 많이 사용된다.
- 부모 클래스의 메서드를 오버라이딩하는 것이 목적이다.
- 클래스를 정의하는 것이 마치 메서드를 정의하는 것과 비슷하다.
- 마지막에 세미콜론을 반드시 기술해야 한다.

형식: 부모 클래스명의 참조변수 = new 부모 클래스명() {
 		익명 클래스의 실행부;
 		부모 클래스의 메서드 오버라이딩();
 	 };
 	 
부모 클래스를 상속받아 이름 없는 자식 클래스를 생성하는 개념으로 이해하면 된다.
상속되기 때문에 오버라이딩이 가능하다. 즉, { } 안 쪽은 '자식'의 영역이다. */

// 가수를 추상화한 클래스
class Singer {
	String name;
	public Singer(String name) {
		this.name = name;
	}
	/* Object 클래스에 정의된 메서드로 객체가 가진 값을 문자열로 반환해준다.
	Java에서 정의하는 모든 클래스는 Object 클래스를 상속하므로 아래와 같이 오버라이딩이 가능하다. */
	@Override
	public String toString() {
		return "이름: " + name;
	}
}
// 걸그룹을 추상화한 자식 클래스
class GirlGroup extends Singer {
	String team;
	public GirlGroup(String name, String team) {
		super(name);
		this.team = team;
	}
	// 부모의 toString()을 호출하기 위해 super를 사용한다.
	@Override
	public String toString() {
		// 이름과 팀명을 반환한다.
		return super.toString() + ", 팀명: " + team;
	}
}
/* 인터페이스 정의
: 기능이 없는 추상 메서드만 멤버메서드로 정의할 수 있다.
또한, 메서드 앞에는 public abstract가 생략되어 있다. */
interface ISinger {
	public void dancing();
}

public class E02AnonymousClass {

	public static void main(String[] args) {
		
		// 부모 클래스를 통해 인스턴스를 생성
		Singer s1 = new Singer("조용필");
		/* 인스턴스의 참조값을 할당받은 참조변수를 출력한다.
		이때 오버라이딩한 toString() 메서드의 반환값이 출력된다.
		먄약, toString()을 삭제하면 @를 포함한 참조값이 출력된다. */
		System.out.println(s1);
		
		// 자식 클래스를 통해 인스턴스 생성 후 정보 출력
		Singer s2 = new GirlGroup("츄", "이달의 소녀");
		// 자식 쪽의 toString()이 호출되어 이름과 팀명까지 출력된다.
		System.out.println(s2);
		
		/* GirlGroup 클래스를 상속받은 익명 클래스 정의
		: String 타입의 변수에 GrilGroup을 상속받은 익명 클래스를 생성해서 그 참조값을 할당한다.
		개념적으로 new GirlGroup() {}; => '익명 extends GirlGroup'과 같다.
		이름이 없는 인스턴스이므로 부모 클래스의 이름을 빌려서 자식의 영역을 만든다고 생각하면 된다. */
		Singer s3 = new GirlGroup("아이린", "레드벨벳") {
			// 자식에서 확장한 멤버변수
			boolean mic = true;
			@Override
			public String toString() {
				return super.toString() + ", 소속사: SM";
			}
		};
		/* 부모의 참조 변수로 자식을 참조할 수 있지만 접근 범위가 부모까지로 제한된다.
		따라서 아래와 같이 자식에서 확장한 멤버변수는 접근할 수 없어 에러가 발생한다.
		접근하고 싶다면 다운캐스팅(강제 형 변환)을 해야 하지만
		익명 클래스는 이름이 없기 때문에 다운캐스팅 자체가 불가능하다.
		따라서 익명 클래스에서는 멤버의 확장이 거의 사용되지 않는다.
		대부분 오바라이딩을 목적으로 활용한다. */
//		System.out.println(s3.mic); 	// 에러 발생
		System.out.println(s3);
		
		/* 오버라이딩은 부모에서 생성한 메서드를 자식에서 재정의하는 것이므로
		애초에 기능이 있는 메서드가 필요하지 않다.
		따라서 인터페이스에 정의된 추상 메서드를 오버라이딩하여
		익명 클래스를 만드는 경우가 매우 많다. */
		ISinger s4 = new ISinger() {
			@Override
			public void dancing() {
				System.out.println("춤 추기");
			}
		};
		s4.dancing();
		
	}
	
}
