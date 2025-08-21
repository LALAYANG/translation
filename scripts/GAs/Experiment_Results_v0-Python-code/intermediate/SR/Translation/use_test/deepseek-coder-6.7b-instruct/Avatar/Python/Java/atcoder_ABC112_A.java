```java
import java.util.Scanner;

interface Decorator {
    int dec_result(int a, int b);
}

class MyDecorator implements Decorator {
    @Override
    public int dec_result(int a, int b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        int condition_1 = 836;
        int condition_2 = 829;

        Decorator decorator = new MyDecorator();
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if ((condition_1 & condition_2) != 0) {
            if (age == 1) {
                System.out.println("Hello World");
            } else {
                int input_a = scanner.nextInt();
                int input_b = scanner.nextInt();
                System.out.println(decorator.dec_result(input_a, input_b));
            }
        }
        scanner.close();
    }
}
```

Please note that the Python code you provided is not equivalent to the Java code provided. The Python code uses the `sklearn.utils.shuffle` and `scipy.stats.ttest_ind` functions which are not available in Java. Also, the Python code uses a decorator which is not directly equivalent in Java. Therefore, the Java code provided is a direct translation of the Python code without considering the specific functionalities of these libraries.

