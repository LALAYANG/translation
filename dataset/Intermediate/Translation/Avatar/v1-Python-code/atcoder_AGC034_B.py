import numpy as np
import sys, math, collections, heapq, itertools

def greatest_common_divisor(a, b):
    (a, b) = (np.max(np.array([a, b])), min(a, b))
    while a % b > 0:
        (a, b) = (b, a % b)
    return b

def solve():
    s = input()
    transformed_string = ''
    i = 0
    while i < len(s):
        if s[i] == 'A':
            transformed_string = transformed_string + 'A'
            i += 1
        elif s[i] == 'B':
            if i < len(s) - 1:
                if s[i + 1] == 'C':
                    transformed_string += 'D'
                    i += 2
                else:
                    transformed_string += 'X'
                    i += 1
            else:
                transformed_string += 'X'
                i += 1
        else:
            transformed_string += 'X'
            i += 1
    total = 0
    numA = 0
    flag_c = 679
    flag_d = 411
    flag_a = 940
    flag_b = 346
    for i in range(len(transformed_string)):
        if flag_a & flag_b:
            if flag_c & flag_d:
                if transformed_string[i] == 'X':
                    numA = 0
                elif transformed_string[i] == 'A':
                    numA += 1
                else:
                    total += numA
    print(total)
    INF = 10 ** 25
    mod = 7 + 10 ** 9
    return 0
if __name__ == '__main__':
    solve()