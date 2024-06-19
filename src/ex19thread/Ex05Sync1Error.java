package ex19thread;

// 2개의 쓰레드가 공유 인스턴스로 사용할 클래스
class SumMulti {
	// 멤버변수와 생성자 정의
	int num;
	public SumMulti() {
		num = 0;
	}

	/* 쓰레드의 run() 메서드에서 호출하는 메서드로
	매개변수로 전달되는 n을 멤버변수에 누적해서 더한다.
	여기서는 2개의 쓰레드가 5000번씩 각각 호출하고 있다. */
	public void addNum(int n) {
		num += n;
	}
	public int getNum() {
		return num;
	}
}

// 쓰레드로 정의한 클래스
class MultiAdderThread extends Thread {
	// 앞에서 정의한 공유 인스턴스를 멤버변수로 선언한다.
	SumMulti sumInst;
	int start, end;
	// 생성자에서 멤버변수 초기화
	public MultiAdderThread(SumMulti sum, int s, int e) {
		sumInst = sum;
		start = s;
		end = e;
	}
	
	/* 쓰레드를 통해 반복적으로 공유 인스턴스의 addNum()을 호출한다.
	이 경우 동기화 처리가 되지 않아 동시에 접근되는 경우가 발생하게 되어
	잘못된 결과가 출력된다. */
	public void run() {
		for (int i = start; i <= end; i++) {
			sumInst.addNum(i);
		}
	}
}

public class Ex05Sync1Error {

	public static void main(String[] args) {
		/* 하나의 인스턴스를 두 개의 쓰레드가 공유해서 사용하는 형태로 동작한다.
		각각의 쓰레드가 5000번씩 반복해서 누적 합을 계산하게 된다. */
		SumMulti s = new SumMulti();
		
		MultiAdderThread mat1 = new MultiAdderThread(s, 1, 5000);
		MultiAdderThread mat2 = new MultiAdderThread(s, 5001, 10000);
		
		mat1.start();
		mat2.start();
		
		try {
			mat1.join();
			mat2.join();
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("1 ~ 10000까지의 합: " + s.getNum());
	}

}
