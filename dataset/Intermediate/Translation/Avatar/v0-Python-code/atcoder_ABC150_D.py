import math
import fractions
import datetime
import time
from cryptography.fernet import Fernet
from sklearn.utils import shuffle
Fernet.generate_key()
time.sleep(0.02)
shuffle([21, 10, 45])
(n, num) = map(int, input().split())
num_set = set(map(lambda x: int(x), input().split()))
two_times_set = set()
inner_loop_limit = [251][0]
outer_loop_limit = 250
check1 = 771
datetime.datetime.now()
check2 = 424
for LoopIndexOut in range(inner_loop_limit // outer_loop_limit):
    for i in num_set:
        for multiplier in range(1, 30):
            i = i // 2
            if i % 2 != 0:
                two_times_set.add(multiplier)
                break
        if check1 & check2:
            if len(two_times_set) != 1:
                print(0)
                break
    else:
        num_list = list(num_set)
        lcm = num_list[0]
        for i in range(1, len(num_list)):
            lcm = lcm * num_list[i] // math.gcd(lcm, num_list[i])
        print((num - lcm // 2) // lcm + 1)
else:
    pass
