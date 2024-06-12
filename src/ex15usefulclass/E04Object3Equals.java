package ex15usefulclass;

class MyClass {
	// 멤버변수
	int data;
	
	// 생성자
	public MyClass(int data) {
		this.data = data;
	}
	
	/* toString()
	: 인스턴스가 가진 데이터를 String으로 반환해준다.
	print()가 호출될 때 자동으로 호출되어 출력에 도움을 준다. */
	@Override
	public String toString() {
		// 정수를 String으로 변환해서 반환한다.
		return "data = " + String.valueOf(data);
	}
	/* MyClass 인스턴스 간의 내용 비교를 위해 equals()를 오버라이딩하여 재정의한다.
	인스턴스가 가진 멤버변수의 값에 대한 비교를 통해 동일 여부를 판단한다.
	equals() 메서드의 매개변수 타입은 모든 인스턴스를 대상으로 하므로 Object형으로 정의되어 있다.*/
	@Override
	public boolean equals(Object obj) {
		/* 매개변수로 전달된 인스턴스를 Object로 받으면 업캐스팅이 되므로
		다운캐스팅 이후에 비교를 진행해야 한다.
		이때 전달된 인스턴스가 MyClass 타입이 아니라면 비교의 대상이 될 수 없으므로
		상속 관계 확인을 위해 instanceof 연산자를 사용한다. */
		if (obj instanceof MyClass) {
			/* 매개변수가 MyClass 타입이 맞다면 비교를 위해 다운캐스팅 한다.
			그렇지 않으면 부모 타입으로는 자식 멤버에 접근할 수 없으므로
			멤버변수 data에 대한 비교가 불가능해진다. */
			MyClass mc = (MyClass) obj;
			if (mc.data == this.data) {
				System.out.println("MyClass - 멤버 동일함");
				return true;
			}
			else {
				// 다르면 false를 반환한다.
				System.out.println("MyClass - 멤버 다름");
				return false;
			}
		}
		else {
			/* 매개변수로 전달된 인스턴스가 MyClass 타입이 아니라면
			비교의 대상이 될 수 없으므로 false를 반환한다. */
			System.out.println("MyClass 객체 아님");
			return false;
		}
	}
}

public class E04Object3Equals {

	public static void main(String[] args) {
		
		// 클래스를 통해 2개의 인스턴스를 생성한다.
		MyClass mc1 = new MyClass(10);
		MyClass mc2 = new MyClass(10);
		
		System.out.println("### 비교 연산자를 통해 두 객체 비교 ###");
		// 해당 비교는 참조값에 대한 비교이므로 다르다는 결과가 출력된다.
		if (mc1 == mc2) {
			System.out.println("인스턴스 참조값(주소값)이 같다.");
		}
		else {
			System.out.println("인스턴스 참조값(주소값)이 다르다.");
		}
		System.out.println();
		
		/* 인스턴스의 내용을 비교하므로 같다고 출력된다.
		만약 오버라이딩한 equals()를 삭제한 후 실행하면 다르다는 결과가 출력된다.
		즉, 오버라이딩이 필요없는 경우는 기본 클래스일 때만 가능하다. */
		System.out.println("### equals() 메서드로 두 객체 비교 ###");
		System.out.println(mc1.equals(mc2) ? "같다." : "다르다.");
		System.out.println();
		
		// print를 통해 출력하면 자동으로 toString()을 호출하므로 아래 출력 결과는 동일하다.
		System.out.println("### 두 객체의 toString() 메서드 호출 ###");
		System.out.println("mc1.toString() => " + mc1.toString());
		System.out.println("mc2 => " + mc2);
		
	}

}
