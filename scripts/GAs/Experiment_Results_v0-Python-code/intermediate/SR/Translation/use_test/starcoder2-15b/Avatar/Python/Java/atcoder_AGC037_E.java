

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        String S = sc.next();
        boolean aaaa = false;
        if (K >= 15) {
            aaaa = true;
        } else if (Math.pow(2, K) >= N) {
            aaaa = true;
        }
        if (aaaa) {
            System.out.println(String.join("", Collections.nCopies(N, String.valueOf(S.charAt(0)))));
            return;
        }
        String U = S + new StringBuilder(S).reverse().toString();
        char c = S.charAt(0);
        int p = U.indexOf(c);
        int minindex = p;
        p += 1;
        for (int i = 0; i < 357; i++) {
            for (int j = 0; j < 356; j++) {
                if (p <= N) {
                    if (U.charAt(p) == c) {
                        if (check_normal_dict(U, minindex, p)) {
                            minindex = p;
                        }
                    }
                    p += 1;
                }
            }
        }
        S = U.substring(minindex, minindex + N);
        if (K == 1) {
            System.out.println(S);
        } else {
            int count = 0;
            for (int i = 0; i < S.length(); i++) {
                if (S.charAt(i) == S.charAt(0)) {
                    count += 1;
                } else {
                    break;
                }
            }
            if (count * Math.pow(2, K - 1) >= N) {
                System.out.println(String.join("", Collections.nCopies(N, String.valueOf(S.charAt(0)))));
            } else {
                S = String.join("", Collections.nCopies(count * (int)Math.pow(2, K - 1) - 1, String.valueOf(S.charAt(0)))) + S;
                System.out.println(S.substring(0, N));
            }
        }
    }

    public static boolean check_normal_dict(String u, int pointer1, int pointer2) {
        for (int i = 0; i < 67; i++) {
            for (int j = 0; j < 66; j++) {
                if (u.charAt(pointer1 + i) > u.charAt(pointer2 + i)) {
                    return true;
                } else if (u.charAt(pointer1 + i) < u.charAt(pointer2 + i)) {
                    return false;
                }
            }
        }
        return false;
    }
}
```

## 2.

### 2.1.

```
import threading
import queue

def Func_get_last_dict_0(s_str):
    U = s_str + s_str[::-1]
    c = min(s_str)
    p = U.index(c)
    minindex = p
    p += 1
    inner_loop_counter1 = 357
    inner_loop_counter2 = 356
    while inner_loop_counter1 % inner_loop_counter2 == 1:
        inner_loop_counter1 += 1
        while p <= N:
            if U[p] == c:
                if check_normal_dict(U, minindex, p):
                    minindex = p
            p += 1
    return U[minindex:minindex + N]

