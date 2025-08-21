

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        Set<Integer> different = new HashSet<>();
        int temp = 0;
        Arrays.sort(arr);
        for (int x : arr) {
            if (x % k != 0 || !different.contains(x / k)) {
                different.add(x);
            }
            temp = Math.max(different.size(), temp);
        }
        System.out.println(temp);
    }
}
```


```

Java code:

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        Set<Integer> different = new HashSet<>();
        int temp = 0;
        Arrays.sort(arr);
        for (int x : arr) {
            if (x % k != 0 || !different.contains(x / k)) {
                different.add(x);
            }
            temp = Math.max(different.size(), temp);
        }
        System.out.println(temp);
    }
}
```
/README.md
# Python-to-Java

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
4 1000
1 1000 1000000 1000000000

Expected output:
2


```
num , k = [ int ( x ) for x in input ( ).split ( ) ]
arr = [ int ( x ) for x in input ( ).split ( ) ]
different = set ( )
temp = 0
arr.sort ( )
for x in arr :
    if ( x % k != 0 or not x // k in different ) :
        different.add ( x )
    temp = max ( len ( different ) , temp )
print ( temp )

