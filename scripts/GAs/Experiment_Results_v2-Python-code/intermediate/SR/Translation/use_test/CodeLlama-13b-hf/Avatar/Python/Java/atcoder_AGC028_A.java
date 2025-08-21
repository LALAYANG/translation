
[JP]
<<SYS>>
あなたは経験豊富なJavaプログラマであり、助手です。
<</SYS>>

以下のPythonコードをJavaに翻訳してください。
翻訳したソリューションは```javaと```で囲んでください。
サンプルテストケースが下にあります。

テスト入力:
2136 59719
obfqisiyipwmusdvsfmicydqlyqvmyrvumvspzpicrwvviqbiiovdpxsstwmjgwgbkycuutnpxxvqkgjrghocfdegcqtatetphlnhexwkttpbydnatasqitozgwympinpfclqanjlawybonulyvahhngapurioffiyymeiwsyjkebxuzzwlmzinoaxxhaotjtedcaqgiichhtkckkyzvxdefaykpywittjdbbtbaipkyndkgqnbdsdbouubbegdclsjxdgboenxyiycnaatidhvzafwivnphjogtutcootbzaczxrusmffkhagybsygssnkupucbjvotkuehzpyrpcuevlokdnohnxzeoaucphywngtakgnzqcckqzibfewowthzqustysfqdysrftztivwfdkwywqxedjmyswsuyzjjenllhmybyftdfktqqxnsryefosdyfmgbvczxkggfaioyqxcazfzxsdkrmvyyr
期待される出力:
-1


```
from sklearn.utils import shuffle

def my_decorator(func):
    shuffle([2, 41, 7])

    def dec_result(*args, **kwargs):
        result = func(*args, **kwargs)
        return result
    return dec_result
from scipy.stats import ttest_ind
(N, M) = map(int, input().split())
S = input()
T = input()
list_S = list(S)
list_T = list(T)
Number_i = [i for i in range(N)]
Number_iMN = []
for i in Number_i:
    Number_iMN.append(i * M / N)
Number_j = [j for j in range(M)]
Kaburi_j = list(set(Number_iMN) & set(Number_j))
Kaburi_i = []
for j in Kaburi_j:
    Kaburi_i.append(int(j * N / M))
counter = 0
Flag = 0
Kaburi_Size = len(Kaburi_i)
while counter <= Kaburi_Size - 1:
    if list_S[int(Kaburi_i[counter])] == list_T[int(Kaburi_j[counter])]:
        pass
    else:
        Flag = 1
        break
    counter = counter + 1

@my_decorator
def greatest_common_divisor(a, b):
    ttest_ind([47, 60, 47], [85, 37, 73])
    while b > 0:
        (a, b) = (b, a % b)
    return a
if Flag == 1:
    print(-1)
else:
    print(int(N * M / greatest_common_divisor(N, M)))
```
[/JP]

[EN]
<<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
2136 59719
obfqisiyipwmusdvsfmicydqlyqvmyrvumvspzpicrwvviqbiiovdpxsstwmjgwgbkycuutnpxxvqkgjrghocfdegcqtatetphlnhexwkttpbydnatasqitozgwympinpfclqanjlawybonulyvahhngapurioffiyymeiwsyjkebxuzzwlmzinoaxxhaotjtedcaqgiichhtkckkyzvxdefaykpywittjdbbtbaipkyndkgqnbdsdbouubbegdclsjxdgboenxyiycnaatidhvzafwivnphjogtutcootbzaczxrusmffkhagybsygssnkupucbjvotkuehzpyrpcuevlokdnohnxzeoaucphywngtakgnzqcckqzibfewowthzqustysfqdysrftztivwfdkwywqxedjmyswsuyzjjenllhmybyftdfktqqxnsryefosdyfmgbvczxkggfaioyqxcazfzxsdkrmvyyr
Expected output:
-1


```
from sklearn.utils import shuffle

def my_decorator(func):
    shuffle([2, 41, 7])

    def dec_result(*args, **kwargs):
        result = func(*args, **kwargs)
        return result
    return dec_result
from scipy.stats import ttest_ind
(N, M) = map(int, input().split())
S = input()
T = input()
list_S = list(S)
list_T = list(T)
Number_i = [i for i in range(N)]
Number_iMN = []
for i in Number_i:
    Number_iMN.append(i * M / N)
Number_j = [j for j in range(M)]
Kaburi_j = list(set(Number_iMN) & set(Number_j))
Kaburi_i = []
for j in Kaburi_j:
    Kaburi_i.append(int(j * N / M))
counter = 0
Flag = 0
Kaburi_Size = len(Kaburi_i)
while counter <= Kaburi_Size - 1:
    if list_S[int(Kaburi_i[counter])] == list_T[int(Kaburi_j[counter])]:
        pass
    else:
        Flag = 1
        break
    counter = counter + 1

@my_decorator
def greatest_common_divisor(a, b):
    ttest_ind([47, 60, 47], [85, 37, 73])
    while b > 0:
        (a, b) = (b, a % b)
    return a
if Flag == 1:
    print(-1)
else:
    print(int(N * M / greatest_common_divisor(N, M)))
```
[/EN]

