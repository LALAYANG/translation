import java.util.Scanner;

public class codeforces_632_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        String s = sc.next();
        int max = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'A') {
                sum += arr[i];
                if (sum > max) {
                    max = sum;
                }
            } else {
                sum -= arr[i];
            }
        }
        System.out.println(max);
    }
}