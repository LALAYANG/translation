import java.util.*;

public class codeforces_25_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] remainderList = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            remainderList[i] = scanner.nextInt() % 2;
            sum += remainderList[i];
        }
        if (sum == 1) {
            for (int i = 0; i < n; i++) {
                if (remainderList[i] == 1) {
                    System.out.println(i + 1);
                    break;
                }
            }
        } else {
            for (int i = 0; i < n; i++) {
                if (remainderList[i] == 0) {
                    System.out.println(i + 1);
                    break;
                }
            }
        }
    }
}