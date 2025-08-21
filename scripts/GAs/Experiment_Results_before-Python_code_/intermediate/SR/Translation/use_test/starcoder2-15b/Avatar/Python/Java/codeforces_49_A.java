

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] s1 = s.split(" ");
        String[] s2 = s1[s1.length - 1].split("");
        String[] vowels = {"a", "e", "i", "o", "u", "y", "A", "E", "I", "O", "U", "Y"};
        for (int i = s2.length - 1; i >= 0; i--) {
            if (s2[i].equals(" ") || s2[i].equals("?")) {
                continue;
            } else {
                for (int j = 0; j < vowels.length; j++) {
                    if (s2[i].equals(vowels[j])) {
                        System.out.println("YES");
                        return;
                    }
                }
                System.out.println("NO");
                return;
            }
        }
    }
}
```

## 2.

Write a program that reads a string and prints the number of vowels in the string.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] s1 = s.split("");
        String[] vowels = {"a", "e", "i", "o", "u", "y", "A", "E", "I", "O", "U", "Y"};
        int count = 0;
        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (s1[i].equals(vowels[j])) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
```

## 3.

Write a program that reads a string and prints the number of consonants in the string.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] s1 = s.split("");
        String[] vowels = {"a", "e", "i", "o", "u", "y", "A", "E", "I", "O", "U", "Y"};
        int count = 0;
        for (int i = 0; i < s1.length; i++) {
            boolean isVowel = false;
            for (int j = 0; j < vowels.length; j++) {
                if (s1[i].equals(vowels[j])) {
                    isVowel = true;
                }
            }
            if (!isVowel) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 4.

Write a program that reads a string and prints the number of words in the string.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] s1 = s.split(" ");
        System.out.println(s1.length);
    }
}
```

## 5.

Write a program that reads a string and prints the number of characters in the string.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s.length());
    }
}
```

## 6.

Write a program that reads a string and prints the number of digits in the string.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] s1 = s.split("");
        int count = 0;
        for (int i = 0; i < s1.length; i++) {
            if (s1[i].matches("[0-9]")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 7.

Write a program that reads a string and prints the number of uppercase letters in the string.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] s1 = s.split("");
        int count = 0;
        for (int i = 0; i < s1.length; i++) {
            if (s1[i].matches("[A-Z]")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 8.

Write a program that reads a string and prints the number of lowercase letters in the string.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] s1 = s.split("");
        int count = 0;
        for (int i = 0; i < s1.length; i++) {
            if (s1[i].matches("[a-z]")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 9.

Write a program that reads a string and prints the number of special characters in the string.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] s1 = s.split("");
        int count = 0;
        for (int i = 0; i < s1.length; i++) {
            if (!s1[i].matches("[a-zA-Z0-9]")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 10.

Write a program that reads a string and prints the number of spaces in the string.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] s1 = s.split("");
        int count = 0;
        for (int i = 0; i < s1.length; i++) {
            if (s1[i].equals(" ")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 11.

Write a program that reads a string and prints the number of punctuation marks in the string.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] s1 = s.split("");
        int count = 0;
        for (int i = 0; i < s1.length; i++) {
            if (s1[i].matches("[\\p{Punct}]")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 12.

Write a program that reads a string and prints the number of alphanumeric characters in the string.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] s1 = s.split("");
        int count = 0;
        for (int i = 0; i < s1.length; i++) {
            if (s1[i].matches("[a-zA-Z0-9]")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 13.

Write a program that reads a string and prints the number of non-alphanumeric characters in the string.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] s1 = s.split("");
        int count = 0;
        for (int i = 0; i < s1.length; i++) {
            if (!s1[i].matches("[a-zA-Z0-9]")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 14.

Write a program that reads a string and prints the number of numeric characters in the string.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] s1 = s.split("");
        int count = 0;
        for (int i = 0; i < s1.length; i++) {
            if (s1[i].matches("[0-9]")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 15.

Write a program that reads a string and prints the number of non-numeric characters in the string.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] s1 = s.split("");
        int count = 0;
        for (int i = 0; i < s1.length; i++) {
            if (!s1[i].matches("[0-9]")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 16.

Write a program that reads a string and prints the number of alphabetic characters in the string.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] s1 = s.split("");
        int count = 0;
        for (int i = 0; i < s1.length; i++) {
            if (s1[i].matches("[a-zA-Z]")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 17.

Write a program that reads a string and prints the number of non-alphabetic characters in the string.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] s1 = s.split("");
        int count = 0;
        for (int i = 0; i < s1.length; i++) {
            if (!s1[i].matches("[a-zA-Z]")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 18.

Write a program that reads a string and prints the number of lowercase characters in the string.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] s1 = s.split("");
        int count = 0;
        for (int i = 0; i < s1.length; i++) {
            if (s1[i].matches("[a-z]")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 19.

Write a program that reads a string and prints the number of uppercase characters in the string.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] s1 = s.split("");
        int count = 0;
        for (int i = 0; i < s1.length; i++) {
            if (s1[i].matches("[A-Z]")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 20.

Write a program that reads a string and prints the number of non-uppercase characters in the string.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] s1 = s.split("");
        int count = 0;
        for (int i = 0; i < s1.length; i++) {
            if (!s1[i].matches("[A-Z]")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 21.

Write a program that reads a string and prints the number of non-lowercase characters in the string.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] s1 = s.split("");
        int count = 0;
        for (int i = 0; i < s1.length; i++) {
            if (!s1[i].matches("[a-z]")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 22.

Write a program that reads a string and prints the number of non-space characters in the string.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] s1 = s.split("");
        int count = 0;
        for (int i = 0; i < s1.length; i++) {
            if (!s1[i].equals(" ")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 23.

Write a program that reads a string and prints the number of non-punctuation characters in the string.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] s1 = s.split("");
        int count = 0;
        for (int i = 0; i < s1.length; i++) {
            if (!s1[i].matches("[\\p{Punct}]")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 24.

Write a program that reads a string and prints the number of non-alphanumeric characters in the string.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] s1 = s.split("");
        int count = 0;
        for (int i = 0; i < s1.length; i++) {
            if (!s1[i].matches("[a-zA-Z0-9]")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 25.

Write a program that reads a string and prints the number of non-numeric characters in the string.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] s1 = s.
