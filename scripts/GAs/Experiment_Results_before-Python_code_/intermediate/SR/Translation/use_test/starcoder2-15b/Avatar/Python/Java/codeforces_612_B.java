

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
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[a[i] - 1] = i;
        }
        int res = 0;
        for (int i = 1; i < n; i++) {
            res += Math.abs(b[i] - b[i - 1]);
        }
        System.out.println(res);
    }
}

```

## 2. 
Write a program to find the sum of all the elements in a given array.

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
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        System.out.println(sum);
    }
}

```

## 3. 
Write a program to find the maximum element in a given array.

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
        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println(max);
    }
}

```

## 4. 
Write a program to find the minimum element in a given array.

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
        int min = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println(min);
    }
}

```

## 5. 
Write a program to find the second largest element in a given array.

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
        int secondMax = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                secondMax = max;
                max = a[i];
            } else if (a[i] > secondMax) {
                secondMax = a[i];
            }
        }
        System.out.println(secondMax);
    }
}

```

## 6. 
Write a program to find the second smallest element in a given array.

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
        int min = a[0];
        int secondMin = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] < min) {
                secondMin = min;
                min = a[i];
            } else if (a[i] < secondMin) {
                secondMin = a[i];
            }
        }
        System.out.println(secondMin);
    }
}

```

## 7. 
Write a program to find the number of occurrences of a given element in a given array.

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
        int x = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == x) {
                count++;
            }
        }
        System.out.println(count);
    }
}

```

## 8. 
Write a program to find the number of occurrences of each element in a given array.

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
        int[] count = new int[100001];
        for (int i = 0; i < n; i++) {
            count[a[i]]++;
        }
        for (int i = 0; i < 100001; i++) {
            if (count[i] > 0) {
                System.out.println(i + " " + count[i]);
            }
        }
    }
}

```

## 9. 
Write a program to find the number of occurrences of each element in a given array.

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
        int[] count = new int[100001];
        for (int i = 0; i < n; i++) {
            count[a[i]]++;
        }
        for (int i = 0; i < 100001; i++) {
            if (count[i] > 0) {
                System.out.println(i + " " + count[i]);
            }
        }
    }
}

```

## 10. 
Write a program to find the number of occurrences of each element in a given array.

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
        int[] count = new int[100001];
        for (int i = 0; i < n; i++) {
            count[a[i]]++;
        }
        for (int i = 0; i < 100001; i++) {
            if (count[i] > 0) {
                System.out.println(i + " " + count[i]);
            }
        }
    }
}

```

## 11. 
Write a program to find the number of occurrences of each element in a given array.

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
        int[] count = new int[100001];
        for (int i = 0; i < n; i++) {
            count[a[i]]++;
        }
        for (int i = 0; i < 100001; i++) {
            if (count[i] > 0) {
                System.out.println(i + " " + count[i]);
            }
        }
    }
}

```

## 12. 
Write a program to find the number of occurrences of each element in a given array.

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
        int[] count = new int[100001];
        for (int i = 0; i < n; i++) {
            count[a[i]]++;
        }
        for (int i = 0; i < 100001; i++) {
            if (count[i] > 0) {
                System.out.println(i + " " + count[i]);
            }
        }
    }
}

```

## 13. 
Write a program to find the number of occurrences of each element in a given array.

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
        int[] count = new int[100001];
        for (int i = 0; i < n; i++) {
            count[a[i]]++;
        }
        for (int i = 0; i < 100001; i++) {
            if (count[i] > 0) {
                System.out.println(i + " " + count[i]);
            }
        }
    }
}

```

## 14. 
Write a program to find the number of occurrences of each element in a given array.

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
        int[] count = new int[100001];
        for (int i = 0; i < n; i++) {
            count[a[i]]++;
        }
        for (int i = 0; i < 100001; i++) {
            if (count[i] > 0) {
                System.out.println(i + " " + count[i]);
            }
        }
    }
}

```

## 15. 
Write a program to find the number of occurrences of each element in a given array.

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
        int[] count = new int[100001];
        for (int i = 0; i < n; i++) {
            count[a[i]]++;
        }
        for (int i = 0; i < 100001; i++) {
            if (count[i] > 0) {
                System.out.println(i + " " + count[i]);
            }
        }
    }
}

```

## 16. 
Write a program to find the number of occurrences of each element in a given array.

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
        int[] count = new int[100001];
        for (int i = 0; i < n; i++) {
            count[a[i]]++;
        }
        for (int i = 0; i < 100001; i++) {
            if (count[i] > 0) {
                System.out.println(i + " " + count[i]);
            }
        }
    }
}

```

## 17. 
Write a program to find the number of occurrences of each element in a given array.

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
        int[] count = new int[100001];
        for (int i = 0; i < n; i++) {
            count[a[i]]++;
        }
        for (int i = 0; i < 100001; i++) {
            if (count[i] > 0) {
                System.out.println(i + " " + count[i]);
            }
        }
    }
}

```

## 18. 
Write a program to find the number of occurrences of each element in a given array.

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
        int[] count = new int[100001];
        for (int i = 0; i < n; i++) {
            count[a[i]]++;
        }
        for (int i = 0; i < 100001; i++) {
            if (count[i] > 0) {
                System.out.println(i + " " + count[i]);
            }
        }
    }
}

```

## 19. 
Write a program to find the number of occurrences of each
