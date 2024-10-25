<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

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
[/INST]
```java
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TaskScheduler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int b = scanner.nextInt();
        Task[] tasks = new Task[n];
        for (int i = 0; i < n; i++) {
            int time = scanner.nextInt();
            int duration = scanner.nextInt();
            tasks[i] = new Task(time, duration, i);
        }

        Queue<Task> remaining = new LinkedList<>();
        int finishTime = 0;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            Task task = tasks[i];
            if (task.time > finishTime && remaining.isEmpty()) {
                finishTime = task.time + task.duration;
                result[task.index] = finishTime;
            } else {
                if (task.time >= finishTime && !remaining.isEmpty()) {
                    finishTime = runTask(remaining, finishTime);
                    result[task.index] = finishTime;
                }
                if (remaining.size() < b) {
                    remaining.add(task);
                } else {
                    result[task.index] = -1;
                }
            }
        }

        while (!remaining.isEmpty()) {
            finishTime = runTask(remaining, finishTime);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }

    private static int runTask(Queue<Task> remaining, int finishTime) {
        Task task = remaining.poll();
        finishTime = Math.max(finishTime, task.time) + task.duration;
        return finishTime;
    }

    static class Task {
        int time;
        int duration;
        int index;

        public Task(int time, int duration, int index) {
            this.time = time;
            this.duration = duration;
            this.index = index;
        }
    }
}
```
Note: The above code is a Java implementation of the Python code you provided. It uses a `Queue` to store the tasks and a `Task` class to represent each task. The `runTask` method is used to run a task and update the finish time. The `main` method is used to read the input, create the tasks, and run the tasks. The `result` array is used to store the finish times of each task.</s>
