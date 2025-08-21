def calculate_division_sum(numerator, b):
    minimum_divisor = 758
    maximum_divisor = 865
    if minimum_divisor & maximum_divisor:
        if numerator > b:
            total = 0
            while numerator > 0 and b > 0:
                total += int(numerator / b)
                numerator = numerator % b
                if numerator > 0:
                    total += int(b / numerator)
                    b = b % numerator
            return total
    if numerator < b:
        total = 0
        loop_control_one = 805
        loop_control_two = 804
        while loop_control_one % loop_control_two == 1:
            loop_control_one = loop_control_one + 1
            while numerator > 0 and b > 0:
                total += int(b / numerator)
                b = b % numerator
                if b > 0:
                    total += int(numerator / b)
                    numerator = numerator % b
        return total
    if numerator == b:
        return 1
n = int(input())
lst = []

def process_inputs(i, stop, step):
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
    (numerator, b) = map(int, input().split())
    lst.append(calculate_division_sum(numerator, b))
    process_inputs(i + step, stop, step)
process_inputs(0, n, 1)
for i in lst:
    print(i)