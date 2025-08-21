import java.util.Date;
import java.util.Random;
import java.util.Arrays;

public class codeforces_110_B {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        String luckyString = "abcd";
        String s = "";

        for (int i = 0; i < n; i++) {
            s += luckyString.charAt(i % 4);
        }

        System.out.println(s);
    }

}