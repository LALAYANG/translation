

```java
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String given = sc.nextLine();
        String[] l1 = given.split(" ");
        int[] l2 = new int[4];
        for (int i = 0; i < 4; i++) {
            l2[i] = Integer.parseInt(l1[i]);
        }
        int x1 = l2[0];
        int y1 = l2[1];
        int x2 = l2[2];
        int y2 = l2[3];
        int denominator = x2 - x1;
        int numerator = y2 - y1;
        if (denominator != 0) {
            double quotient = (double) numerator / denominator;
            if (numerator == 0) {
                int d = (int) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
                int x4 = x1;
                int x3 = x2;
                int y3 = y2 + d;
                int y4 = y1 + d;
                System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
            } else if (denominator == 0) {
                int y4 = y2;
                int y3 = y1;
                int d = (int) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
                int x4 = x1 + d;
                int x3 = x2 + d;
                System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
            } else if (quotient == 1) {
                int x4 = x2;
                int x3 = x1;
                int y4 = y1;
                int y3 = y2;
                System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
            } else if (quotient == -1) {
                int x4 = x1;
                int x3 = x2;
                int y4 = y2;
                int y3 = y1;
                System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
            } else {
                System.out.println("-1");
            }
        }
    }
}
```

## 2.

Write a program that takes a string as input and prints the string in reverse order.

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String given = sc.nextLine();
        String[] l1 = given.split(" ");
        for (int i = l1.length - 1; i >= 0; i--) {
            System.out.print(l1[i] + " ");
        }
    }
}
```

## 3.

Write a program that takes a string as input and prints the string in reverse order.

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String given = sc.nextLine();
        String[] l1 = given.split(" ");
        for (int i = l1.length - 1; i >= 0; i--) {
            System.out.print(l1[i] + " ");
        }
    }
}
```

## 4.

Write a program that takes a string as input and prints the string in reverse order.

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String given = sc.nextLine();
        String[] l1 = given.split(" ");
        for (int i = l1.length - 1; i >= 0; i--) {
            System.out.print(l1[i] + " ");
        }
    }
}
```

## 5.

Write a program that takes a string as input and prints the string in reverse order.

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String given = sc.nextLine();
        String[] l1 = given.split(" ");
        for (int i = l1.length - 1; i >= 0; i--) {
            System.out.print(l1[i] + " ");
        }
    }
}
```

## 6.

Write a program that takes a string as input and prints the string in reverse order.

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String given = sc.nextLine();
        String[] l1 = given.split(" ");
        for (int i = l1.length - 1; i >= 0; i--) {
            System.out.print(l1[i] + " ");
        }
    }
}
```

## 7.

Write a program that takes a string as input and prints the string in reverse order.

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String given = sc.nextLine();
        String[] l1 = given.split(" ");
        for (int i = l1.length - 1; i >= 0; i--) {
            System.out.print(l1[i] + " ");
        }
    }
}
```

## 8.

Write a program that takes a string as input and prints the string in reverse order.

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String given = sc.nextLine();
        String[] l1 = given.split(" ");
        for (int i = l1.length - 1; i >= 0; i--) {
            System.out.print(l1[i] + " ");
        }
    }
}
```

## 9.

Write a program that takes a string as input and prints the string in reverse order.

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String given = sc.nextLine();
        String[] l1 = given.split(" ");
        for (int i = l1.length - 1; i >= 0; i--) {
            System.out.print(l1[i] + " ");
        }
    }
}
```

## 10.

Write a program that takes a string as input and prints the string in reverse order.

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String given = sc.nextLine();
        String[] l1 = given.split(" ");
        for (int i = l1.length - 1; i >= 0; i--) {
            System.out.print(l1[i] + " ");
        }
    }
}
```

## 11.

Write a program that takes a string as input and prints the string in reverse order.

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String given = sc.nextLine();
        String[] l1 = given.split(" ");
        for (int i = l1.length - 1; i >= 0; i--) {
            System.out.print(l1[i] + " ");
        }
    }
}
```

## 12.

Write a program that takes a string as input and prints the string in reverse order.

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String given = sc.nextLine();
        String[] l1 = given.split(" ");
        for (int i = l1.length - 1; i >= 0; i--) {
            System.out.print(l1[i] + " ");
        }
    }
}
```

## 13.

Write a program that takes a string as input and prints the string in reverse order.

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String given = sc.nextLine();
        String[] l1 = given.split(" ");
        for (int i = l1.length - 1; i >= 0; i--) {
            System.out.print(l1[i] + " ");
        }
    }
}
```

## 14.

Write a program that takes a string as input and prints the string in reverse order.

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String given = sc.nextLine();
        String[] l1 = given.split(" ");
        for (int i = l1.length - 1; i >= 0; i--) {
            System.out.print(l1[i] + " ");
        }
    }
}
```

## 15.

Write a program that takes a string as input and prints the string in reverse order.

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String given = sc.nextLine();
        String[] l1 = given.split(" ");
        for (int i = l1.length - 1; i >= 0; i--) {
            System.out.print(l1[i] + " ");
        }
    }
}
```

## 16.

Write a program that takes a string as input and prints the string in reverse order.

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String given = sc.nextLine();
        String[] l1 = given.split(" ");
        for (int i = l1.length - 1; i >= 0; i--) {
            System.out.print(l1[i] + " ");
        }
    }
}
```

## 17.

Write a program that takes a string as input and prints the string in reverse order.

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String given = sc.nextLine();
        String[] l1 = given.split(" ");
        for (int i = l1.length - 1; i >= 0; i--) {
            System.out.print(l1[i] + " ");
        }
    }
}
```

## 18.

Write a program that takes a string as input and prints the string in reverse order.

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String given = sc.nextLine();
        String[] l1 = given.split(" ");
        for (int i = l1.length - 1; i >= 0; i--) {
            System.out.print(l1[i] + " ");
        }
    }
}
```

## 19.

Write a program that takes a string as input and prints the string in reverse order.

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String given = sc.nextLine();
        String[] l1 = given.split(" ");
        for (int i = l1.length - 1; i >= 0; i--) {
            System.out.print(l1[i] + " ");
        }
    }
}
```

## 20.

Write a program that takes a string as input and prints the string in reverse order.

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String given = sc.nextLine();
        String[] l1 = given.split(" ");
        for (int i = l1.length - 1; i >= 0; i--) {
            System.out.print(l1[i] + " ");
        }
    }
}
```

## 21.

Write a program that takes a string as input and prints the string in reverse order.

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String given = sc.nextLine();
        String[] l1 = given.split(" ");
        for (int i = l1.length - 1; i >= 0; i--) {
            System.out.print(l1[i] + " ");
        }
    }
}
```

## 22.

Write a program that takes a string as input and prints the string in reverse order.

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String given = sc.nextLine();
        String[] l1 = given.split(" ");
        for (int i = l1.length - 1; i >= 0; i--) {
            System.out.print(l1[i] + " ");
        }
    }
}
```

## 23.

Write a program that takes a string as input and prints the string in reverse order.

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String given = sc.nextLine();
        String[] l1 = given.split(" ");
        for (int i = l1.length - 1; i >= 0; i--) {
            System.out.print(l1[i] + " ");
        }
    }
}
```

## 24.

Write a program that takes a string as input and prints the string in reverse order.

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String given = sc.nextLine();
        String[] l1 = given.split(" ");
        for (int i = l1.length - 1; i >= 0; i--) {
            System.out.print(l1[i] + " ");
        }
    }
}
```

## 25.

Write a program that takes a string as input and prints the string in reverse order.

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System
