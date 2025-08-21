```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Pair> indexedInput = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            indexedInput.add(new Pair(i + 1, scanner.nextInt()));
        }
        Collections.sort(indexedInput, Comparator.comparing(Pair::getValue));
        List<Integer> A__ = new ArrayList<>();
        for (Pair pair : indexedInput) {
            A__.add(pair.getKey());
        }
        int loopStop = 225;
        int checkStop = 224;
        recursivePrint(0, loopStop / checkStop, 1, A__);
        System.out.println(A__.get(A__.size() - 1));
    }

    public static void recursivePrint(int currentIndex, int stop, int step, List<Integer> A__) {
        if (step == 0 || (step > 0 && currentIndex >= stop) || (step < 0 && currentIndex <= stop)) {
            return;
        }
        for (int i : A__) {
            System.out.print(i + " ");
        }
        recursivePrint(currentIndex + step, stop, step, A__);
    }

    static class Pair {
        private int key;
        private int value;

        public Pair(int key, int value) {
            this.key = key;
            this.value = value;
        }

        public int getKey() {
            return key;
        }

        public int getValue() {
            return value;
        }
    }
}
```

Please note that the Java code does not include the t-test functionality from the Python code, as it is not directly available in Java. If you need to perform a t-test in Java, you may need to use a library such as Apache Commons Math or a statistical library for Java.

