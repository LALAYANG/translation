

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstInput = scanner.nextInt();
        int b = scanner.nextInt();
        int result = 1;
        int i = 0;
        boolean check = true;
        while (check) {
            int CheckerOneTen = 13;
            int CheckerTwoTen = 593;
            int CheckerOneEight = 988;
            int CheckerTwoEight = 976;
            int CheckerOneSix = 29;
            int CheckerTwoSix = 406;
            int IncrementVariable = 1;
            if ((CheckerOneTen & CheckerTwoTen) != 0) {
                if ((CheckerOneEight & CheckerTwoEight) != 0) {
                    if ((CheckerOneSix & CheckerTwoSix) != 0) {
                        if (result >= b) {
                            check = false;
                        } else {
                            result = calculateResult(i, IncrementVariable, firstInput);
                            i = i + 1;
                        }
                    }
                }
            }
        }
        System.out.println(i);
    }

    public static int calculateResult(int i, int IncrementVariable, int firstInput) {
        return firstInput * (i + IncrementVariable) - i;
    }
}
```
/src/main/java/com/hackerrank/java/introduction/JavaOutputFormatting.java
package com.hackerrank.java.introduction;

import java.util.Scanner;

public class JavaOutputFormatting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < t; i++) {
            String s1 = scanner.next();
            int x = scanner.nextInt();
            System.out.printf("%-15s%03d%n", s1, x);
        }

        scanner.close();
    }
}
/src/main/java/com/hackerrank/java/introduction/JavaEndOfFile.java
package com.hackerrank.java.introduction;

import java.util.Scanner;

public class JavaEndOfFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lineNumber = 1;
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            System.out.printf("%d %s%n", lineNumber, line);
          }
}
      lineNumber++;
        }
        scanner.close();
tatic void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result = simpleArraySum(arr);

        System.out.println(result);

        scanner.close();
    }
}
/src/main/java/com/hackerrank/java/introduction/JavaArraySum.java
package com.hackerrank.java.introduction;

import java.util.Scanner;

public class JavaArraySum {
    static int simpleArraySum(int[] ar) {
        int sum = 0;
        for (int i = 0; i < ar.length; i++) {
            sum += ar[i];
        }
        return sum;
    }

    public s/src/main/java/com/hackerrank/java/introduction/JavaDattatic void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        scanner.close();
        System.out.println(isLeapYear(year) ? "Leap" : "Non Leap");
    }
}
eAndTime.java
package com.hackerrank.java.introduction;

import java.util.Scanner;

public class JavaDateAndTime {
    static boolean isLeapYear(int year) {
        if (year < 1918) {
            return year % 4 == 0;
        } else if (year == 1918) {
            return false;
        } else {
            return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
        }
    }

    public s/src/main/java/com/hackerrank/java/introduction/JavaLoopsII.java
package com.hackerrank.java.introduction;

import java.util.Scanner;

public class JavaLoopsII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            int sum = a;
            for (int j = 0; j < n; j++) {
                sum += (int) Math.pow(2, j) * b;
                System.out.print(sum + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
/src/main/java/com/hackerrank/java/introduction/JavaStaticInitializerBlock.java
package com.hackerrank.java.introduction;

import java.util.Scanner;

public class JavaStaticInitializerBlock {
    private static boolean flag;
    private static int B;
    private static int H;
    private static final String EXCEPTION_MESSAGE = "java.lang.Exception: Breadth and height must be positive";

    static {
        Scanner scanner = new Scanner(System.in);
        B = scanner.nextInt();
        H = scanner.nextInt();
        scanner.close();
        if (B <= 0 || H <= 0) {
            flag = true;
            System.out.println(EXCEPTION_MESSAGE);
        }
    }

    public static void main(String[] args) {
        if (!flag) {
            int area = B * H;
            System.out.println(area);
        }
    }
}
/src/main/java/com/hackerrank/java/introduction/JavaIfElse.java
package com.hackerrank.java.introduction;

import java.util.Scanner;

public class JavaIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        if (n % 2 != 0) {
            System.out.println("Weird");
        } else if (n >= 2 && n <= 5) {
            System.out.println("Not Weird");
        } else if (n >= 6 && n <= 20) {
            System.out.println("Weird");
        } else if (n > 20) {
            System.out.println("Not Weird");
        }}

    /src/main/java/com/hackerrank/java/introduction/JavaStdinAndStdoutII.java
package com.hackerrank.java.introduction;

import java.util.Scanner;

panner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String s = scanner.nextLine();
            System.out.println(s);
        }

        scanner.close();
    }
}
ublic class JavaStdinAndStdoutII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = sc/src/main/java/com/hackerrank/java/introduction/JavaLoopsI.java
package com.hackerrank.java.introduction;

import java.util.Scanner;

public class JavaLoopsI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", n, i, n * i);
        }

        scanner.close();
    }
}
/src/main/java/com/hackerrank/java/introduction/JavaStdinAndStdoutI.java
package com.hackerrank.java.introduction;

import java.util.Scanner;

public class JavaStdinAndStdoutI {
    public static void main(StrintInt();
        int y = scanner.nextInt();
        scanner.close();
        System.out.println(x + y);
    }
}
g[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nex/src/main/java/com/hackerrank/java/introduction/JavaIntToBinary.java
package com.hackerrank.java.introduction;

import java.util.Scanner;

public class JavaIntToBinary {
    public statt();
        scanner.close();
        System.out.println(Integer.toBinaryString(n));
    }
}
ic void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();
        System.out.println(Integer.toBinaryString(n));
    }
}

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//        scanner.close();
//        String binary = "";
//        while (n > 0) {
//            binary = n % 2 + binary;
//            n = n / 2;
//        }
//        System.out.println(binary);
//    }
//}

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//        scanner.close();
//        String binary = "";
//        while (n > 0) {
//            binary = n % 2 + binary;
//            n = n / 2;
//        }
//        System.out.println(binary);
//    }
//}

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//        scanner.close();
//        String binary = "";
//        while (n > 0) {
//            binary = n % 2 + binary;
//            n = n / 2;
//        }
//        System.out.println(binary);
//    }
//}

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//        scanner.close();
//        String binary = "";
//        while (n > 0) {
//            binary = n % 2 + binary;
//            n = n / 2;
//        }
//        System.out.println(binary);
//    }
//}

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//        scanner.close();
//        String binary = "";
//        while (n > 0) {
//            binary = n % 2 + binary;
//            n = n / 2;
//        }
//        System.out.println(binary);
//    }
//}

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//        scanner.close();
//        String binary = "";
//        while (n > 0) {
//            binary = n % 2 + binary;
//            n = n / 2;
//        }
//        System.out.println(binary);
//    }
//}

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//        scanner.close();
//        String binary = "";
//        while (n > 0) {
//            binary = n % 2 + binary;
//            n = n / 2;
//        }
//        System.out.println(binary);
//    }
//}

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//        scanner.close();
//        String binary = "";
//        while (n > 0) {
//            binary = n % 2 + binary;
//            n = n / 2;
//        }
//        System.out.println(binary);
//    }
//}

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//        scanner.close();
//        String binary = "";
//        while (n > 0) {
//            binary = n % 2 + binary;
//            n = n / 2;
//        }
//        System.out.println(binary);
//    }
//}

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//        scanner.close();
//        String binary = "";
//        while (n > 0) {
//            binary = n % 
