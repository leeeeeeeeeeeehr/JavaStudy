package ex08class;

/* 해당 예제는 Human 클래스를 별도의 파일로 작성하였다.
동일한 패키지에 정의되었다면 컴파일러는 해당 클래스를 찾아 즉시 인스턴스화 할 수 있다.
만약 다른 패키지에 선언된 클래스라면 반드시 import 선언을 해야 한다. */
public class E02HumanMain {

	public static void main(String[] args) {
		
		/* 1. 클래스를 통해 인스턴스 생성
		: 참조변수(인스턴스형 변수)는 스택 영역에 인스턴스는 힙 영역에 생성된다. */
		Human human = new Human();
		
		/* 2. 인스턴스 초기화
		: 참조변수를 통해 .(닷)으로 접근할 수 있다.
		여기서 멤버변수의 초기값을 할당한다. */
		human.name = "마이클";
		human.age = 28;
		human.energy = 4;
		
		/* 3. 멤버메서드 호출
		: 이를 통해 걷다, 먹다 등의 동작을 실행한다. */
		human.showState();			// 인스턴스의 초기 상태 확인
		System.out.println();
		
		human.eating();
		human.walking();
		human.thinking();
		System.out.println();
		
		human.showState();			// 메서드 호출 후의 상태 확인
		System.out.println();
		
		/* 4. 반복문을 통해 메서드 여러 번 호출
		: 시나리오의 조건이 정확히 구현되었는지 확인한다. */
		for (int i = 1; i <= 3; i++) {
			human.walking();
		}
		System.out.println();
		human.showState();
		
		for (int i = 1; i <= 3; i++) {
			human.eating();
		}
		System.out.println();
		human.showState();
	}

}
