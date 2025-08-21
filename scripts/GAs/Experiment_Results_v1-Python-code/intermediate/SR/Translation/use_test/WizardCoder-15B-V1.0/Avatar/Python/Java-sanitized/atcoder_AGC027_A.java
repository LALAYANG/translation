import java.util.*;

public class atcoder_AGC027_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int funds = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int count = 0;
        if (a[0] > funds) {
            System.out.println(0);
            return;
        }
        for (int i = 0; i < n; i++) {
            if (a[i] > funds) {
                break;
            }
            int remaining = calculateRemaining(funds, a[i]);
            if (remaining < 0) {
                break;
            }
            funds = remaining;
            count++;
        }
        if (funds != 0) {
            count--;
        }
        System.out.println(count);
    }

    public static int calculateRemaining(int funds, int i) {
        return funds - i;
    }
}