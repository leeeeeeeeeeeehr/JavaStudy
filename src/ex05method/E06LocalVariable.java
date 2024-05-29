package ex05method;

public class E06LocalVariable {
	
	/*
	지역변수(Local variable)
	- 변수는 사용범위(Scope)를 가지고 있고, 해당 지역에서만 사용할 수 있다.
	- 해당 지역을 벗어나면 즉시 메모리에서 소멸된다.
	- 기본 자료형은 스택(Stack)이라는 메모리를 사용한다.
	- Stack은 입구가 하나만 있는 컵과 같은 형태이며 '선입후출'의 특성을 가진다.
	- 또한, Stack은 CPU가 메모리의 생성 및 소멸을 주관한다.
	 */

	public static void main(String[] args) {

		boolean scope = true;
		
		/* main 지역에서 num을 선언하면 그보다 좁은 지역인 if문에서는 같은 이름의 변수를 선언할 수 없다.
		큰 지역에서 이미 선언되어 메모리에 상주하고 있기 때문이다. */
		
		// 따라서 이 부분을 주석 처리하지 않으면 에러가 발생한다.
//		int num = 9;
		
		/* main보다 좁은 지역인 if문의 블럭을 생성한 후 변수 num을 선언한다.
		단, if문과 else문은 서로 다른 지역이므로 동일한 이름의 변수를 선언할 수 있다. */
		if (scope) {
			int num = 1;
			num++;
			System.out.println("첫 번쨰 if문 지역: "+ num);
		}
		else {
			int num = 5;
			System.out.println("첫 번째 if문의 else 지역: "+ num);
		}
		/* if문의 블럭에서 선언된 변수 num은 해당 블럭을 벗어나는 순간 메모리에서 소멸되므로
		아래에서 num을 새롭게 선언할 수 있다. */
		int num = 100;
		System.out.println("main 메서드 지역: "+ num);
		
		simpleFunc();
		
		System.out.println("main 메서드 끝");
	}
	
	/* main 지역에서 선언한 변수 num은 메모리에 아직 상주하고 있지만
	 해당 메서드는 크기가 동일한 다른 지역에 정의었으므로 같은 이름의 변수를 선언할 수 있다.
	 
	 앞의 main 메서드의 if ~ else문의 블럭도 같은 개념으로 변수를 선언한 것이다. */
	static void simpleFunc() {
		int num = 1000;
		System.out.println("simple 메서드 지역: "+ num);
	}
}
