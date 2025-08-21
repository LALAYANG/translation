

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                count++;
            }
        }
        if (count == 0) {
            System.out.println(0);
        } else {
            int[] arr = new int[count];
            int j = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') {
                    arr[j]++;
                } else {
                    j++;
                }
            }
            int result = 1;
            for (int i = 0; i < arr.length; i++) {
                result *= arr[i] + 1;
            }
            System.out.println(result);
        }
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
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                count++;
            }
        }
        System.out.println(count);
    }
}

```
/src/main/java/com/github/hcsp/controlflow/Main.md
# 统计一个给定的字符串中，大写英文字母（A,B,C,...,Z）出现的次数。

在提交Pull Request之前，你应当在本地确保所有代码已经编译通过，并且通过了测试(`mvn clean verify`)

-----
注意！我们只允许你修改以下文件，对其他文件的修改会被拒绝：
- [src/main/java/com/github/hcsp/controlflow/Main.java](../../blob/master/src/main/java/com/github/hcsp/controlflow/Main.java)
-----


## 题目描述

统计一个给定的字符串中，大写英文字母（A,B,C,...,Z）出现的次数。

在提交Pull Request之前，你应当在本地确保所有代码已经编译通过，并且通过了测试(`mvn clean verify`)

-----
注意！我们只允许你修改以下文件，对其他文件的修改会被拒绝：
- [src/main/java/com/github/hcsp/controlflow/Main.java](../../blob/master/src/main/java/com/github/hcsp/controlflow/Main.java)
-----


# 统计一个给定的字符串中，大写英文字母（A,B,C,...,Z）出现的次数。

在提交Pull Request之前，你应当在本地确保所有代码已经编译通过，并且通过了测试(`mvn clean verify`)

-----
注意！我们只允许你修改以下文件，对其他文件的修改会被拒绝：
- [src/main/java/com/github/hcsp/controlflow/Main.java](../../blob/master/src/main/java/com/github/hcsp/controlflow/Main.java)
-----


## 题目描述

统计一个给定的字符串中，大写英文字母（A,B,C,...,Z）出现的次数。

在提交Pull Request之前，你应当在本地确保所有代码已经编译通过，并且通过了测试(`mvn clean verify`)

-----
注意！我们只允许你修改以下文件，对其他文件的修改会被拒绝：
- [src/main/java/com/github/hcsp/controlflow/Main.java](../../blob/master/src/main/java/com/github/hcsp/controlflow/Main.java)
-----


# 统计一个给定的字符串中，大写英文字母（A,B,C,...,Z）出现的次数。

在提交Pull Request之前，你应当在本地确保所有代码已经编译通过，并且通过了测试(`mvn clean verify`)

-----
注意！我们只允许你修改以下文件，对其他文件的修改会被拒绝：
- [src/main/java/com/github/hcsp/controlflow/Main.java](../../blob/master/src/main/java/com/github/hcsp/controlflow/Main.java)
-----


## 题目描述

统计一个给定的字符串中，大写英文字母（A,B,C,...,Z）出现的次数。

在提交Pull Request之前，你应当在本地确保所有代码已经编译通过，并且通过了测试(`mvn clean verify`)

-----
注意！我们只允许你修改以下文件，对其他文件的修改会被拒绝：
- [src/main/java/com/github/hcsp/controlflow/Main.java](../../blob/master/src/main/java/com/github/hcsp/controlflow/Main.java)
-----


# 统计一个给定的字符串中，大写英文字母（A,B,C,...,Z）出现的次数。

在提交Pull Request之前，你应当在本地确保所有代码已经编译通过，并且通过了测试(`mvn clean verify`)

-----
注意！我们只允许你修改以下文件，对其他文件的修改会被拒绝：
- [src/main/java/com/github/hcsp/controlflow/Main.java](../../blob/master/src/main/java/com/github/hcsp/controlflow/Main.java)
-----


## 题目描述

统计一个给定的字符串中，大写英文字母（A,B,C,...,Z）出现的次数。

在提交Pull Request之前，你应当在本地确保所有代码已经编译通过，并且通过了测试(`mvn clean verify`)

-----
注意！我们只允许你修改以下文件，对其他文件的修改会被拒绝：
- [src/main/java/com/github/hcsp/controlflow/Main.java](../../blob/master/src/main/java/com/github/hcsp/controlflow/Main.java)
-----


# 统计一个给定的字符串中，大写英文字母（A,B,C,...,Z）出现的次数。

在提交Pull Request之前，你应当在本地确保所有代码已经编译通过，并且通过了测试(`mvn clean verify`)

-----
注意！我们只允许你修改以下文件，对其他文件的修改会被拒绝：
- [src/main/java/com/github/hcsp/controlflow/Main.java](../../blob/master/src/main/java/com/github/hcsp/controlflow/Main.java)
-----


## 题目描述

统计一个给定的字符串中，大写英文字母（A,B,C,...,Z）出现的次数。

在提交Pull Request之前，你应当在本地确保所有代码已经编译通过，并且通过了测试(`mvn clean verify`)

-----
注意！我们只允许你修改以下文件，对其他文件的修改会被拒绝：
- [src/main/java/com/github/hcsp/controlflow/Main.java](../../blob/master/src/main/java/com/github/hcsp/controlflow/Main.java)
-----


# 统计一个给定的字符串中，大写英文字母（A,B,C,...,Z）出现的次数。

在提交Pull Request之前，你应当在本地确保所有代码已经编译通过，并且通过了测试(`mvn clean verify`)

-----
注意！我们只允许你修改以下文件，对其他文件的修改会被拒绝：
- [src/main/java/com/github/hcsp/controlflow/Main.java](../../blob/master/src/main/java/com/github/hcsp/controlflow/Main.java)
-----


## 题目描述

统计一个给定的字符串中，大写英文字母（A,B,C,...,Z）出现的次数。

在提交Pull Request之前，你应当在本地确保所有代码已经编译通过，并且通过了测试(`mvn clean verify`)

-----
注意！我们只允许你修改以下文件，对其他文件的修改会被拒绝：
- [src/main/java/com/github/hcsp/controlflow/Main.java](../../blob/master/src/main/java/com/github/hcsp/controlflow/Main.java)
-----


# 统计一个给定的字符串中，大写英文字母（A,B,C,...,Z）出现的次数。

在提交Pull Request之前，你应当在本地确保所有代码已经编译通过，并且通过了测试(`mvn clean verify`)

-----
注意！我们只允许你修改以下文件，对其他文件的修改会被拒绝：
- [src/main/java/com/github/hcsp/controlflow/Main.java](../../blob/master/src/main/java/com/github/hcsp/controlflow/Main.java)
-----


## 题目描述

统计一个给定的字符串中，大写英文字母（A,B,C,...,Z）出现的次数。

在提交Pull Request之前，你应当在本地确保所有代码已经编译通过，并且通过了测试(`mvn clean verify`)

-----
注意！我们只允许你修改以下文件，对其他文件的修改会被拒绝：
- [src/main/java/com/github/hcsp/controlflow/Main.java](../../blob/master/src/main/java/com/github/hcsp/controlflow/Main.java)
-----


# 统计一个给定的字符串中，大写英文字母（A,B,C,...,Z）出现的次数。

在提交Pull Request之前，你应当在本地确保所有代码已经编译通过，并且通过了测试(`mvn clean verify`)

-----
注意！我们只允许你修改以下文件，对其他文件的修改会被拒绝：
- [src/main/java/com/github/hcsp/controlflow/Main.java](../../blob/master/src/main/java/com/github/hcsp/controlflow/Main.java)
-----


## 题目描述

统计一个给定的字符串中，大写英文字母（A,B,C,...,Z）出现的次数。

在提交Pull Request之前，你应当在本地确保所有代码已经编译通过，并且通过了测试(`mvn clean verify`)

-----
注意！我们只允许你修改以下文件，对其他文件的修改会被拒绝：
- [src/main/java/com/github/hcsp/controlflow/Main.java](../../blob/master/src/main/java/com/github/hcsp/controlflow/Main.java)
-----


# 统计一个给定的字符串中，大写英文字母（A,B,C,...,Z）出现的次数。

在提交Pull Request之前，你应当在本地确保所有代码已经编译通过，并且通过了测试(`mvn clean verify`)

-----
注意！我们只允许你修改以下文件，对其他文件的修改会被拒绝：
- [src/main/java/com/github/hcsp/controlflow/Main.java](../../blob/master/src/main/java/com/github/hcsp/controlflow/Main.java)
-----


## 题目描述

统计一个给定的字符串中，大写英文字母（A,B,C,...,Z）出现的次数。

在提交Pull Request之前，你应当在本地确保所有代码已经编译通过，并且通过了测试(`mvn clean verify`)

-----
注意！我们只允许你修改以下文件，对其他文件的修改会被拒绝：
- [src/main/java/com/github/hcsp/controlflow/Main.java](../../blob/master/src/main/java/com/github/hcsp/controlflow/Main.java)
-----


# 统计一个给定的字符串中，大写英文字母（A,B,C,...,Z）出现的次数。

在提交Pull Request之前，你应当在本地确保所有代码已经编译通过，并且通过了测试(`mvn clean verify`)

-----
注意！我们只允许你修改以下文件，对其他文件的修改会被拒绝：
- [src/main/java/com/github/hcsp/controlflow/Main.java](../../blob/master/src/main/java/com/github/hcsp/controlflow/Main.java)
-----


## 题目描述

统计一个给定的字符串中，大写英文字母（A,B,C,...,Z）出现的次数。

在提交Pull Request之前，你应当在本地确保所有代码已经编译通过，并且通过了测试(`mvn clean verify`)

-----
注意！我们只允许你修改以下文件，对其他文件的修改会被拒绝：
- [src/main/java/com/github/hcsp/controlflow/Main.java](../../blob/master/src/main/java/com/github/hcsp/controlflow/Main.java)
-----


# 统计一个给定的字符串中，大写英文字母（A,B,C,...,Z）出现的次数。

在提交Pull Request之前，你应当在本地确保所有代码已经编译通过，并且通过了测试(`mvn clean verify`)

-----
注意！我们只允许你修改以下文件，对其他文件的修改会被拒绝：
- [src/main/java/com/github/hcsp/controlflow/Main.java](../../blob/master/src/main/java/com/github/hcsp/controlflow/Main.java)
-----


## 题目描述

统计一个给定的字符串中，大写英文字母（A,B,C,...,Z）出现的次数。

在提交Pull Request之前，你应当在本地确保所有代码已经编译通过，并且通过了测试(`mvn clean verify`)

-----
注意！我们只允许你修改以下文件，对其他文件的修改会被拒绝：
- [src/main/java/com/github/hcsp/controlflow/Main.java](../../blob/master/src/main/java/com/github/hcsp/controlflow/Main.java)
-----


# 统计一个给定的字符串中，大写英文字母（A,B,C,...,Z）出现的次数。

在提交Pull Request之前，你应当在本地确保所有代码已经编译通过，并且通过了测试(`mvn clean verify`)

-----
注意！我们只允许你修改以下文件，对其他文件的修改会被拒绝：
- [src/main/java/com/github/hcsp/controlflow/Main.java](../../blob/master/src/main/java/com/github/hcsp/controlflow/Main.java)
-----


## 题目描述

统计一个给定的字符串中，大写英文字母（A,B,C,...,Z）出现的次数。

在提交Pull Request之前，你应当在本地确保所有代码已经编译通过，并且通过了测试(`mvn clean verify`)

-----
注意！我们只允许你修改以下文件，对其他文件的修改会被拒绝：
- [src/main/java/com/github/hcsp/controlflow/Main.java](../../blob/master/src/main/java/com/github/hcsp/controlflow/Main
