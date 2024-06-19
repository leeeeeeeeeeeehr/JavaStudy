package ex17collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/* 문제 2 */
/* 컬렉션 set에 저장된 객체를 이름으로 검색한다.
해당 정보가 있으면 해당 어벤져스의 정보를 출력하고
없으면 "해당 영웅은 없습니다."라는 메시지 출력해야 한다.
검색 부분은 Iterator를 통해 구현하도록 한다.
set 계열의 컬렉션은 기본적으로 중복 저장을 허용하지 않는다.
그러나 아래와 같이 새롭게 정의한 클래스에 대해서는
equals(), hashCode() 메소드를 적절히 오버라이딩 처리해야 중복을 제거할 수 있다.
메소드 오버라이딩을 통해 hero4는 입력되지 않도록 Avengers 클래스를 업데이트하시오. */

class Avengers {
	String name;
	String heroName;
	String weapon;

	public Avengers(String name, String heroName, String weapon) {
		super();
		this.name = name;
		this.heroName = heroName;
		this.weapon = weapon;
	}

	@Override
	public String toString() {
		return "Avengers [본명: " + name +
				", 닉네임: " + heroName + ", 능력: " + weapon +"]";
	}
	
	@Override
	public int hashCode() {
		int sameName = this.name.hashCode();
		
		return sameName;
	}
	@Override
	public boolean equals(Object obj) {
		Avengers avengers = (Avengers)obj;
		
		if (avengers.name.equals(this.name) &&
			avengers.heroName.equals(this.heroName) &&
			avengers.weapon.equals(this.weapon)) {
			return true;
		}
		else {
			return false;
		}
	}
}

public class QuHashSet {

	public static void main(String[] args) {

		HashSet<Avengers> set = new HashSet<Avengers>();

		Avengers hero1 = new Avengers("토니스타크", "아이언맨", "Mark-48 수트");
		Avengers hero2 = new Avengers("스티브로져스", "캡틴아메리카", "비브라늄 방패");
		Avengers hero3 = new Avengers("브루스배너", "헐크", "강한피부와 점프");
		Avengers hero4 = new Avengers("토니스타크", "아이언맨", "Mark-48 수트");
		
		set.add(hero1);
		set.add(hero2);
		set.add(hero3);
		set.add(hero4);		 

		System.out.println("[최초 전체 정보 출력]");
		for (Avengers av : set) {
			System.out.println(av.toString());			
		}
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("검색할 이름을 입력하세요: ");
		String searchName = scanner.nextLine();
		
		boolean isFound = false;
		
		Iterator itr = set.iterator();
		
		while (itr.hasNext()) {
			Avengers avengers = (Avengers)itr.next();
			
			if (searchName.equals(avengers.name)) {
				System.out.println(avengers.toString());
				isFound = true;
				break;
			}
		}
		if (!isFound) {
			System.out.println("해당 영웅이 없습니다.");
		}
		
	}
	
}