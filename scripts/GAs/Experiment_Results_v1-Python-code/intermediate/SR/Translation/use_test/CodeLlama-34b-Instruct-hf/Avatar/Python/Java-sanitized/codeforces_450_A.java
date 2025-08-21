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

        int mx = 0;
        for (int i = 0; i < arrayLength; i++) {
            if (divisorArray[i] > mx) {
                mx = divisorArray[i];
            }
        }

        int ind = 0;
        for (int i = 0; i < arrayLength; i++) {
            if (divisorArray[i] == mx) {
                ind = i;
                break;
            }
        }

        System.out.println(ind + 1);
    }
}