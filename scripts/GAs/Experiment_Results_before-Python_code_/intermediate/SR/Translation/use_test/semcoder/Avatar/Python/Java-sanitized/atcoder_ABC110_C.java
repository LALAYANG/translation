import java.util.Arrays;
import java.util.Scanner;

public class atcoder_ABC110_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        int[] ss = new int[26];
        int[] tt = new int[26];

        for (char c : s.toCharArray()) {
            ss[c - 'a']++;
        }

        for (char c : t.toCharArray()) {
            tt[c - 'a']++;
        }

        Arrays.sort(ss);
        Arrays.sort(tt);

        if (Arrays.equals(ss, tt)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}