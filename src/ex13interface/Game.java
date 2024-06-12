package ex13interface;

/* Java에서는 하나의 Java 파일에 하나의 public 클래스만 선언할 수 있다.
따라서 아무리 간단한 프로그램이라도 확장성을 위해 이와 같이 하나의 Java 파일에
하나의 public 클래스 혹은 인터페이스를 선언하는 것을 권장한다. */
public interface Game {
	int SCISSORS = 1, ROCK = 2, PAPER = 3;
}
