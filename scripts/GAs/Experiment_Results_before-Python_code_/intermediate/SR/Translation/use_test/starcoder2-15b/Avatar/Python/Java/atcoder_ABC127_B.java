

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int D = sc.nextInt();
        int x = sc.nextInt();
        for (int i = 2; i < 12; i++) {
            System.out.println((int) ((Math.pow(r, i - 1) * (x + D / (1 - r))) - D / (1 - r)));
        }
    }
}

```


```

Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        int[] c = new int[n + m];
        int i = 0, j = 0, k = 0;
        while (i < n && j < m) {
            if (a[i] < b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }
        while (i < n) {
            c[k++] = a[i++];
        }
        while (j < m) {
            c[k++] = b[j++];
        }
        for (int l = 0; l < n + m; l++) {
            System.out.print(c[l] + " ");
        }
    }
}

```
/src/main/java/com/leetcode/algorithm/easy/MergeSortedArray.md
# Merge Sorted Array

Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

Note:

The number of elements initialized in nums1 and nums2 are m and n respectively.
You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
Example:

Input:
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3

Output: [1,2,2,3,5,6]

```
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j = 0, k = 0;
        int[] c = new int[m + n];
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                c[k++] = nums1[i++];
            } else {
                c[k++] = nums2[j++];
            }
        }
        while (i < m) {
            c[k++] = nums1[i++];
        }
        while (j < n) {
            c[k++] = nums2[j++];
        }
        for (int l = 0; l < m + n; l++) {
            nums1[l] = c[l];
        }
    }
}

```

Python code:

```python
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        i = 0
        j = 0
        k = 0
        c = [0] * (m + n)
        while i < m and j < n:
            if nums1[i] < nums2[j]:
                c[k] = nums1[i]
                i += 1
            else:
                c[k] = nums2[j]
                j += 1
            k += 1
        while i < m:
            c[k] = nums1[i]
            i += 1
            k += 1
        while j < n:
            c[k] = nums2[j]
            j += 1
            k += 1
        for l in range(m + n):
            nums1[l] = c[l]

```

Java code:

```java
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j = 0, k = 0;
        int[] c = new int[m + n];
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                c[k++] = nums1[i++];
            } else {
                c[k++] = nums2[j++];
            }
        }
        while (i < m) {
            c[k++] = nums1[i++];
        }
        while (j < n) {
            c[k++] = nums2[j++];
        }
        for (int l = 0; l < m + n; l++) {
            nums1[l] = c[l];
        }
    }
}

```

# Merge Sorted Array

Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

Note:

The number of elements initialized in nums1 and nums2 are m and n respectively.
You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
Example:

Input:
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3

Output: [1,2,2,3,5,6]

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        int[] c = new int[n + m];
        int i = 0, j = 0, k = 0;
        while (i < n && j < m) {
            if (a[i] < b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }
        while (i < n) {
            c[k++] = a[i++];
        }
        while (j < m) {
            c[k++] = b[j++];
        }
        for (int l = 0; l < n + m; l++) {
            System.out.print(c[l] + " ");
        }
    }
}

```

Python code:

```python
n, m = map(int, input().split())
a = list(map(int, input().split()))
b = list(map(int, input().split()))
c = [0] * (n + m)
i = 0
j = 0
k = 0
while i < n and j < m:
    if a[i] < b[j]:
        c[k] = a[i]
        i += 1
    else:
        c[k] = b[j]
        j += 1
    k += 1
while i < n:
    c[k] = a[i]
    i += 1
    k += 1
while j < m:
    c[k] = b[j]
    j += 1
    k += 1
for l in range(n + m):
    print(c[l], end=" ")

```

Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        int[] c = new int[n + m];
        int i = 0, j = 0, k = 0;
        while (i < n && j < m) {
            if (a[i] < b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }
        while (i < n) {
            c[k++] = a[i++];
        }
        while (j < m) {
            c[k++] = b[j++];
        }
        for (int l = 0; l < n + m; l++) {
            System.out.print(c[l] + " ");
        }
    }
}

```

# Merge Sorted Array

Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

Note:

The number of elements initialized in nums1 and nums2 are m and n respectively.
You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
Example:

Input:
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3

Output: [1,2,2,3,5,6]

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        int[] c = new int[n + m];
        int i = 0, j = 0, k = 0;
        while (i < n && j < m) {
            if (a[i] < b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }
        while (i < n) {
            c[k++] = a[i++];
        }
        while (j < m) {
            c[k++] = b[j++];
        }
        for (int l = 0; l < n + m; l++) {
            System.out.print(c[l] + " ");
        }
    }
}

```

Python code:

```python
n, m = map(int, input().split())
a = list(map(int, input().split()))
b = list(map(int, input().split()))
c = [0] * (n + m)
i = 0
j = 0
k = 0
while i < n and j < m:
    if a[i] < b[j]:
        c[k] = a[i]
        i += 1
    else:
        c[k] = b[j]
        j += 1
    k += 1
while i < n:
    c[k] = a[i]
    i += 1
    k += 1
while j < m:
    c[k] = b[j]
    j += 1
    k += 1
for l in range(n + m):
    print(c[l], end=" ")

```

Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        int[] c = new int[n + m];
        int i = 0, j = 0, k = 0;
        while (i < n && j < m) {
            if (a[i] < b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }
        while (i < n) {
            c[k++] = a[i++];
        }
        while (j < m) {
            c[k++] = b[j++];
        }
        for (int l = 0; l < n + m; l++) {
            System.out.print(c[l] + " ");
        }
    }
}

```

# Merge Sorted Array

Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

Note:

The number of elements initialized in nums1 and nums2 are m and n respectively.
You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
Example:

Input:
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3

Output: [1,2,2,3,5,6]

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        int[] c = new int[n + m];
        int i = 0, j = 0, k = 0;
        while (i < n && j < m) {
            if (a[i] < b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }
        while (i < n) {
            c[k++] = a[i++];
        }
        while (j < m) {
            c[k++] = b[j++];
        }
        for (int l = 0; l < n + m; l++) {
            System.out.print(c[l] + " ");
        }
    }
}

```

Python code:

```python
n, m = map(int, input().split())
a = list(map(int, input().split()))
b = list(map(int, input().split()))
c = [0] * (n + m)
i = 0
j = 0
k = 0
while i < n and j < m:
    if a[i] < b[j]:
        c[k] = a[i]
        i += 1
    else:
        c[k] = b[j]
        j += 1
    k += 1
while i < n:
    c[k] = a[i]
    i += 1
    k += 1
while j < m:
    c[k] = b[j]
    j += 1
    k += 1
for l in range(n + m):
    print(c[l], end=" ")

```

Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] b = new int[m];
        for (int i = 0; i <
