import math

def sum_of_logarithms(*args):
    sum = 0
    for i in args:
        sum += math.log(i)
    return sum