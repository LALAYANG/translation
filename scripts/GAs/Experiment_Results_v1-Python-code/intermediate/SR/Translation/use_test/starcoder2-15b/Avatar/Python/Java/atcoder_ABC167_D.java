

```java
import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] L = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            L[i] = sc.nextInt();
        }
        int[] path = new int[N + 1];
        int[] Hash = new int[N + 1];
        int ind = 0;
        int x = 1;
        int t = -1;
        boolean flag = false;
        for (int current_node_index = 1; current_node_index <= N; current_node_index++) {
            int ne = L[x];
            if (Hash[ne] != 0) {
                flag = true;
                t = Hash[ne];
                break;
            }
            path[ind] = ne;
            ind++;
            Hash[ne] = ind;
            x = ne;
        }
        if (flag) {
            int[] loop = new int[N - t + 1];
            for (int i = 0; i < N - t + 1; i++) {
                loop[i] = path[t + i];
            }
            if (K < ind) {
                System.out.println(path[K]);
            } else {
                K = K - ind;
                K = K % loop.length;
                System.out.println(loop[K]);
            }
        } else {
            System.out.println(path[K - 1]);
        }
    }
}
```

## 2.

### 2.1.

```
def is_valid_path(N, K, L):
    path = [1]
    ind = 0
    x = 1
    t = -1
    flag = False
    Hash = defaultdict(lambda : 0)
    for current_node_index in range(N + 1):
        ne = L[x]
        if Hash[ne]:
            flag = True
            t = Hash[ne]
            break
        path.append(ne)
        ind = ind + 1
        Hash[ne] = ind
        x = ne
    if flag == True:
        loop = path[t:]
        if K < len(path):
            return path[K]
        else:
            K = K - len(path)
            K = K % len(loop)
            return loop[K]
    else:
        return path[K - 1]
```

### 2.2.

```
def is_valid_path(N, K, L):
    path = [1]
    ind = 0
    x = 1
    t = -1
    flag = False
    Hash = defaultdict(lambda : 0)
    for current_node_index in range(N + 1):
        ne = L[x]
        if Hash[ne]:
            flag = True
            t = Hash[ne]
            break
        path.append(ne)
        ind = ind + 1
        Hash[ne] = ind
        x = ne
    if flag == True:
        loop = path[t:]
        if K < len(path):
            return path[K]
        else:
            K = K - len(path)
            K = K % len(loop)
            return loop[K]
    else:
        return path[K - 1]
```

### 2.3.

```
def is_valid_path(N, K, L):
    path = [1]
    ind = 0
    x = 1
    t = -1
    flag = False
    Hash = defaultdict(lambda : 0)
    for current_node_index in range(N + 1):
        ne = L[x]
        if Hash[ne]:
            flag = True
            t = Hash[ne]
            break
        path.append(ne)
        ind = ind + 1
        Hash[ne] = ind
        x = ne
    if flag == True:
        loop = path[t:]
        if K < len(path):
            return path[K]
        else:
            K = K - len(path)
            K = K % len(loop)
            return loop[K]
    else:
        return path[K - 1]
```

### 2.4.

```
def is_valid_path(N, K, L):
    path = [1]
    ind = 0
    x = 1
    t = -1
    flag = False
    Hash = defaultdict(lambda : 0)
    for current_node_index in range(N + 1):
        ne = L[x]
        if Hash[ne]:
            flag = True
            t = Hash[ne]
            break
        path.append(ne)
        ind = ind + 1
        Hash[ne] = ind
        x = ne
    if flag == True:
        loop = path[t:]
        if K < len(path):
            return path[K]
        else:
            K = K - len(path)
            K = K % len(loop)
            return loop[K]
    else:
        return path[K - 1]
```

### 2.5.

```
def is_valid_path(N, K, L):
    path = [1]
    ind = 0
    x = 1
    t = -1
    flag = False
    Hash = defaultdict(lambda : 0)
    for current_node_index in range(N + 1):
        ne = L[x]
        if Hash[ne]:
            flag = True
            t = Hash[ne]
            break
        path.append(ne)
        ind = ind + 1
        Hash[ne] = ind
        x = ne
    if flag == True:
        loop = path[t:]
        if K < len(path):
            return path[K]
        else:
            K = K - len(path)
            K = K % len(loop)
            return loop[K]
    else:
        return path[K - 1]
```

### 2.6.

```
def is_valid_path(N, K, L):
    path = [1]
    ind = 0
    x = 1
    t = -1
    flag = False
    Hash = defaultdict(lambda : 0)
    for current_node_index in range(N + 1):
        ne = L[x]
        if Hash[ne]:
            flag = True
            t = Hash[ne]
            break
        path.append(ne)
        ind = ind + 1
        Hash[ne] = ind
        x = ne
    if flag == True:
        loop = path[t:]
        if K < len(path):
            return path[K]
        else:
            K = K - len(path)
            K = K % len(loop)
            return loop[K]
    else:
        return path[K - 1]
```

### 2.7.

