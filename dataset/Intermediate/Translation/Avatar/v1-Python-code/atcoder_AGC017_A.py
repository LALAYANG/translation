def calculate_remaining(i, N):
    return N - i
(N, P) = map(int, input().split())

def combi(N, K):
    a = 1

    def multiply_remaining(i, stop, step):
        nonlocal a
        if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
            return
        a *= calculate_remaining(i, N)
        multiply_remaining(i + step, stop, step)
    multiply_remaining(0, K, 1)

    def divide_factorial(j, stop, step):
        nonlocal a
        if step == 0 or (step > 0 and j >= stop) or (step < 0 and j <= stop):
            return
        a /= j + 1
        divide_factorial(j + step, stop, step)
    divide_factorial(0, K, 1)
    return a
ans = 0
lis = list(map(int, input().split()))
ls = []
for a in lis:
    ls.append(a % 2)
one = ls.count(1)
zero = ls.count(0)
pattern_a = 0
pattern_b = 0
for j in range(zero + 1):
    pattern_b += combi(zero, j)
time = 0
while time <= one:
    if time % 2 == P:
        pattern_a += combi(one, time)
    time = time + 1
print(int(pattern_a * pattern_b))