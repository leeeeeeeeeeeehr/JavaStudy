package ex08class;

/* 시나리오 */
/* 다음에 주어진 조건으로 '사람'을 추상화 하시오.
- 속성 : 이름, 나이, 에너지
- 행동 : 걷는다, 생각한다, 먹는다, 현재 상태 표현
- 행동의 조건
   1. 먹으면 에너지가 2 증가
   2. 걸으면 에너지가 1 감소
   3. 생각하면 에너지가 2 감소
   4. 에너지의 최대/최소 범위는 0 ~ 10으로 한다.
      (무한히 먹을 수 없고, 에너지는 마이너스가 될 수 없기 때문에)
*/

public class Human {

	/* 멤버변수: 객체의 속성을 표현한다.
	- 나이의 경우 산술연산이 필요하지 않다면 String으로 설정해도 된다.
	- 에너지는 증감연산이 필요하므로 반드시 int로 설정해야 한다.*/
	String name;
	int age;
	int energy;

	/* 멤버메서드: 객체의 동작을 표현한다.
	'걷기'를 표현한 메서드로, 호출될 때마다 에너지를 1 차감한다.
	만약 차감한 결과가 음수라면 해당 시나리오의 조건을 위배하므로 0으로 고정시킨다. */
	void walking() {
		energy--;
		// 만약 차감 후 음수가 되면 0으로 고정시킨다.
		if (energy < 0) {
			energy = 0;
			System.out.println("[walk] 에너지는 0이 최소입니다.");
			System.out.println("0으로 고정됩니다.");
		}
		// 정상적으로 차감된 경우 메세지를 출력한다.
		else {
			System.out.println("[walk] 에너지가 1 감소하였습니다.");
		}
	}

	// '생각하기'를 표현한 메서드로, 2 감소 후 음수가 되면 0으로 고정시킨다.
	void thinking() {
		energy -= 2;
		if (energy < 0) {
			energy = 0;
			System.out.println("[thinking] 에너지는 0이 최소입니다.");
			System.out.println("0으로 고정됩니다.");
		} else {
			System.out.println("[thinking] 에너지가 2 감소하였습니다.");
		}
	}

	// '먹기'를 표현한 메서드로, 2 증가 후 10을 초과한다면 고정시킨다.
	void eating() {
		energy += 2;
		if (energy > 10) {
			energy = 10;
			System.out.println("[eat] 에너지는 10이 최대치입니다.");
		} else {
			System.out.println("[eat] 에너지가 2 증가하였습니다.");
		}
	}

	// 인스턴스의 상태를 출력하는 멤버메서드이다.
	void showState() {
		System.out.println("=== 님의 현재상태는 ===");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("에너지 : " + energy);
		System.out.println("===================");
	}

}