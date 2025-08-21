
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        List<Integer> x = new ArrayList<>();
        List<Integer> y = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int day = scanner.nextInt();
            int salary = scanner.nextInt();
            x.add(-day);
            x.add(-salary);
        }
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        while (!x.isEmpty()) {
            int d = x.remove(0);
            int salary = x.remove(0);
            int r = m - y.size();
            if (d >= 0 && salary >= 0) {
                heap.add(-salary);
            } else if (r >= -d) {
                y.add(-salary);
            } else {
                y.add(-salary);
                y.remove(0);
            }
        }
        System.out.println(y.stream().mapToInt(i -> i).sum());
    }
}
```
Note that this code assumes that the input is a list of pairs of integers, where each pair represents a day and a salary. The code first reads the input and stores it in a list of pairs. It then creates a priority queue to store the salaries in descending order. The code then iterates through the list of pairs and checks if the salary is positive and the day is non-negative. If both conditions are true, the salary is added to the priority queue. If the day is negative and the salary is positive, the salary is added to the priority queue if there is enough capacity in the priority queue to store it. If the day is negative and the salary is negative, the salary is added to the priority queue if there is enough capacity in the priority queue to store it, and then the first element of the priority queue is removed. Finally, the code prints the sum of the salaries in the priority queue.
