

```java
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = scanner.nextInt();
        }
        ExecutorService executorService = Executors.newFixedThreadPool(n);
        for (int i = 0; i < m; i++) {
            Future<Integer> future = executorService.submit(() -> arr[arr2[i] - 1]);
            try {
                System.out.println(future.get());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        executorService.shutdown();
    }
}
```

## 2.

Write a program that reads a text file and prints the number of words in the file.

```java
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\User\\Desktop\\test.txt");
            Scanner scanner = new Scanner(file);
            int count = 0;
            while (scanner.hasNext()) {
                scanner.next();
                count++;
            }
            System.out.println(count);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
```

## 3.

Write a program that reads a text file and prints the number of words in the file.

```java
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\User\\Desktop\\test.txt");
            Scanner scanner = new Scanner(file);
            int count = 0;
            while (scanner.hasNext()) {
                scanner.next();
                count++;
            }
            System.out.println(count);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
```

## 4.

Write a program that reads a text file and prints the number of words in the file.

```java
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\User\\Desktop\\test.txt");
            Scanner scanner = new Scanner(file);
            int count = 0;
            while (scanner.hasNext()) {
                scanner.next();
                count++;
            }
            System.out.println(count);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
```

## 5.

Write a program that reads a text file and prints the number of words in the file.

```java
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\User\\Desktop\\test.txt");
            Scanner scanner = new Scanner(file);
            int count = 0;
            while (scanner.hasNext()) {
                scanner.next();
                count++;
            }
            System.out.println(count);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
```

## 6.

Write a program that reads a text file and prints the number of words in the file.

```java
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\User\\Desktop\\test.txt");
            Scanner scanner = new Scanner(file);
            int count = 0;
            while (scanner.hasNext()) {
                scanner.next();
                count++;
            }
            System.out.println(count);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
```

## 7.

Write a program that reads a text file and prints the number of words in the file.

```java
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\User\\Desktop\\test.txt");
            Scanner scanner = new Scanner(file);
            int count = 0;
            while (scanner.hasNext()) {
                scanner.next();
                count++;
            }
            System.out.println(count);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
```

## 8.

Write a program that reads a text file and prints the number of words in the file.

```java
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\User\\Desktop\\test.txt");
            Scanner scanner = new Scanner(file);
            int count = 0;
            while (scanner.hasNext()) {
                scanner.next();
                count++;
            }
            System.out.println(count);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
```

## 9.

Write a program that reads a text file and prints the number of words in the file.

```java
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\User\\Desktop\\test.txt");
            Scanner scanner = new Scanner(file);
            int count = 0;
            while (scanner.hasNext()) {
                scanner.next();
                count++;
            }
            System.out.println(count);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
```

## 10.

Write a program that reads a text file and prints the number of words in the file.

```java
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\User\\Desktop\\test.txt");
            Scanner scanner = new Scanner(file);
            int count = 0;
            while (scanner.hasNext()) {
                scanner.next();
                count++;
            }
            System.out.println(count);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
```

## 11.

Write a program that reads a text file and prints the number of words in the file.

```java
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\User\\Desktop\\test.txt");
            Scanner scanner = new Scanner(file);
            int count = 0;
            while (scanner.hasNext()) {
                scanner.next();
                count++;
            }
            System.out.println(count);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
```

## 12.

Write a program that reads a text file and prints the number of words in the file.

```java
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\User\\Desktop\\test.txt");
            Scanner scanner = new Scanner(file);
            int count = 0;
            while (scanner.hasNext()) {
                scanner.next();
                count++;
            }
            System.out.println(count);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
```

## 13.

Write a program that reads a text file and prints the number of words in the file.

```java
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\User\\Desktop\\test.txt");
            Scanner scanner = new Scanner(file);
            int count = 0;
            while (scanner.hasNext()) {
                scanner.next();
                count++;
            }
            System.out.println(count);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
```

## 14.

Write a program that reads a text file and prints the number of words in the file.

```java
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\User\\Desktop\\test.txt");
            Scanner scanner = new Scanner(file);
            int count = 0;
            while (scanner.hasNext()) {
                scanner.next();
                count++;
            }
            System.out.println(count);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
```

## 15.

Write a program that reads a text file and prints the number of words in the file.

```java
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\User\\Desktop\\test.txt");
            Scanner scanner = new Scanner(file);
            int count = 0;
            while (scanner.hasNext()) {
                scanner.next();
                count++;
            }
            System.out.println(count);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
```

## 16.

Write a program that reads a text file and prints the number of words in the file.

```java
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\User\\Desktop\\test.txt");
            Scanner scanner = new Scanner(file);
            int count = 0;
            while (scanner.hasNext()) {
                scanner.next();
                count++;
            }
            System.out.println(count);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
```

## 17.

Write a program that reads a text file and prints the number of words in the file.

```java
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\User\\Desktop\\test.txt");
            Scanner scanner = new Scanner(file);
            int count = 0;
            while (scanner.hasNext()) {
                scanner.next();
                count++;
            }
            System.out.println(count);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
```

## 18.

Write a program that reads a text file and prints the number of words in the file.

```java
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\User\\Desktop\\test.txt");
            Scanner scanner = new Scanner(file);
            int count = 0;
            while (scanner.hasNext()) {
                scanner.next();
                count++;
            }
            System.out.println(count);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
```

## 19.

Write a program that reads a text file and prints the number of words in the file.

```java
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\User\\Desktop\\test.txt");
            Scanner scanner = new Scanner(file);
            int count = 0;
            while (scanner.hasNext()) {
                scanner.next();
                count++;
            }
            System.out.println(count);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
```

## 20.

Write a program that reads a text file and prints the number of words in the file.

```java
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\User\\Desktop\\test.txt");
            Scanner scanner = new Scanner(file);
            int count = 0;
            while (scanner.hasNext()) {
                scanner.next();
                count++;
            }
            System.out.println(count);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
```

## 21.

Write a program that reads a text file and prints the number of words in the file.

```java
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\User\\Desktop\\test.txt");
            Scanner scanner = new Scanner(file);
            int count = 0;
            while (scanner.hasNext()) {
                scanner.next();
                count++;
            }
            System.out.println(count);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
```

## 22.

Write a program that reads a text file and prints the number of words in the file.

```java
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\User\\Desktop\\test.txt");
            Scanner scanner = new Scanner(file);
            int count = 0;
            while (scanner.hasNext()) {
                scanner.next();
                count++;
            }
            System.out.println(count);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
```

## 23.

Write a program that reads a text file and prints the number of words in the file.

```java
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\User\\Desktop\\test.txt");
            Scanner scanner = new Scanner(file);
            int count = 0;
            while (scanner.hasNext()) {
                scanner.next();
                count++;
            }
            System.out.println(count);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
```

## 24.

Write a program that reads a text file and prints the number of words in the file.

```java
import java.io
