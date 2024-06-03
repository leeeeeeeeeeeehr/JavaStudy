package ex05method;

public class QuCircleCalculator {

	/* 문제 2-2 */
	/* 원의 반지름을 인수(파라메타)로 전달하면 원의 넓이와 둘레를 계산하여 반환하는 메서드를 각각 정의하자.
	이를 호출하는 main 메서드를 정의하시오.
	
	- 메서드명 : circleArea(), circleRound()
	- 넓이 공식 : 3.14 * 반지름 * 반지름
	- 둘레 공식 : 2 * 3.14 * 반지름 */
	
	////////////////////////////////////////////////////////////////////////////
	
	public static double circleRound(double radius) {
		
		double round = 2 * 3.14 * radius;
		return round;
		
	}
	
	public static double circleArea(double radius) {
		
		double area = 3.14 * radius * radius;
		return area;
		
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("원의 둘레(5.5): " + circleRound(5.5));
		System.out.println("원의 넓이(5.5): " + circleArea(5.5));
		
	}

}
