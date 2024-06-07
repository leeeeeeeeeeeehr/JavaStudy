package ex12inheritance;

/* 강아지를 표현한 클래스 
- 'Dog is a Animal'이 성립하므로 상속 관계로 표현하기에 적합한 모델	

멤버변수
- dogKind: 강아지의 종류(푸들, 포매라니안 등)
- name: 이름

멤버메소드
- bark(): 강아지가 짖는 것을 표현
	- 출력 결과: 이름이 XX이고 종(포유류)이 YY인 강아지가 짖는다.
- showDog(): 강아지의 현재 상태(멤버변수)를 출력하는 메소드

인자생성자
: 부모 클래스까지 초기화할 수 있도록 구성할 것 */

public class Dog extends Animal {
	
	public String dogKind;
	public String name;
	
	public Dog(String spec, int year, String gen, String kind, String dog_name) {
		super(spec, year, gen);
		dogKind = kind;
		name = dog_name;
	}
	// 멤버변수가 public으로 선언된 경우 직접 사용한다. (species가 public인 경우)
//	void bark() {
//		System.out.println("이름이 '" + this.name + "'이고,"
//				+ "종이 '" + super.species + "'인 강아지가 짖는다.");
//	}
	// 멤버변수가 private으로 선언된 경우 직접 접근이 안되므로 getter를 통해 값을 반환받아야 한다. (species가 private인 경우)
	void bark() {
		System.out.println("이름이 '" + this.name + "'이고,"
				+ "종이 '" + super.getSpecies() + "'인 강아지가 짖는다.");
	}
	void showDog() {
		// species가 public인 경우
//		System.out.println("동물의 종류: " + species);
		// species가 private인 경우
//		System.out.println("동물의 종류: " + getSpecies());
		System.out.println("동물의 나이: " + age);
		System.out.println("동물의 성별: " + gender);
		
		/* 위의 종류, 나이, 성별은 부모의 클래스에 메서드로 표현한 것이 있으니
		super.showAnimal();로 표현하는 것이 더 간단하다. */
		
		System.out.println("동물의 이름: " + name);
		System.out.println(name + "의 종류: " + dogKind);
	}

}
