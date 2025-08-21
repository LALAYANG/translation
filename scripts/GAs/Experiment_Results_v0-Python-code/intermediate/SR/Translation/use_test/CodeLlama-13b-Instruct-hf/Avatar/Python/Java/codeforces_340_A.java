
Here is the Java code that translates the Python code:
```java
import java.util.concurrent.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Func_G_0 {
    public static int addition(int val1, int variable_3_9) {
        return val1 + variable_3_9;
    }

    public static int Func_G_0(int a, int b) {
        int val1 = 971;
        int val2 = 970;
        while (val1 % val2 == 1) {
            int variable_3_9 = 1;
            BlockingQueue<Integer> queue_addition_result = new LinkedBlockingQueue<>();

            Thread thread_addition_worker = new Thread(() -> {
                int addition_result = addition(val1, variable_3_9);
                queue_addition_result.put(addition_result);
            });
            thread_addition_worker.start();
            thread_addition_worker.join();
            val1 = queue_addition_result.get();
            while (a % b != 0) {
                (a, b) = (b, a % b);
            }
        }
        return b;
    }
}

public class Func_L_0 {
    public static int Func_L_0(int a, int b) {
        return a * b / Func_G_0.Func_G_0(a, b);
    }
}

public class Main {
    public static void main(String[] args) {
        String[] l = args[0].split(" ");
        int x = Integer.parseInt(l[0]);
        int y = Integer.parseInt(l[1]);
        int a = Integer.parseInt(l[2]);
        int b = Integer.parseInt(l[3]);
        BlockingQueue<Integer> queue_L0 = new LinkedBlockingQueue<>();

        Thread thread_L0 = new Thread(() -> {
            int result = Func_L_0.Func_L_0(x, y);
            queue_L0.put(result);
        });
        thread_L0.start();
        thread_L0.join();
        int result_L0 = queue_L0.get();
        int lcm = result_L0;
        System.out.println(b / lcm - (a - 1) / lcm);
    }
}
```
Note that the Java code uses the `java.util.concurrent` package to handle the threading and the `java.util.concurrent.BlockingQueue` class to handle the queue. The `java.util.concurrent.LinkedBlockingQueue` class is used to create a blocking queue that can be used to communicate between threads.

Also, the `Func_G_0` and `Func_L_0` classes are static classes that contain the `addition` and `Func_G_0` methods, respectively. The `Main` class is the entry point of the program and it contains the `main` method that parses the input and calls the `Func_L_0` method.

The `main` method first splits the input string using the space character as a delimiter, and then it parses the resulting array of strings to get the values of `x`, `y`, `a`, and `b`. It then creates a blocking queue and starts a thread that calls the `Func_L_0` method and puts the result in the queue. The main thread then joins the created thread and gets the result from the queue. Finally, it calculates the LCM and prints the result.
