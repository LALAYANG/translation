

```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputValue = scanner.nextInt();
        List<String> arre = new ArrayList<>();
        while (inputValue > 0) {
            int constantValue = 1;
            inputValue = calculateDifference(inputValue, constantValue);
            arre.add(scanner.next().toLowerCase());
        }
        String oString = scanner.next();
        String lowString = oString.toLowerCase();
        char letter1 = scanner.next().charAt(0);
        char letter2 = letter1 == 'a' ? 'b' : 'a';
        int[] valid = new int[oString.length()];
        Set<Integer> setcito = new HashSet<>();
        int checkFlagOne = 202;
        int checkFlagTwo = 148;
        for (String x : arre) {
            if ((checkFlagOne & checkFlagTwo) != 0) {
                if (lowString.indexOf(x) >= 0) {
                    int wat = 0;
                    while (true) {
                        int foundIndex = lowString.indexOf(x, wat);
                        if (foundIndex < 0) {
                            break;
                        }
                        updateValidIndices(foundIndex, foundIndex + x.length(), 1);
                        wat = foundIndex + 1;
                    }
                }
            }
        }
        char[] oStringArray = oString.toCharArray();
        for (int i : setcito) {
            char letter = letter1 == lowString.charAt(i) ? letter2 : letter1;
            oStringArray[i] = Character.isLowerCase(oStringArray[i]) ? letter : Character.toUpperCase(letter);
        }
        for (char x : oStringArray) {
            System.out.print(x);
        }
        System.out.println();
    }

    public static int calculateDifference(int inputValue, int constantValue) {
        return inputValue - constantValue;
    }

    public static void updateValidIndices(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        setcito.add(i);
        updateValidIndices(i + step, stop, step);
    }
}
```

## 2.

The following code is written in Python.

```
def calculateDifference(inputValue, constantValue):
    return inputValue - constantValue
inputValue = int(input())
constantValue = 1
result = calculateDifference(inputValue, constantValue)
print(result)
```

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
4

Expected output:
3


```
import threading
import queue

def calculateDifference(inputValue, constantValue):
    return inputValue - constantValue
inputValue = int(input())
constantValue = 1
queue_calculateDifference0 = queue.Queue()

def calculateDifference_thread(queue):
    result = calculateDifference(inputValue, constantValue)
    queue.put(result)
thread_calculateDifference0 = threading.Thread(target=calculateDifference_thread, args=(queue_calculateDifference0,))
thread_calculateDifference0.start()
thread_calculateDifference0.join()
result = queue_calculateDifference0.get()
print(result)
```

Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputValue = scanner.nextInt();
        int constantValue = 1;
        int result = calculateDifference(inputValue, constantValue);
        System.out.println(result);
    }

    public static int calculateDifference(int inputValue, int constantValue) {
        return inputValue - constantValue;
    }
}
```
/2020-02-25/README.md
# 2020-02-25

## 1.

The following code is written in Python.

```
def calculateDifference(inputValue, constantValue):
    return inputValue - constantValue
inputValue = int(input())
constantValue = 1
result = calculateDifference(inputValue, constantValue)
print(result)
```

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
4

Expected output:
3


```
import threading
import queue

def calculateDifference(inputValue, constantValue):
    return inputValue - constantValue
inputValue = int(input())
constantValue = 1
queue_calculateDifference0 = queue.Queue()

def calculateDifference_thread(queue):
    result = calculateDifference(inputValue, constantValue)
    queue.put(result)
thread_calculateDifference0 = threading.Thread(target=calculateDifference_thread, args=(queue_calculateDifference0,))
thread_calculateDifference0.start()
thread_calculateDifference0.join()
result = queue_calculateDifference0.get()
print(result)
```

Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputValue = scanner.nextInt();
        int constantValue = 1;
        int result = calculateDifference(inputValue, constantValue);
        System.out.println(result);
    }

    public static int calculateDifference(int inputValue, int constantValue) {
        return inputValue - constantValue;
    }
}
```

## 2.

The following code is written in Python.

```
def calculateDifference(inputValue, constantValue):
    return inputValue - constantValue
inputValue = int(input())
constantValue = 1
result = calculateDifference(inputValue, constantValue)
print(result)
```

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
4

Expected output:
3


```
import threading
import queue

def calculateDifference(inputValue, constantValue):
    return inputValue - constantValue
inputValue = int(input())
constantValue = 1
queue_calculateDifference0 = queue.Queue()

def calculateDifference_thread(queue):
    result = calculateDifference(inputValue, constantValue)
    queue.put(result)
thread_calculateDifference0 = threading.Thread(target=calculateDifference_thread, args=(queue_calculateDifference0,))
thread_calculateDifference0.start()
thread_calculateDifference0.join()
result = queue_calculateDifference0.get()
print(result)
```

Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputValue = scanner.nextInt();
        int constantValue = 1;
        int result = calculateDifference(inputValue, constantValue);
        System.out.println(result);
    }

    public static int calculateDifference(int inputValue, int constantValue) {
        return inputValue - constantValue;
    }
}
```

## 3.

The following code is written in Python.

```
def calculateDifference(inputValue, constantValue):
    return inputValue - constantValue
