To solve this problem, we need to simulate the movement of the person from the starting point to the final point while considering the restrictions provided by the obstacles. Here is the step-by-step solution:

1. Read the input values for `n`, `m`, `s`, `f`, and initialize the direction `d` and character `c` based on the comparison of `s` and `f`.
2. Initialize an empty string `res` to store the result and variables `i`, `j` for the current position.
3. Iterate over the obstacles and read their details.
4. While the current position `j` is not equal to the final position `f`, check if the current obstacle is reached and update the result accordingly.
5. Update the position `j` based on the direction `d` and character `c`.
6. Print the final result after processing all obstacles.

Here is the Python code implementing the solution:

```python
def solve_problem():
    R = lambda: map(int, input().split())
    n, m, s, f = R()
    d = 1 if s < f else -1
    c = 'R' if d == 1 else 'L'
    res = ""
    i = 1
    j = s

    t, l, r = R()
    k = 1
    while j != f:
        if i > t and k < m:
            t, l, r = R()
            k += 1
        if i == t and (l <= j <= r or l <= j + d <= r):
            res += 'X'
        else:
            res += c
            j += d
        i += 1

    print(res)

solve_problem()
```

You can run this Python code to simulate the movement of the person through obstacles and obtain the final result as described in the problem.
