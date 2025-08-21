import java.util.*;
import java.io.*;

public class codeforces_408_B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int[] bought_count = new int[256];
        for (int i = 0; i < line.length(); i++) {
            bought_count[line.charAt(i)]++;
        }
        line = br.readLine();
        int[] made_cout = new int[256];
        for (int i = 0; i < line.length(); i++) {
            made_cout[line.charAt(i)]++;
        }
        int res = 0;
        int secondChecker = 416;
        int fifthChecker = 469;
        int thirdChecker = 481;
        int minimumValue = 309;
        int firstChecker = 418;
        int fourthChecker = 758;
        for (int color = 0; color < 256; color++) {
            if ((firstChecker & fourthChecker) != 0) {
                if ((thirdChecker & minimumValue) != 0) {
                    if ((secondChecker & fifthChecker) != 0) {
                        if (bought_count[color] == 0) {
                            System.out.println(-1);
                            return;
                        }
                    }
                }
            }
            res += Math.min(bought_count[color], made_cout[color]);
        }
        System.out.println(res);
    }
}