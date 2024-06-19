package ex19thread;

/* Thread (쓰레드)
- 쓰레드의 생성은 Thread 클래스를 상속하는 것부터 시작한다.
- 해당 방법은 쓰레드로 생성할 클래스가 다른 클래스를 상속할 필요가 없을 때 사용할 수 있다.
- 만약 다른 클래스를 상속해야 한다면 Runnable 인터페이스를 구현하여 만들어야 한다. */

class ShowThread extends Thread {
	// 멤버변수와 생성자 정의
	String threadName;
	public ShowThread(String name) {
		threadName = name;
	}
	
	/* run() 메서드는 쓰레드의 main() 메서드에 해당한다.
	Thread 클래스의 run() 메서드는 오버라이딩한 것으로
	직접 호출하면 안되고, start()를 통해 간접적으로 호출해야 한다.
	만약, 직접 호출하면 단순히 실행만 되고 쓰레드가 생성되지 않는다. */
	@Override
	public void run() {
		// 100번 반복 실행
		for (int i = 1; i <= 100; i ++) {
			System.out.println("안녕하세요. " + threadName + "입니다.");
			try {
				/* Thread 클래스의 static 메서드인 sleep()을 통해
				실행의 흐름을 주어진 시간만큼 block 상태로 전환시켜준다.
				1000분의 1초 단위로 기술하게 되므로 아래는 0.01초만큼 block 시키게 된다. */
				sleep(10);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Ex01ThreadStart {

	public static void main(String[] args) {
		ShowThread st1 = new ShowThread("쓰레드 1st");
		ShowThread st2 = new ShowThread("Thread 2nd");
		
		/* 쓰레드 인스턴스를 통한 쓰레드 생성 및 실행
		쓰레드가 정상적으로 생성되면 2개의 작업이 병렬적으로 교차하면서 실행된다. */
		st1.start();
		st2.start();
		
		/* run() 메서드를 통해 실행하면 단순한 실행만 될 뿐 쓰레드가 생성되지 않는다.
		따라서 st1의 작업이 완료돼야만 st2가 실행된다.
		즉, 순차적인 실행이 된다. */
//		st1.run();
//		st2.run();
	}

}
