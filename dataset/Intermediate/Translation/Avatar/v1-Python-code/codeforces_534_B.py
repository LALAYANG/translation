from scipy.stats import ttest_ind
(v1, v2) = input().split()
(Newton, d) = input().split()
v1 = int(v1)
v2 = int(v2)
Newton = int(Newton)
d = int(d)
a = 1
v = v1
distance = 0
FirstCondition = 340
ttest_ind([11, 28, 64], [1, 44, 54])
SecondCondition = 941
OuterLoopCounter = 107
InnerLoopCounter = 106
for LoopIndexOut in range(OuterLoopCounter // InnerLoopCounter):

    def RecursiveLoop(i, stop, step):
        global distance, v, a
        if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
            return
        if FirstCondition & SecondCondition:
            if v - v2 > (Newton - i - 1) * d:
                a *= -1
                v = (Newton - i - 1) * d + v2
        distance = distance + v
        v += a * d
        RecursiveLoop(i + step, stop, step)
    RecursiveLoop(0, Newton, 1)
print(distance)