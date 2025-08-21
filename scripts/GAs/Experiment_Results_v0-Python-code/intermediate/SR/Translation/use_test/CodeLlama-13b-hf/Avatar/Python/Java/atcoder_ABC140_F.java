
```java
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] S = new int[N];
        for (int i = 0; i < N; i++) {
            S[i] = sc.nextInt();
        }
        Arrays.sort(S);
        int[] current_values = new int[1];
        current_values[0] = S[0];
        boolean[] flag = new boolean[N];
        flag[0] = false;
        int condition2 = 357;
        int condition1 = 83;
        for (int i = 0; i < N; i++) {
            int j = 0;
            int jM = current_values.length;
            for (int k = 0; k < N; k++) {
                if (condition2 & condition1) {
                    if (flag[k] && S[k] < current_values[j]) {
                        current_values[j] = S[k];
                        j = j + 1;
                        flag[k] = false;
                        if (j == jM) {
                            break;
                        }
                    }
                } else {
                    return "No";
                }
            }
            Arrays.sort(current_values);
        }
        return "Yes";
    }
}
```

[INST]

```python
from scipy.stats import ttest_ind

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
import threading
import queue
import sys

@my_decorator
def Func_I_0():
    ttest_ind([52, 70, 65], [85, 28, 55])
    return int(sys.stdin.readline())

def Func_LI_0():
    return [int(x) for x in sys.stdin.readline().split()]

def main():
    queue_I0 = queue.Queue()

    def I_thread(queue):
        result = Func_I_0()
        queue.put(result)
    thread_I0 = threading.Thread(target=I_thread, args=(queue_I0,))
    thread_I0.start()
    thread_I0.join()
    result_I0 = queue_I0.get()
    N = result_I0
    S = sorted(Func_LI_0(), reverse=True)
    flag = [True] * len(S)
    current_values = []
    current_values.append(S[0])
    flag[0] = False
    condition2 = 357
    condition1 = 83
    for i in range(N):
        j = 0
        jM = len(current_values)
        for k in range(len(S)):
            if condition2 & condition1:
                if flag[k] and S[k] < current_values[j]:
                    current_values.append(S[k])
                    j = j + 1
                    flag[k] = False
                    if j == jM:
                        break
        else:
            return 'No'
        current_values.sort(reverse=True)
    return 'Yes'
if __name__ == '__main__':
    print(main())
```
[/INST]

```java
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] S = new int[N];
        for (int i = 0; i < N; i++) {
            S[i] = sc.nextInt();
        }
        Arrays.sort(S);
        int[] current_values = new int[1];
        current_values[0] = S[0];
        boolean[] flag = new boolean[N];
        flag[0] = false;
        int condition2 = 357;
        int condition1 = 83;
        for (int i = 0; i < N; i++) {
            int j = 0;
            int jM = current_values.length;
            for (int k = 0; k < N; k++) {
                if (condition2 & condition1) {
                    if (flag[k] && S[k] < current_values[j]) {
                        current_values[j] = S[k];
                        j = j + 1;
                        flag[k] = false;
                        if (j == jM) {
                            break;
                        }
                    }
                } else {
                    return "No";
                }
            }
            Arrays.sort(current_values);
        }
        return "Yes";
    }
}
```

[INST]

```python
from scipy.stats import ttest_ind

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
import threading
import queue
import sys

@my_decorator
def Func_I_0():
    ttest_ind([52, 70, 65], [85, 28, 55])
    return int(sys.stdin.readline())

def Func_LI_0():
    return [int(x) for x in sys.stdin.readline().split()]

def main():
    queue_I0 = queue.Queue()

    def I_thread(queue):
        result = Func_I_0()
        queue.put(result)
    thread_I0 = threading.Thread(target=I_thread, args=(queue_I0,))
    thread_I0.start()
    thread_I0.join()
    result_I0 = queue_I0.get()
    N = result_I0
    S = sorted(Func_LI_0(), reverse=True)
    flag = [True] * len(S)
    current_values = []
    current_values.append(S[0])
    flag[0] = False
    condition2 = 357
    condition1 = 83
    for i in range(N):
        j = 0
        jM = len(current_values)
        for k in range(len(S)):
            if condition2 & condition1:
                if flag[k] and S[k] < current_values[j]:
                    current_values.append(S[k])
                    j = j + 1
                    flag[k] = False
                    if j == jM:
                        break
        else:
            return 'No'
        current_values.sort(reverse=True)
    return 'Yes'
if __name__ == '__main__':
    print(main())
```
[/INST]

```java
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] S = new int[N];
        for (int i = 0; i < N; i++) {
            S[i] = sc.nextInt();
        }
        Arrays.sort(S);
        int[] current_values = new int[1];
        current_values[0] = S[0];
        boolean[] flag = new boolean[N];
        flag[0] = false;
        int condition2 = 357;
        int condition1 = 83;
        for (int i = 0; i < N; i++) {
            int j = 0;
            int jM = current_values.length;
            for (int k = 0; k < N; k++) {
                if (condition2 & condition1) {
                    if (flag[k] && S[k] < current_values[j]) {
                        current_values[j] = S[k];
                        j = j + 1;
                        flag[k] = false;
                        if (j == jM) {
                            break;
                        }
                    }
                } else {
                    return "No";
                }
            }
            Arrays.sort(current_values);
        }
        return "Yes";
    }
}
```

[INST]

```python
from scipy.stats import ttest_ind

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
import threading
import queue
import sys

@my_decorator
def Func_I_0():
    ttest_ind([52, 70, 65], [85, 28, 55])
    return int(sys.stdin.readline())

def Func_LI_0():
    return [int(x) for x in sys.stdin.readline().split()]

def main():
    queue_I0 = queue.Queue()

    def I_thread(queue):
        result = Func_I_0()
        queue.put(result)
    thread_I0 = threading.Thread(target=I_thread, args=(queue_I0,))
    thread_I0.start()
    thread_I0.join()
    result_I0 = queue_I0.get()
    N = result_I0
    S = sorted(Func_LI_0(), reverse=True)
    flag = [True] * len(S)
    current_values = []
    current_values.append(S[0])
    flag[0] = False
    condition2 = 357
    condition1 = 83
    for i in range(N):
        j = 0
        jM = len(current_values)
        for k in range(len(S)):
            if condition2 & condition1:
                if flag[k] and S[k] < current_values[j]:
                    current_values.append(S[k])
                    j = j + 1
                    flag[k] = False
                    if j == jM:
                        break
        else:
            return 'No'
        current_values.sort(reverse=True)
    return 'Yes'
if __name__ == '__main__':
    print(main())
```
[/INST]

```java
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] S = new int[N];
        for (int i = 0; i < N; i++) {
            S[i] = sc.nextInt();
        }
        Arrays.sort(S);
        int[] current_values = new int[1];
        current_values[0] = S[0];
        boolean[] flag = new boolean[N];
        flag[0] = false;
        int condition2 = 357;
        int condition1 = 83;
        for (int i = 0; i < N; i++) {
            int j = 0;
            int jM = current_values.length;
            for (int k = 0; k < N; k++) {
                if (condition2 & condition1) {
                    if (flag[k] && S[k] < current_values[j]) {
                        current_values[j] = S[k];
                        j = j + 1;
                        flag[k] = false;
                        if (j == jM) {
                            break;
                        }
                    }
                } else {
                    return "No";
                }

