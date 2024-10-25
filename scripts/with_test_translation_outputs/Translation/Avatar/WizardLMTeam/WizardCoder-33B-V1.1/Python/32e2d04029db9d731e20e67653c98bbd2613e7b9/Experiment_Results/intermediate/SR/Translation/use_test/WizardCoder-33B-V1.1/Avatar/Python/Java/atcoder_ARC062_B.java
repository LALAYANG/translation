<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
        int num_g = 0, num_p = 0, score = 0;
        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
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

Please note that in Java, you need to import the Scanner class to read input from the user. Also, the input is read as a string, so you need to iterate over each character in the string. <｜end▁of▁sentence｜>
