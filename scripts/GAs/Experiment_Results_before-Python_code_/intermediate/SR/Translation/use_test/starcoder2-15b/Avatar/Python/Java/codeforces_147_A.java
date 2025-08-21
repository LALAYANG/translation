

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] res = new String[s.length()];
        String[] punctuation = {",", ".", "!", "?"};
        for (int i = 0; i < s.length(); i++) {
            if (i >= 1) {
                if (s.charAt(i) == ' ') {
                    if (res[i - 1] != "") {
                        res[i] = s.charAt(i) + "";
                    } else {
                        continue;
                    }
                } else {
                    if (s.charAt(i) == punctuation[0] || s.charAt(i) == punctuation[1] || s.charAt(i) == punctuation[2] || s.charAt(i) == punctuation[3]) {
                        if (res[i - 1] == "") {
                            res[i - 1] = "";
                        }
                        res[i] = s.charAt(i) + "";
                        res[i + 1] = "";
                    } else {
                        res[i] = s.charAt(i) + "";
                    }
                }
            } else {
                if (s.charAt(i) == ' ') {
                    continue;
                }
                if (s.charAt(i) == punctuation[0] || s.charAt(i) == punctuation[1] || s.charAt(i) == punctuation[2] || s.charAt(i) == punctuation[3]) {
                    continue;
                } else {
                    res[i] = s.charAt(i) + "";
                }
            }
        }
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]);
        }
    }
}

```

## 3.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string, so for example, if the input is:

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
            if (s.charAt(i) == 'b' && s.charAt(i + 1) == 'o' && s.charAt(i + 2) == 'b') {
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
        String res = "";
        String temp = "";
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) <= s.charAt(i + 1)) {
                temp += s.charAt(i);
            } else {
                temp += s.charAt(i);
                if (temp.length() > res.length()) {
                    res = temp;
                }
                temp = "";
            }
        }
        temp += s.charAt(s.length() - 1);
        if (temp.length() > res.length()) {
            res = temp;
        }
        System.out.println("Longest substring in alphabetical order is: " + res);
    }
}

```


```

## 3.

Write a program that asks the user to enter a string and prints the number of vowels in the string.

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter a string:

```

```
Number of vowels:

```

```
Enter
