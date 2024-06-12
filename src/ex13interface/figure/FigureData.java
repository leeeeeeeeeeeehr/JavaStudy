package ex13interface.figure;

/* 가로(밑변), 세로(높이)를 멤버로 가지고 있는 클래스로
Triangle, Rectangle 클래스에서 상속해서 사용한다. */
public class FigureData {
	// 멤버변수
	int width, height;
	
	// 생성자
	public FigureData(int width, int height) {
		this.width = width;
		this.height = height;
	}
}
