

```java
import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String record_of_movements = sc.nextLine();
        int x = 0, y = 0;
        HashMap<String, int[]> d_movement = new HashMap<String, int[]>();
        d_movement.put("L", new int[] {0, -1});
        d_movement.put("R", new int[] {0, 1});
        d_movement.put("U", new int[] {1, 0});
        d_movement.put("D", new int[] {-1, 0});
        HashMap<String, String> d = new HashMap<String, String>();
        boolean bug = false;
        for (char move : record_of_movements.toCharArray()) {
            int[] temp = {x, y};
            x += d_movement.get(String.valueOf(move))[0];
            y += d_movement.get(String.valueOf(move))[1];
            if (!d.containsKey(x + "," + y)) {
                for (String step : d_movement.keySet()) {
                    if (x + d_movement.get(step)[0] != temp[0] && y + d_movement.get(step)[1] != temp[1] && d.containsKey((x + d_movement.get(step)[0]) + "," + (y + d_movement.get(step)[1]))) {
                        bug = true;
                        break;
                    }
                }
            } else {
                bug = true;
            }
            if (bug) {
                break;
            }
            d.put(x + "," + y, "");
        }
        if (bug) {
            System.out.println("BUG");
        } else {
            System.out.println("OK");
        }
    }
}
```

## 3. 
Write a program that reads a string and prints the number of times that the string "bob" occurs in the given string, so for example, if the input is:

```
azcbobobegghakl
```

Then your program should print:

```
Number of times bob occurs is: 2
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.substring(i, i + 3).equals("bob")) {
                count++;
            }
        }
        System.out.println("Number of times bob occurs is: " + count);
    }
}
```

## 4. 
Write a program that prints the longest substring of s in which the letters occur in alphabetical order. For example, if s = 'azcbobobegghakl', then your program should print:

```
Longest substring in alphabetical order is: beggh
```

In the case of ties, print the first substring. For example, if s = 'abcbcd', then your program should print:

```
Longest substring in alphabetical order is: abc
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String longest = "";
        String current = "";
        for (int i = 0; i < s.length(); i++) {
            if (i == 0) {
                current = s.substring(i, i + 1);
            } else {
                if (s.charAt(i) >= s.charAt(i - 1)) {
                    current += s.substring(i, i + 1);
                } else {
                    if (current.length() > longest.length()) {
                        longest = current;
                    }
                    current = s.substring(i, i + 1);
                }
            }
        }
        if (current.length() > longest.length()) {
            longest = current;
        }
        System.out.println("Longest substring in alphabetical order is: " + longest);
    }
}
```

## 5. 
Write a program that asks the user to enter a string (any string) and then prints out whether this string is a palindrome or not. If the string is a palindrome, print out, "Yes", and if not, print out, "No".

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean isPalindrome = true;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```
/Week 1/Week 1.md
# Week 1

## 1. 
Write a program that does the following in order:

- Asks the user to enter a number "x"
- Asks the user to enter a number "y"
- Prints out number "x", raised to the power "y".
- Prints out log (base 2) of "x".

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(Math.pow(x, y));
        System.out.println(Math.log(x) / Math.log(2));
    }
}
```

## 2. 
Write a program that prints the sum of all the even numbers from 2 to 1000.

```java
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 2; i <= 1000; i += 2) {
            sum += i;
        }
        System.out.println(sum);
    }
}
```

## 3. 
Write a program that asks the user to enter a number "x", and prints the sum of all the even numbers from 2 to "x" (inclusive).

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int sum = 0;
        for (int i = 2; i <= x; i += 2) {
            sum += i;
        }
        System.out.println(sum);
    }
}
```

## 4. 
Write a program that asks the user to enter a number "x", and prints the sum of all the odd numbers from 1 to "x" (inclusive).

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= x; i += 2) {
            sum += i;
        }
        System.out.println(sum);
    }
}
```

## 5. 
Write a program that asks the user to enter a number "x", and prints the sum of all the multiples of 3 from 1 to "x" (inclusive).

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= x; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 6. 
Write a program that asks the user to enter a number "x", and prints the sum of all the multiples of 4 from 1 to "x" (inclusive).

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= x; i++) {
            if (i % 4 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 7. 
Write a program that asks the user to enter a number "x", and prints the sum of all the multiples of 5 from 1 to "x" (inclusive).

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= x; i++) {
            if (i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 8. 
Write a program that asks the user to enter a number "x", and prints the sum of all the multiples of 7 from 1 to "x" (inclusive).

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= x; i++) {
            if (i % 7 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 9. 
Write a program that asks the user to enter a number "x", and prints the sum of all the multiples of 11 from 1 to "x" (inclusive).

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= x; i++) {
            if (i % 11 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 10. 
Write a program that asks the user to enter a number "x", and prints the sum of all the multiples of 13 from 1 to "x" (inclusive).

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= x; i++) {
            if (i % 13 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 11. 
Write a program that asks the user to enter a number "x", and prints the sum of all the multiples of 17 from 1 to "x" (inclusive).

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= x; i++) {
            if (i % 17 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 12. 
Write a program that asks the user to enter a number "x", and prints the sum of all the multiples of 19 from 1 to "x" (inclusive).

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= x; i++) {
            if (i % 19 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 13. 
Write a program that asks the user to enter a number "x", and prints the sum of all the multiples of 23 from 1 to "x" (inclusive).

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= x; i++) {
            if (i % 23 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 14. 
Write a program that asks the user to enter a number "x", and prints the sum of all the multiples of 29 from 1 to "x" (inclusive).

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= x; i++) {
            if (i % 29 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 15. 
Write a program that asks the user to enter a number "x", and prints the sum of all the multiples of 31 from 1 to "x" (inclusive).

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= x; i++) {
            if (i % 31 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 16. 
Write a program that asks the user to enter a number "x", and prints the sum of all the multiples of 37 from 1 to "x" (inclusive).

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= x; i++) {
            if (i % 37 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 17. 
Write a program that asks the user to enter a number "x", and prints the sum of all the multiples of 41 from 1 to "x" (inclusive).

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= x; i++) {
            if (i % 41 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 18. 
Write a program that asks the user to enter a number "x", and prints the sum of all the
