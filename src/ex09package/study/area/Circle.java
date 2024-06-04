package ex09package.study.area;

// 원의 넓이를 계산하기 위한 클래스
public class Circle {
	
	// 멤버 변수
	double rad;
	final double PI;
	
	// 생성자: 멤버상수를 초기화하고 있음
	public Circle(double rad) {
		this.rad = rad;
		PI = 3.141592;
	}
	
	// 멤버메서드: 원의 넓이를 계산
	public double getArea() {
		return PI * rad * rad;
	}

}