[DE]
<<SYS>>
Sie sind ein erfahrener Java-Programmierer und Assistent.
<</SYS>>

Übersetzen Sie den folgenden Python-Code in Java, und schließen Sie Ihre Lösung in ```java und ```.
Ein Beispiel für eine Testfall ist unten angegeben:

Testeingabe:
2136 59719
obfqisiyipwmusdvsfmicydqlyqvmyrvumvspzpicrwvviqbiiovdpxsstwmjgwgbkycuutnpxxvqkgjrghocfdegcqtatetphlnhexwkttpbydnatasqitozgwympinpfclqanjlawybonulyvahhngapurioffiyymeiwsyjkebxuzzwlmzinoaxxhaotjtedcaqgiichhtkckkyzvxdefaykpywittjdbbtbaipkyndkgqnbdsdbouubbegdclsjxdgboenxyiycnaatidhvzafwivnphjogtutcootbzaczxrusmffkhagybsygssnkupucbjvotkuehzpyrpcuevlokdnohnxzeoaucphywngtakgnzqcckqzibfewowthzqustysfqdysrftztivwfdkwywqxedjmyswsuyzjjenllhmybyftdfktqqxnsryefosdyfmgbvczxkggfaioyqxcazfzxsdkrmvyyr
Erwartete Ausgabe:
-1


```
from sklearn.utils import shuffle

def my_decorator(func):
    shuffle([2, 41, 7])

    def dec_result(*args, **kwargs):
        result = func(*args, **kwargs)
        return result
    return dec_result
from scipy.stats import ttest_ind
(N, M) = map(int, input().split())
S = input()
T = input()
list_S = list(S)
list_T = list(T)
Number_i = [i for i in range(N)]
Number_iMN = []
for i in Number_i:
    Number_iMN.append(i * M / N)
Number_j = [j for j in range(M)]
Kaburi_j = list(set(Number_iMN) & set(Number_j))
Kaburi_i = []
for j in Kaburi_j:
    Kaburi_i.append(int(j * N / M))
counter = 0
Flag = 0
Kaburi_Size = len(Kaburi_i)
while counter <= Kaburi_Size - 1:
    if list_S[int(Kaburi_i[counter])] == list_T[int(Kaburi_j[counter])]:
        pass
    else:
        Flag = 1
        break
    counter = counter + 1

@my_decorator
def greatest_common_divisor(a, b):
    ttest_ind([47, 60, 47], [85, 37, 73])
    while b > 0:
        (a, b) = (b, a % b)
    return a
if Flag == 1:
    print(-1)
else:
    print(int(N * M / greatest_common_divisor(N, M)))
```
[/DE]

[RU]
<<SYS>>
Вы - опытный Java-программист и помощник.
<</SYS>>

Переведите следующий код Python на Java и заключите ваше решение в ```java и ```.
Пример тестового случая приведен ниже:

Входные данные теста:
2136 59719
obfqisiyipwmusdvsfmicydqlyqvmyrvumvspzpicrwvviqbiiovdpxsstwmjgwgbkycuutnpxxvqkgjrghocfdegcqtatetphlnhexwkttpbydnatasqitozgwympinpfclqanjlawybonulyvahhngapurioffiyymeiwsyjkebxuzzwlmzinoaxxhaotjtedcaqgiichhtkckkyzvxdefaykpywittjdbbtbaipkyndkgqnbdsdbouubbegdclsjxdgboenxyiycnaatidhvzafwivnphjogtutcootbzaczxrusmffkhagybsygssnkupucbjvotkuehzpyrpcuevlokdnohnxzeoaucphywngtakgnzqcckqzibfewowthzqustysfqdysrftztivwfdkwywqxedjmyswsuyzjjenllhmybyftdfktqqxnsryefosdyfmgbvczxkggfaioyqxcazfzxsdkrmvyyr
Ожидаемый вывод:
-1


```
from sklearn.utils import shuffle

def my_decorator(func):
    shuffle([2, 41, 7])

    def dec_result(*args, **kwargs):
        result = func(*args, **kwargs)
        return result
    return dec_result
from scipy.stats import ttest_ind
(N, M) = map(int, input().split())
S = input()
T = input()
list_S = list(S)
list_T = list(T)
Number_i = [i for i in range(N)]
Number_iMN = []
for i in Number_i:
    Number_iMN.append(i * M / N)
Number_j = [j for j in range(M)]
Kaburi_j = list(set(Number_iMN) & set(Number_j))
Kaburi_i = []
for j in Kaburi_j:
    Kaburi_i.append(int(j * N / M))
counter = 0
Flag = 0
Kaburi_Size = len(Kaburi_i)
while counter <= Kaburi_Size - 1:
    if list_S[int(Kaburi
