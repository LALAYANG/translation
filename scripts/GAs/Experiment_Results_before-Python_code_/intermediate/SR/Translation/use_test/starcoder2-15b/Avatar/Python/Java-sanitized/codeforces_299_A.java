import java.util.*;
import java.io.*;

public class codeforces_299_A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String n = br.readLine();
            System.out.println(n.charAt(0) - '0' + n.charAt(n.length() - 1) - '0');
        }
    }
}