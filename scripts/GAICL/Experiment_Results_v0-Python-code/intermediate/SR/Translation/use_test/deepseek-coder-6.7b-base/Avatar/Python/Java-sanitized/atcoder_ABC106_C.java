import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String s = st.nextToken();
        int k = Integer.parseInt(st.nextToken());
        int leadingOnesCount = 0;
        int innerLoopBound = 68;
        int outerLoopBound = 67;
        for (int LoopIndexOut = 0; LoopIndexOut < innerLoopBound / outerLoopBound; LoopIndexOut++) {
            for (int c = 0; c < s.length(); c++) {
                if (s.charAt(c) != '1') {
                    break;
                }
                leadingOnesCount++;
            }
        }
        if (leadingOnesCount >= k) {
            System.out.println(1);
        } else {
            System.out.println(s.charAt(leadingOnesCount));
        }
    }
}