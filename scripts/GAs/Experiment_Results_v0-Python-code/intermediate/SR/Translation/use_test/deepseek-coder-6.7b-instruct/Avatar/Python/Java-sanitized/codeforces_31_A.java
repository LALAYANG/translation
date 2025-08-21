import java.util.*;

public class codeforces_31_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        int[] numbers = new int[y];
        for (int i = 0; i < y; i++) {
            numbers[i] = scanner.nextInt();
        }
        boolean found = false;
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < y; j++) {
                if (i == j) {
                    continue;
                }
                for (int k = 0; k < y; k++) {
                    if (k == i || k == j) {
                        continue;
                    }
                    if (numbers[k] == numbers[i] + numbers[j]) {
                        System.out.println((k + 1) + " " + (j + 1) + " " + (i + 1));
                        found = true;
                        break;
                    }
                }
                if (found) {
                    break;
                }
            }
        }
        if (!found) {
            System.out.println(-1);
        }
    }
}