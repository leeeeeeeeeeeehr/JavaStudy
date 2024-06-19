package ex20io;

import java.io.BufferedReader;
import java.io.FileReader;

public class E09StringReader {

	public static void main(String[] args) {
		try {
			// 문자열을 읽기 위한 입력 스트림 생성
			BufferedReader in = new BufferedReader(new FileReader("src/ex20io/string.txt"));
			
			String str;
			while (true) {
				/* 개행(줄바꿈)이 등장하기 전까지의 데이터를 한 번에 읽어온다.
				즉, 한 줄씩 읽는다. */
				str = in.readLine();
				
				// 더이상 읽을 내용이 없다면 while문을 탈출한다.
				if (str == null) {
					break;
				}
				/* 입력 시 newLine()을 통해 개행 정보가 입력되지만
				읽어들인 문자열에는 개행 정보가 포함되지 않는다.
				입력 시 추가했던 개행 정보는 문자열을 라인 별로 구분하는 용도로만 사용하기 때문이다.
				따라서 출력 시 별도로 줄 바꿈 처리를 해줘야 한다. */
				System.out.println(str);
			}
			in.close();
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
