

```java
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        int ans = 1, sumL = 0;
        String[] strs = Pattern.compile("[.?!]").split(s);
        for (String str : strs) {
            str = str.trim() + ".";
            int L = str.length();
            if (L > 1) {
                if (L > n) {
                    System.out.println("Impossible");
                    return;
                }
                if (sumL + L + (sumL > 0) > n) {
                    ans++;
                    sumL = L;
                } else {
                    sumL = sumL + L + (sumL > 0);
                }
            }
        }
        System.out.println(ans);
    }
}

```


```

Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}

```
/src/main/java/com/github/hcsp/controlflow/Main.md
# 统计一个给定的字符串中，大写字母出现的次数。

请提交一个Pull Request，在Main中完成统计一个给定的字符串中，大写字母出现的次数。

在提交Pull Request之前，你应当在本地确保所有代码已经编译通过，并且通过了测试(`mvn clean verify`)

-----
注意！我们只允许你修改以下文件，对其他文件的修改会被拒绝：
- [src/main/java/com/github/hcsp/controlflow/Main.java](../../../../../main/java/com/github/hcsp/controlflow/Main.java)
-----


## 题目描述

请提交一个Pull Request，在Main中完成统计一个给定的字符串中，大写字母出现的次数。

在提交Pull Request之前，你应当在本地确保所有代码已经编译通过，并且通过了测试(`mvn clean verify`)

-----
注意！我们只允许你修改以下文件，对其他文件的修改会被拒绝：
- [src/main/java/com/github/hcsp/controlflow/Main.java](../../../../../main/java/com/github/hcsp/controlflow/Main.java)
-----


# 统计一个给定的字符串中，大写字母出现的次数。

请提交一个Pull Request，在Main中完成统计一个给定的字符串中，大写字母出现的次数。

在提交Pull Request之前，你应当在本地确保所有代码已经编译通过，并且通过了测试(`mvn clean verify`)

-----
注意！我们只允许你修改以下文件，对其他文件的修改会被拒绝：
- [src/main/java/com/github/hcsp/controlflow/Main.java](../../../../../main/java/com/github/hcsp/controlflow/Main.java)
-----


## 题目描述

请提交一个Pull Request，在Main中完成统计一个给定的字符串中，大写字母出现的次数。

在提交Pull Request之前，你应当在本地确保所有代码已经编译通过，并且通过了测试(`mvn clean verify`)

-----
注意！我们只允许你修改以下文件，对其他文件的修改会被拒绝：
- [src/main/java/com/github/hcsp/controlflow/Main.java](../../../../../main/java/com/github/hcsp/controlflow/Main.java)
-----


# 统计一个给定的字符串中，大写字母出现的次数。

请提交一个Pull Request，在Main中完成统计一个给定的字符串中，大写字母出现的次数。

在提交Pull Request之前，你应当在本地确保所有代码已经编译通过，并且通过了测试(`mvn clean verify`)

-----
注意！我们只允许你修改以下文件，对其他文件的修改会被拒绝：
- [src/main/java/com/github/hcsp/controlflow/Main.java](../../../../../main/java/com/github/hcsp/controlflow/Main.java)
-----


## 题目描述

请提交一个Pull Request，在Main中完成统计一个给定的字符串中，大写字母出现的次数。

在提交Pull Request之前，你应当在本地确保所有代码已经编译通过，并且通过了测试(`mvn clean verify`)

-----
注意！我们只允许你修改以下文件，对其他文件的修改会被拒绝：
- [src/main/java/com/github/hcsp/controlflow/Main.java](../../../../../main/java/com/github/hcsp/controlflow/Main.java)
-----


# 统计一个给定的字符串中，大写字母出现的次数。

请提交一个Pull Request，在Main中完成统计一个给定的字符串中，大写字母出现的次数。

在提交Pull Request之前，你应当在本地确保所有代码已经编译通过，并且通过了测试(`mvn clean verify`)

-----
注意！我们只允许你修改以下文件，对其他文件的修改会被拒绝：
- [src/main/java/com/github/hcsp/controlflow/Main.java](../../../../../main/java/com/github/hcsp/controlflow/Main.java)
-----


