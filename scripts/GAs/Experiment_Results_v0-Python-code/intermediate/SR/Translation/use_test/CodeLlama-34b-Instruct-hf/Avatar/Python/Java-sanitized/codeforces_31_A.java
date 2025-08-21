import java.util.Scanner;

public class codeforces_31_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum = numbers[i] + numbers[j];
                for (int k = j + 1; k < n; k++) {
                    if (numbers[k] == sum) {
                        System.out.println(i + 1 + " " + j + 1 + " " + k + 1);
                        return;
                    }
                }
            }
        }
        System.out.println(-1);
    }
}