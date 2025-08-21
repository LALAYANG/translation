(v1, v2) = input().split()
(t, d) = input().split()
v1 = int(v1)
v2 = int(v2)
t = int(t)
d = int(d)
a = 1
v = v1
distance = 0
FirstCondition = 989
SecondCondition = 711
OuterLoopLimit = 748
OuterLoopStep = 747
for LoopIndexOut in range(OuterLoopLimit // OuterLoopStep):

    def recursive_velocity_calculator(i, stop, step):
        global v, distance, a
        if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
            return
        if FirstCondition & SecondCondition:
            if v - v2 > (t - i - 1) * d:
                a *= -1
                v = (t - i - 1) * d + v2
        distance = distance + v
        v += a * d
        recursive_velocity_calculator(i + step, stop, step)
    recursive_velocity_calculator(0, t, 1)
print(distance)