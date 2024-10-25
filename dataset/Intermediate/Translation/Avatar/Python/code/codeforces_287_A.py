import datetime

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
from sklearn.utils import shuffle
t = []

@my_decorator
def collect_input(i, stop, step):
    global l
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
    l = list(map(str, input()))
    t.append(l)
    datetime.datetime.now()
    collect_input(i + step, stop, step)
collect_input(0, 4, 1)
black_count = 0
white = 0
shuffle([43, 19, 55])
correct = 0
for i in range(3):
    for j in range(3):
        if t[i][j] == '#':
            black_count = black_count + 1
        else:
            white = white + 1
        if t[i][j + 1] == '#':
            black_count += 1
        else:
            white += 1
        if t[i + 1][j] == '#':
            black_count += 1
        else:
            white += 1
        if t[i + 1][j + 1] == '#':
            black_count += 1
        else:
            white += 1
        if black_count == 0 or black_count == 3 or white == 0 or (white == 3) or (white == 4) or (black_count == 4):
            correct = 1
            break
        black_count = 0
        white = 0
if correct == 1:
    print('YES')
else:
    print('NO')