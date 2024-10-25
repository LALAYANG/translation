<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
10 3
1 14
3 2
5 4
6 9
9 1
12 22
15 11
18 8
28 2
29 4

Expected output:
15 17 21 30 -1 -1 41 49 51 -1 


```
import queue
n , b = list ( map ( int , input ( ).split ( ) ) )
class Task :
    def __init__ ( self , time : int , duration : int , index : int ) -> None :
        super ( ).__init__ ( )
        self.time = time
        self.duration = duration
        self.index = index
remaining = queue.Queue ( )
running = False
finish_time = 0
def run_task ( remaining : queue.Queue , finish_time : int ) :
    task_to_run = remaining.get ( )
    finish_time = max ( finish_time , task_to_run.time ) + task_to_run.duration
    result [ task_to_run.index ] = finish_time
    return finish_time , result
result = { }
for i in range ( n ) :
    time , duration = list ( map ( int , input ( ).split ( ) ) )
    task = Task ( time , duration , index = i )
    result.update ( { i : 0 } )
    if task.time > finish_time and remaining.empty ( ) :
        running = True
        finish_time = task.time + task.duration
        result [ i ] = finish_time
    else :
        if task.time >= finish_time and not remaining.empty ( ) :
            finish_time , result = run_task ( remaining = remaining , finish_time = finish_time )
        if remaining.qsize ( ) < b :
            remaining.put ( task )
        else :
            result [ i ] = - 1
while not remaining.empty ( ) :
    finish_time , result = run_task ( remaining = remaining , finish_time = finish_time )
for key in result :
    print ( result.get ( key ) )


```

### Response:
Here is the Java version of your Python code:

```java
import java.util.*;

class Task {
    int time;
    int duration;
    int index;

    public Task(int time, int duration, int index) {
        this.time = time;
        this.duration = duration;
        this.index = index;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int b = scanner.nextInt();
        Queue<Task> remaining = new LinkedList<>();
        boolean running = false;
        int finishTime = 0;
        Map<Integer, Integer> result = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int time = scanner.nextInt();
            int duration = scanner.nextInt();
            Task task = new Task(time, duration, i);
            result.put(i, 0);

            if (task.time > finishTime && remaining.isEmpty()) {
                running = true;
                finishTime = task.time + task.duration;
                result.put(i, finishTime);
            } else {
                if (task.time >= finishTime && !remaining.isEmpty()) {
                    finishTime = runTask(remaining, finishTime, result);
                }
                if (remaining.size() < b) {
                    remaining.add(task);
                } else {
                    result.put(i, -1);
                }
            }
        }

        while (!remaining.isEmpty()) {
            finishTime = runTask(remaining, finishTime, result);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(result.get(i) + " ");
        }
    }

    private static int runTask(Queue<Task> remaining, int finishTime, Map<Integer, Integer> result) {
        Task taskToRun = remaining.poll();
        finishTime = Math.max(finishTime, taskToRun.time) + taskToRun.duration;
        result.put(taskToRun.index, finishTime);
        return finishTime;
    }
}
```

Please note that the Java version of your code uses `java.util.Scanner` for input, `java.util.Queue` for the `remaining` queue, and `java.util.Map` for the `result` map. The `runTask` method has been moved outside of the main method for clarity.
<|EOT|>
