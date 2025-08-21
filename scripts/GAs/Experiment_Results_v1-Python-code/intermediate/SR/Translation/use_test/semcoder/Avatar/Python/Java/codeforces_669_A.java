```java
import java.util.Scanner;

class Main {
    public static int calculate_product(int arg0, int arg1) {
        return arg0 * arg1;
    }

    public static int nested_multiply(int arg0, int arg1) {
        return calculate_product(arg0, arg1);
    }

    public static int compute_product(int arg0, int arg1) {
        return nested_multiply(arg0, arg1);
    }

    public static int recursive_multiply(int arg0, int arg1) {
        return compute_product(arg0, arg1);
    }

    public static int multiply_recursive(int arg0, int arg1) {
        return recursive_multiply(arg0, arg1);
    }

    public static int multiply_deep(int arg0, int arg1) {
        return multiply_recursive(arg0, arg1);
    }

    public static int multiply_indirect(int arg0, int arg1) {
        return multiply_deep(arg0, arg1);
    }

    public static int multiply_nested(int arg0, int arg1) {
        return multiply_indirect(arg0, arg1);
    }

    public static int my_decorator(int func) {
        return func;
    }

    public static int apply_multiplication(int a, int b) {
        return multiply_nested(a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int user_input = scanner.nextInt();
        int result = (apply_multiplication(user_input, 2) + 1) / 3;
        System.out.println(result);
    }
}
```
