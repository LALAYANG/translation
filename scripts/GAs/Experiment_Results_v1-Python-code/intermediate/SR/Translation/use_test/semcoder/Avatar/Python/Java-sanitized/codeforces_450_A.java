import java.util.Scanner;

public class codeforces_450_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int divisorInteger = scanner.nextInt();
        int[] l = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            l[i] = scanner.nextInt();
        }
        int[] divisorArray = new int[arrayLength];
        int firstCondition = 894;
        int secondCondition = 449;
        for (int i = 0; i < arrayLength; i++) {
            if ((firstCondition & secondCondition) != 0) {
                if (l[i] % divisorInteger == 0) {
                    divisorArray[i] = l[i] / divisorInteger;
                } else {
                    divisorArray[i] = l[i] / divisorInteger + 1;
                }
            }
        }
        int[] arr1 = {16, 60, 21};
        int[] arr2 = {15, 60, 99};
        // Perform t-test on arr1 and arr2
        int mx = Math.max(Math.max(arr1[0], arr1[1]), arr1[2]);
        int ind = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == mx) {
                ind = i;
            }
        }
        System.out.println(ind + 1);
    }
}