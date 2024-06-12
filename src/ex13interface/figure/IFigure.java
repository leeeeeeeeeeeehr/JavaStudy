package ex13interface.figure;

/* 인터페이스 혹은 클래스 하나 당 하나의 자바 파일을 구성하는 것을 권장한다.
그렇게 해야 클래스를 public으로 선언할 수 있어 재활용이 가능해진다. */
public interface IFigure {
	// 도형의 넓이 계산 기능
	void area(String figureName);
}
