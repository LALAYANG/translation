<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
07:12
05:55

Expected output:
01:17


```
h1 , m1 = ( map ( int , input ( ).split ( ':' ) ) )
m1 += h1 * 60
h2 , m2 = ( map ( int , input ( ).split ( ':' ) ) )
m2 += h2 * 60
m2 = m1 - m2
m2 %= 1440
print ( "%02d:%02d" % ( m2 // 60 , m2 % 60 ) )


```
[/INST]
```java
import java.util.Scanner;

public class TimeDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h1, m1, h2, m2;

        // Get the first time
        System.out.print("Enter the first time (hh:mm): ");
        String[] time1 = sc.nextLine().split(":");
        h1 = Integer.parseInt(time1[0]);
        m1 = Integer.parseInt(time1[1]);

        // Get the second time
        System.out.print("Enter the second time (hh:mm): ");
        String[] time2 = sc.nextLine().split(":");
        h2 = Integer.parseInt(time2[0]);
        m2 = Integer.parseInt(time2[1]);

        // Calculate the difference in minutes
        int totalMinutes = (h1 * 60) + m1 - (h2 * 60) - m2;

        // Calculate the hours and minutes from the total minutes
        int hours = totalMinutes / 60;
        int minutes = totalMinutes % 60;

        // Print the result
        System.out.println("The time difference is " + hours + " hours and " + minutes + " minutes.");
    }
}
```
Note: In Java, we use the `Scanner` class to read input from the user. We also use the `Integer.parseInt()` method to convert the input strings to integers. Finally, we use the modulo operator (`%`) to calculate the minutes and hours from the total minutes.</s>
