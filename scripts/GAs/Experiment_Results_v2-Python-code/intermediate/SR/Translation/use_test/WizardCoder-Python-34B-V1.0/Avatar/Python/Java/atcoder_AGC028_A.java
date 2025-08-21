```java
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        String S = scanner.next();
        String T = scanner.next();
        char[] list_S = S.toCharArray();
        char[] list_T = T.toCharArray();
        int[] Number_i = new int[N];
        for (int i = 0; i < N; i++) {
            Number_i[i] = i;
        }
        int[] Number_j = new int[M];
        for (int j = 0; j < M; j++) {
            Number_j[j] = j;
        }
        int[] Number_iMN = new int[N];
        for (int i = 0; i < N; i++) {
            Number_iMN[i] = i * M / N;
        }
        HashSet<Integer> set_iMN = new HashSet<Integer>(Arrays.asList(Number_iMN));
        HashSet<Integer> set_j = new HashSet<Integer>(Arrays.asList(Number_j));
        set_iMN.retainAll(set_j);
        int[] Kaburi_i = set_iMN.stream().mapToInt(Integer::intValue).toArray();
        int[] Kaburi_j = set_j.stream().intersection(set_iMN).toArray();
        boolean Flag = false;
        for (int i = 0; i < Kaburi_i.length; i++) {
            if (list_S[Kaburi_i[i]] != list_T[Kaburi_j[i]]) {
                Flag = true;
                break;
            }
        }
        if (Flag) {
            System.out.println(-1);
        } else {
            System.out.println(N * M / greatest_common_divisor(N, M));
        }
    }

    public static int greatest_common_divisor(int a, int b) {
        while (b > 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
``` 
