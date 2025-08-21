import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class codeforces_637_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = sc.nextLine().split(" ");
        ArrayList<Integer> w = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            w.add(Integer.parseInt(s[i]));
        }
        Collections.sort(w, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        int c = 0;
        int a = 0;
        for (int i = 0; i < w.size(); i++) {
            if (w.get(i) == w.get(w.size() - 1)) {
                c = i;
                a = w.get(i);
                break;
            }
        }
        System.out.println(a);
    }
}