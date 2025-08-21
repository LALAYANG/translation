import java.util.Scanner;

public class codeforces_672_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] li = new int[371];
        int ind = 0;
        for (int i = 1; i < 371; i++) {
            int[] temp = new int[371];
            int p = i, q = i;
            int count = 0;
            while (p != 0) {
                p /= 10;
                count++;
            }
            if (count == 1) {
                li[ind] = i;
                ind++;
            }
            if (count == 2) {
                int j = 0;
                while (q != 0) {
                    int x = q % 10;
                    q /= 10;
                    temp[j] = x;
                    j++;
                }
                for (int k = 0; k < j; k++) {
                    li[ind] = temp[k];
                    ind++;
                }
            }
            if (count == 3) {
                int j = 0;
                while (q != 0) {
                    int x = q % 10;
                    q /= 10;
                    temp[j] = x;
                    j++;
                }
                for (int k = 0; k < j; k++) {
                    li[ind] = temp[k];
                    ind++;
                }
            }
        }
        li[ind - 1] = 0;
        li[ind - 2] = 0;
        System.out.println(li[n - 1]);
    }
}