## 题目描述

请提交一个Pull Request，在Main中完成统计一个给定的字符串中，大写字母出现的次数。

在提交Pull Request之前，你应当在本地确保所有代码已经编译通过，并且通过了测试(`mvn clean verify`)

-----
注意！我们只允许你修改以下文件，对其他文件的修改会被拒绝：
- [src/main/java/com/github/hcsp/controlflow/Main.java](../../../../../main/java/com/github/hcsp/controlflow/Main.java)
-----


# 统计一个给定的字符串中，大写字母出现的次数。

请提交一个Pull Request，在Main中完成统计一个给定的字符串中，大写字母出现的次数。

在提交Pull Request之前，你应当在本地确保所有代码已经编译通过，并且通过了测试(`mvn clean verify`)

-----
注意！我们只允许你修改以下文件，对其他文件的修改会被拒绝：
- [src/main/java/com/github/hcsp/controlflow/Main.java](../../../../../main/java/com/github/hcsp/controlflow/Main.java)
-----


## 题目描述

请提交一个Pull Request，在Main中完成统计一个给定的字符串中，大写字母出现的次数。

在提交Pull Request之前，你应当在本地确保所有代码已经编译通过，并且通过了测试(`mvn clean verify`)

-----
注意！我们只允许你修改以下文件，对其他文件的修改会被拒绝：
- [src/main/java/com/github/hcsp/controlflow/Main.java](../../../../../main/java/com/github/hcsp/controlflow/Main.java)
-----


# 统计一个给定的字符串中，大写字母出现的次数。

请提交一个Pull Request，在Main中完成统计一个给定的字符串中，大写字母出现的次数。

在提交Pull Request之前，你应当在本地确保所有代码已经编译通过，并且通过了测试(`mvn clean verify`)

-----
注意！我们只允许你修改以下文件，对其他文件的修改会被拒绝：
- [src/main/java/com/github/hcsp/controlflow/Main.java](../../../../../main/java/com/github/hcsp/controlflow/Main.java)
-----


## 题目描述

请提交一个Pull Request，在Main中完成统计一个给定的字符串中，大写字母出现的次数。

在提交Pull Request之前，你应当在本地确保所有代码已经编译通过，并且通过了测试(`mvn clean verify`)

-----
注意！我们只允许你修改以下文件，对其他文件的修改会被拒绝：
- [src/main/java/com/github/hcsp/controlflow/Main.java](../../../../../main/java/com/github/hcsp/controlflow/Main.java)
-----


# 统计一个给定的字符串中，大写字母出现的次数。

请提交一个Pull Request，在Main中完成统计一个给定的字符串中，大写字母出现的次数。

在提交Pull Request之前，你应当在本地确保所有代码已经编译通过，并且通过了测试(`mvn clean verify`)

-----
注意！我们只允许你修改以下文件，对其他文件的修改会被拒绝：
- [src/main/java/com/github/hcsp/controlflow/Main.java](../../../../../main/java/com/github/hcsp/controlflow/Main.java)
-----


## 题目描述

请提交一个Pull Request，在Main中完成统计一个给定的字符串中，大写字母出现的次数。

在提交Pull Request之前，你应当在本地确保所有代码已经编译通过，并且通过了测试(`mvn clean verify`)

-----
注意！我们只允许你修改以下文件，对其他文件的修改会被拒绝：
- [src/main/java/com/github/hcsp/controlflow/Main.java](../../../../../main/java/com/github/hcsp/controlflow/Main.java)
-----


# 统计一个给定的字符串中，大写字母出现的次数。

请提交一个Pull Request，在Main中完成统计一个给定的字符串中，大写字母出现的次数。

在提交Pull Request之前，你应当在本地确保所有代码已经编译通过，并且通过了测试(`mvn clean verify`)

-----
注意！我们只允许你修改以下文件，对其他文件的修改会被拒绝：
- [src/main/java/com/github/hcsp/controlflow/Main.java](../../../../../main/java/com/github/hcsp/controlflow/Main.java)
-----


## 题目描述

请提交一个Pull Request，在Main中完成统计一个给定的字符串中，大写字母出现的次数。

