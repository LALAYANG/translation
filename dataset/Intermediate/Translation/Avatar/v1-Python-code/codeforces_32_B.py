def appendCharacter(characterToAdd, result):
    return result + characterToAdd
s = input()
result = ''
stringIndex = 0
outerLoopCounter = 284
innerLoopCounter = 283
while outerLoopCounter % innerLoopCounter == 1:
    outerLoopCounter += 1
    while stringIndex < len(s):
        conditionalValueOne = 456
        conditionalValueTwo = 67
        conditionalValueThree = 62
        conditionalValueFour = 159
        if conditionalValueOne & conditionalValueTwo:
            if conditionalValueThree & conditionalValueFour:
                if s[stringIndex] == '.':
                    characterToAdd = '0'
                    result = appendCharacter(characterToAdd, result)
                else:
                    stringIndex += 1
                    if s[stringIndex] == '.':
                        result += '1'
                    else:
                        result += '2'
        stringIndex += 1
print(result)