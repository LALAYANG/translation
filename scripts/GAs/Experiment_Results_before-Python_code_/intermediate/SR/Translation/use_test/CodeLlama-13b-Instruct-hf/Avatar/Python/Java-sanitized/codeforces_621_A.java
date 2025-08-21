import java.util.Scanner;

public class codeforces_621_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] lst = new int[n];
        for (int i = 0; i < n; i++) {
            lst[i] = sc.nextInt();
        }
        sc.close();

        int sum = 0;
        int od = 0;
        for (int i = 0; i < n; i++) {
            if (lst[i] % 2 == 0) {
                sum += lst[i];
            } else {
                if (od > 1) {
                    sum += lst[i];
                    od--;
                }
            }
        }
        System.out.println(sum);
    }
}