<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
12345

Expected output:
12351


```
def leapyear ( n ) :
    if ( n % 400 == 0 or ( n % 4 == 0 and n % 100 != 0 ) ) :
        return "y"
    else :
        return "n"
n = int ( input ( ) )
d = "f"
if ( n % 400 == 0 or ( n % 4 == 0 and n % 100 != 0 ) ) :
    ans = "ly"
else :
    ans = "nly"
while ( True ) :
    if ( n % 400 == 0 or ( n % 4 == 0 and n % 100 != 0 ) ) :
        if ( d == "m" ) :
            d = "w"
            n += 1
        elif ( d == "t" ) :
            d = "th"
            n += 1
        elif ( d == "w" ) :
            d = "f"
            n += 1
        elif ( d == "th" ) :
            d = "sa"
            n += 1
        elif ( d == "f" ) :
            d = "s"
            n += 1
        elif ( d == "sa" ) :
            d = "m"
            n += 1
        elif ( d == "s" ) :
            d = "t"
            n += 1
    else :
        if ( d == "m" ) :
            d = "t"
            n += 1
        elif ( d == "t" ) :
            d = "w"
            n += 1
        elif ( d == "w" ) :
            d = "th"
            n += 1
        elif ( d == "th" ) :
            d = "f"
            n += 1
        elif ( d == "f" ) :
            d = "sa"
            n += 1
        elif ( d == "sa" ) :
            d = "s"
            n += 1
        elif ( d == "s" ) :
            d = "m"
            n += 1
    if ( d == "f" and ans == "ly" and leapyear ( n ) == "y" ) :
        break
    elif ( d == "f" and ans == "nly" and leapyear ( n ) == "n" ) :
        break
print ( n )


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String d = "f";
        String ans = (n % 400 == 0 || (n % 4 == 0 && n % 100 != 0)) ? "ly" : "nly";

        while (true) {
            if (n % 400 == 0 || (n % 4 == 0 && n % 100 != 0)) {
                switch (d) {
                    case "m":
                        d = "w";
                        n++;
                        break;
                    case "t":
                        d = "th";
                        n++;
                        break;
                    case "w":
                        d = "f";
                        n++;
                        break;
                    case "th":
                        d = "sa";
                        n++;
                        break;
                    case "f":
                        d = "s";
                        n++;
                        break;
                    case "sa":
                        d = "m";
                        n++;
                        break;
                    case "s":
                        d = "t";
                        n++;
                        break;
                }
            } else {
                switch (d) {
                    case "m":
                        d = "t";
                        n++;
                        break;
                    case "t":
                        d = "w";
                        n++;
                        break;
                    case "w":
                        d = "th";
                        n++;
                        break;
                    case "th":
                        d = "f";
                        n++;
                        break;
                    case "f":
                        d = "sa";
                        n++;
                        break;
                    case "sa":
                        d = "s";
                        n++;
                        break;
                    case "s":
                        d = "m";
                        n++;
                        break;
                }
            }

            if (d.equals("f") && ans.equals("ly") && leapyear(n)) {
                break;
            } else if (d.equals("f") && ans.equals("nly") && !leapyear(n)) {
                break;
            }
        }

        System.out.println(n);
    }

    public static boolean leapyear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}
``` <｜end▁of▁sentence｜>
