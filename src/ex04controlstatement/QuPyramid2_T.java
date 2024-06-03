package ex04controlstatement;

public class QuPyramid2_T {

	public static void main(String[] args) {
		
		int x = 5;
		
		do {
			int y = 1;
			do {
				System.out.print("* ");					
				y++;
			} while (y <= x);
			x--;
			System.out.println();
		} while (x >= 1);
		
	}
}
