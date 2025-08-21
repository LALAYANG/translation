```java
import java.util.*;
import java.util.stream.*;
import java.lang.Math;

class Main {
    static class Pair implements Comparable<Pair> {
        int index;
        int value;

        Pair(int index, int value) {
            this.index = index;
            this.value = value;
        }

        @Override
        public int compareTo(Pair o) {
            return Integer.compare(this.value, o.value);
        }
    }

    static List<Integer> A__ = new ArrayList<>();

    static void ttest_ind(int[] a, int[] b) {
        double sum1 = Arrays.stream(a).sum();
        double sum2 = Arrays.stream(b).sum();
        double avg1 = sum1 / a.length;
        double avg2 = sum2 / b.length;

        double var1 = Arrays.stream(a).mapToDouble(x -> Math.pow(x - avg1, 2)).sum() / a.length;
        double var2 = Arrays.stream(b).mapToDouble(x -> Math.pow(x - avg2, 2)).sum() / b.length;

        double result = (avg1 - avg2) / Math.sqrt(var1 + var2);
        System.out.println(result);
    }

    static void recursivePrint(int currentIndex, int stop, int step) {
        if (step == 0 || (step > 0 && currentIndex >= stop) || (step < 0 && currentIndex <= stop)) {
            return;
        }
        for (int i : A__) {
            System.out.print(i + " ");
        }
        System.out.println();
        recursivePrint(currentIndex + step, stop, step);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Pair[] indexedInput = new Pair[N];
        for (int i = 0; i < N; i++) {
            indexedInput[i] = new Pair(i + 1, scanner.nextInt());
        }
        Arrays.sort(indexedInput);
        A__ = Arrays.stream(indexedInput).mapToInt(x -> x.index).boxed().collect(Collectors.toList());
        ttest_ind(new int[]{89, 62, 48}, new int[]{78, 76, 77});
        recursivePrint(0, 225 / 224, 1);
        System.out.println(A__.get(A__.size() - 1));
    }
}
```

This Java code does the same thing as the Python code. It reads an integer `N` and `N` integers from the input, sorts them and prints them in ascending order along with the result of the t-test. Then it prints the sequence of numbers in the sorted order and the last number in the sequence. The t-test is performed on the arrays `[89, 62, 48]` and `[78, 76, 77]`.

