import java.util.Scanner;

public class codeforces_189_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ribbonLength = scanner.nextInt();
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = scanner.nextInt();
        }
        int ans = 0;
        if (ribbonLength % arr[0] == 0) {
            ans = ribbonLength / arr[0];
        } else {
            int k = 0;
            for (int countLargest = 0; countLargest <= ribbonLength / arr[2]; countLargest++) {
                for (int j = 0; j <= ribbonLength / arr[1]; j++) {
                    int check = ribbonLength - countLargest * arr[2] - j * arr[1];
                    if (check >= 0 && check % arr[0] == 0) {
                        k = check / arr[0];
                        ans = Math.max(ans, k + countLargest + j);
                    }
                }
            }
        }
        System.out.println(ans);
    }
}