import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		String input_string = sc.next();
		int[] count = new int[26];
		for(int i = 0; i < input_string.length(); i++) {
			count[input_string.charAt(i) - 'A']++;
		}
		Arrays.sort(count);
		int res = 0;
		for(int i = 25; i >= 0; i--) {
			if(k >= count[i]) {
				res += count[i] * count[i];
				k -= count[i];
			}
			else {
				res += k * k;
				break;
			}
		}
		System.out.println(res);
	}
}