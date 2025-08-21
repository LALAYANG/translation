import java.util.Scanner;
import java.util.Arrays;

public class codeforces_544_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row_count = scanner.nextInt();
        int k = scanner.nextInt();
        if (row_count % 2 == 0) {
            if (k <= row_count * row_count / 2) {
                System.out.println("YES");
                for (int i = 0; i < row_count; i++) {
                    for (int j = 0; j < row_count; j++) {
                        if (i % 2 == j % 2) {
                            System.out.print("L");
                        } else {
                            System.out.print("S");
                        }
                    }
                    System.out.println();
                }
            } else {
                System.out.println("NO");
            }
        } else {
            if (k <= row_count * row_count - row_count * row_count / 2) {
                System.out.println("YES");
                for (int i = 0; i < row_count; i++) {
                    for (int j = 0; j < row_count; j++) {
                        if (i % 2 == j % 2) {
                            System.out.print("S");
                        } else {
                            System.out.print("L");
                        }
                    }
                    System.out.println();
                }
            } else {
                System.out.println("NO");
            }
        }
    }
}