import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        Map<String, Integer> w = new HashMap<>();
        for (String word : s) {
            w.put(word, w.getOrDefault(word, 0) + 1);
        }
        int c = -1;
        String a = "";
        for (String word : s) {
            if (w.get(word) == Collections.max(w.values())) {
                if (s.indexOf(word) > c) {
                    a = word;
                    c = s.indexOf(word);
                }
            }
        }
        System.out.println(a);
    }
}