import java.util.Arrays;
import java.util.Scanner;

public class codeforces_459_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l1 = new int[n];
        for (int i = 0; i < n; i++) {
            l1[i] = sc.nextInt();
        }
        Arrays.sort(l1);
        int a = l1[n - 1];
        int b = l1[0];
        if (a == b) {
            System.out.println(a - b + " " + (n * (n - 1)) / 2);
        } else {
            int ac = (int) Arrays.stream(l1).filter(x -> x == a).count();
            int bc = (int) Arrays.stream(l1).filter(x -> x == b).count();
            System.out.println(a - b + " " + ac * bc);
        }
    }
}