package ex12inheritance;

/* Has-A
: X has a Y
 	=> 'X가 Y를 소유(포함)하다'로 표현 가능한 관계

여기서는 권총을 소유한 경찰을 표현했다.
Has-A와 같이 소유의 관계를 상속으로 표현하면 클래스 간의 강한 연결고리가 형성되어
권총이 없는 경찰을 표현하기 힘들어진다.
따라서 이 경우에는 구성(Composition) 관계로 표현하는 것이 좋다.
구성 관계랑 클래스의 멤버로 또 다른 클래스를 사용하는 것을 말한다. */

// 권총을 추상화
class Gun {
	
	// 멤버변수: 총알
	int bullet;
	
	// 생성자
	public Gun(int bNum) {
		bullet = bNum;
	}
	
	// 총을 발사한 후 총알이 감소하는 것을 표현
	public void shootGun() {
		System.out.println("샷건 쏨");
		bullet--;
	}
	
}

// 경찰을 추상화
class Police {
	
	/* 권총과 수갑을 보유한 경찰을 표현하기 위함
	상속으로 구현하지 않고 멤버변수로 정의하고 있다. */
	// 수갑: 정수형 멤버변수
	int handCuffs;
	// 권총: 인스턴스형 멤버변수 (다른 클래스를 통해 생성)
	Gun gun;
	
	// 생성자
	public Police(int bNum, int hCuff) {
		/* 수갑에 대한 초기화,
		정수값을 통해 보유 여부를 결정 */
		handCuffs = hCuff;
		/* 권총에 대한 초기화,
		권총의 보유 여부는 총알이 없는 상태라면 권총이 없는 것으로 간주하여 null로 초기화한다.
		참조 변수가 null을 할당 받았다는 것은 참조할 인스턴스가 없는 것을 의미한다.
		즉, Heap 영역에 생성된 인스턴스가 아예 없으므로 소유하지 않은 것을 표현할 수 있다. */
		if (bNum <= 0) {
			gun = null;				// null이므로 참조값이 없음 => '없음'을 표현
		}
		else {
			gun = new Gun(bNum);	// 인스턴스를 생성함으로 참조값을 가짐 => '있음'을 표현
		}
	}
	
	// 수갑 채우는 것을 표현
	public void putHandcuff() {
		System.out.println("수갑 채움");
		handCuffs--;
	}
	// 권총 발사하는 것을 표현
	public void shoot() {
		// 조건물을 통해 소유한 총이 있을 때만 발사할 수 있다.
		if (gun == null) {
			System.out.println("보유한 권총 없음");
		}
		else {
			gun.shootGun();
		}
	}
	
}

public class E05HasAComposite {

	public static void main(String[] args) {
		
		// 권총을 보유한 경찰, 총알 5발과 수갑 3개로 인스턴스 생성
		System.out.println("=== 경찰 1 ===");
		Police police1 = new Police(5, 3);
		police1.shoot();			// 발사 가능
		police1.putHandcuff();
		
		// 권총을 보유하지 않은 경찰, 수갑 3개만으로 인스턴스 생성
		System.out.println("=== 경찰 2 ===");
		Police police2 = new Police(0, 3);
		police2.shoot();			// 발사 불가능
		police2.putHandcuff();

	}

}
