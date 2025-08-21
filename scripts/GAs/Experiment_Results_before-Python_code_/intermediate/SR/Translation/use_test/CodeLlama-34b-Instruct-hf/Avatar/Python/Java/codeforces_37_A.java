```java
import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }
        int high = 1;
        int tower = n;
        int maximum = 1;
        java.util.Arrays.sort(l);
        for (int i = 1; i < n; i++) {
            if (l[i] == l[i - 1]) {
                tower -= 1;
                high += 1;
            } else {
                if (high > maximum) {
                    maximum = high;
                }
                high = 1;
            }
        }
        if (high > maximum) {
            maximum = high;
        }
        System.out.println(maximum + " " + tower);
    }
}
```
Note: The above code is a Java implementation of the Tower of Hanoi problem. It takes in an integer `n` as input, which represents the number of disks, and an array of integers `l` as input, which represents the heights of the disks. The code then sorts the array of integers using the `Arrays.sort()` method and then uses a loop to calculate the maximum height of the tower and the number of disks that can be placed on top of each other. Finally, it prints the maximum height and the number of disks that can be placed on top of each other.
