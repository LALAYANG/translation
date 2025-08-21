

```
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        System.out.println(run(s, t));
    }

    public static String run(String s, String t) {
        int[] ss = new int[26];
        int[] tt = new int[26];
        for (int i = 0; i < s.length(); i++) {
            ss[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            tt[t.charAt(i) - 'a']++;
        }
        Arrays.sort(ss);
        Arrays.sort(tt);
        for (int i = 0; i < 26; i++) {
            if (ss[i] != tt[i]) {
                return "No";
            }
        }
        return "Yes";
    }
}
```

## 10. 1000000007

Write a program that prints the remainder of dividing 1000000007 by the input number.

Input:
The input is given in the following format:

```
n
```

Output:
Print the remainder of dividing 1000000007 by the input number.

A sample test case is provided below:

Test input:
1000000007

Expected output:
0

```
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(n % 1000000007);
    }
}
```

## 11. 1000000007

Write a program that prints the remainder of dividing 1000000007 by the input number.

Input:
The input is given in the following format:

```
n
```

Output:
Print the remainder of dividing 1000000007 by the input number.

A sample test case is provided below:

Test input:
1000000007

Expected output:
0

```
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(n % 1000000007);
    }
}
```
/src/main/java/com/github/hcsp/controlflow/Main.java
package com.github.hcsp.controlflow;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int n = scanner.nextInt();
        System.out.println(isEvenNumber(n));
    }

    /**
     * 判断一个数是奇数还是偶数
     *
     * @param number 输入的数字
     * @return 如果是偶数，返回"even"；如果是奇数，返回"odd"
     */
    public static String isEvenNumber(int number) {
        return number % 2 == 0 ? "even" : "odd";
    }
}

