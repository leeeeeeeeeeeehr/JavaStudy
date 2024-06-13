package ex16exception;

public class Ex02PreDefineException5 {
	
	public static void main(String[] args)  {	
	 
		System.out.println("### ArithmeticException ###");
		int result = 10;
		try {
			/* 숫자를 0으로 나누면 무한대가 되므로 연산이 불가능하다.
			이처럼 연산불능 상태가 되었을 때 예외가 발생한다. */
			result = result / 0;
			System.out.println("결과는 " + result);
		}
		catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
			System.out.println("예외 메세지: " + e.getMessage());
		}
				 
	}
		
}