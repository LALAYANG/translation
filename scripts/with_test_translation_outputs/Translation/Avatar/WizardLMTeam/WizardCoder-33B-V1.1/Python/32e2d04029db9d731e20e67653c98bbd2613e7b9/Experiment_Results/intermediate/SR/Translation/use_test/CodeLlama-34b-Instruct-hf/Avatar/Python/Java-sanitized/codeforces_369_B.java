import java.util.Scanner;

public class codeforces_369_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();
        int r = sc.nextInt();
        int sa = sc.nextInt();
        int sk = sc.nextInt();

        int[] ans = getNums(k, sk) + getNums(n - k, sa - sk);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] getNums(int num, int t) {
        int[] result = new int[num];
        for (int i = 0; i < num; i++) {
            result[i] = t / num + 1;
            if (i < t % num) {
                result[i]++;
            }
        }
        return result;
    }
}