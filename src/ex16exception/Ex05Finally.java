package ex16exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/* finally절
 : 예외 발생과 상관 없이 try문으로 진입했을 때 반드시 실행해야 할 코드가 있는 경우 기술하는 블럭이다.
 단, 필수사항은 아니므로 꼭 필요한 경우에만 사용하면 된다.
 
 1. try ~ catch
 	: 예외를 직접 처리할 때
 2. try ~ catch ~ finally
 	: 예외를 직접 처리한 후 실행할 문장이 있을 때
 3. try ~ finally
 	: 예외는 외부로 던지고 예외 발생과 상관 없이 실행할 문장이 있을 때 */

public class Ex05Finally {
	
	/* 런타임 예외가 발생되는 메서드로 예외가 발생하면
	호출한 지점으로 예외 던지기를 한다. 즉, 예외를 무시한다. */
	static void runtime() throws NumberFormatException {
		Integer.parseInt("백");
	}
	
	static void tryCatchFinally() {
		Scanner scan = new Scanner(System.in);
		System.out.print("나이를 입력하세요: ");
		int age = -1;
		try {
			// '10살'과 같이 입력하면 예외가 발생한다.
			age = scan.nextInt();
			System.out.println("당신은 5년 후 " + (age + 5) + "살 입니다.");
			/* 앞에서 정상적인 값을 입력하더라도 return이 실행된다.
			일반적으로 return은 메서드의 종료를 의미하지만
			finally 절이 있다면 해당 구문이 실행된 후 종료된다. */
			return;
		}
		catch (InputMismatchException e) {
			System.out.println("나이는 숫자만 쓰세요.");
		}
		/* try절에서 예외 발생과 상관없이 또는 return을 만나더라도
		항상 finally절은 실행된다. */
		finally {
			System.out.println("항상 실행되는 finally절 입니다.");
			/* 해당 명령은 프로그램 실행 자체를 종료한다.
			즉, 콘솔 창의 터미네이트 버튼을 누르는 것과 동일하게 동작한다.
			따라서 try절에서 해당 명령을 만나게되면 funally절은 실행되지 않는다. */
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
		
		/* NumberFormatException과 같은 예외는
		발생된 지점에서 예외 던지기 하는 것은 가능하나
		반드시 예외 처리해야만 프로그램이 종료되지 않는다.
		즉, 예외 인스턴스에 따라 무시할 수 있는 것도 있지만
		이치럼 반드시 예외 처리를 해워야 하는 것도 존재한다. */
		try {
			// 호출하자마자 예외 발생
			runtime();
		}
		catch (NumberFormatException e) {
			e.printStackTrace();
		}
		
		tryCatchFinally();
		
		/* 프로그램 내에서 예외가 발생되었지만 예외 처리를 통해
		실행의 흐름이 끝까지 이어지므로 해당 문장이 실행된다.
		하지만 exit(0)이 중간에 실행되면 이 부분은 실행될 수 없다. */
		System.out.println("=== 끝 ===");
	}

}
