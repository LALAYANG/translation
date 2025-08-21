import java.util.*;
import java.io.*;

public class codeforces_705_B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] w = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int c = 2;
        for (int i = 0; i < n; i++) {
            if (w[i] == 1) {
                System.out.println(c);
            } else if (w[i] % 2 == 0) {
                c = 3 - c;
                System.out.println(c);
            } else {
                System.out.println(c);
            }
        }
    }
}