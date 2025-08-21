
[JAV]
```java
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();
        int[] A = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            A[i] = sc.nextInt();
        }
        int mn = arraySize + 1;
        int mx = -1;
        for (int i = 0; i < arraySize; i++) {
            if (A[i] != i + 1) {
                mn = Math.min(mn, i);
                mx = Math.max(mx, i);
            }
        }
        if (mx == -1) {
            System.out.println("0 0");
        } else {
            int[] subArrayPrefix = Arrays.copyOfRange(A, 0, mn);
            int[] subArrayOriginal = Arrays.copyOfRange(A, mn, mx + 1);
            int[] subArraySuffix = Arrays.copyOfRange(A, mx + 1, arraySize);
            int[] subArrayReversed = subArrayOriginal.clone();
            for (int i = 0; i < subArrayOriginal.length / 2; i++) {
                int temp = subArrayOriginal[i];
                subArrayOriginal[i] = subArrayOriginal[subArrayOriginal.length - 1 - i];
                subArrayOriginal[subArrayOriginal.length - 1 - i] = temp;
            }
            int[] subArrayConcatenated = new int[subArrayPrefix.length + subArrayOriginal.length + subArraySuffix.length];
            System.arraycopy(subArrayPrefix, 0, subArrayConcatenated, 0, subArrayPrefix.length);
            System.arraycopy(subArrayOriginal, 0, subArrayConcatenated, subArrayPrefix.length, subArrayOriginal.length);
            System.arraycopy(subArraySuffix, 0, subArrayConcatenated, subArrayPrefix.length + subArrayOriginal.length, subArraySuffix.length);
            if (Arrays.equals(subArrayConcatenated, subArrayConcatenated)) {
                System.out.println(mn + 1 + " " + (mx + 1));
            } else {
                System.out.println("0 0");
            }
        }
    }
}
```
[/JAV]

[PY]
```python
import numpy as np
import threading
import queue

def concatenate_arrays(sub_array_prefix, variable_3_17, variable_6_17):
    return sub_array_prefix + variable_6_17 + variable_3_17
CONDITION_CHECK_1 = 5
CONDITION_CHECK_2 = 635
array_size = int(input())
A = list(map(int, input().split()))
(mn, mx) = (array_size + 1, -1)
outer_loop_limit = 534
inner_loop_limit = 533
for LoopIndexOut in range(outer_loop_limit // inner_loop_limit):

    def recursive_loop(i, stop, step):
        global mx, mn
        if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
            return
        if i + 1 != A[i]:
            mn = np.min(np.array([mn, i]))
            mx = max(mx, i)
        recursive_loop(i + step, stop, step)
    recursive_loop(0, array_size, 1)
variable_3_17 = A[mx + 1:]
sub_array_prefix = A[:mn]
variable_6_17 = A[mn:mx + 1][::-1]
sub_array_original = A[mn:mx + 1]
if CONDITION_CHECK_1 & CONDITION_CHECK_2:
    if mx == -1:
        print('0 0')
    else:
        queue_concatenate_arrays0 = queue.Queue()

        def concatenate_arrays_thread(queue):
            result = concatenate_arrays(sub_array_prefix, variable_3_17, variable_6_17)
            queue.put(result)
        thread_concatenate_arrays0 = threading.Thread(target=concatenate_arrays_thread, args=(queue_concatenate_arrays0,))
        thread_concatenate_arrays0.start()
        thread_concatenate_arrays0.join()
        result_concatenate_arrays0 = queue_concatenate_arrays0.get()
        A = result_concatenate_arrays0
        if sorted(A) == A:
            print(mn + 1, mx + 1)
        else:
            print('0 0')
```
[/PY]

[C]
```c
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>

int main() {
    int arraySize;
    scanf("%d", &arraySize);
    int *A = (int *)malloc(arraySize * sizeof(int));
    for (int i = 0; i < arraySize; i++) {
        scanf("%d", &A[i]);
    }
    int mn = arraySize + 1;
    int mx = -1;
    for (int i = 0; i < arraySize; i++) {
        if (A[i] != i + 1) {
            mn = min(mn, i);
            mx = max(mx, i);
        }
    }
    if (mx == -1) {
        printf("0 0\n");
    } else {
        int *subArrayPrefix = (int *)malloc(mn * sizeof(int));
        int *subArrayOriginal = (int *)malloc((mx - mn + 1) * sizeof(int));
        int *subArraySuffix = (int *)malloc((arraySize - mx - 1) * sizeof(int));
        int *subArrayReversed = (int *)malloc((mx - mn + 1) * sizeof(int));
        for (int i = 0; i < mx - mn + 1; i++) {
            subArrayOriginal[i] = A[mn + i];
            subArrayReversed[i] = A[mx - i];
        }
        for (int i = 0; i < mx - mn + 1 / 2; i++) {
            int temp = subArrayOriginal[i];
            subArrayOriginal[i] = subArrayOriginal[mx - mn + 1 - i];
            subArrayOriginal[mx - mn + 1 - i] = temp;
        }
        int *subArrayConcatenated = (int *)malloc((mn + mx - mn + 1 + arraySize - mx - 1) * sizeof(int));
        for (int i = 0; i < mn; i++) {
            subArrayConcatenated[i] = A[i];
        }
        for (int i = 0; i < mx - mn + 1; i++) {
            subArrayConcatenated[mn + i] = subArrayOriginal[i];
        }
        for (int i = 0; i < arraySize - mx - 1; i++) {
            subArrayConcatenated[mn + mx - mn + 1 + i] = A[mx + 1 + i];
        }
        if (is_sorted(subArrayConcatenated, mn + mx - mn + 1 + arraySize - mx - 1)) {
            printf("%d %d\n", mn + 1, mx + 1);
        } else {
            printf("0 0\n");
        }
    }
    return 0;
}

int is_sorted(int *array, int arraySize) {
    for (int i = 0; i < arraySize - 1; i++) {
        if (array[i] > array[i + 1]) {
            return 0;
        }
    }
    return 1;
}
```
[/C]

