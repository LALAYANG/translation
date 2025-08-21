```java
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

public class Main {
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
```

This Java code does the same thing as the Python code. It reads the number of pairs and the pairs themselves, sorts the pairs in descending order based on the second element, and then checks if the first element of any pair is greater than the first element of the previous pair. If it is, it prints "Happy Alex" and returns. If it doesn't find such a pair, it prints "Poor Alex".

