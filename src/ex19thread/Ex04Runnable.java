package ex19thread;

// 부모 클래스로 사용할 클래스
class Sum {
	// 멤버변수와 생성사
	int num;
	public Sum() {
		num = 0;
	}
	
	/* 메서드 호출 시 전달되는 인수의 값을 누적해서 멤버변수에 더한다.
	 * 만약 1 ~ 10까지 순차적으로 전달한다면 수열의 합이 된다. */
	public void addNum(int n) {
		num += n;
	}
	public int getNum() {
		return num;
	}
}

/* 쓰레드 클래스를 생성하는 두 번째 방법
: Java는 다중 상속을 지원하지 않으므로 기능을 위해 다른 클래스를 상속해야 한다면
Runnable 인터페이스를 구현해서 쓰레드 클래스를 정의해야 한다.
 */
class AdderThread extends Sum implements Runnable {
	// 멤버변수와 생성자: 시작값과 종료값을 지정한다.
	int start, end;
	public AdderThread(int s, int e) {
		start = s;
		end = e;
	}
	/* 멤버변수 start에서 end까지 반복하면서
	부모 클래스에 정의된 addNum()을 호출하여 누적 합을 계산한다.
	start가 1이고 end가 10이라며 1 ~ 10까지의 합을 쓰레드를 통해 계산하게 된다. */
	@Override
	public void run() {
		for (int i = start; i <= end; i++) {
			System.out.println("i = " + i);
			addNum(i);
		}
	}
}

public class Ex04Runnable {

	public static void main(String[] args) {
		/* Runnable 인터페이스를 구현한 클래스의 인스턴스를 대상으로 쓰레드를 생성한다.
		해당 방법도 결국 Thread 클래스를 통해서 생성하게 된다.
		
		여기서는 일반적인 인스턴스가 생성된다. */
		AdderThread at1 = new AdderThread(1, 500);
		AdderThread at2 = new AdderThread(501, 1000);
		
		// 여기서 쓰레드 인스턴스가 된다.
		Thread thread1 = new Thread(at1);
		Thread thread2 = new Thread(at2);
		
		// start()를 통해 쓰레드를 시작한다.
		thread1.start();
		thread2.start();
		
		try {
			/* 생성된 쓰레드가 하나의 작업을 완료하기를 기다린다.
			즉, 해당 쓰레드가 하나의 작업이 종료되기를 기다렸다가 다음 쓰레드를 실행한다.
			쓰레드의 동시 접근을 제한하는 기능을 가지고 있다. */
			thread1.join();
			thread2.join();
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("1 ~ 100까지의 합: "+ (at1.getNum() + at2.getNum()));

	}

}
