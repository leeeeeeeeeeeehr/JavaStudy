package ex16exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/* 개발자 정의 예외 클래스
1. Exception 클래스를 상속한다.
2. 생성자에서 예외 발생 시 출력할 메세지를 super()를 통해 입력한다.
3. 예외 발생 지점에서 if문으로 감지한 후 예외 인스턴스를 생성 및 throw 한다.
4. catch문에서 예외 인스턴스를 처리한다. */

class AgeErrorException extends Exception {
	public AgeErrorException() {
		super("나이 입력이 잘못되었어요.");
	}
}

public class Ex06DeveloperDefine {

	public static void main(String[] args) {
		System.out.print("나이를 입력하세요: ");
		try {
			/* 아래 메서드에서 AgeErrorException 예외 인스턴스를 throw하면 여기에서 예외 처리한다.
			즉, 메서드를 호출한 지점에서 예외 처리하는 방식이다. */
			int age = readAge();
			System.out.println("당신의 나이는 " + age + "입니다.");
		}
		catch (AgeErrorException e) {
			System.out.println("[예외 발생] " + e.getMessage());
		}
	}
	
	// 예외 던지기를 하여 호출한 지점으로 예외 인스턴스를 전달한다.
	public static int readAge() throws AgeErrorException {
		Scanner sc = new Scanner(System.in);
		int inputAge = 0;
		try {
			/* 나이 입력 시 문자를 입력하는 경우에 대해 예외 처리를 하고 있다.
			이 부분은 Java에서 미리 정의해놓은 클래스를 사용한다. */
			inputAge = sc.nextInt();
		}
		catch (InputMismatchException e) {
			e.printStackTrace();
			System.exit(0);
		}
		/* 만약 나이를 음수로 입력하는 경우 JVM이 감지하지 못하므로
		if문을 통해 직접 판단해야 한다. */
		if (inputAge < 0) {
			// 나이를 음수로 판단하면 우리가 정의한 예외 인스턴스를 생성한 후 throw 한다.
			AgeErrorException ex = new AgeErrorException();
			throw ex;
			/* 예외 인스턴스를 throw 하는 순간 에러가 발생한다.
			이는 프로그램의 종료로 이어지므로 반드시 예외 처리를 해야 한다.
			여기서는 직접 예외 처리를 하지 않고 호출한 main() 메서드로
			예외 인스턴스를 throws 한다.
			(main 메서드에서 받아서 예외 처리를 하고있다.) */
		}
		return inputAge;
	}

}
