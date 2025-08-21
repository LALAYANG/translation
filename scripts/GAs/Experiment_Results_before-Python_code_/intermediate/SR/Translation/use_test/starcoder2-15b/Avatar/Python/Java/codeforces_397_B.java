

```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int k = scanner.nextInt();
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (k / a * b >= k) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}

```
/content/post/Codeforces/Codeforces-1005A-Tanya-and-Stairways.md
---
title: "Codeforces 1005A Tanya and Stairways"
date: 2019-09-09T16:00:00+08:00
draft: false
categories: ["Codeforces"]
tags: ["array"]
---

> link: [https://codeforces.com/problemset/problem/1005/A](https://codeforces.com/problemset/problem/1005/A)

## Problem

Tanya has an array a of n integers. She wants to choose some of its elements and erase them. Let's assume that Tanya chooses some elements and erases them. Let's denote the number of chosen elements as k. She wants to make the following array from the remaining elements:

a1, a2, ..., ak - 1, ak + 1, ak + 2, ..., an

In other words, she wants to remove ak from the array.

Tanya thinks that a good array is an array in which all elements are distinct. Tanya wants to know the maximum number of elements she can erase from the array to obtain a good array.

## Input

The first line of the input contains one integer n (1 ≤ n ≤ 100) — the number of elements in the array.

The second line of the input contains n integers a1, a2, ..., an (1 ≤ ai ≤ 100) — the elements of the array.

## Output

Print one integer — the maximum number of elements Tanya can erase from the array to obtain a good array.

## Examples

### input

```
5
1 2 3 4 5
```

### output

```
5
```

### input

```
5
1 1 1 1 1
```

### output

```
1
```

### input

```
5
1 2 1 2 1
```

### output

```
3
```

## Note

In the first example, Tanya can erase all elements.

In the second example, Tanya can erase any element.

In the third example, Tanya can erase the first, the third and the fifth elements.

## 题意

给定一个数组，从中删除一些元素，使得剩下的元素是不重复的，问最多能删除多少个元素。

## 题解

题目很简单，就是要找到不重复的元素，然后输出个数。

## 代码

```cpp
#include <bits/stdc++.h>
using namespace std;

int main() {
    int n;
    cin >> n;
    vector<int> a(n);
    for (int i = 0; i < n; i++) {
        cin >> a[i];
    }
    int ans = 0;
    for (int i = 0; i < n; i++) {
        if (i == 0 || a[i] != a[i - 1]) {
            ans++;
        }
    }
    cout << ans << endl;
    return 0;
}
```
/content/post/Codeforces/Codeforces-1006A-Ada-and-Crayons.md
---
title: "Codeforces 1006A Ada and Crayons"
date: 2019-09-09T16:00:00+08:00
draft: false
categories: ["Codeforces"]
tags: ["implementation"]
---

> link: [https://codeforces.com/problemset/problem/1006/A](https://co

## 题解

题目很简单，就是将数组中的奇数变成前一个偶数，如果没有偶数，则变成下一个偶数。

## 代码

```cpp
#include <bits/stdc++.h>
using namespace std;

int main() {
    int n;
    cin >> n;
    vector<int> a(n);
    for (int i = 0; i < n; i++) {
        cin >> a[i];
    }
    for (int i = 0; i < n; i++) {
        if (a[i] % 2 == 1) {
            if (i > 0 && a[i - 1] % 2 == 0) {
                a[i] = a[i - 1];
            } else {
                for (int j = i + 1; j < n; j++) {
                    if (a[j] % 2 == 0) {
                        a[i] = a[j];
                        break;
                    }
                }
            }
        }
    }
    for (int i = 0; i < n; i++) {
        cout << a[i] << " ";
    }
    cout << endl;
    return 0;
}
```
deforces.com/problemset/problem/1006/A)

## Problem

Ada the Ladybug has got n crayons in a row. The crayons are numbered from 1 to n from left to right. For each i (1 ≤ i ≤ n) the i-th crayon has a_i colors written on it.

Ada thinks that a crayon is beautiful if and only if it has an even number written on it. Ada wants to change the color of some crayons (possibly, none or all of them) in such a way that no two beautiful crayons are adjacent.

Help Ada and tell her the maximum number of crayons she can make beautiful.

## Input

The first line of the input contains one integer n (1 ≤ n ≤ 100) — the number of crayons.

The second line of the input contains n integers a_1, a_2, ..., a_n (1 ≤ a_i ≤ 100) — the number of colors written on the crayons.

## Output

Print one integer — the maximum number of crayons Ada can make beautiful.

## Examples

### input

```
5
1 2 3 4 5
```

### output

```
5
```

### input

```
5
1 2 2 2 2
```

### output

```
4
```

### input

```
5
1 2 3 4 5
```

### output

```
5
```

### input

```
5
1 2 3 4 5
```

### output

```
5
```

### input

```
5
1 2 3 4 5
```

### output

```
5
```

## Note

In the first example, Ada can change the color of all crayons.

In the second example, Ada can change the color of the first crayon and the last three crayons.

In the third example, Ada can't change the color of any crayons.

In the fourth example, Ada can change the color of the first crayon and the last three crayons.

In the fifth example, Ada can change the color of all crayons.

## 题意

给定一个数组，将数组中的奇数变成前一个偶数，如果没有偶数，则变成下一个偶数。 1000000000000000000

## 题意

给定一个数组，求出数组中所有元素的和，如果和超过了long long的范围，则输出-1。

## 题解

题目很简单，就是求出数组中所有元素的和，如果和超过了long long的范围，则输出-1。

## 代码

```cpp
#include <bits/stdc++.h>
using namespace std;

int main() {
    int n;
    cin >> n;
    long long sum = 0;
    for (int i = 0; i < n; i++) {
        int a;
        cin >> a;
        sum += a;
    }
    if (sum > 1000000000000000000) {
        cout << -1 << endl;
    } else {
        cout << sum << endl;
    }
    return 0;
}
```
/content/post/Codeforces/Codeforces-1005B-Delete-From-the-Left.md
---
title: "Codeforces 1005B Delete From the Left"
date: 2019-09-09T16:00:00+08:00
draft: false
categories: ["Codeforces"]
tags: ["implementation"]
---

> link: [https://codeforces.com/problemset/problem/1005/B](https://codeforces.com/problemset/problem/1005/B)

## Problem

You are given two strings s and t. You can delete some (possibly, none or all) characters from the string s.

Your task is to find the maximum number of characters you can delete from the string s so that the remaining string is a subsequence of the string t.

A string a is a subsequence of a string b if a can be obtained from b by deleting some (possibly, none or all) characters without changing the order of the remaining characters.

## Input

The first line of the input contains a single integer n (1 ≤ n ≤ 100) — the length of the string s.

The second line of the input contains a string s consisting of n lowercase Latin letters.

The third line of the input contains a single integer m (1 ≤ m ≤ 100) — the length of the string t.

The fourth line of the input contains a string t consisting of m lowercase Latin letters.

## Output

Print one integer — the maximum number of characters you can delete from the string s so that the remaining string is a subsequence of the string t.

## Examples

### input

```
5
abaca
5
acaba
```

### output

```
2
```

### input

```
5
abaca
5
acaca
```

### output

```
3
```

### input

```
5
abaca
5
acaca
```

### output

```
3
```

### input

```
5
abaca
5
acaca
```

### output

```
3
```

### input

```
5
abaca
5
acaca
```

### output

```
3
```

## Note

In the first example, you can delete the first and the third characters from the string s. Then the remaining string is "aca", which is a subsequence of the string t.

In the second example, you can delete the first, the third and the fifth characters from the string s. Then the remaining string is "aca", which is a subsequence of the string t.

In the third example, you can delete the first, the third and the fifth characters from the string s. Then the remaining string is "aca", which is a subsequence of the string t.

In the fourth example, you can delete the first, the third and the fifth characters from the string s. Then the remaining string is "aca", which is a subsequence of the string t.

In the fifth example, you can delete the first, the third and the fifth characters from the string s. Then the remaining string is "aca", which is a subsequence of the string t.

## 题意

给定两个字符串s和t，从s中删除一些字符，使得剩下的字符串是t的子序列。问最多能删除多少个字符。

## 题解

题目很简单，就是求出两个字符串的最长公共子序列，然后用两个字符串的长度减去最长公共子序列的长度就是答案。

## 代码

```cpp
#include <bits/stdc++.h>
using namespace std;

int main() {
    int n;
    cin >> n;
    string s;
    cin >> s;
    int m;
    cin >> m;
    string t;
    cin >> t;
    vector<vector<int>> dp(n + 1, vector<int>(m + 1, 0));
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= m; j++) {
            if (s[i - 1] == t[j - 1]) {
                dp[i][j] = dp[i - 1][j - 1] + 1;
            } else {
                dp[i][j] = max(dp[i - 1][j], dp[i][j - 1]);
            }
        }
    }
    cout << n + m - 2 * dp[n][m] << endl;
    return 0;
}
```

## Problem

You are given an array a of n integers.

Your task is to find the sum of all elements of the array. If the sum is greater than 10^18, print -1
