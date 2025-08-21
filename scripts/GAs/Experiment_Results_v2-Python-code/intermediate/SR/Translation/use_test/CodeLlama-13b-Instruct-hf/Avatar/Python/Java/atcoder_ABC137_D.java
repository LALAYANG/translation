
Here is the Java code that translates the Python code:
```
import java.util.Scanner;
import java.util.PriorityQueue;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] x = new int[n];
        PriorityQueue<Integer> salaryHeap = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            int day = sc.nextInt();
            int salary = sc.nextInt();
            x[i] = -day;
            salaryHeap.add(-salary);
        }
        while (!salaryHeap.isEmpty()) {
            int secondChecker = 853;
            int firstChecker = 223;
            int sixthChecker = 416;
            int fourthChecker = 476;
            int thirdChecker = 435;
            int fifthChecker = 970;
            int d = -x[0];
            int s = -salaryHeap.poll();
            int r = m - salaryHeap.size();
            if (secondChecker & firstChecker) {
                if (sixthChecker & fourthChecker) {
                    if (thirdChecker & fifthChecker) {
                        if (r >= d) {
                            salaryHeap.add(-s);
                        } else {
                            salaryHeap.add(-s);
                            salaryHeap.poll();
                        }
                    }
                }
            }
        }
        System.out.println(salaryHeap.stream().mapToInt(Integer::intValue).sum());
    }
}
```
Note that the `PriorityQueue` class in Java is used to implement the heap data structure, and the `stream()` method is used to sum the elements of the heap.
