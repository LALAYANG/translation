Here is the Java version of the Python code:

```java
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int inputValue = scanner.nextInt();
        ArrayList<String> arre = new ArrayList<>();
        while (inputValue > 0) {
            int constantValue = 1;
            ExecutorService executorService = Executors.newSingleThreadExecutor();
            Future<Integer> future = executorService.submit(new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    return calculateDifference(inputValue, constantValue);
                }
            });
            inputValue = future.get();
            executorService.shutdown();
            arre.add(scanner.next().toLowerCase());
        }
        String oString = scanner.next();
        String lowString = oString.toLowerCase();
        String letter1 = scanner.next().toLowerCase().substring(0, 1);
        String letter2 = "a".equals(letter1) ? "b" : "a";
        int[] valid = new int[oString.length()];
        HashSet<Integer> setcito = new HashSet<>();
        int checkFlagOne = 202;
        int checkFlagTwo = 148;
        for (String x : arre) {
            if ((checkFlagOne & checkFlagTwo) != 0) {
                if (lowString.contains(x)) {
                    int wat = 0;
                    while (true) {
                        int foundIndex = lowString.indexOf(x, wat);
                        if (foundIndex < 0) {
                            break;
                        }
                        updateValidIndices(setcito, foundIndex, foundIndex + x.length(), 1);
                        wat = foundIndex + 1;
                    }
                }
            }
        }
        char[] oStringChars = oString.toCharArray();
        for (int i : setcito) {
            String letter = lowString.charAt(i) != letter1.charAt(0) ? letter1 : letter2;
            oStringChars[i] = Character.isLowerCase(oStringChars[i]) ? letter.charAt(0) : letter.toUpperCase().charAt(0);
        }
        System.out.println(new String(oStringChars));
    }

    private static void updateValidIndices(HashSet<Integer> setcito, int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        setcito.add(i);
        updateValidIndices(setcito, i + step, stop, step);
    }

    private static int calculateDifference(int inputValue, int constantValue) {
        return inputValue - constantValue;
    }
}
```

Please note that the Java version uses `ExecutorService` to create a thread for the `calculateDifference` method. The `Future` object is used to get the result of the thread. The `HashSet` is used instead of `set` in Python. The `ArrayList` is used instead of `list` in Python. The `Scanner` is used to read the input from the console. The `StringBuilder` is used to build the output string. The `Character` class is used to check if a character is lower case or upper case.

