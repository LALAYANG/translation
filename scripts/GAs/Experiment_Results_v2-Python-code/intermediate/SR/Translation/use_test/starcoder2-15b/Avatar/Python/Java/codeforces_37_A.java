

```java
import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = scanner.nextInt();
        }
        int high = 1;
        int tower = n;
        int maximum = 1;
        java.util.Arrays.sort(l);
        Queue<Integer> towerHeightQueue = new LinkedBlockingQueue<>();
        Thread towerHeightCalculationThread = new Thread(() -> {
            int heightDifference = 1;
            int calculatedTowerHeight = calculateTowerHeight(tower, heightDifference);
            towerHeightQueue.add(calculatedTowerHeight);
        });
        recursiveLoop(1, n, 1, l, high, maximum, tower, towerHeightQueue, towerHeightCalculationThread);
        if (high > maximum) {
            maximum = high;
        }
        System.out.println(maximum + " " + tower);
    }

    private static void recursiveLoop(int i, int stop, int step, int[] l, int high, int maximum, int tower, Queue<Integer> towerHeightQueue, Thread towerHeightCalculationThread) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        if (l[i] == l[i - 1]) {
            towerHeightCalculationThread.start();
            try {
                towerHeightCalculationThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            tower = towerHeightQueue.poll();
            high = high + 1;
        } else {
            if (high > maximum) {
                maximum = high;
            }
            high = 1;
        }
        recursiveLoop(i + step, stop, step, l, high, maximum, tower, towerHeightQueue, towerHeightCalculationThread);
    }

    private static int calculateTowerHeight(int tower, int heightDifference) {
        return tower - heightDifference;
    }
}
```

## 2.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [number for number in numbers if number % 3 == 0]
```

## 3.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [number for number in numbers if number % 3 == 0]
```


```
def divisible_by_3(numbers):
    return [number for number in numbers if number % 3 == 0]
```
/README.md
# Python to Java

## 1.

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
4
6 5 6 7

Expected output:
2 3


```
import threading
import queue

def calculate_tower_height(tower, height_difference):
    return tower - height_difference
from scipy.stats import ttest_ind
n = int(input())
l = list(map(int, input().split()))
high = 1
tower = n
maximum = 1
l.sort()

def recursive_loop(i, stop, step):
    global high, maximum, tower
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
    ttest_ind([96, 78, 63], [40, 22, 2])
    if l[i] == l[i - 1]:
        height_difference = 1
        tower_height_queue = queue.Queue()

        def tower_height_thread(queue):
            result = calculate_tower_height(tower, height_difference)
            queue.put(result)
        tower_height_calculation_thread = threading.Thread(target=tower_height_thread, args=(tower_height_queue,))
        tower_height_calculation_thread.start()
        tower_height_calculation_thread.join()
        calculated_tower_height = tower_height_queue.get()
        tower = calculated_tower_height
        high = high + 1
    else:
        if high > maximum:
            maximum = high
        high = 1
    recursive_loop(i + step, stop, step)
recursive_loop(1, n, 1)
if high > maximum:
    maximum = high
print(maximum, tower)
```

Java code:

```java
import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = scanner.nextInt();
        }
        int high = 1;
        int tower = n;
        int maximum = 1;
        java.util.Arrays.sort(l);
        Queue<Integer> towerHeightQueue = new LinkedBlockingQueue<>();
        Thread towerHeightCalculationThread = new Thread(() -> {
            int heightDifference = 1;
            int calculatedTowerHeight = calculateTowerHeight(tower, heightDifference);
            towerHeightQueue.add(calculatedTowerHeight);
        });
        recursiveLoop(1, n, 1, l, high, maximum, tower, towerHeightQueue, towerHeightCalculationThread);
        if (high > maximum) {
            maximum = high;
        }
        System.out.println(maximum + " " + tower);
    }

    private static void recursiveLoop(int i, int stop, int step, int[] l, int high, int maximum, int tower, Queue<Integer> towerHeightQueue, Thread towerHeightCalculationThread) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        if (l[i] == l[i - 1]) {
            towerHeightCalculationThread.start();
            try {
                towerHeightCalculationThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            tower = towerHeightQueue.poll();
            high = high + 1;
        } else {
            if (high > maximum) {
                maximum = high;
            }
            high = 1;
        }
        recursiveLoop(i + step, stop, step, l, high, maximum, tower, towerHeightQueue, towerHeightCalculationThread);
    }

    private static int calculateTowerHeight(int tower, int heightDifference) {
        return tower - heightDifference;
    }
}
```

## 2.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [number for number in numbers if number % 3 == 0]
```

## 3.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.
