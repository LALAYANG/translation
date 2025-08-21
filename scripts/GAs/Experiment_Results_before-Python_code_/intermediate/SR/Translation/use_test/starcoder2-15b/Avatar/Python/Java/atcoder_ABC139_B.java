

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int hole = 1;
        int i = 0;
        boolean check = true;
        while (check) {
            if (hole >= b) {
                check = false;
            } else {
                hole = a * (i + 1) - i;
                i++;
            }
        }
        System.out.println(i);
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
        int max = a[0];
        int min = a[0];
        for (int i = 0; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println(max - min);
    }
}

```
/src/main/java/com/github/hcsp/controlflow/Main.md
# 最大的差值

请实现一个方法，对于给定的数组，返回最大的差值。

例如：

- `[1,2,5,4,10]`的最大差值是`9`
- `[5,6]`的最大差值是`1`
- `[-1,-2,-3]`的最大差值是`2`

在提交Pull Request之前，你应当在本地确保所有代码已经编译通过，并且通过了测试(`mvn clean verify`)

-----
注意！我们只允许你修改以下文件，对其他文件的修改会被拒绝：
- [src/main/java/com/github/hcsp/controlflow/Main.java](../../../../../main/java/com/github/hcsp/controlflow/Main.java)
-----


## 题目描述

请实现一个方法，对于给定的数组，返回最大的差值。

例如：

- `[1,2,5,4,10]`的最大差值是`9`
- `[5,6]`的最大差值是`1`
- `[-1,-2,-3]`的最大差值是`2`

在提交Pull Request之前，你应当在本地确保所有代码已经编译通过，并且通过了测试(`mvn clean verify`)

-----
注意！我们只允许你修改以下文件，对其他文件的修改会被拒绝：
- [src/main/java/com/github/hcsp/controlflow/Main.java](../../../../../main/java/com/github/hcsp/controlflow/Main.java)
-----


## 题目描述

请实现一个方法，对于给定的数组，返回最大的差值。

例如：

- `[1,2,5,4,10]`的最大差值是`9`
- `[5,6]`的最大差值是`1`
- `[-1,-2,-3]`的最大差值是`2`

在提交Pull Request之前，你应当在本地确保所有代码已经编译通过，并且通过了测试(`mvn clean verify`)

-----
注意！我们只允许你修改以下文件，对其他文件的修改会被拒绝：
- [src/main/java/com/github/hcsp/controlflow/Main.java](../../../../../main/java/com/github/hcsp/controlflow/Main.java)
-----


## 题目描述

请实现一个方法，对于给定的数组，返回最大的差值。

例如：

- `[1,2,5,4,10]`的最大差值是`9`
- `[5,6]`的最大差值是`1`
- `[-1,-2,-3]`的最大差值是`2`

在提交Pull Request之前，你应当在本地确保所有代码已经编译通过，并且通过了测试(`mvn clean verify`)

-----
注意！我们只允许你修改以下文件，对其他文件的修改会被拒绝：
- [src/main/java/com/github/hcsp/controlflow/Main.java](../../../../../main/java/com/github/hcsp/controlflow/Main.java)
-----


## 题目描述

请实现一个方法，对于给定的数组，返回最大的差值。

例如：

- `[1,2,5,4,10]`的最大差值是`9`
- `[5,6]`的最大差值是`1`
- `[-1,-2,-3]`的最大差值是`2`

在提交Pull Request之前，你应当在本地确保所有代码已经编译通过，并且通过了测试(`mvn clean verify`)

-----
注意！我们只允许你修改以下文件，对其他文件的修改会被拒绝：
- [src/main/java/com/github/hcsp/controlflow/Main.java](../../../../../main/java/com/github/hcsp/controlflow/Main.java)
-----


## 题目描述

请实现一个方法，对于给定的数组，返回最大的差值。

例如：

- `[1,2,5,4,10]`的最大差值是`9`
- `[5,6]`的最大差值是`1`
- `[-1,-2,-3]`的最大差值是`2`

在提交Pull Request之前，你应当在本地确保所有代码已经编译通过，并且通过了测试(`mvn clean verify`)

-----
注意！我们只允许你修改以下文件，对其他文件的修改会被拒绝：
- [src/main/java/com/github/hcsp/controlflow/Main.java](../../../../../main/java/com/github/hcsp/controlflow/Main.java)
-----


## 题目描述

请实现一个方法，对于给定的数组，返回最大的差值。

例如：

- `[1,2,5,4,10]`的最大差值是`9`
- `[5,6]`的最大差值是`1`
- `[-1,-2,-3]`的最大差值是`2`

在提交Pull Request之前，你应当在本地确保所有代码已经编译通过，并且通过了测试(`mvn clean verify`)

-----
注意！我们只允许你修改以下文件，对其他文件的修改会被拒绝：
- [src/main/java/com/github/hcsp/controlflow/Main.java](../../../../../main/java/com/github/hcsp/controlflow/Main.java)
-----


## 题目描述

请实现一个方法，对于给定的数组，返回最大的差值。

例如：

- `[1,2,5,4,10]`的最大差值是`9`
- `[5,6]`的最大差值是`1`
- `[-1,-2,-3]`的最大差值是`2`

在提交Pull Request之前，你应当在本地确保所有代码已经编译通过，并且通过了测试(`mvn clean verify`)

-----
注意！我们只允许你修改以下文件，对其他文件的修改会被拒绝：
- [src/main/java/com/github/hcsp/controlflow/Main.java](../../../../../main/java/com/github/hcsp/controlflow/Main.java)
-----


## 题目描述

请实现一个方法，对于给定的数组，返回最大的差值。

例如：

- `[1,2,5,4,10]`的最大差值是`9`
- `[5,6]`的最大差值是`1`
- `[-1,-2,-3]`的最大差值是`2`

在提交Pull Request之前，你应当在本地确保所有代码已经编译通过，并且通过了测试(`mvn clean verify`)

-----
注意！我们只允许你修改以下文件，对其他文件的修改会被拒绝：
- [src/main/java/com/github/hcsp/controlflow/Main.java](../../../../../main/java/com/github/hcsp/controlflow/Main.java)
-----


## 题目描述

请实现一个方法，对于给定的数组，返回最大的差值。

例如：

- `[1,2,5,4,10]`的最大差值是`9`
- `[5,6]`的最大差值是`1`
- `[-1,-2,-3]`的最大差值是`2`

在提交Pull Request之前，你应当在本地确保所有代码已经编译通过，并且通过了测试(`mvn clean verify`)

-----
注意！我们只允许你修改以下文件，对其他文件的修改会被拒绝：
- [src/main/java/com/github/hcsp/controlflow/Main.java](../../../../../main/java/com/github/hcsp/controlflow/Main.java)
-----


## 题目描述

请实现一个方法，对于给定的数组，返回最大的差值。

例如：

- `[1,2,5,4,10]`的最大差值是`9`
- `[5,6]`的最大差值是`1`
- `[-1,-2,-3]`的最大差值是`2`

在提交Pull Request之前，你应当在本地确保所有代码已经编译通过，并且通过了测试(`mvn clean verify`)

-----
注意！我们只允许你修改以下文件，对其他文件的修改会被拒绝：
- [src/main/java/com/github/hcsp/controlflow/Main.java](../../../../../main/java/com/github/hcsp/controlflow/Main.java)
-----


## 题目描述

请实现一个方法，对于给定的数组，返回最大的差值。

例如：

- `[1,2,5,4,10]`的最大差值是`9`
- `[5,6]`的最大差值是`1`
- `[-1,-2,-3]`的最大差值是`2`

在提交Pull Request之前，你应当在本地确保所有代码已经编译通过，并且通过了测试(`mvn clean verify`)

-----
注意！我们只允许你修改以下文件，对其他文件的修改会被拒绝：
- [src/main/java/com/github/hcsp/controlflow/Main.java](../../../../../main/java/com/github/hcsp/controlflow/Main.java)
-----


## 题目描述

请实现一个方法，对于给定的数组，返回最大的差值。

例如：

- `[1,2,5,4,10]`的最大差值是`9`
- `[5,6]`的最大差值是`1`
- `[-1,-2,-3]`的最大差值是`2`

在提交Pull Request之前，你应当在本地确保所有代码已经编译通过，并且通过了测试(`mvn clean verify`)

-----
注意！我们只允许你修改以下文件，对其他文件的修改会被拒绝：
- [src/main/java/com/github/hcsp/controlflow/Main.java](../../../../../main/java/com/github/hcsp/controlflow/Main.java)
-----


## 题目描述

请实现一个方法，对于给定的数组，返回最大的差值。

例如：

- `[1,2,5,4,10]`的最大差值是`9`
- `[5,6]`的最大差值是`1`
- `[-1,-2,-3]`的最大差值是`2`

在提交Pull Request之前，你应当在本地确保所有代码已经编译通过，并且通过了测试(`mvn clean verify`)

-----
注意！我们只允许你修改以下文件，对其他文件的修改会被拒绝：
- [src/main/java/com/github/hcsp/controlflow/Main.java](../../../../../main/java/com/github/hcsp/controlflow/Main.java)
-----


## 题目描述

请实现一个方法，对于给定的数组，返回最大的差值。

例如：

- `[1,2,5,4,10]`的最大差值是`9`
- `[5,6]`的最大差值是`1`
- `[-1,-2,-3]`的最大差值是`2`

在提交Pull Request之前，你应当在本地确保所有代码已经编译通过，并且通过了测试(`mvn clean verify`)

-----
注意！我们只允许你修改以下文件，对其他文件的修改会被拒绝：
- [src/main/java/com/github/hcsp/controlflow/Main.java](../../../../../main/java/com/github/hcsp/controlflow/Main.java)
-----


## 题目描述

请实现一个方法，对于给定的数组，返回最大的差值。

例如：

- `[1,2,5,4,10]`的最大差值是`9`
- `[5,6]`的最大差值是`1`
- `[-1,-2,-3]`的最大差值是`2`

在提交Pull Request之前，你应当在本地确保所有代码已经编译通过，并且通过了测试(`mvn clean verify`)

-----
注意！我们只允许你修改以下文件，对其他文件的修改会被拒绝：
- [src/main/java/com/github/hcsp/controlflow/Main.java](../../../../../main/java/com/github/hcsp/controlflow/Main.java)
-----


## 题目描述

请实现一个方法，对于给定的数组，返回最大的差值。

例如：

- `[1,2,5,4,10]`的最大差值是`9`
- `[5,6]`的最大差值是`1`
- `[-1,-2,-3]`的最大差值是`2`

在提交Pull Request之前，你应当在本地确保所有代码已经编译通过，并且通过了测试(`mvn clean verify`)

-----
注意！我们只允许你修改以下文件，对其他文件的修改会被拒绝：
- [src/main/java/com/github/hcsp/controlflow/Main.java](../../../../../main/java/com/github/hcsp/controlflow/Main.java)
-----


## 题目描述

请实现一个方法，对于给定的数组，返回最大的差值。

例如：

- `[1,2,5,4,10]`的最大差值是`9`
- `[5,6]`的最大差值是`1`
- `[-1,-2,-3]`的最大差值是`2`

在提交Pull Request之前，你应当在本地确保所有代码已经编译通过，并且通过了测试(`mvn clean verify`)

-----
注意！我们只允许你修改以下文件，对其他文件的修改会被拒绝：
- [src/main/java/com/github/hcsp/controlflow/Main.java](../../../../../main/java/com/github/hcsp/controlflow/Main.java)
-----


## 题目描述

请实现一个方法，对于给定的数组，返回最大的差值。

例如：

- `[1,2,5,4,10]`的最大差值是`9`
- `[5,6]`的最大差值是`1`
- `[-1,-2,-3]`的最大差值是`2`

在提交Pull Request之前，你应当在本地确保所有代码已经编译通过，并且通过了测试(`mvn clean verify`)

-----
注意！我们只允许你修改以下文件，对其他文件的修改会被拒绝：
- [src/main/java/com/github/hcsp/controlflow/Main.java](../../../../../main/java/com/github/hcsp/controlflow/Main.java)
-----


## 题目描述

请实现一个方法，对于给定的数组，返回最大的差值。

例如：

- `[1,2,5,4,10]`的最大差值是`9`
- `[5,6]`的最大差值是`1
