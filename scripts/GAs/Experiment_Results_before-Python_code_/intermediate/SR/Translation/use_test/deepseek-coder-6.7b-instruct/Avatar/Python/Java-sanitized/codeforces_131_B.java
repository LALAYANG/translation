import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class codeforces_131_B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        Map<Integer, Integer> w = new HashMap<>();
        for (String value : s) {
            int key = Integer.parseInt(value);
            w.put(key, w.getOrDefault(key, 0) + 1);
        }
        int c = 0;
        for (Integer i : w.keySet()) {
            if (i == 0) {
                c += w.get(i) * (w.get(i) - 1);
            } else {
                if (w.containsKey(-i)) {
                    c += w.get(i) * w.get(-i);
                }
            }
        }
        System.out.println(c / 2);
    }
}