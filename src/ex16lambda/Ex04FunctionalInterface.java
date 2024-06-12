package ex16lambda;

/* 함수형 인터페이스
: 람다식을 사용하기 위해서는 인터페이스를 먼저 만들고 람다식으로 구현할 추상 메서드를 선언한다.
이를 람다식으로 만들기 위한 '함수형 인터페이스'라고 한다.
함수형 인터페이스에는 오직 하나의 추상 메서드만 선언할 수 있다. */

/* @FunctionalInterface
: 함수형 인터페이스의 조건을 갖추었는지에 대한 검사를 컴파일러에게 요청하는 어노테이션이다. */

@FunctionalInterface
interface ISchool4 {
	void studyLambda(String str);
	/* 함수형 인터페이스에는 추상 메서드를 추가로 선언하면 에러가 발생한다.
	단 하나의 추상 메서드만 정의할 수 있다. */
//	void studyLambda2(String str);
}

public class Ex04FunctionalInterface {

	/* main 메서드에서 정의한 람다식의 참조 변수는 ISchool4 타입이므로
	아래와 같이 매개변수로 전달 받은 후 추상 메서드인 studyLambda()를 호출할 수 있다. */
	static void execute(ISchool4 school4, String s) {
		school4.studyLambda(s);
	}
	
	public static void main(String[] args) {
		/* ISchool4 인터페이스를 구현하여 람다식을 생성한다.
		추상 메서드를 통해 매개변수의 타입을 유추할 수 있으므로
		아래와 같이 String을 생략할 수 있다. */
		ISchool4 sch = (str) -> System.out.println("ISchool4로 구현 받아 정의한 람다입니다." + str);
		
		/* 앞에서 정의한 람다식을 메서드의 인수로 전달한다.
		이때 람다식 자체가 전달되는 것이 아닌 참조값만 전달된다.
		우리는 참조값을 통해 람다식의 기능을 호출할 수 있다. */
		execute(sch, "\n람다를 매개변수로 전달합니다.");
	}

}
