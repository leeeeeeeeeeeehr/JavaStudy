package ex18lambda;

public class Human {
	/* 멤버변수: 이름, 성별, 점수
	: getter, setter 함수가 있기 때문에 private으로 선언해주었다.
	public이나 default로 선언하면 외부에서도 접근할 수 있기 때문에
	getter, setter 메서드를 사용할 필요가 없다. */
	private String name;
	private String gender;
	private int score;
	
	// 인자 생성자
	public Human(String name, String gender, int score) {
		this.name = name;
		this.gender = gender;
		this.score = score;
	}

	// getter, setter 메서드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	
}
