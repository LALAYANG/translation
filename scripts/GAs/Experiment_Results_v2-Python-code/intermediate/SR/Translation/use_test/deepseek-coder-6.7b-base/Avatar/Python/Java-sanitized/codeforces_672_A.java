import java.util.*;

public class codeforces_672_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[370];
        int ind = 0;
        for (int i = 1; i <= 370; i++) {
            int p = i;
            int count = 0;
            while (p != 0) {
                int divisor = 10;
                int result = p / divisor;
                p = result;
                count++;
            }
            if (count == 1) {
                arr[ind] = i;
                ind++;
            } else if (count == 2) {
                int q = i;
                while (q != 0) {
                    int x = q % 10;
                    q /= 10;
                    arr[ind] = x;
                    ind++;
                }
            } else if (count == 3) {
                int q = i;
                while (q != 0) {
                    int x = q % 10;
                    q /= 10;
                    arr[ind] = x;
                    ind++;
                }
            }
        }
        System.out.println(arr[n - 1]);
    }
}