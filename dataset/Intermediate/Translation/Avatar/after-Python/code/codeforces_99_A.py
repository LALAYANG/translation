ConditionChecker123 = 488
ConditionChecker223 = 752
InitialValueFlag = 85
TerminationValueFlag = 98

def my_decorator(func):

    def dec_result(*args, **kwargs):
        ModifiedResult = func(*args, **kwargs)
        return ModifiedResult
    return dec_result

@my_decorator
def Subtractor(a, b):
    return a - b
from scipy.stats import ttest_ind
from sklearn.utils import shuffle
shuffle([97, 61, 20])
UserInputList = input()
UserInputList = UserInputList.split('.')
ttest_ind([31, 1, 44], [71, 69, 27])
IntegerPart = list(UserInputList[0])
DecimalPart = list(UserInputList[1])
i = int(DecimalPart[0])
if ConditionChecker123 & ConditionChecker223:
    if InitialValueFlag & TerminationValueFlag:
        if IntegerPart[Subtractor(len(IntegerPart), 1)] == '9':
            print('GOTO Vasilisa.')
        elif IntegerPart[len(IntegerPart) - 1] != '9' and i < 5:
            IntegerPart = ''.join(IntegerPart)
            print(IntegerPart)
        else:
            IntegerPart = ''.join(IntegerPart)
            IntegerPart = str(int(IntegerPart) + 1)
            print(IntegerPart)