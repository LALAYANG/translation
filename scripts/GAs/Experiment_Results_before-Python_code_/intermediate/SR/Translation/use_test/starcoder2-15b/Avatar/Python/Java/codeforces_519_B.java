

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
        }
        int x = 0;
        int y = 0;
        int z = 0;
        for (int i = 0; i < n; i++) {
            x += a[i];
        }
        for (int i = 0; i < n; i++) {
            y += b[i];
        }
        for (int i = 0; i < n; i++) {
            z += c[i];
        }
        System.out.println(Math.abs(x - y));
        System.out.println(Math.abs(y - z));
    }
}

```
/src/main/java/com/github/hcsp/controlflow/Main.java
package com.github.hcsp.controlflow;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 统计给定字符串中，大写英文字母（A,B,C,...,Z）、小写英文字母（a,b,c,...,z）、数字（0,1,2,...,9）和其他字符的个数。
        String str = scanner.nextLine();
        int upperCase = 0;
        int lowerCase = 0;
        int digit = 0;
        int other = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                upperCase++;
            } else if (c >= 'a' && c <= 'z') {
                lowerCase++;
            } else if (c >= '0' && c <= '9') {
                digit++;
            } else {
                other++;
            }
        }
        System.out.println("大写英文字母有：" + upperCase + "个");
        System.out.println("小写英文字母有：" + lowerCase + "个");
        System.out.println("数字有：" + digit + "个");
        System.out.println("其他字符有：" + other + "个");
    }
}

