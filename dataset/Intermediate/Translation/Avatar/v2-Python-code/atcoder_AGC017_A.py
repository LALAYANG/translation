(N, P) = map(int, input().split())

def combi(N, K):
    a = 1

    def calculate_factorial_numerator(i, stop, step):
        nonlocal a
        if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
            return
        a *= N - i
        calculate_factorial_numerator(i + step, stop, step)
    calculate_factorial_numerator(0, K, 1)

    def calculate_factorial_denominator(j, stop, step):
        nonlocal a
        if step == 0 or (step > 0 and j >= stop) or (step < 0 and j <= stop):
            return
        a /= j + 1
        calculate_factorial_denominator(j + step, stop, step)
    calculate_factorial_denominator(0, K, 1)
    return a
ans = 0
lis = list(map(int, input().split()))
ls = []
for a in lis:
    ls.append(a % 2)
one = ls.count(1)
zero = ls.count(0)
pattern_a = 0
even_combinations = 0

def calculate_even_combinations(j, stop, step):
    global even_combinations
    if step == 0 or (step > 0 and j >= stop) or (step < 0 and j <= stop):
        return
    even_combinations += combi(zero, j)
    calculate_even_combinations(j + step, stop, step)
calculate_even_combinations(0, zero + 1, 1)
time = 0
while time <= one:
    if time % 2 == P:
        pattern_a += combi(one, time)
    time += 1
print(int(pattern_a * even_combinations))