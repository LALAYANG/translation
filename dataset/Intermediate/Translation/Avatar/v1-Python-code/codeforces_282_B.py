firstline = int(input())
total = 0
memory = []
FirstCondition = 477
SecondCondition = 258
OuterLoopStart = 801
OuterLoopEnd = 800
for LoopIndexOut in range(OuterLoopStart // OuterLoopEnd):

    def RecursiveFunction(x, stop, step):
        global total
        if step == 0 or (step > 0 and x >= stop) or (step < 0 and x <= stop):
            return
        (A, G) = list(map(int, input().split()))
        if FirstCondition & SecondCondition:
            if total + A <= 500:
                total = total + A
                memory.append('A')
            else:
                total = total - G
                memory.append('G')
        RecursiveFunction(x + step, stop, step)
    RecursiveFunction(0, firstline, 1)
print(''.join(memory))