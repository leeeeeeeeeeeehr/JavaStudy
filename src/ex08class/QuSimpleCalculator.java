package ex08class;

/* 문제 1 */
/* 기본 사칙연산을 할 때마다 연산의 결과와 몇 번 수행되었는지를 출력하는 계산기 클래스를 정의해보자.
아래 main 함수에 부합하는 CalculatorEx 클래스를 정의하면 되고 해당 수치는 임의로 바꿔도 된다.
init() 멤버메소드에서는 계산의 결과를 카운트하는 멤버변수를 0으로 초기화 한다. */

class CalculatorEx {
	double a, b;
	int addCount;
	int minCount;
	int mulCount;
	int divCount;
	
	void init() {
		addCount = 0;
		minCount = 0;
		mulCount = 0;
		divCount = 0;
	}
	
	public double add(double a, double b) {
		addCount++;
		return a + b;
	}
	public double min(double a, double b) {
		minCount++;
		return a - b;
	}
	public double mul(double a, double b) {
		mulCount++;
		return a * b;
	}
	public double div(double a, double b) {
		divCount++;
		return a / b;
	}
	public void showOpCount() {
		System.out.println("덧셈 횟수: " + addCount);
		System.out.println("뺄셈 횟수: " + minCount);
		System.out.println("곱셈 횟수: " + mulCount);
		System.out.println("나눗셈 횟수: " + divCount);
	}
}


public class QuSimpleCalculator {

	public static void main(String[] args) {
		CalculatorEx cal = new CalculatorEx();
		cal.init();
		System.out.println("1 + 2 = " + cal.add(1 , 2));
		System.out.println("10.5 - 5.5 = " + cal.min(10.5 , 5.5));
		System.out.println("4.0 * 5.0 = " + cal.mul(4.0 , 5.0));
		System.out.println("100 / 25 = " + cal.div(100 , 25));
		System.out.println("10.0 * 3.0 = " + cal.mul(10.0 , 3.0));
		cal.showOpCount();
	}

}
