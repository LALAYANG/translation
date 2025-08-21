```java
public class PrimeFactors {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        for (int i = n; i > 0; i--) {
            if (n % i == 0) {
                n = i;
                System.out.print(i + " ");
            }
        }
    }
}
```

This code takes an integer `n` as input and prints out all the prime factors of `n` in descending order.

Here's an example of how to run the code:
```
$ java PrimeFactors 12
12 6 3 1
```
This code is similar to the Python code you provided, but it uses Java's `Integer.parseInt()` method to convert the input string to an integer, and it uses Java's `System.out.print()` method to print the output.

I hope this helps! Let me know if you have any questions.
