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
