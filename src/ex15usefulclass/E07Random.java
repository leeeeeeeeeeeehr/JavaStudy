package ex15usefulclass;

import java.util.Random;

public class E07Random {

	public static void main(String[] args) {
		
		/* Random 클래스는 인스턴스 생성 시 전달되는 인수를 기반으로 난수를 생성한다.
		이것을 Seed(씨앗)라고 표현한다.
		만약 동일한 Seed를 사용하면 항상 동일한 패턴의 난수가 생성되는데
		이를 가짜난수(Pseudo-random number)라고 한다. */
		System.out.println("# 가짜 난수: 같은 패턴의 난수만 생성됨");
		Random random1 = new Random(32);
		for (int i = 0; i < 10; i++) {
			System.out.print(random1.nextInt(100) + " ");
		}
		System.out.println();
		
		/* Random 클래스의 nextInt(n) 메서드
		: 0 ~ n-1 까지의 난수가 생성된다. */
		System.out.println("\n# 난수 생성 1: 씨드 없음");
		Random random2 = new Random();
		for (int i = 0; i < 10; i ++) {
			System.out.print(random2.nextInt(100) + " ");
		}
		System.out.println();
		
		/* Seed를 부여하려면 setSeed() 메서드를 사용한다.
		이때 현재 시간을 밀리초 단위로 반환하는 메서드를 사용하면 편리하다. */
		System.out.println("\n# 난수 생성 2: 변화하는 시간으로 씨드 지정");
		Random random3 = new Random();
		random3.setSeed(System.currentTimeMillis());
		System.out.println("(1970년 1월 1일부터 지금까지 지난 밀리 초: " + System.currentTimeMillis() + ")");
		for (int i = 0; i < 10; i++) {
			System.out.print(random3.nextInt(100) + " ");
		}
		System.out.println();
		
		/* nextInt()에 인수가 없는 경우에는 음수, 양수가 혼용된 난수가 생성된다.
		이 경우에는 Math.abs()를 통해 양수로 변환하고
		특정수를 나누는 형태로 필요한 난수를 생성할 수 있다. */
		System.out.println("\n# 난수 생성 3: nextInt() 인수 없음");
		Random random4 = new Random();
		for (int i = 0; i < 10; i++) {
			System.out.print(random4.nextInt() + " ");
		}

	}

}