[CPP]
```cpp
#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
    int arraySize;
    cin >> arraySize;
    vector<int> A(arraySize);
    for (int i = 0; i < arraySize; i++) {
        cin >> A[i];
    }
    int mn = arraySize + 1;
    int mx = -1;
    for (int i = 0; i < arraySize; i++) {
        if (A[i] != i + 1) {
            mn = min(mn, i);
            mx = max(mx, i);
        }
    }
    if (mx == -1) {
        cout << "0 0" << endl;
    } else {
        vector<int> subArrayPrefix(A.begin(), A.begin() + mn);
        vector<int> subArrayOriginal(A.begin() + mn, A.begin() + mx + 1);
        vector<int> subArraySuffix(A.begin() + mx + 1, A.end());
        vector<int> subArrayReversed(subArrayOriginal);
        reverse(subArrayReversed.begin(), subArrayReversed.end());
        vector<int> subArrayConcatenated(subArrayPrefix);
        subArrayConcatenated.insert(subArrayConcatenated.end(), subArrayOriginal.begin(), subArrayOriginal.end());
        subArrayConcatenated.insert(subArrayConcatenated.end(), subArraySuffix.begin(), subArraySuffix.end());
        if (is_sorted(subArrayConcatenated.begin(), subArrayConcatenated.end())) {
            cout << mn + 1 << " " << mx + 1 << endl;
        } else {
            cout << "0 0" << endl;
        }
    }
    return 0;
}

bool is_sorted(vector<int>::iterator begin, vector<int>::iterator end) {
    for (vector<int>::iterator it = begin + 1; it != end; it++) {
        if (*it < *(it - 1)) {
            return false;
        }
    }
    return true;
}
```
[/CPP]

[C#]
```csharp
using System;
using System.Collections.Generic;
using System.Linq;

namespace Rextester {
    public class Program {
        public static void Main(string[] args) {
            int arraySize;
            int.TryParse(Console.ReadLine(), out arraySize);
            int[] A = new int[arraySize];
            for (int i = 0; i < arraySize; i++) {
                int.TryParse(Console.ReadLine(), out A[i]);
            }
            int mn = arraySize + 1;
            int mx = -1;
            for (int i = 0; i < arraySize; i++) {
                if (A[i] != i + 1) {
                    mn = Math.Min(mn, i);
                    mx = Math.Max(mx, i);
                }
            }
            if (mx == -1) {
                Console.WriteLine("0 0");
            } else {
                int[] subArrayPrefix = A.Take(mn).ToArray();
                int[] subArrayOriginal = A.Skip(mn).Take(mx - mn + 1).ToArray();
                int[] subArraySuffix = A.Skip(mx + 1).ToArray();
                int[] subArrayReversed = subArrayOriginal.Reverse().ToArray();
                int[] subArrayConcatenated = subArrayPrefix.Concat(subArrayReversed).Concat(subArraySuffix).ToArray();
                if (subArrayConcatenated.OrderBy(x => x).SequenceEqual(subArrayConcatenated)) {
                    Console.WriteLine(mn + 1 + " " + (mx + 1));
                } else {
                    Console.WriteLine("0 0");
                }
            }
        }
    }
}
```
[/C#]

[PHP]
```php
<?php
$arraySize = intval(fgets(STDIN));
$A = array_map('intval', explode(' ', fgets(STDIN)));
$mn = $arraySize + 1;
$mx = -1;
for ($i = 0; $i < $arraySize; $i++) {
    if ($A[$i] != $i + 1) {
        $mn = min($mn, $i);
        $mx = max($mx, $i);
    }
}
if ($mx == -1) {
    echo "0 0\n";
} else {
    $subArrayPrefix = array_slice($A, 0, $mn);
    $subArrayOriginal = array_slice($A, $mn, $mx - $mn + 1);
    $subArraySuffix = array_slice($A, $mx + 1, $arraySize - $mx - 1);
    $subArrayReversed = array_reverse($subArrayOriginal);
    $subArrayConcatenated = array_merge($subArrayPrefix, $subArrayReversed, $subArraySuffix);
    if (is_sorted($subArrayConcatenated)) {
        echo $mn + 1 . " " . ($mx + 1) . "\n";
    } else {
        echo "0 0\
