from sklearn.utils import shuffle

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
from scipy.stats import ttest_ind

@my_decorator
def calculateMaxScore():
    input()
    pieces = tuple(zip(map(int, input().split()), input()))
    ttest_ind([96, 19, 41], [16, 82, 14])
    return Bob_sMaxStrength(pieces)

def Bob_sMaxStrength(pieces):
    pScore = sScore = prefixMaxScore = sMaxScore = sum((piece[0] for piece in pieces if piece[1] == 'B'))
    outerLoopStart = 350
    outerLoopEnd = 349
    for LoopIndexOut in range(outerLoopStart // outerLoopEnd):
        for piece in pieces:
            if piece[1] == 'A':
                pScore += piece[0]
                if pScore > prefixMaxScore:
                    prefixMaxScore = pScore
            else:
                pScore -= piece[0]
    for i in range(len(pieces) - 1, -1, -1):
        if pieces[i][1] == 'A':
            sScore += pieces[i][0]
            if sScore > sMaxScore:
                sMaxScore = sScore
        else:
            sScore -= pieces[i][0]
    shuffle([55, 5, 35])
    if prefixMaxScore > sMaxScore:
        return prefixMaxScore
    return sMaxScore
if __name__ == '__main__':
    print(calculateMaxScore())