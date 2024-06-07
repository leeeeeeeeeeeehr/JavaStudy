package ex12inheritance;

/* 동물의 일반적인 특성을 표현하는 클래스를 정의하시오.
멤버변수
- species: 동물의 종류(포유류, 어류, 조류 등)
- age: 나이
- gender: 성별

멤버메소드
- showAnimal(): 멤버변수를 출력하는 용도

인자생성자
: 멤버변수 3개 모두를 초기화할 수 있도록 정의
	
※ 1차 완성 후 species를 private로 선언 후 적절히 수정한다. */

public class Animal {
	
//	public String species;
	// publice을 private로 변경
	private String species;
	public int age;
	public String gender;
	
	public Animal(String spec, int year, String gen) {
		this.species = spec;
		this.age = year;
		this.gender = gen;
	}
	public void showAnimal() {
		System.out.println("동물의 종류: " + species);
		System.out.println("동물의 나이: " + age);
		System.out.println("동물의 성별: " + gender);
	}
	
	/* getter 메서드
	: private으로 선언된 멤버변수를 클래스 외부로 반환할 때 사용하는 메서드 */
	public String getSpecies() {
		return species;
	}

}
