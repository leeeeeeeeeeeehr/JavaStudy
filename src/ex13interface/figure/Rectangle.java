package ex13interface.figure;

/* 사각형을 표현한 클래스이다.
가로, 세로가 필요하므로 FigureData를 상속하고
넓이와 그리는 행위를 표현하기 위해 2개의 인터페이스까지 구현한다. */
public class Rectangle extends FigureData implements IFigure, IDrawable {
	
	/* 상속은 '확장'이 기본이지만 특수한 경우에는 멤버의 확장이 필요하지 않다.
	부모 클래스에 이미 변수가 선언되어 있으므로 super을 통해 초기화한다. */
	public Rectangle(int width, int height) {
		super(width, height);
	}
	
	@Override
	public void draw(String figureName) {
		System.out.println(figureName + "을 그립니다.");	
	}
	@Override
	public void area(String figureName) {
		System.out.println(figureName + "의 면적 (가로 * 세로): " + width * height);
	}
}
