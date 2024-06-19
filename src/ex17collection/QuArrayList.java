package ex17collection;

import java.util.LinkedList;
import java.util.Scanner;

import common.Student;

/* 문제 1 */
/* 실행 순서는 아래와 같다.
1. 사용자로부터 이름을 입력 받는다.
2. 입력 받은 이름으로 검색해서 인덱스 위치(indexOf 사용)를 알아낸다.
3. 해당 인덱스로 그 객체를 삭제한다.
4. 삭제된 객체의 정보(이름, 나이, 학번)를 출력한다. */

public class QuArrayList {

	public static void main(String[] args) {
		LinkedList<Student> list = new LinkedList<Student>();
		
		// 저장할 객체 생성
		Student st1 = new Student("가길동", 10, "2018");
		Student st2 = new Student("나길동", 20, "2017");
		Student st3 = new Student("다길동", 30, "2016");
		Student st4 = new Student("마길동", 40, "2015");
		
		// 객체 추가(컬렉션에 저장)
		list.add(st1);
		list.add(st2);
		list.add(st3);
		list.add(st4);
			
		// 1. 검색할 이름을 입력 받는다.
		Scanner scanner = new Scanner(System.in);
		System.out.println("검색할 이름을 입력하세요: ");
		String searchName = scanner.nextLine();
		
		boolean isRemoved = false;
		
		// 2. 확장 for문으로 컬렉션 전체를 접근한다.
		for (Student st : list) {
			// 3. 검색된 데이터의 유/무에 따라 제어한다.
			if (searchName.equals(st.getName())) {
				System.out.println("검색된 데이터를 삭제하겠습니다.");
				// 검색 결과 있으면 검색된 데이터를 삭제한다.
				list.remove(st);
				isRemoved = true;
				break;
			}
		}
		
		// 검색 결과가 없으면 검색 결과가 없다고 출력한다.
		if (!isRemoved) {
			System.out.println("검색한 데이터가 없습니다.");
		}
		
		System.out.println("\n** 검색 후 정보 출력 **");

		// 4. 전체 정보 출력
		for (Student st : list) {
			System.out.println(st);
		}

	}

}
