import java.util.Scanner;

public class codeforces_612_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int[] number_array = new int[1];
        int[] multiplied_value = multiply(number_array, n);
        int[] indexed_array = multiplied_value;
        for (int i = 0; i < n; i++) {
            indexed_array[a[i] - 1] = i;
        }
        int res = 0;
        for (int i = 1; i < n; i++) {
            res += Math.abs(indexed_array[i] - indexed_array[i - 1]);
        }
        System.out.println(res);
    }

    public static int[] multiply(int[] number_array, int n) {
        return number_array;
    }
}