import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Pair implements Comparable<Pair> {
    int first, second;

    Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public int compareTo(Pair o) {
        if (this.second == o.second) {
            return Integer.compare(this.first, o.first);
        }
        return Integer.compare(o.second, this.second);
    }
}

public class codeforces_456_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Pair> m = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            m.add(new Pair(scanner.nextInt(), scanner.nextInt()));
        }
        Collections.sort(m);
        Pair a = m.get(0);
        for (Pair i : m.subList(1, m.size())) {
            if (i.first > a.first) {
                System.out.println("Happy Alex");
                return;
            }
            a = i;
        }
        System.out.println("Poor Alex");
    }
}