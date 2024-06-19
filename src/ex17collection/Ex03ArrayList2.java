package ex17collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

import common.Student;

public class Ex03ArrayList2 {

	public static void main(String[] args) {
		
		/* 아래 2개의 컬렉션은 내부적인 자료 구조만 다른뿐 구현 방법에는 차이가 없다.
		인스턴스 생성 시 Student형의 타입 매개변수를 통해 생성한다.
		즉, Student 인스턴스를 저장할 수 있는 상자가 된다. */
		LinkedList<Student> list2 = new LinkedList<Student>();
//		ArrayList<Student> list2 = new ArrayList<Student>();
		
		/* List에 저장할 Student 인스턴스 생성,
		외부 패키지에 선언되었으므로 import 해야 한다. */
		Student st1 = new Student("정우성", 10, "2018");
		Student st2 = new Student("원빈", 20, "2017");
		Student st3 = new Student("장동건", 30, "2016");
		Student st4 = new Student("공유", 40, "2015");

		// List에 인스턴스 추가, 인덱스는 자동으로 부여된다.
		list2.add(st1);		// 인덱스 0
		list2.add(st2);
		list2.add(st3);
		list2.add(st4);		// 인덱스 3
		// List는 인덱스로 구분할 수 있고 중복 저장이 가능하다.
		list2.add(st2);
		
		System.out.println("[출력 1: 일반 for문]");
		
		/* 일반 for문 사용을 위해 size() 메서드로 추가된 인스턴스의 갯수를 반환 받는다.
		또한, index로 접근해야 하므로 get() 메서드를 사용한다. */
		for (int i = 0; i < list2.size(); i++) {
			/* List의 각 인덱스에 저장된 인스턴스의 참조값을 그대로 출력한다.
			toString() 메서드를 오버라이딩 했으므로 인스턴스에 저장된 멤버변수 값이 출력된다.
			만약 오버라이딩이 되어있지 않다면 참조값이 출력될 것이다. */
			System.out.println(list2.get(i));
		}
		System.out.println();
		
		/* 인스턴스의 참조값을 통해 삭제하는 경우 boolean 값이 반환된다.
		또한 동일한 인스턴스가 존재한다면 앞에 있는 것이 먼저 삭제된다.
		즉, 동시에 삭제되지 않고 하나씩 삭제된다. */
		boolean removeOk = list2.remove(st2);			// 원빈 삭제
		
		// 정상적으로 삭제되면 true를 반환한다.
		System.out.println("인스턴스를 통한 삭제: " + removeOk);
		System.out.println("(true면 '원빈'이 삭제되었음)");
		System.out.println();
		
		/* 컬렉션에 저장된 값을 통해 이터레이터 인스턴스를 생성한다.
		반환할 인스턴스가 있는지 확인한 후 true이면 next()로 출력한다. */
		System.out.println("[출력 2: Iterator]");
		
		Iterator<Student> it2 = list2.iterator();
		
		while (it2.hasNext()) {
			System.out.println(it2.next());
		}
		System.out.println();
		
		/* 시나리오 */
		/* 컬렉션에 저장된 인스턴스를 이름으로 검색하여 삭제하는 코드를 작성하시오.
		이때 반복문은 확장 for문을 사용하시오. */
		Scanner scanner = new Scanner(System.in);
		System.out.print("삭제할 이름을 입력하세요: ");
		
		String removeName = scanner.nextLine();
		
		// 리스트에 저장된 인스턴스의 갯수만큼 반복
		for (Student st : list2) {
			/* 이름으로 검색 시 멤버변수 name은 private으로 선언되었으므로
			getter()를 통해 접근해야 한다.
			삭제를 위해 입력한 이름과 Student 인스턴스에 저장된 name과
			일치하는지 확인한 후 해당 인스턴스를 찾을 수 있다. */
			if (removeName.equals(st.getName())) {
				// 정보가 일치하면 참조값을 통해 삭제한다.
				list2.remove(st);
				// 삭제가 완료되면 즉시 반복문을 탈출한다.
				break;
			}
		}
		System.out.println("삭제 후의 객체 수: " + list2.size());
		
		System.out.println();
		

		System.out.println("[출력 3: 확장 for문]");
		
		/* 앞에서 삭제한 인스턴스에 따라 아래의 결과는 달라질 수 있다.
		인스턴스의 인덱스를 통해 삭제하면 인스턴스의 참조값이 반환된다.
		따라서 삭제된 인스턴스의 정보를 출력할 수 있다. */
		System.out.println("=== 삭제된 객체의 이름: " + list2.remove(2).getName() + " ===");
		
		for (Student st : list2) {
			// 남아있는 정보는 2개가 출력된다.
			System.out.println(st);
		}
		
	}

}
