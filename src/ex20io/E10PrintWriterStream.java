package ex20io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class E10PrintWriterStream {

	public static void main(String[] args) throws IOException {
		// 입력 스트림 없이 출력 스트림만 있는 클래스
		PrintWriter out = new PrintWriter(new FileWriter("src/ex20io/printf.txt"));
		
		// 앞에서 txt 파일 쪽으로 생성한 스트림을 통해 내용을 입력한다.
		out.printf("제 나이는 %d살 입니다.", 9);
		out.println("");

		out.println("저는 기타 치는 것을 좋아해요.");
		out.print("노래 부를 때 행복한 것 같아요.");
		out.close();
		
		System.out.println("printf.txt가 생성되었습니다.");
	}

}
