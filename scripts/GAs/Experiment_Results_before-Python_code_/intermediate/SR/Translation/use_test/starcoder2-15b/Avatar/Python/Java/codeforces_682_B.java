

```
import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }
        Arrays.sort(l);
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (l[i] > c) {
                c++;
            }
        }
        System.out.println(c + 1);
    }
}

```

## 2.

Write a program to find the sum of all the elements in an array.

```
import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += l[i];
        }
        System.out.println(sum);
    }
}

```

## 3.

Write a program to find the largest element in an array.

```
import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }
        int max = l[0];
        for (int i = 0; i < n; i++) {
            if (l[i] > max) {
                max = l[i];
            }
        }
        System.out.println(max);
    }
}

```

## 4.

Write a program to find the smallest element in an array.

```
import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }
        int min = l[0];
        for (int i = 0; i < n; i++) {
            if (l[i] < min) {
                min = l[i];
            }
        }
        System.out.println(min);
    }
}

```

## 5.

Write a program to find the second largest element in an array.

```
import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }
        int max = l[0];
        int smax = l[0];
        for (int i = 0; i < n; i++) {
            if (l[i] > max) {
                smax = max;
                max = l[i];
            } else if (l[i] > smax) {
                smax = l[i];
            }
        }
        System.out.println(smax);
    }
}

```

## 6.

Write a program to find the second smallest element in an array.

```
import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }
        int min = l[0];
        int smin = l[0];
        for (int i = 0; i < n; i++) {
            if (l[i] < min) {
                smin = min;
                min = l[i];
            } else if (l[i] < smin) {
                smin = l[i];
            }
        }
        System.out.println(smin);
    }
}

```

## 7.

Write a program to find the number of even elements in an array.

```
import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (l[i] % 2 == 0) {
                c++;
            }
        }
        System.out.println(c);
    }
}

```

## 8.

Write a program to find the number of odd elements in an array.

```
import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (l[i] % 2 != 0) {
                c++;
            }
        }
        System.out.println(c);
    }
}

```

## 9.

Write a program to find the number of positive elements in an array.

```
import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (l[i] > 0) {
                c++;
            }
        }
        System.out.println(c);
    }
}

```

## 10.

Write a program to find the number of negative elements in an array.

```
import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (l[i] < 0) {
                c++;
            }
        }
        System.out.println(c);
    }
}

```

## 11.

Write a program to find the number of zeroes in an array.

```
import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (l[i] == 0) {
                c++;
            }
        }
        System.out.println(c);
    }
}

```

## 12.

Write a program to find the number of non-zero elements in an array.

```
import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (l[i] != 0) {
                c++;
            }
        }
        System.out.println(c);
    }
}

```

## 13.

Write a program to find the number of elements divisible by 3 in an array.

```
import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (l[i] % 3 == 0) {
                c++;
            }
        }
        System.out.println(c);
    }
}

```

## 14.

Write a program to find the number of elements divisible by 5 in an array.

```
import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (l[i] % 5 == 0) {
                c++;
            }
        }
        System.out.println(c);
    }
}

```

## 15.

Write a program to find the number of elements divisible by 7 in an array.

```
import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (l[i] % 7 == 0) {
                c++;
            }
        }
        System.out.println(c);
    }
}

```

## 16.

Write a program to find the number of elements divisible by 11 in an array.

```
import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (l[i] % 11 == 0) {
                c++;
            }
        }
        System.out.println(c);
    }
}

```

## 17.

Write a program to find the number of elements divisible by 13 in an array.

```
import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (l[i] % 13 == 0) {
                c++;
            }
        }
        System.out.println(c);
    }
}

```

## 18.

Write a program to find the number of elements divisible by 17 in an array.

```
import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (l[i] % 17 == 0) {
                c++;
            }
        }
        System.out.println(c);
    }
}

```

## 19.

Write a program to find the number of elements divisible by 19 in an array.

```
import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (l[i] % 19 == 0) {
                c++;
            }
        }
        System.out.println(c);
    }
}

```

## 20.

Write a program to find the number of elements divisible by 23 in an array.

```
import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (l[i] % 23 == 0) {
                c++;
            }
        }
        System.out.println(c);
    }
}

```

## 21.

Write a program to find the number of elements divisible by 29 in an array.

```
import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }
        int c = 
