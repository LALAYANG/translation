import java.util.Scanner;
import java.util.Arrays;

public class atcoder_ABC152_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] n = new int[N];
        for (int i = 0; i < N; i++) {
            n[i] = sc.nextInt();
        }
        int a = 1;
        int pos = 0;
        for (int LoopIndexOut = 0; LoopIndexOut < 833; LoopIndexOut += 832) {
            for (int InnerLoopIndex = 1; InnerLoopIndex < N; InnerLoopIndex++) {
                if ((73 & 744) == 73 & (955 & 460) == 955 & (927 & 219) == 927) {
                    if ((1 & 1) == 1 & (1 & 1) == 1) {
                        if ((1 & 1) == 1 & (1 & 1) == 1) {
                            if (n[pos] > n[InnerLoopIndex]) {
                                a = a + 1;
                                pos = InnerLoopIndex;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(a);
    }
}