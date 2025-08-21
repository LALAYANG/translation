

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstInput = scanner.nextInt();
        int secondInput = scanner.nextInt();
        System.out.println(Math.min(firstInput, secondInput) + " " + calculateHalfDiff(Math.max(firstInput, secondInput), Math.min(firstInput, secondInput)) / 2);
    }

    public static int diff(int arg0, int arg1) {
        return arg0 - arg1;
    }

    public static int calculateHalfDiff(int a, int b) {
        return diff(a, b);
    }
}
```
/src/main/java/com/github/hcsp/annotation/Todo.java
package com.github.hcsp.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface Todo {
    String value() default "TODO";
}
t.println(Arrays.toString(result));
    }
}
/src/main/java/com/github/hcsp/annotation/Sort.java
package com.github.hcsp.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Sort {
    String value() default "quick";

    static void main(String[] args) {
        int[] result = new int[]{1, 2, 3, 4, 5};
        Arrays.sort(result);
        System.out.println(Arrays.toString(result));
    }
}
/src/main/java/com/github/hcsp/annotation/SortAnnotation.java
package com.github.hcsp.annotation;

import java.lang.reflect.Method;
import java.util.Arrays;

public class SortAnnotation {
    // 排序一个整型数组，请在SortAnnotation.java中完成SortAnnotation注解，使得如下程序能排
    // 序成功
    // 假设数组元素个数小于100
    @Sort
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        // 不能使用Java的排序函数来实现哦
        int[] result = sort(new int[]{4, 2, 6, 3, 1, 5});
        System.ou
