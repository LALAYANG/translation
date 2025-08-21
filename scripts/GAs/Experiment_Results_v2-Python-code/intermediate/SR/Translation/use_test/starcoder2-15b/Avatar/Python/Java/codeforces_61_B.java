

```java
import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            String s1 = s.replaceAll("[^a-zA-Z]", "");
            String s2 = s1.toLowerCase();
            System.out.println(s2);
        }
    }
}
```

## 2.

Write a program that reads a string and prints the number of times that the string a occurs in it, not overlapping.

For example, if the string is abaaba, there are two occurrences of a.

```
Sample Input:
abaaba

Sample Output:
2
```

```java
import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 3.

Write a program that reads a string and prints the number of times that the string a occurs in it, overlapping.

For example, if the string is abaaba, there are three occurrences of a.

```
Sample Input:
abaaba

Sample Output:
3
```

```java
import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 4.

Write a program that reads a string and prints the number of times that the string hi occurs in it, not overlapping.

For example, if the string is abhiabhihi, there are two occurrences of hi.

```
Sample Input:
abhiabhihi

Sample Output:
2
```

```java
import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == 'h' && s.charAt(i + 1) == 'i') {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 5.

Write a program that reads a string and prints the number of times that the string hi occurs in it, overlapping.

For example, if the string is abhiabhihi, there are three occurrences of hi.

```
Sample Input:
abhiabhihi

Sample Output:
3
```

```java
import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == 'h' && s.charAt(i + 1) == 'i') {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 6.

Write a program that reads a string and prints the number of times that the string xyz occurs in it, not overlapping.

For example, if the string is abcxyzxyzxyz, there are two occurrences of xyz.

```
Sample Input:
abcxyzxyzxyz

Sample Output:
2
```

```java
import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.charAt(i) == 'x' && s.charAt(i + 1) == 'y' && s.charAt(i + 2) == 'z') {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 7.

Write a program that reads a string and prints the number of times that the string xyz occurs in it, overlapping.

For example, if the string is abcxyzxyzxyz, there are three occurrences of xyz.

```
Sample Input:
abcxyzxyzxyz

Sample Output:
3
```

```java
import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.charAt(i) == 'x' && s.charAt(i + 1) == 'y' && s.charAt(i + 2) == 'z') {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 8.

Write a program that reads a string and prints the number of times that the string xyz occurs in it, not overlapping.

For example, if the string is abcxyzxyzxyz, there are two occurrences of xyz.

```
Sample Input:
abcxyzxyzxyz

Sample Output:
2
```

```java
import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.charAt(i) == 'x' && s.charAt(i + 1) == 'y' && s.charAt(i + 2) == 'z') {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 9.

Write a program that reads a string and prints the number of times that the string xyz occurs in it, overlapping.

For example, if the string is abcxyzxyzxyz, there are three occurrences of xyz.

```
Sample Input:
abcxyzxyzxyz

Sample Output:
3
```

```java
import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.charAt(i) == 'x' && s.charAt(i + 1) == 'y' && s.charAt(i + 2) == 'z') {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 10.

Write a program that reads a string and prints the number of times that the string xyz occurs in it, not overlapping.

For example, if the string is abcxyzxyzxyz, there are two occurrences of xyz.

```
Sample Input:
abcxyzxyzxyz

Sample Output:
2
```

```java
import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.charAt(i) == 'x' && s.charAt(i + 1) == 'y' && s.charAt(i + 2) == 'z') {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 11.

Write a program that reads a string and prints the number of times that the string xyz occurs in it, overlapping.

For example, if the string is abcxyzxyzxyz, there are three occurrences of xyz.

```
Sample Input:
abcxyzxyzxyz

Sample Output:
3
```

```java
import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.charAt(i) == 'x' && s.charAt(i + 1) == 'y' && s.charAt(i + 2) == 'z') {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 12.

Write a program that reads a string and prints the number of times that the string xyz occurs in it, not overlapping.

For example, if the string is abcxyzxyzxyz, there are two occurrences of xyz.

```
Sample Input:
abcxyzxyzxyz

Sample Output:
2
```

```java
import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.charAt(i) == 'x' && s.charAt(i + 1) == 'y' && s.charAt(i + 2) == 'z') {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 13.

Write a program that reads a string and prints the number of times that the string xyz occurs in it, overlapping.

For example, if the string is abcxyzxyzxyz, there are three occurrences of xyz.

```
Sample Input:
abcxyzxyzxyz

Sample Output:
3
```

```java
import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.charAt(i) == 'x' && s.charAt(i + 1) == 'y' && s.charAt(i + 2) == 'z') {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 14.

Write a program that reads a string and prints the number of times that the string xyz occurs in it, not overlapping.

For example, if the string is abcxyzxyzxyz, there are two occurrences of xyz.

```
Sample Input:
abcxyzxyzxyz

Sample Output:
2
```

```java
import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.charAt(i) == 'x' && s.charAt(i + 1) == 'y' && s.charAt(i + 2) == 'z') {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 15.

Write a program that reads a string and prints the number of times that the string xyz occurs in it, overlapping.

For example, if the string is abcxyzxyzxyz, there are three occurrences of xyz.

```
Sample Input:
abcxyzxyzxyz

Sample Output:
3
```

```java
import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.charAt(i) == 'x' && s.charAt(i + 1) == 'y' && s.charAt(i + 2) == 'z') {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 16.

Write a program that reads a string and prints the number of times that the string xyz occurs in it, not overlapping.

For example, if the string is abcxyzxyzxyz, there are two occurrences of xyz.

```
Sample Input:
abcxyzxyzxyz

Sample Output:
2
```

```java
import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.charAt(i) == 'x' && s.charAt(i + 1) == 'y' && s.charAt(i + 2) == 'z') {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 17.

Write a program that reads a string and prints the number of times that
