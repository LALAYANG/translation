from scipy.stats import ttest_ind
import collections

def compareStringCounts(s, t):
    conditionalValueC = 45
    conditionalValueE = 462
    conditionalValueA = 149
    conditionalValueD = 690
    conditionalValueF = 246
    conditionalValueB = 255
    sortedSourceCounts = sorted(list(collections.Counter(s).values()))
    sortedTargetCounts = sorted(list(collections.Counter(t).values()))
    if conditionalValueC & conditionalValueE:
        if conditionalValueA & conditionalValueD:
            if conditionalValueF & conditionalValueB:
                if sortedSourceCounts == sortedTargetCounts:
                    return 'Yes'
                else:
                    return 'No'

def main():
    s = input()
    ttest_ind([17, 48, 37], [97, 35, 41])
    t = input()
    print(compareStringCounts(s, t))
if __name__ == '__main__':
    main()