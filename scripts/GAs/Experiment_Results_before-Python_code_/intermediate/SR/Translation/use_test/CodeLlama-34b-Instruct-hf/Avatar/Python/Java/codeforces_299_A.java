```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println(min);
    }
}
```

Explanation:

1. The first line of the code `num_inp = lambda : int ( input ( ) )` is a lambda function that takes no arguments and returns an integer. It is used to read an integer from the input stream.
2. The second line of the code `arr_inp = lambda : list ( map ( int , input ( ).split ( ) ) )` is a lambda function that takes no arguments and returns a list of integers. It is used to read a list of integers from the input stream.
3. The third line of the code `sp_inp = lambda : map ( int , input ( ).split ( ) )` is a lambda function that takes no arguments and returns a map of integers. It is used to read a map of integers from the input stream.
4. The fourth line of the code `a = sorted ( map ( int , [ * open ( 0 ) ] [ 1 ].split ( ) ) )` is a lambda function that takes no arguments and returns a sorted list of integers. It is used to read a sorted list of integers from the input stream.
5. The fifth line of the code `print ( [ a [ 0 ] , - 1 ] [ any ( x % a [ 0 ] for x in a ) ] )` is a lambda function that takes no arguments and returns a boolean value. It is used to check if any element in the list `a` is divisible by the first element of the list `a`.

In the Java code, we have used the `Scanner` class to read the input from the user. We have also used the `Arrays.sort()` method to sort the array of integers. The rest of the code is similar to the Python code.
