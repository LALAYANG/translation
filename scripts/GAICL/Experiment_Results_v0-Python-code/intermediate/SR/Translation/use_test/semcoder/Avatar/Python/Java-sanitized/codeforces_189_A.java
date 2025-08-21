import java.util.Scanner;

public class codeforces_189_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = scanner.nextInt();
        }
        int totalLength = arr[0];
        int[] lengths = {arr[1], arr[2], arr[3]};
        if (totalLength % lengths[0] == 0) {
            System.out.println(totalLength / lengths[0]);
            return;
        }
        int ans = 0;
        if (lengths[0] == lengths[1]) {
            int count1 = 0;
            for (int i = 0; i <= totalLength / lengths[2]; i++) {
                int remainder = totalLength - i * lengths[2];
                if (remainder >= 0 && remainder % lengths[0] == 0) {
                    count1 = remainder / lengths[0];
                    ans = Math.max(ans, count1 + i);
                }
            }
        } else {
            int count1 = 0;
            for (int i = 0; i <= totalLength / lengths[2]; i++) {
                for (int j = 0; j <= totalLength / lengths[1]; j++) {
                    int check = totalLength - i * lengths[2] - j * lengths[1];
                    if (check >= 0 && check % lengths[0] == 0) {
                        count1 = check / lengths[0];
                        ans = Math.max(ans, count1 + i + j);
                    }
                }
            }
        }
        System.out.println(ans);
    }
}