package ex12inheritance;

// 직사각형을 표현한 클래스
class Rectangle2 {
	// 멤버변수: 가로, 세로 길이를 표현
	int width;
	int height;
	
	// 생성자: 멤버변수 초기화
	public Rectangle2(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public void showAreaInfo() {
		// 멤버변수를 사용 시 this를 붙여 멤버변수임을 명시하도록 한다.
		System.out.println("직사각형의 면적: " + (this.width * this.height));
	}
}

// 정사각형을 표현한 클래스(정사각형은 직사각형의 일종)
class Square2 extends Rectangle2 {
	/* 직사각형은 가로, 세로 두 변의 길이가 서로 다르므로 2개의 멤버변수가 필요하다.
	하지만 정사각형은 길이가 동일하므로 1개의 값으로 2개의 멤버변수를 초기화할 수 있다.
	즉, 해당 클래스는 멤버변수의 확장이 필요하지 않다. */
	public Square2(int cm) {
		super(cm, cm);
	}
	
	public void showAreaInfo() {
		// 부모의 멤버변수를 통해 사각형의 넓이를 계산한다.
		System.out.println("정사각형의 면적: " + (super.width * super.height));
	}
}

public class QuRectangleMain_T {

	public static void main(String[] args) {
		// 부모 클래스의 인스턴스 (직사각형)
		Rectangle2 rec = new Rectangle2(4, 3);
       	rec.showAreaInfo();

   		Square2 sqr = new Square2(7);
       	sqr.showAreaInfo();
	}
}
