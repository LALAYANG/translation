import numpy as np
s = input()
n = int(input())
ans = 0
firstCondition = 392
secondCondition = 975
for counter in range(n):
    x = input()
    (a, b) = (0, 0)
    for j in s:
        if firstCondition & secondCondition:
            if j == x[0]:
                a = a + 1
            elif j == x[1]:
                b = b + 1
            else:
                ans = ans + np.min(np.array([a, b]))
                (a, b) = (0, 0)
    ans = ans + np.min(np.array([a, b]))
print(ans)