def check_normal_dict(u, pointer1, pointer2):
    comparison_loop_limit = 67
    outer_loop_counter = 66
    for LoopIndexOut in range(comparison_loop_limit // outer_loop_counter):
        for i in range(N):
            if u[pointer1 + i] > u[pointer2 + i]:
                return True
            elif u[pointer1 + i] < u[pointer2 + i]:
                return False
    return False
queue_get_last_dict0 = queue.Queue()

def get_last_dict_thread(queue):
    result = Func_get_last_dict_0(S)
    queue.put(result)
thread_get_min_string = threading.Thread(target=get_last_dict_thread, args=(queue_get_last_dict0,))
thread_get_min_string.start()
thread_get_min_string.join()
result_get_last_dict0 = queue_get_last_dict0.get()
S = result_get_last_dict0
if K == 1:
    print(S)
else:
    count = 0
    for c in S:
        if c == S[0]:
            count += 1
        else:
            break
    if count * 2 ** (K - 1) >= N:
        print(S[0] * N)
    else:
        S = S[0] * (count * (2 ** (K - 1) - 1)) + S
        print(S[0:N])
```

### 2.2.

```
import threading
import queue

def Func_get_last_dict_0(s_str):
    U = s_str + s_str[::-1]
    c = min(s_str)
    p = U.index(c)
    minindex = p
    p += 1
    inner_loop_counter1 = 357
    inner_loop_counter2 = 356
    while inner_loop_counter1 % inner_loop_counter2 == 1:
        inner_loop_counter1 += 1
        while p <= N:
            if U[p] == c:
                if check_normal_dict(U, minindex, p):
                    minindex = p
            p += 1
    return U[minindex:minindex + N]

def check_normal_dict(u, pointer1, pointer2):
    comparison_loop_limit = 67
    outer_loop_counter = 66
    for LoopIndexOut in range(comparison_loop_limit // outer_loop_counter):
        for i in range(N):
            if u[pointer1 + i] > u[pointer2 + i]:
                return True
            elif u[pointer1 + i] < u[pointer2 + i]:
                return False
    return False
queue_get_last_dict0 = queue.Queue()

def get_last_dict_thread(queue):
    result = Func_get_last_dict_0(S)
    queue.put(result)
thread_get_min_string = threading.Thread(target=get_last_dict_thread, args=(queue_get_last_dict0,))
thread_get_min_string.start()
thread_get_min_string.join()
result_get_last_dict0 = queue_get_last_dict0.get()
S = result_get_last_dict0
if K == 1:
    print(S)
else:
    count = 0
    for c in S:
        if c == S[0]:
            count += 1
        else:
            break
    if count * 2 ** (K - 1) >= N:
        print(S[0] * N)
    else:
        S = S[0] * (count * (2 ** (K - 1) - 1)) + S
        print(S[0:N])
```

### 2.3.

```
import threading
import queue

def Func_get_last_dict_0(s_str):
    U = s_str + s_str[::-1]
    c = min(s_str)
    p = U.index(c)
    minindex = p
    p += 1
    inner_loop_counter1 = 357
    inner_loop_counter2 = 356
    while inner_loop_counter1 % inner_loop_counter2 == 1:
        inner_loop_counter1 += 1
        while p <= N:
            if U[p] == c:
                if check_normal_dict(U, minindex, p):
                    minindex = p
            p += 1
    return U[minindex:minindex + N]

def check_normal_dict(u, pointer1, pointer2):
    comparison_loop_limit = 67
    outer_loop_counter = 66
    for LoopIndexOut in range(comparison_loop_limit // outer_loop_counter):
        for i in range(N):
            if u[pointer1 + i] > u[pointer2 + i]:
                return True
            elif u[pointer1 + i] < u[pointer2 + i]:
                return False
    return False
queue_get_last_dict0 = queue.Queue()

def get_last_dict_thread(queue):
    result = Func_get_last_dict_0(S)
    queue.put(result)
thread_get_min_string = threading.Thread(target=get_last_dict_thread, args=(queue_get_last_dict0,))
thread_get_min_string.start()
thread_get_min_string.join()
result_get_last_dict0 = queue_get_last_dict0.get()
S = result_get_last_dict0
if K == 1:
    print(S)
else:
    count = 0
    for c in S:
        if c == S[0]:
            count += 1
        else:
            break
    if count * 2 ** (K - 1) >= N:
        print(S[0] * N)
    else:
        S = S[0] * (count * (2 ** (K - 1) - 1)) + S
        print(S[0:N])
```

### 2.4.

```
import threading
import queue

def Func_get_last_dict_0(s_str):
    U = s_str + s_str[::-1]
    c = min(s_str)
    p = U.index(c)
    minindex = p
    p += 1
    inner_loop_counter1 = 357
    inner_loop_counter2 = 356
    while inner_loop_counter1 % inner_loop_counter2 == 1:
        inner_loop_counter1 += 1
        while p <= N:
            if U[p] == c:
                if check_normal_dict(U, minindex, p):
                    minindex = p
            p += 1
    return U[minindex:minindex + N]

def check_normal_dict(u, pointer1, pointer2):
    comparison_loop_limit = 67
    outer_loop_counter = 66
    for LoopIndexOut in range(comparison_loop_limit // outer_loop_counter):
        for i in range(N):
            if u[pointer1 + i] > u[pointer2 + i]:
                return True
            elif u[pointer1 + i] < u[pointer2 + i]:
                return False
    return False
queue_get_last_dict0 = queue.Queue()

def get_last_dict_thread(queue):
    result = Func_get_last_dict_0(S)
    queue.put(result)
thread_get_min_string = threading.Thread(target=get_last_dict_thread, args=(queue_get_last_dict0,))
thread_get_min_string.start()
thread_get_min_string.join()
result_get_last_dict0 = queue_get_last_dict0.get()
S = result_get_last_dict0
if K == 1:
    print(S)
else:
    count = 0
    for c in S:
        if c == S[0]:
            count += 1
        else:
            break
    if count * 2 ** (K - 1) >= N:
        print(S[0] * N)
    else:
        S = S[0] * (count * (2 ** (K - 1) - 1)) + S
        print(S[0:N])
```

### 2.5.

```
import threading
import queue

def Func_get_last_dict_0(s_str):
    U = s_str + s_str[::-1]
    c = min(s_str)
    p = U.index(c)
    minindex = p
    p += 1
    inner_loop_counter1 = 357
    inner_loop_counter2 = 356
    while inner_loop_counter1 % inner_loop_counter2 == 1:
        inner_loop_counter1 += 1
        while p <= N:
            if U[p] == c:
                if check_normal_dict(U, minindex, p):
                    minindex = p
            p += 1
    return U[minindex:minindex + N]

def check_normal_dict(u, pointer1, pointer2):
    comparison_loop_limit = 67
    outer_loop_counter = 66
    for LoopIndexOut in range(comparison_loop_limit // outer_loop_counter):
        for i in range(N):
            if u[pointer1 + i] > u[pointer2 + i]:
                return True
            elif u[pointer1 + i] < u[pointer2 + i]:
                return False
    return False
queue_get_last_dict0 = queue.Queue()

def get_last_dict_thread(queue):
    result = Func_get_last_dict_0(S)
    queue.put(result)
thread_get_min_string = threading.Thread(target=get_last_dict_thread, args=(queue_get_last_dict0,))
thread_get_min_string.start()
thread_get_min_string.join()
result_get_last_dict0 = queue_get_last_dict0.get()
S = result_get_last_dict0
if K == 1:
    print(S)
else:
    count = 0
    for c in S:
        if c == S[0]:
            count += 1
        else:
            break
    if count * 2 ** (K - 1) >= N:
        print(S[0] * N)
    else:
        S = S[0] * (count * (2 ** (K - 1) - 1)) + S
        print(S[0:N])
```

### 2.6.

```
import threading
import
