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

public class atcoder_ABC137_D {
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