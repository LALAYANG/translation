

```java
import java.util.Scanner;
import java.util.HashSet;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        HashSet<Integer> c = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            int indexG = s.indexOf("G");
            int indexS = s.indexOf("S");
            c.add(indexS - indexG);
        }
        if (c.contains(-1)) {
            System.out.println(-1);
        } else {
            System.out.println(c.size());
        }
    }
}
```


```

Java code:

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            for (int j = 0; j < m; j++) {
                a[i][j] = s.charAt(j) - '0';
            }
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] == 1) {
                    if (i == 0 || a[i - 1][j] == 0) {
                        count++;
                    }
                    if (j == 0 || a[i][j - 1] == 0) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
```

## 3. 1000000007

```

```

Java code:

```java

```

## 4. 1000000007

```

```

Java code:

```java

```

## 5. 1000000007

```

```

Java code:

```java

```

## 6. 1000000007

```

```

Java code:

```java

```

## 7. 1000000007

```

```

Java code:

```java

```

## 8. 1000000007

```

```

Java code:

```java

```

## 9. 1000000007

```

```

Java code:

```java

```

## 10. 1000000007

```

```

Java code:

```java

```
/README.md
# Codeforces Round #500 (Div. 2)

## 1. 1000000007

```

```

Java code:

```java

```

## 2. 1000000007

```

```

Java code:

```java

```

## 3. 1000000007

```

```

Java code:

```java

```

## 4. 1000000007

```

```

Java code:

```java

```

## 5. 1000000007

```

```

Java code:

```java

```

## 6. 1000000007

```

```

Java code:

```java

```

## 7. 1000000007

```

```

Java code:

```java

```

## 8. 1000000007

```

```

Java code:

```java

```

## 9. 1000000007

```

```

Java code:

```java

```

## 10. 1000000007

```

```

Java code:

```java

```

# Codeforces Round #501 (Div. 2)

## 1. 1000000007

```

```

Java code:

```java

```

## 2. 1000000007

```

```

Java code:

```java

```

## 3. 1000000007

```

```

Java code:

```java

```

## 4. 1000000007

```

```

Java code:

```java

```

## 5. 1000000007

```

```

Java code:

```java

```

## 6. 1000000007

```

```

Java code:

```java

```

## 7. 1000000007

```

```

Java code:

```java

```

## 8. 1000000007

```

```

Java code:

```java

```

## 9. 1000000007

```

```

Java code:

```java

```

## 10. 1000000007

```

```

Java code:

```java

```

# Codeforces Round #502 (Div. 2)

## 1. 1000000007

```

```

Java code:

```java

```

## 2. 1000000007

```

```

Java code:

```java

```

## 3. 1000000007

```

```

Java code:

```java

```

## 4. 1000000007

```

```

Java code:

```java

```

## 5. 1000000007

```

```

Java code:

```java

```

## 6. 1000000007

```

```

Java code:

```java

```

## 7. 1000000007

```

```

Java code:

```java

```

## 8. 1000000007

```

```

Java code:

```java

```

## 9. 1000000007

```

```

Java code:

```java

```

## 10. 1000000007

```

```

Java code:

```java

```

# Codeforces Round #503 (Div. 2)

## 1. 1000000007

```

```

Java code:

```java

```

## 2. 1000000007

```

```

Java code:

```java

```

## 3. 1000000007

```

```

Java code:

```java

```

## 4. 1000000007

```

```

Java code:

```java

```

## 5. 1000000007

```

```

Java code:

```java

```

## 6. 1000000007

```

```

Java code:

```java

```

## 7. 1000000007

```

```

Java code:

```java

```

## 8. 1000000007

```

```

Java code:

```java

```

## 9. 1000000007

```

```

Java code:

```java

```

## 10. 1000000007

```

```

Java code:

```java

```

# Codeforces Round #504 (Div. 2)

## 1. 1000000007

```

```

Java code:

```java

```

## 2. 1000000007

```

```

Java code:

```java

```

## 3. 1000000007

```

```

Java code:

```java

```

## 4. 1000000007

```

```

Java code:

```java

```

## 5. 1000000007

```

```

Java code:

```java

```

## 6. 1000000007

```

```

Java code:

```java

```

## 7. 1000000007

```

```

Java code:

```java

```

## 8. 1000000007

```

```

Java code:

```java

```

## 9. 1000000007

```

```

Java code:

```java

```

## 10. 1000000007

```

```

Java code:

```java

```

# Codeforces Round #505 (Div. 2)

## 1. 1000000007

```

```

Java code:

```java

```

## 2. 1000000007

```

```

Java code:

```java

```

## 3. 1000000007

```

```

Java code:

```java

```

## 4. 1000000007

```

```

Java code:

```java

```

## 5. 1000000007

```

```

Java code:

```java

```

## 6. 1000000007

```

```

Java code:

```java

```

## 7. 1000000007

```

```

Java code:

```java

```

## 8. 1000000007

```

```

Java code:

```java

```

## 9. 1000000007

```

```

Java code:

```java

```

## 10. 1000000007

```

```

Java code:

```java

```

# Codeforces Round #506 (Div. 2)

## 1. 1000000007

```

```

Java code:

```java

```

## 2. 1000000007

```

```

Java code:

```java

```

## 3. 1000000007

```

```

Java code:

```java

```

## 4. 1000000007

```

```

Java code:

```java

```

## 5. 1000000007

```

```

Java code:

```java

```

## 6. 1000000007

```

```

Java code:

```java

```

## 7. 1000000007

```

```

Java code:

```java

```

## 8. 1000000007

```

```

Java code:

```java

```

## 9. 1000000007

```

```

Java code:

```java

```

## 10. 1000000007

```

```

Java code:

```java

```

# Codeforces Round #507 (Div. 2)

## 1. 1000000007

```

```

Java code:

```java

```

## 2. 1000000007

```

```

Java code:

```java

```

## 3. 1000000007

```

```

Java code:

```java

```

## 4. 1000000007

```

```

Java code:

```java

```

## 5. 1000000007

```

```

Java code:

```java

```

## 6. 1000000007

```

```

Java code:

```java

```

## 7. 1000000007

```

```

Java code:

```java

```

## 8. 1000000007

```

```

Java code:

```java

```

## 9. 1000000007

```

```

Java code:

```java

```

## 10. 1000000007

```

```

Java code:

```java

```

# Codeforces Round #508 (Div. 2)

## 1. 1000000007

```

```

Java code:

```java

```

## 2. 1000000007

```

```

Java code:

```java

```

## 3. 1000000007

```

```

Java code:

```java

```

## 4. 1000000007

```

```

Java code:

```java

```

## 5. 1000000007

```

```

Java code:

```java

```

## 6. 1000000007

```

```

Java code:

```java

```

## 7. 1000000007

```

```

Java code:

```java


