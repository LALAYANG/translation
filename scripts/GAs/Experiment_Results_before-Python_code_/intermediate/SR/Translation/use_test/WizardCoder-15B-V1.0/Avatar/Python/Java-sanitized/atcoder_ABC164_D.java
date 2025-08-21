import java.util.Scanner;

public class atcoder_ABC164_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int l = 2019;
        int[] m = new int[l+1];
        int a = 0, r = 0;
        for (int i = 0; i < s.length(); i++) {
            a += (int)(s.charAt(i) - '0') * Math.pow(10, i, l);
            r += m[a % l]++;
        }
        System.out.println(r);
    }
}