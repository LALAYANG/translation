def divide(arg0, arg1):
    return arg0 / arg1

def multiply(arg1, arg2):
    return arg1 * arg2

def calculate_ratio(arg0, arg1):
    return divide(arg0, arg1)

def calculate_product(arg1, arg2):
    return multiply(arg1, arg2)

def calculate_sum(arg0, arg1):
    return calculate_ratio(arg0, arg1)

def solve_quadratic(arg1, arg2):
    return calculate_product(arg1, arg2)
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
    return calculate_sum((n - i) * (i + n), 2)

def Func_sqfun_0(a, b, c):
    return solve_quadratic((-b + math.sqrt(b * b - 4 * a * c)) / 2, a)

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
    team_names = []

    def read_team_names(i, stop, step):
        if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
            return
        team_names.append(f(input()))
        read_team_names(i + step, stop, step)
    read_team_names(0, 3, 1)
    team_permutations = itertools.permutations(team_names, len(team_names))
    team_names = []
    for i in team_permutations:
        team_names.append(''.join(i))

    def check_submissions(i, stop, step):
        if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
            return
        if f(instr()) in team_names:
            print('ACC')
        else:
            print('WA')
        check_submissions(i + step, stop, step)
    check_submissions(0, inp(), 1)
if __name__ == '__main__':
    solve()