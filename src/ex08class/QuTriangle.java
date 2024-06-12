package ex08class;

/* 문제 2 */
/* 밑변과 높이 정보를 저장할 수 있는 Triangle 클래스를 정의해보자.
init 메서드를 통해 밑변과 높이를 초기화 한다.
그리고 밑변과 높이를 변경시킬 수 있는 메서드와 삼각형의 넓이를 계산해서 반환하는 메서드도 함께 정의해보자. */

class Triangle {
	double bottom;
	double height;
	
	void init(double x, double y) {
		bottom = x;
		height = y;
	}
	
	double getArea() {
		return (bottom * height)/2;
	}
	
	void setBottom(double b) {
		this.bottom = b;
	}
	void setHeight(double h) {
		this.height = h;
	}
	
}

public class QuTriangle {

	public static void main(String[] args) {
		Triangle t = new Triangle();
		t.init(10, 17); //밑변 10, 높이 17로 초기화
		System.out.println("삼각형의 넓이 : "+ t.getArea());
		t.setBottom(50);//밑변 50으로 변경
		t.setHeight(14);//높이 14로 변경
		System.out.println("삼각형의 넓이 : "+ t.getArea());
	}

}
