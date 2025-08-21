```java
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        int inputValue = Integer.parseInt(args[0]);
        String[] arre = new String[inputValue];
        ExecutorService executor = Executors.newFixedThreadPool(1);
        LinkedBlockingQueue<Integer> queue_calculateDifference0 = new LinkedBlockingQueue<>();
        while (inputValue > 0) {
            int constantValue = 1;
            Future<Integer> future = executor.submit(new CalculateDifference(inputValue, constantValue, queue_calculateDifference0));
            inputValue = queue_calculateDifference0.take();
            arre[inputValue - 1] = args[inputValue].toLowerCase();
        }
        executor.shutdown();
        String oString = args[inputValue];
        String lowString = oString.toLowerCase();
        char letter1 = args[inputValue + 1].toLowerCase().charAt(0);
        char letter2 = 'a';
        if (letter1 == 'a') {
            letter2 = 'b';
        }
        boolean[] valid = new boolean[oString.length()];
        int checkFlagOne = 202;
        int checkFlagTwo = 148;
        for (String x : arre) {
            if ((checkFlagOne & checkFlagTwo) != 0) {
                int wat = 0;
                while (true) {
                    int foundIndex = lowString.indexOf(x, wat);
                    if (foundIndex < 0) {
                        break;
                    }
                    for (int i = foundIndex; i < foundIndex + x.length(); i++) {
                        valid[i] = true;
                    }
                    wat = foundIndex + 1;
                }
            }
        }
        for (int i = 0; i < oString.length(); i++) {
            char letter = valid[i] ? (oString.charAt(i) == letter1 ? letter2 : letter1) : oString.charAt(i);
            System.out.print(letter);
        }
        System.out.println();
    }

    private static class CalculateDifference implements Callable<Integer> {
        private int inputValue;
        private int constantValue;
        private LinkedBlockingQueue<Integer> queue;

        public CalculateDifference(int inputValue, int constantValue, LinkedBlockingQueue<Integer> queue) {
            this.inputValue = inputValue;
            this.constantValue = constantValue;
            this.queue = queue;
        }

        public Integer call() {
            return inputValue - constantValue;
        }
    }
}
```

Sample test case:
```
4
hello
party
abefglghjdhfgj
IVan
petrsmatchwin
a
```

Expected output:
```
petrsmatchwin
``` 
