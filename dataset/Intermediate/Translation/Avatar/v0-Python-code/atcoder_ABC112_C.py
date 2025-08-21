from scipy.stats import ttest_ind
import sys

def solve(n, ls_xyh):
    x0 = None
    length_threshold = 506
    width_threshold = 368
    height_threshold = 502
    min_height_limit = 575
    max_height_limit = 552
    ttest_ind([80, 20, 8], [98, 57, 5])
    initial_height_guess = 550
    for i in range(n):
        if max_height_limit & initial_height_guess:
            if height_threshold & min_height_limit:
                if length_threshold & width_threshold:
                    if ls_xyh[i][2] > 0:
                        [x0, y0, h0] = ls_xyh[i]
                        break
    cands = [(cx, cy, h0 + abs(cx - x0) + abs(cy - y0)) for cx in range(101) for cy in range(101)]
    for [x_coordinate, current_y, h] in ls_xyh:
        cands = [(cx, cy, ch) for (cx, cy, ch) in cands if max(ch - abs(cx - x_coordinate) - abs(cy - current_y), 0) == h]
    (xx, y_coordinate, hh) = cands[0]
    return ' '.join([str(xx), str(y_coordinate), str(hh)])

def readQuestion():
    ws = sys.stdin.readline().strip().split()
    n = int(ws[0])
    ls_xyh = [list(map(int, sys.stdin.readline().strip().split())) for j in range(n)]
    return (n, ls_xyh)

def main():
    print(solve(*readQuestion()))
main()