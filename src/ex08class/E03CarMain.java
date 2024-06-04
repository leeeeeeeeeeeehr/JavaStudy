package ex08class;

// 자동차를 추상화한 클래스 정의
class Car {
	
	// 멤버변수: 자동차 모델명, 소유주
	String carModel;
	// 소유주를 표현한 멤버변수는 Human 타입으로 정의한다.
	Human owner;
	/* => 우리가 직접 정의한 클래스는 객체를 표현하기 위한 용도로 사용되지만
	Java에서는 하나의 자료형으로 사용된다. 즉, 객체를 표현하는 또 하나의 자료형을 생성하는 것이
	class를 정의하는 목적이 된다. */
	
	
	/* 초기화 메서드 1
	: 매개변수가 없는 형태로 항상 고정된 값으로만 인스턴스를 초기화할 수 있다.
	따라서 확장성이 없는 형태이다. */
	void initialize() {
		
		// Car 클래스의 멤버변수를 초기화한다.
		carModel = "람보르기니";
		
		/* 자동차 소유주를 표현한 Human 타입의 멤버변수는 아직 인스턴스가 생성되지 않은 상태이므로,
		초기화를 위해 인스턴스를 생성한 후 초기화를 진행해야 한다. */
		owner = new Human();
		owner.name = "스티브로져스";
		owner.age = 30;
		owner.energy = 10;
	}
	
	/* 초기화 메서드 2
	: 위와 동일한 이름의 메서드로 오버로딩 되어있다.
	초기화를 진행하는 역할은 동일하나 매개변수를 통해 다양한 값으로 초기화할 수 있다. */
	void initialize(String model, String name, int age, int energy) {
		
		carModel = model;
		
		owner = new Human();
		owner.name = name;
		owner.age = age;
		owner.energy = energy;
	}
	
	// '운전'을 표현한 멤버메서드
	void drive() {
		// owner는 인스턴스티므로 이름을 출력하기 위해 '변수명.name'과 같이 기술해야 한다.
		System.out.println(owner.name + "(이)가" + carModel + "을 운전한다.");
	}
	
	// 인스턴스의 현재 상태를 출력하는 멤버메서드
	void showCarInfo() {
		System.out.println("[차량정보]");
		// 모델명은 Car 클래스의 멤버변수이므로 그대로 사용한다.
		System.out.printf("모델명: %s\n", carModel);
		// 소유주를 표현한 owner 인스턴스의 멤버메서드 호출을 통해 정보를 출력할 수 있다.
		owner.showState();
	}
} // end of Car class

public class E03CarMain {

	public static void main(String[] args) {
		
		/* 자동차1 객체(인스턴스) 생성
		: 매개변수가 없는 초기화 메서드를 호출하여 람보르기니로 초기화한다. */
		Car car1 = new Car();
		car1.initialize();
		car1.showCarInfo();
		
		/* 자동차2 객체(인스턴스) 생성
		: 초기화 메서드를 호출하는 대신 멤버변수에 직접 접근하여 인스턴스를 초기화한다.
		이 경우 인스턴스를 생성할 때마다 동일한 코드를 반복적으로 작성해야 하므로 비효율적이다.
		따라서 이 방법은 거의 사용되지 않는다. */
		Car car2 = new Car();
		car2.carModel = "밴틀리";
		car2.owner = new Human();
		car2.owner.name = "토니스타크";
		car2.owner.age = 52;
		car2.owner.energy = 8;
		car2.showCarInfo();
		
		/* 자동차3 객체(인스턴스) 생성
		: 매개변수가 있는 초기화 메서드를 사용하여 인스턴스를 생성한다.
		이 경우 매개변수를 통해 다양한 값을 전달할 수 있으므로 여러 형태의 인스턴스를 생성할 수 있다.
		따라서 가장 효율적인 코드라 할 수 있다. */
		Car car3 = new Car();
		car3.initialize("스포츠카", "성유겸", 8, 10);
		car3.showCarInfo();
		
		/* 자동차4 객제(인스턴스) 생성
		해당 인스턴스는 생성만 하고 초기화하지 않은 상태로 출력을 시도하므로 예외가 발생하게 된다.
		즉, 인스턴스는 초기화 이후 사용해야 한다. */
		Car car4 = new Car();
		car4.showCarInfo();

	}

}
