```java
import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = scanner.nextInt();
        }
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                a.add(x[i]);
            } else {
                b.add(x[i]);
            }
        }
        int[] cnta = new int[100002 + 1];
        int[] cntb = new int[100002 + 1];
        for (int i : a) {
            cnta[i]++;
        }
        for (int i : b) {
            cntb[i]++;
        }
        int vala = getMaxCountIndex(cnta);
        int vala1 = getSecondMaxCountIndex(cnta, vala);
        int valb = getMaxCountIndex(cntb);
        int valb1 = getSecondMaxCountIndex(cntb, valb);
        if ((valb != vala) && (vala != -1) && (valb != -1)) {
            int result = (int) a.stream().filter(i -> i != vala).count();
            result += (int) b.stream().filter(i -> i != valb).count();
            System.out.println(result);
        } else if ((vala == valb) && (vala != -1) && (valb != -1)) {
            int resa = (int) a.stream().filter(i -> i != vala).count();
            int resa1 = (int) a.stream().filter(i -> i != vala1).count();
            int resb = (int) b.stream().filter(i -> i != valb).count();
            int resb1 = (int) b.stream().filter(i -> i != valb1).count();
            System.out.println(Math.min(resa + resb1, resa1 + resb));
        }
    }

    private static int getMaxCountIndex(int[] counts) {
        return IntStream.range(0, counts.length)
                .boxed()
                .max(Comparator.comparingInt(i -> counts[i]))
                .orElse(-1);
    }

    private static int getSecondMaxCountIndex(int[] counts, int maxIndex) {
        return IntStream.range(0, counts.length)
                .boxed()
                .filter(i -> i != maxIndex)
                .max(Comparator.comparingInt(i -> counts[i]))
                .orElse(-1);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer `n` and an array of `n` integers from the input, then it separates the array into two lists `a` and `b` based on the index of the elements. It then counts the occurrences of each number in `a` and `b` and finds the most common numbers in both lists. Finally, it prints the minimum number of elements that need to be changed to make the two lists have the same most common number.

