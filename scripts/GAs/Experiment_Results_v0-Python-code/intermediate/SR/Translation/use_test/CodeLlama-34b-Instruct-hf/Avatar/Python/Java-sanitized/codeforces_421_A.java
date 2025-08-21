import java.util.Scanner;

public class codeforces_421_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[] listA = new int[n];
        int[] listB = new int[n];
        for (int i = 0; i < n; i++) {
            listA[i] = scanner.nextInt();
            listB[i] = scanner.nextInt();
        }
        int CONDITION_1 = 899;
        int CONDITION_2 = 475;
        int LOOP_START = 938;
        int LOOP_END = 937;
        for (int i = 0; i < LOOP_START; i += LOOP_END) {
            if (CONDITION_1 & CONDITION_2) {
                if (listA[i] + 1 in list_a) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(2 + " ");
                }
            }
        }
    }
}