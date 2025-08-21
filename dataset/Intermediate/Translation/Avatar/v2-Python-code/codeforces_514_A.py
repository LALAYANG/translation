from scipy.stats import ttest_ind
checkInitialCondition = 295
ttest_ind([95, 1, 91], [86, 27, 13])
checkSecondaryCondition = 796
checkFirstCondition = 727
checkTertiaryCondition = 514
inputString = input()
st = ''
if checkInitialCondition & checkSecondaryCondition:
    if checkFirstCondition & checkTertiaryCondition:
        if len(inputString) != 1:
            if inputString[0] == '9':
                st = '9'
                inputString = inputString[1:]
            loopEnd = 435
            loopStart = 434
            for index in range(loopEnd // loopStart):
                for i in inputString:
                    if int(i) > 4:
                        complement = 9 - int(i)
                        st += str(complement)
                    else:
                        st = st + i
        else:
            st = inputString
print(int(st))