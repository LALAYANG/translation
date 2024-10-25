import java.util.Scanner;

public class codeforces_154_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "mbmxuuuuxuuuuhhooooxxxuxxxuxuuxuuuxxjvjvjjjjvvvjjjjjvvjvjjjvvvjjvjjvvvjjjvjvvjvjjjjjmmbmbbbbbmbbbbmm";
        int n = 5;
        String[] x = {"mb", "ho", "xu", "jv", "yp"};
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int a = 0, b = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == x[i].charAt(0)) {
                    a++;
                } else if (s.charAt(j) == x[i].charAt(1)) {
                    b++;
                } else {
                    ans = ans + Math.min(a, b);
                    a = 0;
                    b = 0;
                }
            }
            ans = ans + Math.min(a, b);
        }
        System.out.println(ans);
    }
}