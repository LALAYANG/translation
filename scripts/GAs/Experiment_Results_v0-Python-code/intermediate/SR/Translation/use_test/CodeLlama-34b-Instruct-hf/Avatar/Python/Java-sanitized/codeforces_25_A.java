import java.util.Scanner;

public class codeforces_25_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] remainderList = new int[n];
        for (int i = 0; i < n; i++) {
            remainderList[i] = sc.nextInt() % 2;
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += remainderList[i];
        }
        if (sum == 1) {
            System.out.println(remainderList.length - remainderList.indexOf(1) + 1);
        } else {
            System.out.println(remainderList.length - remainderList.indexOf(0) + 1);
        }
    }
}