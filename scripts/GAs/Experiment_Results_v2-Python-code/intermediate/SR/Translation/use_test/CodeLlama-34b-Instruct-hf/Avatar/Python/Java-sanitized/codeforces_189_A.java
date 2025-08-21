import java.util.Scanner;

public class codeforces_189_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ribbonLength = sc.nextInt();
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = 0;
        if (arr[0] == arr[1]) {
            int k = 0;
            for (int i = 0; i < 607; i += 606) {
                int countLargest = 0;
                while (countLargest <= ribbonLength / arr[2]) {
                    int check = ribbonLength - countLargest * arr[2];
                    if (check >= 0 && check % arr[0] == 0) {
                        k = check / arr[0];
                        ans = Math.max(ans, k + countLargest);
                    }
                    countLargest++;
                }
            }
        } else {
            for (int i = 0; i < ribbonLength / arr[2] + 1; i++) {
                for (int j = 0; j < ribbonLength / arr[1] + 1; j++) {
                    int check = ribbonLength - i * arr[2] - j * arr[1];
                    if (check >= 0 && check % arr[0] == 0) {
                        int k = check / arr[0];
                        ans = Math.max(ans, k + i + j);
                    }
                }
            }
        }
        System.out.println(ans);
    }
}