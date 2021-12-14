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

	/*
	 * UC2 Line Comparison
	 */
	public static void FindEqualLines() {
		LineLength();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x3 and y3 Co-ordinates:");
		int x3 = sc.nextInt();
		int y3 = sc.nextInt();

		System.out.println("Enter x4 and y4 Co-ordinates:");
		int x4 = sc.nextInt();
		int y4 = sc.nextInt();

		len1 = (int) Math.sqrt(Math.pow((x4 - x3), 2) + Math.pow((y4 - y3), 2));
		System.out.println("The length of (line 2) is : " + len1);
//        L2 = len1;

		if (len.equals(len1)) {
			System.out.println("\nLines are equal");
		} else
			System.out.println("\nLines are not equals");

	}

	/*
	 * UC3 Line Comparison
	 */
	public static void FindCompreLine() {
		FindEqualLines();

		if (len > len1) {
			System.out.println("\nLine1 is Greater line2");
		} else if (len < len1) {
			System.out.println("\nLine1 lesser than line2");
		}
	}

	/*
	 * UC4 Line Comparison
	 */
	public static void FindCompareToLines() {
		FindEqualLines();
		int a = len.compareTo(len1); // 0 -1

		if (a == 0) {
			
		} else if (a == -1) {

			System.out.println("\nLine1 lesser than line2");
		}else {
			System.out.println("Line1 is Greater line2");
		}

	}

	public static void main(String args[]) {
		/*
		 * calling Functions
		 */
		// LineLength();
		// FindEqualLines();
		// FindCompreLine();
		FindCompareToLines();
	}

}