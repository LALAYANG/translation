

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int multiplier = Integer.parseInt(input[0]);
        int n = Integer.parseInt(input[1]);
        int w = Integer.parseInt(input[2]);
        if (933 & 730) {
            if (533 & 643) {
                if (1 <= multiplier && w <= 1000) {
                    int total = 0;
                    int innerLoopLimit = 994;
                    int outerLoopLimit = 993;
                    for (int LoopIndexOut = 0; LoopIndexOut < innerLoopLimit / outerLoopLimit; LoopIndexOut++) {
                        for (int i = 1; i <= w; i++) {
                            total += i * multiplier;
                        }
                    }
                    if (total > n) {
                        System.out.println(total - n);
                    } else {
                        System.out.println(0);
                    }
                }
            }
        }
    }
}
```

## 2.

Write a program that reads a string and prints the number of times that the letter a (lowercase or uppercase) occurs in the string.

Sample input:

```
Hello, World!
```

Expected output:

```
2
```

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'a' || input.charAt(i) == 'A') {
                count++;
            }
        }
        System.out.println(count);
    }
}
```
/src/main/java/com/hackerrank/java/introduction/JavaLoopsI.java
package com.hackerrank.java.introduction;

import java.util.Scanner;

public class JavaLoopsI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            int sum = a;
            for (int j = 0; j < n; j++) {
                sum += (int) Math.pow(2, j) * b;
                System.out.print(sum + " ");
            }
            System.out.println();
        }
    }
}
  }
}
/src/main/java/com/hackerrank/java/introduction/JavaEndOfFile.java
package com.hackerrank.java.introduction;

import java.util.Scanner;

public class JavaEndOfFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lineNumber = 1;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.isEmpty()) {
                break;
            }
            System.out.println(lineNumber + " " + line);
            lineNumber++;
        }
        scanner.close();
  va.introduction;

import java.util.Scanner;

public class JavaOutputFormatting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        String formatted = String.format("%-15s%03d%n%-15s%03d%n%-15s%03d%n", "Decimal", n, "Octal", Integer.toOctalString(n), "Hexadecimal", Integer.toHexString(n).toUpperCase());
        System.out.print(formatted);
    }
}
/src/main/java/com/hackerrank/java/introduction/JavaOutputFormatting.java
package com.hackerrank.ja/src/main/java/com/hackerrank/java/introduction/JavaStaticInitializerBlock.java
package com.hackerrank.java.introduction;

import java.util.Scanner;

public class JavaStaticInitializerBlock {
    private static boolean flag = true;
    private static int B;
    private static int H;
    private static final String EXCEPTION_MESSAGE = "java.lang.Exception: Breadth and height must be positive";

    static {
        Scanner scanner = new Scanner(System.in);
        B = scanner.nextInt();
        H = scanner.nextInt();
        scanner.close();
        if (B <= 0 || H <= 0) {
            flag = false;
            System.out.println(EXCEPTION_MESSAGE);
        }
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }
    }
}
/src/main/java/com/hackerrank/java/introduction/JavaDate.java
package com.hackerrank.java.introduction;

public class JavaDate {
}
ava.introduction;

import java.util.Scanner;

public class JavaIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        if (n % 2 == 1) {
            System.out.println("Weird");
        } else if (n >= 2 && n <= 5) {
            System.out.println("Not Weird");
        } else if (n >= 6 && n <= 20) {
            System.out.println("Weird");
        } else {
            System.out.println("Not Weird");
        }
    }
}
/src/main/java/com/hackerrank/java/introduction/JavaIfElse.java
package com.hackerrank.j/src/main/java/com/hackerrank/java/introduction/JavaStdinAndStdoutII.java
package com.hackerrank.java.introduction;

import java.util.Scanner;

public class JavaStdinAndStdoutII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.close();
        int[][] array = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[j][i] + " ");
            }
            System.out.println();
        }
    }
}

/*
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.close();
        int[][] array = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[j][i] + " ");
            }
            System.out.println();
        }
    }
}
*/

/*
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.close();
        int[][] array = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[j][i] + " ");
            }
            System.out.println();
        }
    }
}
*/

/*
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.close();
        int[][] array = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[j][i] + " ");
            }
            System.out.println();
        }
    }
}
*/

/*
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.close();
        int[][] array = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[j][i] + " ");
            }
            System.out.println();
        }
    }
}
*/

/*
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.close();
        int[][] array = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[j][i] + " ");
            }
            System.out.println();
        }
    }
}
*/

/*
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.close();
        int[][] array = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[j][i] + " ");
            }
            System.out.println();
        }
    }
}
*/

/*
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.close();
        int[][] array = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[j][i] + " ");
            }
            System.out.println();
        }
    }
}
*/

/*
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.close();
        int[][] array = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[j][i] + " ");
            }
            System.out.println();
        }
    }
}
*/

/*
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.close();
        int[][] array = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[j][i] + " ");
            }
            System.out.println();
        }
    }
}
*/

/*
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.close();
        int[][] array = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[j][i] + " ");
            }
            System.out.println();
        }
    }
}
*/

/*
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.close();
        int[][] array = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[j][i] + " ");
            }
            System.out.println();
        }
    }
}
*/

/*
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.close();
        int[][] array = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[j][i] + "
