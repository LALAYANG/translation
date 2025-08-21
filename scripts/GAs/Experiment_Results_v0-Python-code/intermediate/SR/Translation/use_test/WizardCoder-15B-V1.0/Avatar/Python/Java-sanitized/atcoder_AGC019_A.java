import java.util.*;

public class atcoder_AGC019_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int h = sc.nextInt();
        int s = sc.nextInt();
        int d = sc.nextInt();
        int[] arr = new int[]{q, h, s, d};
        Arrays.sort(arr);
        int min = arr[0] * 4;
        if (min > arr[1] * 2) {
            min = arr[1] * 2;
        }
        if (min > arr[2]) {
            min = arr[2];
        }
        if (n % 2 == 0) {
            System.out.println(min * (n / 2));
        } else {
            System.out.println(min * (n / 2) + arr[0]);
        }
    }
}