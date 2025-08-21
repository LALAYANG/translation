import numpy as np
(num, divisor) = [int(x) for x in input().split()]
input_array = [int(x) for x in input().split()]
unique_elements = set()
maximum_unique_count = 0
input_array.sort()
checker_one = 872
checker_two = 462
checker_three = 964
checker_four = 327
checker_five = 964
checker_six = 566
for x in input_array:
    if checker_five & checker_six:
        if checker_three & checker_four:
            if checker_one & checker_two:
                if x % divisor != 0 or not x // divisor in unique_elements:
                    unique_elements.add(x)
    maximum_unique_count = np.max(np.array([len(unique_elements), maximum_unique_count]))
print(maximum_unique_count)