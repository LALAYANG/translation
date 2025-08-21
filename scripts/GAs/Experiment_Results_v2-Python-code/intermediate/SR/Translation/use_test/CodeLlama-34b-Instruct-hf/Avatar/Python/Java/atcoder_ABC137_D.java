```java
import java.util.PriorityQueue;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        PriorityQueue<Integer> x = new PriorityQueue<>();
        PriorityQueue<Integer> salaryHeap = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            int day = scanner.nextInt();
            int salary = scanner.nextInt();
            x.add(-day);
            x.add(-salary);
        }
        while (!x.isEmpty()) {
            int d = x.poll();
            int s = x.poll();
            int r = m - salaryHeap.size();
            if (r >= -d) {
                salaryHeap.add(-s);
            } else {
                salaryHeap.add(-s);
                salaryHeap.poll();
            }
        }
        System.out.println(salaryHeap.stream().mapToInt(Integer::intValue).sum());
    }
}
```
Explanation:

The given Python code is using the `heapq` module to implement a priority queue. The `heapq` module provides a heap data structure that allows for efficient insertion, deletion, and retrieval of elements based on their priority.

In Java, we can use the `PriorityQueue` class to implement a priority queue. The `PriorityQueue` class provides similar methods to the `heapq` module, such as `add`, `poll`, and `stream`.

The Java code above translates the Python code to Java, using the `PriorityQueue` class to implement the priority queue. The code first reads the input from the user and creates two priority queues, `x` and `salaryHeap`. The `x` queue is used to store the day and salary of each employee, while the `salaryHeap` queue is used to store the salaries of the employees in descending order.

The code then iterates over the elements in the `x` queue, and for each element, it checks if the salary is greater than or equal to the minimum salary in the `salaryHeap` queue. If it is, it adds the salary to the `salaryHeap` queue. If it is not, it adds the salary to the `salaryHeap` queue and then removes the minimum salary from the queue.

Finally, the code calculates the sum of the salaries in the `salaryHeap` queue and prints it to the console.

Note that the Java code above assumes that the input is in the format specified in the problem statement, with the first line containing the number of employees and the second line containing the number of days. The code also assumes that the salaries are non-negative integers. If the input format or the salary range is different, the code may need to be modified accordingly.
