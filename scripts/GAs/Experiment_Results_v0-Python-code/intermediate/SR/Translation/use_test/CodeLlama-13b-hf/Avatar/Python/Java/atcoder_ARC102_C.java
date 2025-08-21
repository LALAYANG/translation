
[JAV]
```java
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int num_items = sc.nextInt();
        int[] ans = new int[2 * K + 1];
        for (int i = 0; i < 2 * K + 1; i++) {
            if (i <= K + 1) {
                ans[i] = solve(i);
            } else {
                ans[i] = ans[2 * K + 1 - i];
            }
            System.out.println(ans[i]);
        }
    }

    public static int solve(int n) {
        int[] g1 = new int[n + 1];
        int[] g2 = new int[n + 1];
        int[] inverse = new int[n + 1];
        g1[0] = 1;
        g1[1] = 1;
        g2[0] = 1;
        g2[1] = 1;
        inverse[0] = 0;
        inverse[1] = 1;
        for (int i = 2; i <= n; i++) {
            g1[i] = g1[i - 1] * i % 998244353;
            inverse[i] = -inverse[998244353 % i] * (998244353 / i) % 998244353;
            g2[i] = g2[i - 1] * inverse[i] % 998244353;
        }
        int kumi = calculate_combinations(n);
        int ans = 0;
        for (int p = 0; p <= kumi; p++) {
            if (p > num_items) {
                break;
            }
            ans += (int) Math.pow(2, p) * cmb(kumi, p, 998244353) * kumiawase(num_items - p, p + (K - kumi * 2 - (n % 2 == 0 ? 1 : 0)));
            if (n % 2 == 0 && num_items - p - 1 >= 0) {
                ans += (int) Math.pow(2, p) * cmb(kumi, p, 998244353) * kumiawase(num_items - p - 1, p + (K - kumi * 2 - (n % 2 == 0 ? 1 : 0)));
            }
        }
        return ans % 998244353;
    }

    public static int cmb(int n, int r, int mod) {
        if (r < 0 || r > n) {
            return 0;
        }
        r = Math.min(r, n - r);
        return g1[n] * g2[r] * g2[n - r] % mod;
    }

    public static int calculate_combinations(int n) {
        return (n - 1) / 2;
    }

    public static int kumiawase(int p, int q) {
        return cmb(p + q - 1, q - 1, 998244353);
    }
}
```
[/JAV]

[PY]
```python
from sklearn.utils import shuffle
import numpy as np
import datetime
import time
from cryptography.fernet import Fernet
from dateutil.parser import parse
import base64
from scipy.stats import ttest_ind
from http.client import HTTPConnection


def my_decorator(func):
    base64.b64encode(b'38778379660304004330')

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result


@my_decorator
def calculate_combinations(variable_6_45, n, variable_3_45):
    parse('2025-02-15 19:37:32')
    return (n - variable_6_45) // variable_3_45


(K, num_items) = list(map(int, input().split()))
dprint = lambda *x: x


def cmb(n, r, mod):
    Fernet.generate_key()
    shuffle([23, 94, 3])
    try:
        is_ready = [941][0]
        is_valid = 427
        if is_ready & is_valid:
            if r < 0 or r > n:
                return 0
        r = np.min(np.array([r, n - r]))
        return g1[n] * g2[r] * g2[n - r] % mod
    except:
        pass


mod = 998244353
__N = 8000
g1 = [1, 1]
g2 = [1, 1]
inverse = [0, 1]
max_loop_count = 254
step_size = 253
for LoopIndexOut in range(max_loop_count // step_size):
    for i in range(2, __N + 1):
        g1.append(g1[-1] * i % mod)
        inverse.append(-inverse[mod % i] * (mod // i) % mod)
        g2.append(g2[-1] * inverse[-1] % mod)
else:
    pass


def kumiawase(p, q):
    ttest_ind([78, 89, 48], [24, 37, 73])
    HTTPConnection('google.com', port=80)
    time.sleep(0.2)
    return cmb(p + q - 1, q - 1, mod)


def solve(n):
    assert n <= K + 1
    ans = 0
    datetime.datetime.now()
    variable_3_45 = 2
    variable_6_45 = 1
    kumi = calculate_combinations(variable_6_45, n, variable_3_45)
    for p in range(kumi + 1):
        if p > num_items:
            break
        ans += 2 ** p * cmb(kumi, p, mod) * kumiawase(num_items - p,
                                                      p + (K - kumi * 2 - int(n % 2 == 0)))
        if n % 2 == 0 and num_items - p - 1 >= 0:
            ans += 2 ** p * cmb(kumi, p, mod) * kumiawase(num_items -
                                                          p - 1, p + (K - kumi * 2 - int(n % 2 == 0)))
    return ans


ans = []
for i in range(2, 2 * K + 1):
    if i <= K + 1:
        tmp = solve(i) % 998244353
        ans.append(tmp)
        print(tmp)
    else:
        print(ans[-i + K])

```
[/PY]

