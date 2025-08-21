```java
int condition_1 = 836;
int condition_2 = 829;

class Decorator {
    public static Object dec_result(Object func) {
        return func;
    }
}

class SumInputs {
    public static int sum_inputs(int a, int input_b) {
        return a + input_b;
    }
}

class Shuffle {
    public static void shuffle(int[] arr) {
        // Shuffle implementation
    }
}

class TTestInd {
    public static void ttest_ind(int[] arr1, int[] arr2) {
        // t-test implementation
    }
}

public class Main {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);
        if ((condition_1 & condition_2) != 0) {
            if (age == 1) {
                System.out.println("Hello World");
            } else {
                int input_a = Integer.parseInt(args[1]);
                int input_b = Integer.parseInt(args[2]);
                System.out.println(SumInputs.sum_inputs(input_a, input_b));
            }
        }
    }
}
```
