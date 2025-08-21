

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ip = sc.nextLine();
        String st = "";
        if (ip.length() != 1) {
            if (ip.charAt(0) == '9') {
                st = "9";
                ip = ip.substring(1);
            }
            for (int i = 0; i < ip.length(); i++) {
                if (ip.charAt(i) > '4') {
                    int n = 9 - (ip.charAt(i) - '0');
                    st += n;
                } else {
                    st += ip.charAt(i);
                }
            }
        } else {
            st = ip;
        }
        System.out.println(Integer.parseInt(st));
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
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}

```
/src/main/java/com/github/hcsp/controlflow/Main.md
# 最大的整数

请实现一个程序，找出数组中最大的那个整数。

在提交答案之前，你需要在本地编译并运行这个类，看看你的程序是否能够正常工作。

提交答案时，你需要将这个文件重新命名为`Main.java`

## 题目描述

请实现一个程序，找出数组中最大的那个整数。

在提交答案之前，你需要在本地编译并运行这个类，看看你的程序是否能够正常工作。

提交答案时，你需要将这个文件重新命名为`Main.java`

## 示例

```
输入：[1, 2, 3]
输出：3
```

```
输入：[1, 2, 3, 4, 5]
输出：5
```

```
输入：[-1, -2, -3, -4, -5]
输出：-1
```

## 思路

1. 定义一个变量max，初始值为数组的第一个元素
2. 遍历数组，如果当前元素大于max，则将max赋值为当前元素
3. 遍历结束后，max即为数组中最大的元素

## 解答

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}/src/main/java/com/github/hcsp/controlflow/Main.java
package com.github.hcsp.controlflow;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        int max = arr[0];
//        for (int i = 1; i < n; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        System.out.println(max);
//    }
//}

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        int max = arr[0];
//        for (int i = 1; i < n; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        System.out.println(max);
//    }
//}

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        int max = arr[0];
//        for (int i = 1; i < n; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        System.out.println(max);
//    }
//}

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        int max = arr[0];
//        for (int i = 1; i < n; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        System.out.println(max);
//    }
//}

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        int max = arr[0];
//        for (int i = 1; i < n; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        System.out.println(max);
//    }
//}

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        int max = arr[0];
//        for (int i = 1; i < n; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        System.out.println(max);
//    }
//}

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        int max = arr[0];
//        for (int i = 1; i < n; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        System.out.println(max);
//    }
//}

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        int max = arr[0];
//        for (int i = 1; i < n; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        System.out.println(max);
//    }
//}

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        int max = arr[0];
//        for (int i = 1; i < n; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        System.out.println(max);
//    }
//}

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        int max = arr[0];
//        for (int i = 1; i < n; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        System.out.println(max);
//    }
//}

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        int max = arr[0];
//        for (int i = 1; i < n; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        System.out.println(max);
//    }
//}

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        int max = arr[0];
//        for (int i = 1; i < n; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        System.out.println(max);
//    }
//}

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        int max = arr[0];
//        for (int i = 1; i < n; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        System.out.println(max);
//    }
//}

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        int max = arr[0];
//        for (int i = 1; i < n; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        System.out.println(max);
//    }
//}

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        int max = arr[0];
//        for (int i = 1; i < n; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        System.out.println(max);
//    }
//}

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        int max = arr[0];
//        for (int i = 1; i < n; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        System.out.println(max);
//    }
//}

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        int max = arr[0];
//        for (int i = 1; i < n; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        System.out.println(max);
//    }
//}

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        int max = arr[0];
//        for (int i = 1; i < n; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        System.out.println(max);
//    }
//}

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//       
