package LineComparsion;

import java.util.Scanner;

public class LineComparison {
	static Integer len, len1;
//	static Integer L1,L2;

	/*
	 * UC1 Line Comparison
	 */
	public static void LineLength() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter x1 and y1 Co-ordinates:");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();

		System.out.println("Enter x2 and y2 Co-ordinates:");
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();

		len = (int) Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
//		L1 = len;
		System.out.println("The length of (line 1) is : " + len);
	}

	public static void main(String args[]) {
		/*
		 * calling Functions
		 */
		 LineLength();
		
	}

}