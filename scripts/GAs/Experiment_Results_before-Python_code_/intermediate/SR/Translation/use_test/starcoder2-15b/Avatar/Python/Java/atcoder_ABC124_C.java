

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int even = 0, odd = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                if (s.charAt(i) == '0') {
                    even++;
                } else {
                    odd++;
                }
            } else {
                if (s.charAt(i) == '0') {
                    odd++;
                } else {
                    even++;
                }
            }
        }
        System.out.println(Math.min(even, odd));
    }
}
```

## 2.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string.

Test input:

```
bobbobbobbob
```

Expected output:

```
4
```

```java
import java.util.*;
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
        System.out.println(count);
    }
}
```

## 3.

Write a program that reads a string and prints the longest substring of the string that consists of the same letter.

Test input:

```
abbbccddddd
```

Expected output:

```
ddddd
```

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int max = 0;
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            int count = 1;
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                } else {
                    break;
                }
            }
            if (count > max) {
                max = count;
                ans = s.substring(i, i + count);
            }
        }
        System.out.println(ans);
    }
}
```

## 4.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string.

Test input:

```
bobbobbobbob
```

Expected output:

```
4
```

```java
import java.util.*;
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
        System.out.println(count);
    }
}
```

## 5.

Write a program that reads a string and prints the longest substring of the string that consists of the same letter.

Test input:

```
abbbccddddd
```

Expected output:

```
ddddd
```

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int max = 0;
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            int count = 1;
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                } else {
                    break;
                }
            }
            if (count > max) {
                max = count;
                ans = s.substring(i, i + count);
            }
        }
        System.out.println(ans);
    }
}
```

## 6.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string.

Test input:

```
bobbobbobbob
```

Expected output:

```
4
```

```java
import java.util.*;
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
        System.out.println(count);
    }
}
```

## 7.

Write a program that reads a string and prints the longest substring of the string that consists of the same letter.

Test input:

```
abbbccddddd
```

Expected output:

```
ddddd
```

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int max = 0;
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            int count = 1;
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                } else {
                    break;
                }
            }
            if (count > max) {
                max = count;
                ans = s.substring(i, i + count);
            }
        }
        System.out.println(ans);
    }
}
```

## 8.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string.

Test input:

```
bobbobbobbob
```

Expected output:

```
4
```

```java
import java.util.*;
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
        System.out.println(count);
    }
}
```

## 9.

Write a program that reads a string and prints the longest substring of the string that consists of the same letter.

Test input:

```
abbbccddddd
```

Expected output:

```
ddddd
```

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int max = 0;
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            int count = 1;
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                } else {
                    break;
                }
            }
            if (count > max) {
                max = count;
                ans = s.substring(i, i + count);
            }
        }
        System.out.println(ans);
    }
}
```

## 10.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string.

Test input:

```
bobbobbobbob
```

Expected output:

```
4
```

```java
import java.util.*;
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
        System.out.println(count);
    }
}
```


```

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = i; j < n; j++) {
                if (a[j] == 0) {
                    count++;
                } else {
                    break;
                }
            }
            max = Math.max(max, count);
        }
        System.out.println(max);
    }
}
```

## 10.

Write a program that reads an array of integers and prints the number of times that the number 0 appears in the array.

Test input:

```
10
1 0 0 0 0 0 0 0 0 0
```

Expected output:

```
9
```

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```
/01-arrays/01-arrays.md
# Arrays

## 1.

Write a program that reads an array of integers and prints the number of times that the number 0 appears in the array.

Test input:

```
10
1 0 0 0 0 0 0 0 0 0
```

Expected output:

```
9
```

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 2.

Write a program that reads an array of integers and prints the number of times that the number 0 appears in the array.

Test input:

```
10
1 0 0 0 0 0 0 0 0 0
```

Expected output:

```
9
```

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 3.

Write a program that reads an array of integers and prints the number of times that the number 0 appears in the array.

Test input:

```
10
1 0 0 0 0 0 0 0 0 0
```

Expected output:

```
9
```

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 4.

Write a program that reads an array of integers and prints the number of times that the number 0 appears in the array.

Test input:

```
10
1 0 0 0 0 0 0 0 0 0
```

Expected output:

```
9
```

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 5.

Write a program that reads an array of integers and prints the number of times that the number 0 appears in the array.

Test input:

```
10
1 0 0 0 0 0 0 0 0 0
```

Expected output:

```
9
```

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 6.

Write a program that reads an array of integers and prints the number of times that the number 0 appears in the array.

Test input:

```
10
1 0 0 0 0 0 0 0 0 0
```

Expected output:

```
9
```

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 7.

Write a program that reads an array of integers and prints the number of times that the number 0 appears in the array.

Test input:

```
10
1 0 0 0 0 0 0 0 0 0
```

Expected output:

```
9
```

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
       
