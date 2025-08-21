import java.util.Scanner;
import java.util.Arrays;

public class codeforces_682_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > c) {
                c++;
            }
        }
        System.out.println(c + 1);
    }
}