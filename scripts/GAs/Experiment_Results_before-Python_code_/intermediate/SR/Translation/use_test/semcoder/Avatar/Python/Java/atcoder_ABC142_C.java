```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());
        String[] input = scanner.nextLine().split(" ");

        List<Integer> A = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            A.add(Integer.parseInt(input[i]));
        }

        List<Integer> A_ = new ArrayList<>(A);
        Collections.sort(A_, Comparator.comparingInt(o -> A.get(o - 1)));

        List<Integer> A__ = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            A__.add(A_.get(i));
        }

        for (int i = 0; i < N - 1; i++) {
            System.out.print(A__.get(i) + " ");
        }
        System.out.println(A__.get(N - 1));
    }
}
```
