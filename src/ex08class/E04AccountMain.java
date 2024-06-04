package ex08class;

/* 시나리오 */
/* 은행 계좌를 추상해보자.
- 멤버변수
: 예금주, 계좌번호, 잔고
- 멤버메서드: 입금하다, 출금하다, 계좌 잔고 조회

조건 1) 입금은 무제한으로 가능
조건 2) 잔고가 부족한 경우에는 출금 불능 처리
조건 3) 초기화메서드: 멤버변수를 초기화할 수 있는 메서드 정의 */

// 은행 계좌를 추상화한 클래스
class Account {
	
	// 멤버변수
	String name;
	// 계좌번호는 연산의 대상이 아니므로 String으로 선언한다.
	String accountNumber;
	/* 잔고의 경우 입출금을 위한 연산이 필요하므로 int로 선언한다.
	(소수점까지 필요한 경우 double로 선언해야 한다.) */
	int balance;
	
	// 자동으로 생성되는 디폴트 생성자 메서드
	public Account() {
		
	}
	
	// 입금 처리를 위한 멤버메서드
	void deposit(int money) {
		// 별도의 제한이 없으므로 잔고에 합산만 해준다.
		balance += money;
		System.out.println(money + "원이 입금되었습니다.");
	}
	
	// 출금 처리를 위한 멤버메서드
	void withdraw(int money) {
		// 출금을 위해 잔고와 출금액을 비교하여 처리한다.
		if (balance >= money) {
			// 잔고가 충분하다면 money만큼 차감한다.
			balance -= money;
			System.out.println("계좌에서 " + money + "원이 출금되었습니다.");
		}
		else {
			System.out.println("잔고 부족으로 출금이 불가능합니다.");
		}
	}
	
	// 계좌 정보를 출력하는 멤버메서드 (= 계좌 조회)
	void showAccount() {
		System.out.println("계좌주: " + name);
		System.out.println("계좌번호: " + accountNumber);
		System.out.println("잔고: " + balance);
	}
	
	// 초기화를 위한 멤버메서드
	void init(String n, String a, int b) {
		name = n;
		accountNumber = a;
		balance = b;
	}
}

public class E04AccountMain {

	public static void main(String[] args) {
		
		// 첫 번째 계좌 인스턴스 생성
		Account account = new Account();
		// 초기화 메서드를 통해 인스턴스 초기화
		account.init("장동건", "111-21-8888", 1000);
		// 입/출금을 진행한 후 계좌 정보 확인
		account.deposit(9000);
		account.withdraw(5000);
		account.showAccount();
		
		// 두 번째 계좌 인스턴스 생성
		Account account2 = new Account();
		// 멤버변수에 직접 접근하여 인스턴스 초기화
		account2.name = "정우성";
		account2.accountNumber = "123-45-67890";
		account2.balance = 900000;
		account2.showAccount();
		
		/* 멤버변수를 직접 기술하는 것은 초기화 메서드에 비해 불편한 방법이므로
		첫 번째 방법으로 초기화하는 것이 좋다. */
		
	}

}
