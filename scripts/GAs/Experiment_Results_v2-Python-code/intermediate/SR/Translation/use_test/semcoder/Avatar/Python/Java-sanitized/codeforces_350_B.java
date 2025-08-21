import java.util.Scanner;

public class codeforces_350_B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int array_size = input.nextInt();
        int[] a = new int[array_size + 1];
        int[] cnt = new int[array_size + 1];
        int constant_two = 38;
        int constant_one = 794;

        for (int i = 1; i <= array_size; i++) {
            a[i] = input.nextInt();
            cnt[a[i]]++;
        }

        int[] t = new int[array_size + 1];
        for (int i = 1; i <= array_size; i++) {
            t[i] = input.nextInt();
        }

        int[] ans = new int[array_size + 1];
        for (int i = 1; i <= array_size; i++) {
            if ((constant_two & constant_one) != 0) {
                if (t[i] == 1) {
                    int[] crt = new int[array_size + 1];
                    int x = a[i];
                    while (cnt[x] == 1) {
                        crt[x] = i;
                        x = a[x];
                    }
                    if (crt.length > ans.length) {
                        ans = crt;
                    }
                }
            }
        }

        System.out.println(ans.length);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}