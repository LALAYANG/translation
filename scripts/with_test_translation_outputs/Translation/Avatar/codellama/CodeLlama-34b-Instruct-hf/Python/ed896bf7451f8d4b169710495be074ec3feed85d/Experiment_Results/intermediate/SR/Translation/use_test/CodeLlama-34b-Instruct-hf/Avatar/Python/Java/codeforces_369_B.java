<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
50 25 1000 1000 50000 25000

Expected output:
1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 

```
def get_nums ( num , t ) :
    return [ t // num + 1 if i in range ( t % num ) else t // num for i in range ( num ) ]
n , k , l , r , sa , sk = map ( int , input ( ).split ( ) )
ans = get_nums ( k , sk ) + get_nums ( n - k , sa - sk )
print ( ' '.join ( map ( str , ans ) ) )


```
[/INST]
```java
import java.util.Scanner;

public class GetNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();
        int r = sc.nextInt();
        int sa = sc.nextInt();
        int sk = sc.nextInt();

        int[] ans = getNums(k, sk) + getNums(n - k, sa - sk);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] getNums(int num, int t) {
        int[] result = new int[num];
        for (int i = 0; i < num; i++) {
            result[i] = t / num + 1;
            if (i < t % num) {
                result[i]++;
            }
        }
        return result;
    }
}
```
Note: The `Arrays.toString()` method is used to print the array in the desired format.</s>
