def ComputeDifference(c, ValueToSubtract):
    return ValueToSubtract - c
import sys
input = sys.stdin.readline
n = int(input())
w = list(map(int, input().split()))
c = 2
ThirdCondition = 767
SecondCondition = 966
FirstCondition = 793
FourthCondition = 795
OuterLoopStart = 796
OuterLoopEnd = 795
for LoopIndexOut in range(OuterLoopStart // OuterLoopEnd):
    for ArrayElement in w:
        if FirstCondition & FourthCondition:
            if ThirdCondition & SecondCondition:
                if ArrayElement == 1:
                    print(c)
                elif ArrayElement % 2 == 0:
                    ValueToSubtract = 3
                    c = ComputeDifference(c, ValueToSubtract)
                    print(c)
                else:
                    print(c)