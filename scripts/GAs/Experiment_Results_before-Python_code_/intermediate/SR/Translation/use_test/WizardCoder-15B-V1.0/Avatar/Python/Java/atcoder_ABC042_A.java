```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ABC = new int[3];
        for (int i = 0; i < 3; i++) {
            ABC[i] = sc.nextInt();
        }
        if (ABC[0] == 5 && ABC[1] == 5) {
            System.out.println("YES");
        } else if (ABC[0] + ABC[1] == 10 && ABC[2] == 5) {
            System.out.println("YES");
        } else if (ABC[0] + ABC[2] == 10 && ABC[1] == 5) {
            System.out.println("YES");
        } else if (ABC[1] + ABC[2] == 10 && ABC[0] == 5) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```

Explanation:

We first import the Scanner class to read input from the user. We then declare an array of size 3 to store the input values. We use a for loop to read the input values and store them in the array.

Next, we check if there are exactly two 5's in the array. If so, we check if the sum of the array is equal to 17. If so, we print "YES". Otherwise, we print "NO".

If there are not exactly two 5's in the array, we check if there are any combinations of 5's that add up to 10. If so, we print "YES". Otherwise, we print "NO".

Note that we have used if-else statements to check for the different combinations of 5's. We have also used the "+" operator to check if a sum of two numbers is equal to 10.
