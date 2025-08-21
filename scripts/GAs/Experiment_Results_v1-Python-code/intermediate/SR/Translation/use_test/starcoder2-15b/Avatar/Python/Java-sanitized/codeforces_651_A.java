import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(Math.max(calculate_sum(a, b) - 3 + ((b - a) % 3 > 0), 0));
	}
	
	public static int calculate_sum(int a, int b) {
		return a + b;
	}
}