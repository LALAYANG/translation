import java.util.Date;
import java.util.Random;

public class codeforces_110_B {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        String s = "";
        for (int i = 0; i < n; i++) {
            s += "abcd".charAt(i % 4);
        }
        System.out.println(s);
    }
}