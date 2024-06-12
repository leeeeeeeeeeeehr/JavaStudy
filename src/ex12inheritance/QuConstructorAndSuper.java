package ex12inheritance;

/* 문제 1 */
/* 상속 관계에 놓여있는 클래스의 생성자 정의 및 호출 방식을 기본으로 다음 클래스의 적절한 생성자를 삽입해보자.
그리고 이의 확인을 위한 main 메서드도 적절히 정의해보자. */

class Car {
	int gasoline;
	
	public Car(int g) {
		this.gasoline = g;
	}
}

class HybridCar extends Car {
   	int electric;
   	
   	public HybridCar(int g, int e) {
   		super(g);
   		this.electric = e;
   	}
}

class HybridWaterCar extends HybridCar {
   	int water;
   	
   	public HybridWaterCar(int g, int e, int w) {
   		super(g, e);
   		this.water = w;
   	}
 
   	public void showNowGauge() {
     	System.out.println("남은 가솔린: " + gasoline);
     	System.out.println("남은 전기량: " + electric);
     	System.out.println("남은 워터량: " + water);
   	}
}

public class QuConstructorAndSuper {

	public static void main(String[] args) {
		HybridWaterCar hcar = new HybridWaterCar(10,20,30);
		hcar.showNowGauge();
	}
	
}