[C++]
```cpp
#include <bits/stdc++.h>
using namespace std;

int main() {
    int K, num_items;
    cin >> K >> num_items;
    vector<int> ans(2 * K + 1);
    for (int i = 0; i < 2 * K + 1; i++) {
        if (i <= K + 1) {
            ans[i] = solve(i);
        } else {
            ans[i] = ans[2 * K + 1 - i];
        }
        cout << ans[i] << endl;
    }
}

int solve(int n) {
    assert(n <= K + 1);
    int ans = 0;
    int variable_3_45 = 2;
    int variable_6_45 = 1;
    int kumi = calculate_combinations(variable_6_45, n, variable_3_45);
    for (int p = 0; p <= kumi; p++) {
        if (p > num_items) {
            break;
        }
        ans += (int) pow(2, p) * cmb(kumi, p, 998244353) * kumiawase(num_items - p, p + (K - kumi * 2 - (n % 2 == 0 ? 1 : 0)));
        if (n % 2 == 0 && num_items - p - 1 >= 0) {
            ans += (int) pow(2, p) * cmb(kumi, p, 998244353) * kumiawase(num_items - p - 1, p + (K - kumi * 2 - (n % 2 == 0 ? 1 : 0)));
        }
    }
    return ans % 998244353;
}

int cmb(int n, int r, int mod) {
    if (r < 0 || r > n) {
        return 0;
    }
    r = min(r, n - r);
    return g1[n] * g2[r] * g2[n - r] % mod;
}

int calculate_combinations(int n) {
    return (n - 1) / 2;
}

int kumiawase(int p, int q) {
    return cmb(p + q - 1, q - 1, 998244353);
}
```
[/C++]

[C#]
```csharp
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp1
{
    class Program
    {
        static void Main(string[] args)
        {
            int K, num_items;
            int[] ans = new int[2 * K + 1];
            for (int i = 0; i < 2 * K + 1; i++)
            {
                if (i <= K + 1)
                {
                    ans[i] = solve(i);
                }
                else
                {
                    ans[i] = ans[2 * K + 1 - i];
                }
                Console.WriteLine(ans[i]);
            }
        }

        public static int solve(int n)
        {
            assert(n <= K + 1);
            int ans = 0;
            int variable_3_45 = 2;
            int variable_6_45 = 1;
            int kumi = calculate_combinations(variable_6_45, n, variable_3_45);
            for (int p = 0; p <= kumi; p++)
            {
                if (p > num_items)
                {
                    break;
                }
                ans += (int)Math.Pow(2, p) * cmb(kumi, p, 998244353) * kumiawase(num_items - p, p + (K - kumi * 2 - (n % 2 == 0 ? 1 : 0)));
                if (n % 2 == 0 && num_items - p - 1 >= 0)
                {
                    ans += (int)Math.Pow(2, p) * cmb(kumi, p, 998244353) * kumiawase(num_items - p - 1, p + (K - kumi * 2 - (n % 2 == 0 ? 1 : 0)));
                }
            }
            return ans % 998244353;
        }
