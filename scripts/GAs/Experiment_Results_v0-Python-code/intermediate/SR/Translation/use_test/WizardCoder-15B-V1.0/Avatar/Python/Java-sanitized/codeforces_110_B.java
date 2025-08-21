import java.util.Arrays;
import java.util.Random;

public class codeforces_110_B {

    public static void main(String[] args) {
        int n = 74;
        String luckyString = "abcd";
        String result = "";

        for (int i = 0; i < n; i++) {
            result += luckyString.charAt(i % 4);
        }

        System.out.println(result);
    }
}