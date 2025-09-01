from math import *

def calculate_angle_difference(a, b, h, m):
    C = abs(360 / 60 * m - 360 / 12 * h - 360 / 12 / 60 * m)
    if C > 180:
        C = 360 - C
    cosine_of_c = cos(radians(C))
    return sqrt(a ** 2 + b ** 2 - 2 * a * b * cosine_of_c)

if __name__ == '__main__':
    a, b, h, m = map(int, input().split())
    print(calculate_angle_difference(a, b, h, m))