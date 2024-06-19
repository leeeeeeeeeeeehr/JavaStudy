package ex19thread;

/* 쓰레드의 우선순위
- setPriority(우선순위): 쓰레드의 우선순위를 지정한다.
- getPriority(): 지정된 우선순위를 반환한다. */

class MessageSendingThread extends Thread {
	String message;
	
	// 생성자 1: 이름만 지정한다.
	public MessageSendingThread(String str) {
		message = str;
	}
	// 생성자 2: 이름과 우선순위까지 지정한다.
	public MessageSendingThread(String str, int pri) {
		message = str;
		setPriority(pri);
	}
	
	public void run() {
		/* 각 쓰레드는 1000번씩 반복 출력한다.
		이때 부여받은 우선순위를 출력한다. */
		for (int i = 1; i <= 1000; i++) {
			System.out.println(message + "_" + i + "(" + getPriority() + ")");
			
			/* 기본적으로 우선순위가 높은 쓰레드가 먼저 실행되지만
			sleep()을 호출하면 실행 중 잠깐씩 블럭 상태로 전환되어
			우선순위가 낮은 쓰레드도 실행될 수 있는 기회가 생긴다. */
			try {
				sleep(1);
			}
			catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}

public class Ex02Priority {

	public static void main(String[] args) {
		
		/* 1단계 실행
		: 우선순위를 부여하지 않은 상태로 쓰레드 인스턴스를 생성하면
		동일한 우선순위 '5'를 부여받게 된다.
		이때는 CPU가 알아서 작업을 분배한다. */
//		MessageSendingThread tr1 = new MessageSendingThread("첫번째");
//		MessageSendingThread tr2 = new MessageSendingThread("두번째");
//		MessageSendingThread tr3 = new MessageSendingThread("세번째");
		
		/* 2단계 실행
		: Thread 클래스의 정적 상수를 이용해서 우선순위를 부여한다.
		순서대로 '10', '5', '1'의 우선순위를 부여받게 된다.
		상수 대신 정수로 부여해도 동일하다. */
		MessageSendingThread tr1 =
				new MessageSendingThread("첫번째", Thread.MAX_PRIORITY);
		
		MessageSendingThread tr2 =
				new MessageSendingThread("두번째", Thread.NORM_PRIORITY);
		
		MessageSendingThread tr3 =
				new MessageSendingThread("세번째", Thread.MIN_PRIORITY);
		
		tr1.start();
		tr2.start();
		tr3.start();

	}

}
