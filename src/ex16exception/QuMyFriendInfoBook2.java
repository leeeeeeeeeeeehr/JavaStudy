package ex16exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/* 문제 4 */
/* 해당 프로그램은 메뉴 선택 시 정수를 입력해야 하므로 문자를 입력하면 예외가 발생한다. 
이에 따른 예외 처리를 구현하시오. */

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
	private Friend[] myFriends;
	private int numOfFriends;
	
	public FriendInfoHandler(int num) {
		myFriends = new Friend[num];
		numOfFriends = 0;
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
		
		if (choice == 1) {
			System.out.print("별명: ");
			iNickname = scan.nextLine();
			HighFriend high = new HighFriend(iName, iPhone, iAddr, iNickname);
			myFriends[numOfFriends++] = high;
		}
		else if (choice == 2) {
			System.out.print("전공: ");
			iMajor = scan.nextLine();
			myFriends[numOfFriends++] = new UnivFriend(iName, iPhone, iAddr, iMajor);
		}
		System.out.println("\n=== 친구 정보 입력이 완료되었습니다. ===\n");
	}
	
	public void showAllData() {
		for (int i = 0; i < numOfFriends; i++) {
			myFriends[i].showAllData();
		}
		System.out.println("\n=== 전체 정보가 출력되었습니다. ===\n");
	}
	
	public void showSimpleData() {
		
		for (int i = 0; i < numOfFriends; i++) {
			myFriends[i].showBasicInfo();
		}
		
		System.out.println("\n=== 간략 정보가 출력되었습니다. ===\n");
	}
	
	public void searchInfo() {
		boolean isFind = false;
		Scanner scan = new Scanner(System.in);
		System.out.print("\n검색할 이름을 입력하세요. => ");
		String searchName = scan.nextLine();
		
		for (int i = 0; i < numOfFriends; i++) {
			if (searchName.compareTo(myFriends[i].name) == 0) {
				myFriends[i].showAllData();
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
		
		for (int i = 0; i < numOfFriends; i++) {
			if (deleteName.compareTo(myFriends[i].name) == 0) {
				myFriends[i] = null;
				deleteIndex = i;
				numOfFriends--;
				break;
			}
		}
		
		if (deleteIndex == -1) {
			System.out.println("\n=== 삭제된 데이터가 없습니다. ===\n");
		}
		else {
			for (int i = deleteIndex; i < numOfFriends; i++) {
				myFriends[i] = myFriends[i+1];
			}
			System.out.println("\n=== 데이터(" + deleteIndex + "번)가 삭제되었습니다. ===\n");
		}
	}
}

public class QuMyFriendInfoBook2 {
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
				
				try {
					menuShow();
					
					int choice = scan.nextInt();
					scan.nextLine();
					
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
					}
				}
				catch (InputMismatchException e) {
					System.out.println("정수만 입력하세요.");
					scan.nextLine();
				}
				
			}
	}
}