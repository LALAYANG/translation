```java
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        int n = Integer.parseInt(args[0]);
        LinkedList<Integer> li = new LinkedList<>();
        int ind = 0;
        for (int i = 1; i <= 370; i++) {
            int p = i;
            int q = i;
            int count = 0;
            while (p != 0) {
                int variable_3_13 = 10;
                ExecutorService executor = Executors.newSingleThreadExecutor();
                Future<Integer> quotient = executor.submit(new CalculateQuotient(p, variable_3_13));
                p = quotient.get();
                count++;
                executor.shutdown();
            }
            if (count == 1) {
                li.add(i);
            }
            if (count == 2) {
                LinkedList<Integer> temp = new LinkedList<>();
                while (q != 0) {
                    int x = q % 10;
                    q /= 10;
                    temp.addFirst(x);
                }
                ExecutorService executor = Executors.newSingleThreadExecutor();
                Future<LinkedList<Integer>> result_append_list = executor.submit(new AppendList(temp, li);
                li = result_append_list.get();
                executor.shutdown();
            }
            if (count == 3) {
                LinkedList<Integer> temp = new LinkedList<>();
                while (q != 0) {
                    int x = q % 10;
                    q /= 10;
                    temp.addFirst(x);
                }
                li.addAll(temp);
            }
        }
        li.removeLast();
        li.removeLast();
        System.out.println(li.get(n - 1));
    }
}

class CalculateQuotient implements Callable<Integer> {
    private int p;
    private int variable_3_13;

    public CalculateQuotient(int p, int variable_3_13) {
        this.p = p;
        this.variable_3_13 = variable_3_13;
    }

    public Integer call() {
        return p / variable_3_13;
    }
}

class AppendList implements Callable<LinkedList<Integer>> {
    private LinkedList<Integer> variable_3_18;
    private LinkedList<Integer> li;

    public AppendList(LinkedList<Integer> variable_3_18, LinkedList<Integer> li) {
        this.variable_3_18 = variable_3_18;
        this.li = li;
    }

    public LinkedList<Integer> call() {
        return new LinkedList<>(li).addAll(variable_3_18);
    }
}
``` 
