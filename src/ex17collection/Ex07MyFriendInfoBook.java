package ex17collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Friend {
	String name;
	String phone;
	String addr;
	
	public Friend(String name, String phone, String addr) {
		this.name = name;
		this.phone = phone;
		this.addr = addr;
	}
	public void showAllData() {
		System.out.println("이름: " + name);
		System.out.println("전화번호: " + phone);
		System.out.println("주소: " + addr);
	}
	public void showBasicInfo() {}
}

class HighFriend extends Friend {
	String nickname;
	
	public HighFriend(String name, String phone, String addr, String nickname) {
		super(name, phone, addr);
		this.nickname = nickname;
	}
	@Override
	public void showAllData() {
		System.out.println("\n=== 고딩 친구 (전체 정보) ===");
		super.showAllData();
		System.out.println("별명: " + nickname);
	}
	@Override
	public void showBasicInfo() {
		System.out.println("\n=== 고딩 친구 ===");
		System.out.println("별명: " + nickname);
		System.out.println("전번: " + phone);
	}
}

class UnivFriend extends Friend {
	String major;
	
	public UnivFriend(String name, String phone, String addr, String major) {
		super(name, phone, addr);
		this.major = major;
	}
	@Override
	public void showAllData() {
		System.out.println("\n=== 대딩 친구 (전체 정보) ===");
		super.showAllData();
		System.out.println("전공: " + major);
	}
	@Override
	public void showBasicInfo() {
		System.out.println("\n=== 대딩 친구 ===");
		System.out.println("이름: " + name);
		System.out.println("전화번호: " + phone);
	}
}

class FriendInfoHandler {
	
	/* 기존에 인스턴스 배열에 저장했던 것을 컬렉션으로 변경한다.
	컬렉션은 제네릭을 기반으로 하므로 인스턴스 생성 시 저장할 타입을 결정하게 된다.
	여기서는 Friend 클래스를 상속한 HighFriend, UnivFriend를 저장할 것이므로
	이와 같이 선언하면 된다. */
	private ArrayList<Friend> lists;
	
	public FriendInfoHandler(int num) {
		// 생성자에서 정보를 저장한 List 컬렉션을 생성한다.
		lists = new ArrayList<Friend>();
	}
	
	public void addFriend(int choice) {
		Scanner scan = new Scanner(System.in);
		String iName, iPhone, iAddr, iNickname, iMajor;
		System.out.println();
		System.out.print("이름: ");
		iName = scan.nextLine();
		System.out.print("전화번호: ");
		iPhone = scan.nextLine();
		System.out.print("주소: ");
		iAddr = scan.nextLine();
		
		/* List<E>는 자동 인덱싱이 지원되므로
		인스턴스 추가를 위해 index 변수를 별도로 사용할 필요가 없다.
		단지 add() 메서드를 통해 추가하면 된다. */
		if (choice == 1) {
			System.out.print("별명: ");
			iNickname = scan.nextLine();
			HighFriend high = new HighFriend(iName, iPhone, iAddr, iNickname);
			lists.add(high);
		}
		else if (choice == 2) {
			System.out.print("전공: ");
			iMajor = scan.nextLine();
			lists.add(new UnivFriend(iName, iPhone, iAddr, iMajor));
		}
		System.out.println("\n=== 친구 정보 입력이 완료되었습니다. ===\n");
	}
	
	// 전체 정보 출력용 메서드
	public void showAllData() {
		/* 일반 for문을 사용하는 경우 변수 i를 인덱스로 사용해야 하므로
		get() 메서드를 통해 인스턴스를 인출한다. */
		for (int i = 0; i < lists.size(); i++) {
			lists.get(i).showAllData();
		}
		System.out.println("\n=== 전체 정보가 출력되었습니다. ===\n");
	}
	
	// 간략 정보 출력용 메서드
	public void showSimpleData() {
		// 확장 for문은 인덱스를 사용하지 않으므로 간단히 인스턴스를 인출할 수 있다.
		for (Friend fr : lists) {
			fr.showBasicInfo();
		}
		
		System.out.println("\n=== 간략 정보가 출력되었습니다. ===\n");
	}
	
	public void searchInfo() {
		// 검색한 정보가 있는지 확인하기 위한 변수
		boolean isFind = false;
		Scanner scan = new Scanner(System.in);
		System.out.print("\n검색할 이름을 입력하세요. => ");
		String searchName = scan.nextLine();
		
		// Iterator 인스턴스 생성
		Iterator<Friend> itr = lists.iterator();
		while (itr.hasNext()) {
			// 저장된 인스턴스 인출
			Friend fr = itr.next();
			// 우리가 입력한 이름과 일치하는지 확인한다.
			if (searchName.compareTo(fr.name) == 0) {
				// 일치하면 정보를 출력한다.
				fr.showAllData();
				System.out.println("\n=== 귀하가 요청하는 정보를 찾았습니다. ===\n");
				isFind = true;
			}
		}
		if (isFind == false) {
			System.out.println("\n=== 찾는 정보가 없습니다. ===\n");
		}
	}
	
	public void deleteInfo() {
		Scanner scan = new Scanner(System.in);
		System.out.print("\n삭제할 이름을 입력하세요. => ");
		String deleteName = scan.nextLine();
		
		int deleteIndex = -1;
		// 확장 for문을 통해 반복하여 삭제할 이름을 검색한다.
		for (Friend fr : lists) {
			if (deleteName.compareTo(fr.name) == 0) {
				// 이름이 일치하면 삭제 처리한다.
				lists.remove(fr);
				deleteIndex = 1;
				break;
			}
		}
		
		if (deleteIndex == -1) {
			System.out.println("\n=== 삭제된 데이터가 없습니다. ===\n");
		}
		else {
			System.out.println("\n=== 데이터가 삭제되었습니다. ===\n");
		}
	}
}

public class Ex07MyFriendInfoBook {
	public static void menuShow() {
		System.out.println("####### 메뉴를 입력하세요. #######");
		System.out.print("1. 고딩 친구 입력  ");
		System.out.println("2. 대딩 친구 입력");
		System.out.print("3. 전체 정보 출력  ");
		System.out.println("4. 간략 정보 출력");
		System.out.print("5. 검색   ");
		System.out.print("6. 삭제  ");
		System.out.println("7. 프로그램 종료");
		System.out.print("메뉴 선택 >>>>> ");
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		FriendInfoHandler handler = new FriendInfoHandler(100);
		
		while (true) {
			menuShow();
			
			int choice = scan.nextInt();
			
			switch (choice) {
			case 1: case 2:
				handler.addFriend(choice);
				break;
			case 3:
				handler.showAllData();
				break;
			case 4:
				handler.showSimpleData();
				break;
			case 5:
				handler.searchInfo();
				break;
			case 6:
				handler.deleteInfo();
				break;
			case 7:
				System.out.println("\n=== 프로그램 종료 ===");
				return;
			}	// switch 끝
		}	// while 끝
		
	}	// main 끝

}	// class 끝
