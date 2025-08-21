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
        int[] result = tTestInd(listA, listB);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] tTestInd(int[] listA, int[] listB) {
        int[] result = new int[listA.length];
        for (int i = 0; i < listA.length; i++) {
            result[i] = listA[i] - listB[i];
        }
        return result;
    }
}