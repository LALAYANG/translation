<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
2 2

Expected output:
2


```
s = list ( input ( ) )
num_g , num_p = 0 , 0
score = 0
for x in s :
    if x == 'g' :
        if num_g - num_p > 0 :
            score += 1
            num_p += 1
        else :
            score = score
            num_g += 1
    elif x == 'p' :
        if num_g - num_p > 0 :
            score = score
            num_p += 1
        else :
            score -= 1
            num_g += 1
print ( score )


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int num_g = 0, num_p = 0;
        int score = 0;
        for (char x : s.toCharArray()) {
            if (x == 'g') {
                if (num_g - num_p > 0) {
                    score += 1;
                    num_p += 1;
                } else {
                    score = score;
                    num_g += 1;
                }
            } else if (x == 'p') {
                if (num_g - num_p > 0) {
                    score = score;
                    num_p += 1;
                } else {
                    score -= 1;
                    num_g += 1;
                }
            }
        }
        System.out.println(score);
    }
}
```
<|EOT|>
