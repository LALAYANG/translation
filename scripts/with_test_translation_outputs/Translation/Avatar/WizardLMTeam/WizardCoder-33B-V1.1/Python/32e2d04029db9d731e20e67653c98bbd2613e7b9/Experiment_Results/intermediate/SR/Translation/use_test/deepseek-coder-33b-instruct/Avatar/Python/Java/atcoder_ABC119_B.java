<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
3
100000000 JPY
100.00000000 BTC
0.00000001 BTC

Expected output:
138000000.0038


```
N = int ( input ( ) )
x = [ eval ( input ( ).replace ( 'JPY' , '* 1.0' ).replace ( 'BTC' , '* 380000.0' ) ) for i in range ( N ) ]
print ( sum ( x ) )


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        double sum = 0;
        for (int i = 0; i < N; i++) {
            double value = scanner.nextDouble();
            String currency = scanner.next();
            if (currency.equals("JPY")) {
                sum += value;
            } else if (currency.equals("BTC")) {
                sum += value * 380000.0;
            }
        }
        System.out.printf("%.2f", sum);
    }
}
```

This Java code reads the number of inputs, then for each input, it reads a double value and a string representing the currency. If the currency is "JPY", it adds the value to the sum. If the currency is "BTC", it multiplies the value by 380000.0 and adds the result to the sum. Finally, it prints the sum with 2 decimal places.
<|EOT|>
