import java.util.Scanner;
import java.util.Arrays;

public class codeforces_387_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] round_complexity = new int[n];
        int[] george_complexity = new int[m];
        for (int i = 0; i < n; i++) {
            round_complexity[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            george_complexity[i] = sc.nextInt();
        }
        Arrays.sort(round_complexity);
        Arrays.sort(george_complexity);
        int index = 0;
        int j = 0;
        while (index < n && j < m) {
            if (round_complexity[index] <= george_complexity[j]) {
                index++;
            }
            j++;
        }
        System.out.println(n - index);
    }
}