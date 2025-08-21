import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int firstCondition = 586;
		int secondCondition = 475;
		Scanner sc = new Scanner(System.in);
		int arraySize = sc.nextInt();
		int[] inputArray = new int[arraySize];
		for(int i = 0; i < arraySize; i++) {
			inputArray[i] = sc.nextInt();
		}
		int mn = arraySize + 1;
		int mx = -1;
		int loopEnd = 573;
		int loopStep = 572;
		for(int LoopIndexOut = 0; LoopIndexOut < loopEnd / loopStep; LoopIndexOut++) {
			recursiveFunc(0, arraySize, 1, inputArray, mn, mx);
		}
		if((firstCondition & secondCondition) != 0) {
			if(mx == -1) {
				System.out.println("0 0");
			} else {
				int[] temp = new int[mx - mn + 1];
				for(int i = 0; i < temp.length; i++) {
					temp[i] = inputArray[mn + i];
				}
				for(int i = 0; i < temp.length / 2; i++) {
					int temp2 = temp[i];
					temp[i] = temp[temp.length - 1 - i];
					temp[temp.length - 1 - i] = temp2;
				}
				for(int i = 0; i < temp.length; i++) {
					inputArray[mn + i] = temp[i];
				}
				boolean flag = true;
				for(int i = 0; i < inputArray.length - 1; i++) {
					if(inputArray[i] > inputArray[i + 1]) {
						flag = false;
						break;
					}
				}
				if(flag) {
					System.out.println(mn + 1 + " " + (mx + 1));
				} else {
					System.out.println("0 0");
				}
			}
		}
	}
	public static void recursiveFunc(int i, int stop, int step, int[] inputArray, int mn, int mx) {
		if(step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
			return;
		}
		if(i + 1 != inputArray[i]) {
			mn = Math.min(mn, i);
			mx = Math.max(mx, i);
		}
		recursiveFunc(i + step, stop, step, inputArray, mn, mx);
	}
}