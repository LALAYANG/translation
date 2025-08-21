```java
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        int pya = Integer.parseInt(System.console().readLine());
        String[] arre = new String[pya];
        ExecutorService executor = Executors.newFixedThreadPool(1);
        while (pya > 0) {
            int decrementValue = 1;
            Queue<Integer> differenceQueue = new LinkedList<>();
            Callable<Integer> calculateDifferenceTask = () -> {
                return calculateDifference(decrementValue, pya);
            };
            Future<Integer> future = executor.submit(calculateDifferenceTask);
            int result_calculateDifference0 = future.get();
            pya = result_calculateDifference0;
            arre[pya - 1] = System.console().readLine().toLowerCase();
        }
        executor.shutdown();
        String inputString = System.console().readLine();
        String lowString = inputString.toLowerCase();
        char letter1 = System.console().readLine().toLowerCase().charAt(0);
        char letter2 = (letter1 == 'a') ? 'b' : 'a';
        boolean[] valid = new boolean[inputString.length()];
        Set<Integer> setcito = new HashSet<>();
        int checkFlagOne = 962;
        int checkFlagTwo = 449;
        for (String x : arre) {
            if ((checkFlagOne & checkFlagTwo) != 0) {
                int index = lowString.indexOf(x);
                while (index >= 0) {
                    setcito.add(index);
                    index = lowString.indexOf(x, index + 1);
                }
            }
        }
        char[] inputStringArray = inputString.toCharArray();
        for (int i : setcito) {
            char letter = (lowString.charAt(i) == letter1) ? letter2 : letter1;
            inputStringArray[i] = (Character.isLowerCase(inputStringArray[i]) ? letter : Character.toUpperCase(letter));
        }
        for (char x : inputStringArray) {
            System.out.print(x);
        }
        System.out.println();
    }

    private static int calculateDifference(int decrementValue, int pya) {
        return pya - decrementValue;
    }
}
```

Test input:
4
hello
party
abefglghjdhfgj
IVan
petrsmatchwin
a

Expected output:
petrsmatchwin 
