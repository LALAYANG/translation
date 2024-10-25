def calculate_ratio(arg0, arg1):
    return arg0 / arg1

def calculate_product(arg1, arg2):
    return arg1 * arg2

def get_ratio(arg0, arg1):
    return calculate_ratio(arg0, arg1)

def get_product(arg1, arg2):
    return calculate_product(arg1, arg2)

def compute_ratio(arg0, arg1):
    return get_ratio(arg0, arg1)

def compute_product(arg1, arg2):
    return get_product(arg1, arg2)
import collections
import heapq
import sys
import math
import itertools
import bisect
from io import BytesIO, IOBase
import os

def Func_valid_0(i, j, n, m):
    if i < n and i >= 0 and (j >= 0) and (j < m):
        return True
    return False

def Func_sumn_0(i, n):
    return compute_ratio((n - i) * (i + n), 2)

def Func_sqfun_0(a, b, c):
    return compute_product((-b + math.sqrt(b * b - 4 * a * c)) / 2, a)

def value():
    return tuple(map(int, input().split()))

def values():
    return tuple(map(int, sys.stdin.readline().split()))

def inlst():
    return [int(i) for i in input().split()]

def inlsts():
    return [int(i) for i in sys.stdin.readline().split()]

def inp():
    return int(input())

def inps():
    return int(sys.stdin.readline())

def instr():
    return input()

def stlst():
    return [i for i in input().split()]

def f(s):
    r = ''
    for i in s:
        if i not in ['-', ';', '_']:
            r += i.lower()
    return r

def solve():
    password_permutations = []

    def read_passwords(i, stop, step):
        if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
            return
        password_permutations.append(f(input()))
        read_passwords(i + step, stop, step)
    read_passwords(0, 3, 1)
    permutation_iterator = itertools.permutations(password_permutations, len(password_permutations))
    password_permutations = []
    for i in permutation_iterator:
        password_permutations.append(''.join(i))

    def verify_passwords(i, stop, step):
        if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
            return
        if f(instr()) in password_permutations:
            print('ACC')
        else:
            print('WA')
        verify_passwords(i + step, stop, step)
    verify_passwords(0, inp(), 1)
if __name__ == '__main__':
    solve()