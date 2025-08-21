Thought process:
1. Implement the `leapyear` function to check if a year is a leap year.
2. Read the input integer `n`.
3. Initialize variables `d` and `ans`.
4. Use a while loop to iterate until the condition is met.
5. Update the day of the week based on the conditions.
6. Check if the conditions for the final output are met.
7. Print the final output.

```java
public class Main {
    public static String leapyear(int n) {
        if (n % 400 == 0 || (n % 4 == 0 && n % 100 != 0)) {
            return "y";
        } else {
            return "n";
        }
    }

    public static void main(String[] args) {
        int n = 12345;
        String d = "f";
        String ans = "nly";

        while (true) {
            if (leapyear(n) == "y") {
                if (d == "m") {
                    d = "w";
                    n++;
                } else if (d == "t") {
                    d = "th";
                    n++;
                } else if (d == "w") {
                    d = "f";
                    n++;
                } else if (d == "th") {
                    d = "sa";
                    n++;
                } else if (d == "f") {
                    d = "s";
                    n++;
                } else if (d == "sa") {
                    d = "m";
                    n++;
                } else if (d == "s") {
                    d = "t";
                    n++;
                }
            } else {
                if (d == "m") {
                    d = "t";
                    n++;
                } else if (d == "t") {
                    d = "w";
                    n++;
                } else if (d == "w") {
                    d = "th";
                    n++;
                } else if (d == "th") {
                    d = "f";
                    n++;
                } else if (d == "f") {
                    d = "sa";
                    n++;
                } else if (d == "sa") {
                    d = "s";
                    n++;
                } else if (d == "s") {
                    d = "m";
                    n++;
                }
            }

            if (d == "f" && ans == "ly" && leapyear(n) == "y") {
                break;
            } else if (d == "f" && ans == "nly" && leapyear(n) == "n") {
                break;
            }
        }

        System.out.println(n);
    }
}
```
