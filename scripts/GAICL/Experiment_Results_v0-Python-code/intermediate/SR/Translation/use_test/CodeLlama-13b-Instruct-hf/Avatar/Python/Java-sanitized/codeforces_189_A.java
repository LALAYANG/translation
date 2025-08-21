import java.util.Arrays;
import java.util.Scanner;

public class codeforces_189_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] lengths = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int totalLength = lengths[0];
        lengths = Arrays.stream(lengths).sorted().toArray();
        if (totalLength % lengths[0] == 0) {
            System.out.println(totalLength / lengths[0]);
            return;
        }
        int ans = 0;
        if (lengths[0] == lengths[1]) {
            int k = 0;
            for (int i = 0; i <= totalLength / lengths[2]; i++) {
                int check = totalLength - i * lengths[2];
                if (check >= 0 && check % lengths[0] == 0) {
                    k = check / lengths[0];
                    ans = Math.max(ans, k + i);
                }
            }
        } else {
            int k = 0;
            for (int i = 0; i <= totalLength / lengths[2]; i++) {
                for (int j = 0; j <= totalLength / lengths[1]; j++) {
                    int check = totalLength - i * lengths[2] - j * lengths[1];
                    if (check >= 0 && check % lengths[0] == 0) {
                        k = check / lengths[0];
                        ans = Math.max(ans, k + i + j);
                    }
                }
            }
        }
        System.out.println(ans);
    }
}