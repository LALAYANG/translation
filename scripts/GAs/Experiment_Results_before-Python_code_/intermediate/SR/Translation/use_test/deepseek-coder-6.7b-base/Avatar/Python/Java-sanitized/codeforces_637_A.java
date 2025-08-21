import java.util.*;
import java.io.*;

public class codeforces_637_A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(s[i], map.getOrDefault(s[i], 0) + 1);
        }
        int max = 0;
        String ans = "";
        for (String key : map.keySet()) {
            if (map.get(key) > max) {
                max = map.get(key);
                ans = key;
            }
        }
        System.out.println(ans);
    }
}