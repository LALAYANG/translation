```java
public class Main {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(args[i + 1]);
        }
        int currentLevel = 0;
        int counter = 0;
        int counterTurns = -1;
        while (counter < n) {
            counterTurns++;
            for (int i = 0; i < n; i++) {
                if (a[i] != -1 && a[i] <= counter) {
                    counter++;
                    a[i] = -1;
                }
            }
            a = reverse(a);
        }
        System.out.println(counterTurns);
    }

    public static int[] reverse(int[] a) {
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[a.length - i - 1];
        }
        return b;
    }
}
```
This code takes an integer `n` and an array of integers `a` as input, and it reverses the array `a` `n` times. It then prints the number of turns it took to reverse the array.

The `main` function first takes the input `n` and `a` from the user, and then it initializes the variables `currentLevel`, `counter`, and `counterTurns`. It then enters a loop that runs for `n` times.

In each iteration of the loop, it first increments `counterTurns` by 1. Then, it iterates over the array `a` and checks if each element is not equal to -1 and is less than or equal to `counter`. If so, it increments `counter` by 1 and sets the element to -1.

After iterating over the array, it reverses the array using the `reverse` function, which takes an array `a` as input and returns a new array `b` with the elements of `a` in reverse order.

Finally, it prints the value of `counterTurns` to the console.

The `reverse` function is a helper function that is used to reverse the array `a`. It takes an array `a` as input and returns a new array `b` with the elements of `a` in reverse order. It does this by iterating over the array `a` and setting each element of `b` to the corresponding element of `a`, but in reverse order.

For example, if the input array `a` is [1, 2, 3, 4, 5], the output array `b` will be [5, 4, 3, 2, 1].
