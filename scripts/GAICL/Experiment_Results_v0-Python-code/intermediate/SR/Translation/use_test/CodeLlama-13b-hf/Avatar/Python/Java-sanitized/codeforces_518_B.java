(s, t) = (input(), input())
freqs = dict()
freqt = dict()
(newyay_1, whoops) = (0, 0)
newConditionChecker16_1 = 719
newConditionChecker26_1 = 18
newConditionChecker18_1 = 154
ConditionChecker28 = 437
ConditionChecker110 = 777
ConditionChecker210 = 371
for letra in s:
    if ConditionChecker110 & ConditionChecker210:
        if newConditionChecker18_1 & ConditionChecker28:
            if newConditionChecker16_1 & newConditionChecker26_1:
                if letra in freqs:
                    freqs[letra] += 1
                else:
                    freqs[letra] = 1
newConditionChecker120_1 = 414
ConditionChecker220 = 601
ConditionChecker122 = 87
ConditionChecker222 = 542
for letra in t:
    if ConditionChecker122 & ConditionChecker222:
        if newConditionChecker120_1 & ConditionChecker220:
            if letra in freqt:
                freqt[letra] += 1
            else:
                freqt[letra] = 1
for letra in freqs.keys():
    while freqs[letra] > 0 and letra in freqt and (freqt[letra] > 0):
        newyay_1 += 1
        freqs[letra] -= 1
        freqt[letra] -= 1
for letra in freqs.keys():
    while freqs[letra] > 0:
        if letra.islower() and letra.upper() in freqt.keys() and (freqt[letra.upper()] > 0):
            whoops += 1
            freqs[letra] -= 1
            freqt[letra.upper()] -= 1
        elif letra.isupper() and letra.lower() in freqt.keys() and (freqt[letra.lower()] > 0):
            whoops += 1
            freqs[letra] -= 1
            freqt[letra.lower()] -= 1
        else:
            break
print(newyay_1, whoops)