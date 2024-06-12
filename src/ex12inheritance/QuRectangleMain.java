package ex12inheritance;

/* 문제 3 */
/* 정사각형을 의미하는 Square 클래스와 직사각형을 의미하는 Rectangle 클래스를 정의하고자 한다.
그런데 정사각형은 직사각형의 일종이므로 다음의 형태로 클래스의 상속 관계를 구성하고자 한다.
아래의 소스를 참조하여 구현하시오. */

// 직사각형을 표현한 클래스
class Rectangle {
	int width;
	int height;
	double area;
	
	public Rectangle(int w, int h) {
		this.width = w;
		this.height = h;
	}
	public void showAreaInfo() {
		area = width * height;
		System.out.println("직사각형 면적: " + area);
	}
} 

// 정사각형을 표현한 클래스 (정사각형은 직사각형의 일종)
class Square extends Rectangle {
	public Square(int cm) {
		super(cm, cm);
	}
	@Override
	public void showAreaInfo() {
		area = width * height;
		System.out.println("정사각형의 면적: " + area);
	}
}

class QuRectangleMain {
	public static void main(String[] args) {
       	Rectangle rec = new Rectangle(4, 3);
       	rec.showAreaInfo();

 		Square sqr = new Square(7);
       	sqr.showAreaInfo();
	}
}