在提交Pull Request之前，你应当在本地确保所有代码已经编译通过，并且通过了测试(`mvn clean verify`)

-----
注意！我们只允许你修改以下文件，对其他文件的修改会被拒绝：
- [src/main/java/com/github/hcsp/controlflow/Main.java](../../../../../main/java/com/github/hcsp/controlflow/Main.java)
-----


# 统计一个给定的字符串中，大写字母出现的次数。

请提交一个Pull Request，在Main中完成统计一个给定的字符串中，大写字母出现的次数。

在提交Pull Request之前，你应当在本地确保所有代码已经编译通过，并且通过了测试(`mvn clean verify`)

-----
注意！我们只允许你修改以下文件，对其他文件的修改会被拒绝：
- [src/main/java/com/github/hcsp/controlflow/Main.java](../../../../../main/java/com/github/hcsp/controlflow/Main.java)
-----


## 题目描述

请提交一个Pull Request，在Main中完成统计一个给定的字符串中，大写字母出现的次数。

在提交Pull Request之前，你应当在本地确保所有代码已经编译通过，并且通过了测试(`mvn clean verify`)

-----
注意！我们只允许你修改以下文件，对其他文件的修改会被拒绝：
- [src/main/java/com/github/hcsp/controlflow/Main.java](../../../../../main/java/com/github/hcsp/controlflow/Main.java)
-----


# 统计一个给定的字符串中，大写字母出现的次数。

请提交一个Pull Request，在Main中完成统计一个给定的字符串中，大写字母出现的次数。

在提交Pull Request之前，你应当在本地确保所有代码已经编译通过，并且通过了测试(`mvn clean verify`)

-----
注意！我们只允许你修改以下文件，对其他文件的修改会被拒绝：
- [src/main/java/com/github/hcsp/controlflow/Main.java](../../../../../main/java/com/github/hcsp/controlflow/Main.java)
-----


## 题目描述

请提交一个Pull Request，在Main中完成统计一个给定的字符串中，大写字母出现的次数。

在提交Pull Request之前，你应当在本地确保所有代码已经编译通过，并且通过了测试(`mvn clean verify`)

-----
注意！我们只允许你修改以下文件，对其他文件的修改会被拒绝：
- [src/main/java/com/github/hcsp/controlflow/Main.java](../../../../../main/java/com/github/hcsp/controlflow/Main.java)
-----


# 统计一个给定的字符串中，大写字母出现的次数。

请提交一个Pull Request，在Main中完成统计一个给定的字符串中，大写字母出现的次数。

在提交Pull Request之前，你应当在本地确保所有代码已经编译通过，并且通过了测试(`mvn clean verify`)

-----
注意！我们只允许你修改以下文件，对其他文件的修改会被拒绝：
- [src/main/java/com/github/hcsp/controlflow/Main.java](../../../../../main/java/com/github/hcsp/controlflow/Main.java)
-----


## 题目描述

请提交一个Pull Request，在Main中完成统计一个给定的字符串中，大写字母出现的次数。

在提交Pull Request之前，你应当在本地确保所有代码已经编译通过，并且通过了测试(`mvn clean verify`)

-----
注意！我们只允许你修改以下文件，对其他文件的修改会被拒绝：
- [src/main/java/com/github/hcsp/controlflow/Main.java](../../../../../main/java/com/github/hcsp/controlflow/Main.java)
-----


# 统计一个给定的字符串中，大写字母出现的次数。

请提交一个Pull Request，在Main中完成统计一个给定的字符串中，大写字母出现的次数。

在提交Pull Request之前，你应当在本地确保所有代码已经编译通过，并且通过了测试(`mvn clean verify`)

-----
注意！我们只允许你修改以下文件，对其他文件的修改会被拒绝：
- [src/main/java/com/github/hcsp/controlflow/Main.java](../../../../../main/java/com/github/hcsp/controlflow/Main.java)
-----


## 题目描述

请提交一个Pull Request，在Main中完成统计一个给定的字符串中，大写字母出现的次数。

在提交Pull Request之前，你应当在本地确保所有代码已经编译通过，并且通过了测试(`mvn
