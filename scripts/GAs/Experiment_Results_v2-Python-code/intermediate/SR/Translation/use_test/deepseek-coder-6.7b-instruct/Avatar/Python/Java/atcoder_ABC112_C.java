```java
import java.util.*;

public class Main {
    private static final int CHECK_SIXTEEN = 519;
    private static final int CHECK_TWENTY_SIX = 132;
    private static final int CHECK_EIGHTEEN = 313;
    private static final int CHECK_TWENTY_EIGHT = 206;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<List<Integer>> ls_xyh = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                temp.add(scanner.nextInt());
            }
            ls_xyh.add(temp);
        }
        System.out.println(solve(n, ls_xyh));
    }

    public static String solve(int n, List<List<Integer>> ls_xyh) {
        Integer x0 = null;
        for (int i = 0; i < n; i++) {
            if ((CHECK_EIGHTEEN & CHECK_TWENTY_EIGHT) != 0) {
                if ((CHECK_SIXTEEN & CHECK_TWENTY_SIX) != 0) {
                    if (ls_xyh.get(i).get(2) > 0) {
                        List<Integer> temp = ls_xyh.get(i);
                        x0 = temp.get(0);
                        break;
                    }
                }
            }
        }
        List<List<Integer>> cands = new ArrayList<>();
        for (int cx = 0; cx <= 100; cx++) {
            for (int cy = 0; cy <= 100; cy++) {
                cands.add(Arrays.asList(cx, cy, h0 + Math.abs(cx - x0) + Math.abs(cy - y0)));
            }
        }
        for (List<Integer> list : ls_xyh) {
            int x = list.get(0);
            int y = list.get(1);
            int h = list.get(2);
            cands.removeIf(cand -> Math.max(cand.get(2) - Math.abs(cand.get(0) - x) - Math.abs(cand.get(1) - y), 0) != h);
        }
        List<Integer> res = cands.get(0);
        return res.get(0) + " " + res.get(1) + " " + res.get(2);
    }
}
```

This Java code does the same thing as the Python code. It reads the input from the console, calls the `solve` method with the input, and prints the result. The `solve` method implements the logic of the Python code. It uses the `List` interface in Java instead of Python's list, and the `Arrays.asList` method to create lists. The `removeIf` method is used to filter the `cands` list in the same way as the Python list comprehension.

