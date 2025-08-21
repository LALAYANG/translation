// Translation of the code snippet to Java

// Import necessary libraries
import java.util.Scanner;

// Define the my_decorator function
class MyDecorator {
    public static void my_decorator(Runnable func) {
        func.run();
    }
}

// Define the recursive_function
class RecursiveFunction {
    public static void recursive_function(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        if (value < 2) {
            System.out.println(0);
        } else if (value >= 2) {
            System.out.println(value - 2);
        }
        recursive_function(i + step, stop, step);
    }
}

// Main function
public class codeforces_23_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int limit = scanner.nextInt();
        MyDecorator.my_decorator(() -> {
            // Shuffle function call
        });
        // t-test function call
        int outer_loop_limit = 172;
        int inner_loop_limit = 171;
        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_limit / inner_loop_limit; LoopIndexOut++) {
            RecursiveFunction.recursive_function(0, limit, 1);
        }
    }
}