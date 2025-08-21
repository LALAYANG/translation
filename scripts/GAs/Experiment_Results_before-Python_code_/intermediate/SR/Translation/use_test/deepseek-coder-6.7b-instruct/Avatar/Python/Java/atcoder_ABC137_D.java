Here is the Java version of the Python code:

```java
import java.util.PriorityQueue;
import java.util.Scanner;

class Worker implements Comparable<Worker>{
    int day;
    int salary;

    public Worker(int day, int salary){
        this.day = day;
        this.salary = salary;
    }

    @Override
    public int compareTo(Worker o) {
        if(this.day == o.day)
            return o.salary - this.salary;
        else
            return o.day - this.day;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        PriorityQueue<Worker> workers = new PriorityQueue<>();
        for(int i = 0; i < n; i++){
            int day = scanner.nextInt();
            int salary = scanner.nextInt();
            workers.add(new Worker(day, salary));
        }
        PriorityQueue<Integer> salaries = new PriorityQueue<>();
        while(!workers.isEmpty()){
            Worker worker = workers.poll();
            if(salaries.size() < m){
                salaries.add(worker.salary);
            } else if(worker.salary > salaries.peek()){
                salaries.poll();
                salaries.add(worker.salary);
            }
        }
        int sum = 0;
        for(int salary : salaries){
            sum += salary;
        }
        System.out.println(sum);
    }
}
```

This Java code does the same thing as the Python code. It reads the number of workers and the maximum number of days from the input, then reads the days and salaries for each worker. It then sorts the workers by day in descending order and by salary in descending order. It keeps track of the maximum number of workers that can be hired within the given number of days, and adds the salaries of the hired workers to a priority queue. The sum of the salaries in the priority queue is then printed as the result.

