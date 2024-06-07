package ex12inheritance;

/* instanceof 연산자
: 인스턴스 변수가 어떤 타입의 변수인지를 판단하는 연산자로 형 변환이 가능하면 true를 반환한다.
(형 변환이 가능하다는 것은 상속 관계임을 뜻한다.)

- 인스턴스 간에 형 변환이 되려면 반드시 두 클래스 간에 상속 관계가 있어야 한다.
- 부모 타입의 참조 변수로 자식 인스턴스를 참조할 수 있으므로 매개변수를 부모 타입으로 정의하면
  자식 인스턴스를 인수로 받을 수 있다.
- 매개변수로 전달되는 인수는 부모 타입으로 자동 형 변환(업캐스팅)되므로
  정상적인 사용을 위해 강제 형 변환(다운캐스팅) 해야 하는데
  이때 확인을 위해 사용된다. */

// 아래 3개의 클래스는 상속 관계를 가지고 있다.
class Box {
	public void boxWrap() {
		System.out.println("Box로 포장합니다.");
	}
}

class PaperBox extends Box {
	public void paperWrap() {
		System.out.println("PaperBox로 포장합니다.");
	}
}

class GoldPaperBox extends PaperBox {
	public void goldWrap() {
		System.out.println("GoldPaperBox로 포장합니다.");
	}
}

public class E09InstanceOf {
	
	/* 
	1. 메서드 정의 시 부모 타입의 매개변수로 설정하면 자식 타입의 인스턴스를 모두 받을 수 있다.
	2. Box 타입으로 인수를 받게되면 자동 형 변환(업캐스팅) 되므로 자식 클래스의 멤버메서드는 호출할 수 없게 된다.
	3. 이 때 자식 클래스의 멤버메서드를 호출하기 위해선 강제 형 변환(다운캐스팅)이 필요하다.
	4. instanceof 연산자를 통해 자식 타입으로 형 변환이 가능한지 판단한 후 true를 반환하면
	   다운캐스팅을 진행한 후 자식 클래스의 멤버메서드를 호출할 수 있게 된다.
	 */
	static void wrapBox(Box b) {
		/* 세 가지 인스턴스 중 어떤 것이 전달되더라도 Box 타입으로 자동 형 변환되므로
		해당 매개변수를 통해 호출할 수 있는 메서드는 boxWrap()이 유일하다.
		따라서 다운캐스팅이 필요하다.*/
		if (b instanceof GoldPaperBox) {
			((GoldPaperBox) b).goldWrap();
		}
		else if (b instanceof PaperBox) {
			((PaperBox) b).paperWrap();
		}
		else if (b instanceof Box) {
			b.boxWrap();
		}
	}
	
	/* 만약 부모 타입의 매개변수로 자식 인스턴스를 받을 수 없다면
	아래와 같이 각각의 타입에 따른 모든 메서드를 정의해야 한다.
	
	상속 관계가 더 깊어진다면 메서드는 점점 늘어나게 되어 코드는 더욱 더 복잡해질 것이다.
	따라서 부모로 자식을 참조할 수 있는 것은 개발자에게 편리함을 가져다 준다. */
//	static void wrapBox(Box b) {}
//	static void wrapBox(PaperBox b) {}
//	static void wrapBox(GoldPaperBox b) {}

	public static void main(String[] args) {

		Box box1 = new Box();
		PaperBox box2 = new PaperBox();
		GoldPaperBox box3 = new GoldPaperBox();
		
		wrapBox(box1);
		wrapBox(box2);
		wrapBox(box3);
		
		/* String 인스턴스는 Box와는 아무런 관계가 없으므로 인수로 전달할 수 없다.
		즉, 상속 관계가 성립하지 않는다. */
		String str = new String("나는 누구?");
//		wrapBox(str);
//		if (str instanceof Box) {}
		
	}

}
