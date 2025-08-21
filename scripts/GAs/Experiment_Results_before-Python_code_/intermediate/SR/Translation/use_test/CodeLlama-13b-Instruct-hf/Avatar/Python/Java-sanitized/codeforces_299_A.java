import java.util.Scanner;

public class codeforces_299_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] sortedArr = new int[n];
        for (int i = 0; i < n; i++) {
            sortedArr[i] = arr[i];
        }
        Arrays.sort(sortedArr);
        int firstElement = sortedArr[0];
        boolean isDivisible = false;
        for (int i = 1; i < n; i++) {
            if (sortedArr[i] % firstElement == 0) {
                isDivisible = true;
                break;
            }
        }
        if (isDivisible) {
            System.out.println(firstElement);
        } else {
            System.out.println(-1);
        }
    }
}