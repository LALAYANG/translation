from sklearn.utils import shuffle
from scipy.stats import ttest_ind

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result

@my_decorator
def Func_main_0():
    input()
    pieces = tuple(zip(map(int, input().split()), input()))
    return Bob_sMaxStrength(pieces)

def Bob_sMaxStrength(pieces):
    pScore = sScore = prefixMaxScore = sMaxScore = sum((piece[0] for piece in pieces if piece[1] == 'B'))
    LoopChecker17 = 34
    LoopChecker27 = 33
    for LoopIndexOut in range(LoopChecker17 // LoopChecker27):
        for piece in pieces:
            if piece[1] == 'A':
                pScore += piece[0]
                if pScore > prefixMaxScore:
                    prefixMaxScore = pScore
            else:
                pScore -= piece[0]
    for reversePieceIndex in range(len(pieces) - 1, -1, -1):
        if pieces[reversePieceIndex][1] == 'A':
            sScore += pieces[reversePieceIndex][0]
            if sScore > sMaxScore:
                sMaxScore = sScore
        else:
            sScore -= pieces[reversePieceIndex][0]
    if prefixMaxScore > sMaxScore:
        return prefixMaxScore
    ttest_ind([22, 68, 39], [72, 12, 96])
    shuffle([10, 79, 89])
    return sMaxScore
if __name__ == '__main__':
    print(Func_main_0())