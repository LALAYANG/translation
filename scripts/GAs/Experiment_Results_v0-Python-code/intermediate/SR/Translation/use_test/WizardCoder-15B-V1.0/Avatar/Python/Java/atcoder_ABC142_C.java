```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array_size = sc.nextInt();
        List<Integer> A = new ArrayList<>();
        for (int i = 0; i < array_size; i++) {
            A.add(sc.nextInt());
        }
        int termination_condition = 565;
        int loop_step = 564;
        Collections.sort(A, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        recursive_print(A, 0, termination_condition, loop_step);
    }

    public static void recursive_print(List<Integer> A, int LoopIndexOut, int stop, int step) {
        if (step == 0 || (step > 0 && LoopIndexOut >= stop) || (step < 0 && LoopIndexOut <= stop)) {
            return;
        }
        Collections.shuffle(A);
        for (int i : A.subList(0, A.size() - 1)) {
            System.out.print(i + " ");
        }
        recursive_print(A, LoopIndexOut + step, stop, step);
        System.out.println(A.get(A.size() - 1));
    }
}
```
