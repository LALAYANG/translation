import java.util.Scanner;

public class codeforces_59_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int distinct = 0;
        for (int i = 0; i < n; i++) {
            boolean found = false;
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                distinct++;
            }