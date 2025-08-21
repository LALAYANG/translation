import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int input_num = sc.nextInt();
		int k = sc.nextInt();
		String v = sc.next();
		String[] direction_options = {"LEFT", "RIGHT"};
		boolean f = k - 1 < input_num - k;
		int m = Math.min(k - 1, input_num - k);
		ArrayList<String> a = new ArrayList<String>();
		recursive_ttest(0, m, 1, a, f);
		for(int i = v.length() - 1 + 2 * f; i >= 0; i -= 1 + 2 * f) {
			a.add("PRINT " + v.charAt(i));
			a.add(direction_options[f]);
		}
		for(int i = 0; i < a.size() - 1; i++) {
			System.out.println(a.get(i));
		}
	}
	public static void recursive_ttest(int i, int stop, int step, ArrayList<String> a, boolean f) {
		if(step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
			return;
		}
		a.add(direction_options[not f]);
		recursive_ttest(i + step, stop, step, a, f);
	}
}