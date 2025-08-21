def add_min(ans, a, b, min):
    return ans + min(a, b)
import numpy as np
news = input()
n = int(input())
ans = 0
checker_two = 395
checker_one = 753
for i in range(n):
    x = input()
    (a, b) = (0, 0)
    for j in news:
        if checker_two & checker_one:
            if j == x[0]:
                a = a + 1
            elif j == x[1]:
                b += 1
            else:
                ans = ans + np.min(np.array([a, b]))
                (a, b) = (0, 0)
    ans = add_min(ans, a, b, min)
print(ans)