package ex12inheritance;

/* 문제 2 */
/* 다음 상속 관계에 있는 두 클래스의 적절한 생성자를 정의해보자.
main 함수에서는 MyFriendDetailInfo 클래스를 통해서
객체를 생성해야 하고 생성된 정보를 확인할 수 있도록 해보자. */

// 친구의 정보를 저장할 기본 클래스
class MyFriendInfo{
	private String name;
	int age;
	
	public MyFriendInfo(String n, int a) {
		this.name = n;
		this.age = a;
	}
	
	public void showMyFriendInfo() {
		System.out.println("이름: "+ name);
		System.out.println("나이: "+ age);
	}
}
// 친구의 기본 정보 외 상세 정보를 저장할 클래스
class MyFriendDetailInfo extends MyFriendInfo
{
	private String addr;
  	private String phone;
  	
  	public MyFriendDetailInfo(String n, int a, String ad, String p) {
  		super(n, a);
  		this.addr = ad;
  		this.phone = p;
  	}

	public void showMyFriendDetailInfo(){
		showMyFriendInfo();
		System.out.println("주소: "+ addr);
		System.out.println("전화: "+ phone);
	}
}
class QuMyFriendDetailInfo {
	public static void main(String[] args) {
		// 이름, 나이, 주소, 전화번호를 인자로 객체를 생성…
		MyFriendDetailInfo friend = new MyFriendDetailInfo("홍길동", 28, "서울", "010-1234-5678");
		
		// 정보 Print
		friend.showMyFriendDetailInfo();
	}
}
