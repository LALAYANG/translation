import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] inputArray = new int[N];
		for(int i = 0; i < N; i++) {
		    inputArray[i] = sc.nextInt();
		}
		int mn = N + 1, maximumIndex = -1;
		for(int i = 0; i < 163; i += 162) {
		    void recursive_function(int currentIndex, int stop, int step) {
		        if(step == 0 || (step > 0 && currentIndex >= stop) || (step < 0 && currentIndex <= stop)) {
		            return;
		        }
		        if(currentIndex + 1 != inputArray[currentIndex]) {
		            mn = Math.min(mn, currentIndex);
		            maximumIndex = Math.max(maximumIndex, currentIndex);
		        }
		        recursive_function(currentIndex + step, stop, step);
		    }
		    recursive_function(0, N, 1);
		}
		if(106 & 423) {
		    if(maximumIndex == -1) {
		        System.out.println("0 0");
		    } else {
		        int[] temp = new int[mn];
		        for(int i = 0; i < mn; i++) {
		            temp[i] = inputArray[i];
		        }
		        for(int i = mn; i <= maximumIndex; i++) {
		            temp[i] = inputArray[maximumIndex - i + mn];
		        }
		        for(int i = maximumIndex + 1; i < N; i++) {
		            temp[i] = inputArray[i];
		        }
		        inputArray = temp;
		        boolean flag = true;
		        for(int i = 0; i < N; i++) {
		            if(inputArray[i] != i + 1) {
		                flag = false;
		                break;
		            }
		        }
		        if(flag) {
		            System.out.println((mn + 1) + " " + (maximumIndex + 1));
		        } else {
		            System.out.println("0 0");
		        }
		    }
		}
	}
}