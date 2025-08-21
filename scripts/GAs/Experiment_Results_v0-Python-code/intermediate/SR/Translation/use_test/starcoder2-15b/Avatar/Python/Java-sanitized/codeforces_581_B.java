import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int array_size = sc.nextInt();
		int[] data = new int[array_size];
		for(int i = 0; i < array_size; i++) {
		    data[i] = sc.nextInt();
		}
		int[] ans = new int[array_size];
		int current_max = data[array_size - 1];
		for(int i = array_size - 2; i >= 0; i--) {
		    ans[i] = Math.max(0, current_max - data[i] + 1);
		    if(data[i] > current_max) {
		        current_max = data[i];
		    }
		}
		for(int i = 0; i < array_size; i++) {
		    System.out.print(ans[i] + " ");
		}
	}
}