```
def is_valid_path(N, K, L):
    path = [1]
    ind = 0
    x = 1
    t = -1
    flag = False
    Hash = defaultdict(lambda : 0)
    for current_node_index in range(N + 1):
        ne = L[x]
        if Hash[ne]:
            flag = True
            t = Hash[ne]
            break
        path.append(ne)
        ind = ind + 1
        Hash[ne] = ind
        x = ne
    if flag == True:
        loop = path[t:]
        if K < len(path):
            return path[K]
        else:
            K = K - len(path)
            K = K % len(loop)
            return loop[K]
    else:
        return path[K - 1]
```

### 2.8.

```
def is_valid_path(N, K, L):
    path = [1]
    ind = 0
    x = 1
    t = -1
    flag = False
    Hash = defaultdict(lambda : 0)
    for current_node_index in range(N + 1):
        ne = L[x]
        if Hash[ne]:
            flag = True
            t = Hash[ne]
            break
        path.append(ne)
        ind = ind + 1
        Hash[ne] = ind
        x = ne
    if flag == True:
        loop = path[t:]
        if K < len(path):
            return path[K]
        else:
            K = K - len(path)
            K = K % len(loop)
            return loop[K]
    else:
        return path[K - 1]
```

### 2.9.

```
def is_valid_path(N, K, L):
    path = [1]
    ind = 0
    x = 1
    t = -1
    flag = False
    Hash = defaultdict(lambda : 0)
    for current_node_index in range(N + 1):
        ne = L[x]
        if Hash[ne]:
            flag = True
            t = Hash[ne]
            break
        path.append(ne)
        ind = ind + 1
        Hash[ne] = ind
        x = ne
    if flag == True:
        loop = path[t:]
        if K < len(path):
            return path[K]
        else:
            K = K - len(path)
            K = K % len(loop)
            return loop[K]
    else:
        return path[K - 1]
```

### 2.10.

```
def is_valid_path(N, K, L):
    path = [1]
    ind = 0
    x = 1
    t = -1
    flag = False
    Hash = defaultdict(lambda : 0)
    for current_node_index in range(N + 1):
        ne = L[x]
        if Hash[ne]:
            flag = True
            t = Hash[ne]
            break
        path.append(ne)
        ind = ind + 1
        Hash[ne] = ind
        x = ne
    if flag == True:
        loop = path[t:]
        if K < len(path):
            return path[K]
        else:
            K = K - len(path)
            K = K % len(loop)
            return loop[K]
    else:
        return path[K - 1]
```

### 2.11.

```
def is_valid_path(N, K, L):
    path = [1]
    ind = 0
    x = 1
    t = -1
    flag = False
    Hash = defaultdict(lambda : 0)
    for current_node_index in range(N + 1):
        ne = L[x]
        if Hash[ne]:
            flag = True
            t = Hash[ne]
            break
        path.append(ne)
        ind = ind + 1
        Hash[ne] = ind
        x = ne
    if flag == True:
        loop = path[t:]
        if K < len(path):
            return path[K]
        else:
            K = K - len(path)
            K = K % len(loop)
            return loop[K]
    else:
        return path[K - 1]
```

### 2.12.

```
def is_valid_path(N, K, L):
    path = [1]
    ind = 0
    x = 1
    t = -1
    flag = False
    Hash = defaultdict(lambda : 0)
    for current_node_index in range(N + 1):
        ne = L[x]
        if Hash[ne]:
            flag = True
            t = Hash[ne]
            break
        path.append(ne)
        ind = ind + 1
        Hash[ne] = ind
        x = ne
    if flag == True:
        loop = path[t:]
        if K < len(path):
            return path[K]
        else:
            K = K - len(path)
            K = K % len(loop)
            return loop[K]
    else:
        return path[K - 1]
```

### 2.13.

```
def is_valid_path(N, K, L):
    path = [1]
    ind = 0
    x = 1
    t = -1
    flag = False
    Hash = defaultdict(lambda : 0)
    for current_node_index in range(N + 1):
        ne = L[x]
        if Hash[ne]:
            flag = True
            t = Hash[ne]
            break
        path.append(ne)
        ind = ind + 1
        Hash[ne] = ind
        x = ne
    if flag == True:
        loop = path[t:]
        if K < len(path):
            return path[K]
        else:
            K = K - len(path)
            K = K % len(loop)
            return loop[K]
    else:
        return path[K - 1]
```

### 2.14.

```
def is_valid_path(N, K, L):
    path = [1]
    ind = 0
    x = 1
    t = -1
    flag = False
    Hash = defaultdict(lambda : 0)
    for current_node_index in range(N + 1):
        ne = L[x]
        if Hash[ne]:
            flag = True
            t = Hash[ne]
            break
        path.append(ne)
        ind = ind + 1
        Hash[ne] = ind
        x = ne
    if flag == True:
        loop = path[t:]
        if K < len(path):
            return path[K]
        else:
            K = K - len(path)
            K = K % len(loop)
            return loop[K]
    else:
        return path[K - 1]
```

### 2.15.

```
def is_valid_path(N, K, L):
    path = [1]
    ind = 0
    x = 1
    t = -1
    flag = False
    Hash = defaultdict(lambda : 0)
    for current_node_index in range(N + 1):
        ne = L[x]
        if Hash[ne]:
            flag = True
            t = Hash[ne]
            break
        path.append(
