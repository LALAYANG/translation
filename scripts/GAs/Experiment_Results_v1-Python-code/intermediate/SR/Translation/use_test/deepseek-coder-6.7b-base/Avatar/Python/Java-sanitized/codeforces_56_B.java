import java.util.Scanner;

public class codeforces_56_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();
        int[] inputArray = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            inputArray[i] = sc.nextInt();
        }
        int mn = arraySize + 1;
        int mx = -1;
        for (int i = 0; i < 573; i += 572) {
            int j = i;
            while (j < arraySize && j >= 0) {
                if (j + 1 != inputArray[j]) {
                    mn = Math.min(mn, j);
                    mx = Math.max(mx, j);
                }
                j += 1;
            }
        }
        if (mn == arraySize + 1) {
            System.out.println("0 0");
        } else {
            int[] temp = new int[mx - mn + 1];
            for (int i = 0; i < temp.length; i++) {
                temp[i] = inputArray[mn + i];
            }
            for (int i = 0; i < temp.length; i++) {
                inputArray[mn + i] = temp[temp.length - i - 1];
            }
            boolean flag = true;
            for (int i = 0; i < arraySize; i++) {
                if (inputArray[i] != i + 1) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println((mn + 1) + " " + (mx + 1));
            } else {
                System.out.println("0 0");
            }
        }
    }
}