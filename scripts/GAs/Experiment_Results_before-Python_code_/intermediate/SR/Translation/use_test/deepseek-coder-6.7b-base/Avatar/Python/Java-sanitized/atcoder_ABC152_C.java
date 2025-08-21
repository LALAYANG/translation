import java.util.Scanner;

public class atcoder_ABC152_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 1;
        int pos = 0;
        for (int i = 1; i < n; i++) {
            if (arr[pos] > arr[i]) {
                count++;
                pos = i;
            }
        }
        System.out.println(count);
    }
}