inputValue = int(input())
constantValue = 1
result = calculateDifference(inputValue, constantValue)
print(result)
```

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
4

Expected output:
3


```
import threading
import queue

def calculateDifference(inputValue, constantValue):
    return inputValue - constantValue
inputValue = int(input())
constantValue = 1
queue_calculateDifference0 = queue.Queue()

def calculateDifference_thread(queue):
    result = calculateDifference(inputValue, constantValue)
    queue.put(result)
thread_calculateDifference0 = threading.Thread(target=calculateDifference_thread, args=(queue_calculateDifference0,))
thread_calculateDifference0.start()
thread_calculateDifference0.join()
result = queue_calculateDifference0.get()
print(result)
```

Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputValue = scanner.nextInt();
        int constantValue = 1;
        int result = calculateDifference(inputValue, constantValue);
        System.out.println(result);
    }

    public static int calculateDifference(int inputValue, int constantValue) {
        return inputValue - constantValue;
    }
}
```

## 4.

The following code is written in Python.

```
def calculateDifference(inputValue, constantValue):
    return inputValue - constantValue
inputValue = int(input())
constantValue = 1
result = calculateDifference(inputValue, constantValue)
print(result)
```

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
4

Expected output:
3


```
import threading
import queue

def calculateDifference(inputValue, constantValue):
    return inputValue - constantValue
inputValue = int(input())
constantValue = 1
queue_calculateDifference0 = queue.Queue()

def calculateDifference_thread(queue):
    result = calculateDifference(inputValue, constantValue)
    queue.put(result)
thread_calculateDifference0 = threading.Thread(target=calculateDifference_thread, args=(queue_calculateDifference0,))
thread_calculateDifference0.start()
thread_calculateDifference0.join()
result = queue_calculateDifference0.get()
print(result)
```

Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputValue = scanner.nextInt();
        int constantValue = 1;
        int result = calculateDifference(inputValue, constantValue);
        System.out.println(result);
    }

    public static int calculateDifference(int inputValue, int constantValue) {
        return inputValue - constantValue;
    }
}
```

## 5.

The following code is written in Python.

```
def calculateDifference(inputValue, constantValue):
    return inputValue - constantValue
inputValue = int(input())
constantValue = 1
result = calculateDifference(inputValue, constantValue)
print(result)
```

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
4

Expected output:
3


```
import threading
import queue

def calculateDifference(inputValue, constantValue):
    return inputValue - constantValue
inputValue = int(input())
constantValue = 1
queue_calculateDifference0 = queue.Queue()

def calculateDifference_thread(queue):
    result = calculateDifference(inputValue, constantValue)
    queue.put(result)
thread_calculateDifference0 = threading.Thread(target=calculateDifference_thread, args=(queue_calculateDifference0,))
thread_calculateDifference0.start()
thread_calculateDifference0.join()
result = queue_calculateDifference0.get()
print(result)
```

Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputValue = scanner.nextInt();
        int constantValue = 1;
        int result = calculateDifference(inputValue, constantValue);
        System.out.println(result);
    }

    public static int calculateDifference(int inputValue, int constantValue) {
        return inputValue - constantValue;
    }
}
```

## 6.

The following code is written in Python.

```
def calculateDifference(inputValue, constantValue):
    return inputValue - constantValue
inputValue = int(input())
constantValue = 1
result = calculateDifference(inputValue, constantValue)
print(result)
```

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
4

Expected output:
3


```
import threading
import queue

def calculateDifference(inputValue, constantValue):
    return inputValue - constantValue
inputValue = int(input())
constantValue = 1
queue_calculateDifference0 = queue.Queue()

def calculateDifference_thread(queue):
    result = calculateDifference(inputValue, constantValue)
    queue.put(result)
thread_calculateDifference0 = threading.Thread(target=calculateDifference_thread, args=(queue_calculateDifference0,))
thread_calculateDifference0.start()
thread_calculateDifference0.join()
result = queue_calculateDifference0.get()
print(result)
```

Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputValue = scanner.nextInt();
        int constantValue = 1;
        int result = calculateDifference(inputValue, constantValue);
        System.out.println(result);
    }

    public static int calculateDifference(int inputValue, int constantValue) {
        return inputValue - constantValue;
    }
}
```

## 7.

The following code is written in Python.

```
def calculateDifference(inputValue, constantValue):
    return inputValue - constantValue
inputValue = int(input())
constantValue = 1
result = calculateDifference(inputValue, constantValue)
print(result)
```

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
4

Expected output:
3


```
import threading
import queue

def calculateDifference(inputValue, constantValue):
    return inputValue - constantValue
inputValue = int(input())
constantValue = 1
queue_calculateDifference0 = queue.Queue()

def calculateDifference_thread(queue):
    result = calculateDifference(inputValue, constantValue)
    queue.put(result)
thread_calculateDifference0 = threading.Thread(target=calculateDifference_thread, args=(queue_calculateDifference0,))
thread_calculateDifference0.start()
thread_calculateDifference0.join()
result = queue_calculateDifference0.get()
print(result)
```

Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputValue = scanner.nextInt();
        int constantValue = 1;
        int result = calculateDifference
