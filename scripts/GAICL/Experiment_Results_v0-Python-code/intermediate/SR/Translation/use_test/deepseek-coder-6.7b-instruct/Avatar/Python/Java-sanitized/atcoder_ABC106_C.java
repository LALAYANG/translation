import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String s = br.readLine();
            int k = Integer.parseInt(br.readLine());
            int leadingOnesCount = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != '1') {
                    break;
                }
                leadingOnesCount++;
            }
            if (leadingOnesCount >= k) {
                System.out.println(1);
            } else {
                System.out.println(s.charAt(leadingOnesCount));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}