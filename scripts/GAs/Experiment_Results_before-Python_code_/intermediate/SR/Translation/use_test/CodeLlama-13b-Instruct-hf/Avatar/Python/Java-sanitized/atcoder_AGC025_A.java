import java.util.Scanner;

public class atcoder_AGC025_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = {10, 100, 1000, 10000, 100000};
        int newValue = 0;
        for (int i = 0; i < n.length; i++) {
            newValue += Integer.parseInt(n[i]);
        }
        if (a.contains(n)) {
            System.out.println(10);
        } else {
            System.out.println(newValue);
        }
    }
}