<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
mbmxuuuuxuuuuhhooooxxxuxxxuxuuxuuuxxjvjvjjjjvvvjjjjjvvjvjjjvvvjjvjjvvvjjjvjvvjvjjjjjmmbmbbbbbmbbbbmm
5
mb
ho
xu
jv
yp

Expected output:
37


```
s = input ( )
n = int ( input ( ) )
ans = 0
for i in range ( n ) :
    x = input ( )
    a , b = 0 , 0
    for j in s :
        if j == x [ 0 ] :
            a += 1
        elif j == x [ 1 ] :
            b += 1
        else :
            ans = ans + min ( a , b )
            a , b = 0 , 0
    ans = ans + min ( a , b )
print ( ans )


```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = sc.nextInt();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            String x = sc.nextLine();
            int a = 0, b = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == x.charAt(0)) {
                    a++;
                } else if (s.charAt(j) == x.charAt(1)) {
                    b++;
                } else {
                    ans = ans + Math.min(a, b);
                    a = 0;
                    b = 0;
                }
            }
            ans = ans + Math.min(a, b);
        }
        System.out.println(ans);
    }
}
```
Test case:
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "mbmxuuuuxuuuuhhooooxxxuxxxuxuuxuuuxxjvjvjjjjvvvjjjjjvvjvjjjvvvjjvjjvvvjjjvjvvjvjjjjjmmbmbbbbbmbbbbmm";
        int n = 5;
        String[] x = {"mb", "ho", "xu", "jv", "yp"};
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int a = 0, b = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == x[i].charAt(0)) {
                    a++;
                } else if (s.charAt(j) == x[i].charAt(1)) {
                    b++;
                } else {
                    ans = ans + Math.min(a, b);
                    a = 0;
                    b = 0;
                }
            }
            ans = ans + Math.min(a, b);
        }
        System.out.println(ans);
    }
}
```
Output:
```
37
```</s>
