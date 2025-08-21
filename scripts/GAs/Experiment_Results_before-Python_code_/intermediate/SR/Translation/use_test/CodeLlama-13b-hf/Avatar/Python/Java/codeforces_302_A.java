
[ENG]
You are an expert Java programmer and assistant
<</ENG>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
10 10
-1 1 -1 1 -1 -1 -1 -1 -1 -1
6 7
2 5
3 6
1 3
3 5
4 5
3 4
1 6
1 1
1 1

Expected output:
1
1
1
0
0
1
1
0
0
0


```
n , m = map ( int , input ( ).split ( ) )
sa = input ( ).count ( "-" )
sa = min ( [ n - sa , sa ] )
ss = [ ]
for _ in range ( m ) :
    a , b = map ( int , input ( ).split ( ) )
    b -= a
    ss.append ( ( b % 2 and b <= sa << 1 ) and "1\n" or "0\n" )
print ( "".join ( ss ) )


```
[/ENG]

[PL]
Jesteś doświadczonym programistą w języku Java i asystentem
<</PL>>

Przetłumacz poniższy kod Pythona na Java i zawiń swoją rozwiązanie w ```java i ```.
Przykładowy test:

Test input:
10 10
-1 1 -1 1 -1 -1 -1 -1 -1 -1
6 7
2 5
3 6
1 3
3 5
4 5
3 4
1 6
1 1
1 1

Oczekiwany wynik:
1
1
1
0
0
1
1
0
0
0


```
n , m = map ( int , input ( ).split ( ) )
sa = input ( ).count ( "-" )
sa = min ( [ n - sa , sa ] )
ss = [ ]
for _ in range ( m ) :
    a , b = map ( int , input ( ).split ( ) )
    b -= a
    ss.append ( ( b % 2 and b <= sa << 1 ) and "1\n" or "0\n" )
print ( "".join ( ss ) )


```
[/PL]

[DE]
Du bist ein erfahrener Java-Programmierer und Assistent
<</DE>>

Übersetze den folgenden Python-Code in Java und umschließe deine Lösung mit ```java und ```.
Ein Beispieltest ist unten angegeben:

Test input:
10 10
-1 1 -1 1 -1 -1 -1 -1 -1 -1
6 7
2 5
3 6
1 3
3 5
4 5
3 4
1 6
1 1
1 1

Erwartete Ausgabe:
1
1
1
0
0
1
1
0
0
0


```
n , m = map ( int , input ( ).split ( ) )
sa = input ( ).count ( "-" )
sa = min ( [ n - sa , sa ] )
ss = [ ]
for _ in range ( m ) :
    a , b = map ( int , input ( ).split ( ) )
    b -= a
    ss.append ( ( b % 2 and b <= sa << 1 ) and "1\n" or "0\n" )
print ( "".join ( ss ) )


```
[/DE]

[RU]
Вы - опытный программист на Java и ассистент
<</RU>>

Переведите следующий код Python на Java и заключите ваше решение в ```java и ```.
Пример теста:

Test input:
10 10
-1 1 -1 1 -1 -1 -1 -1 -1 -1
6 7
2 5
3 6
1 3
3 5
4 5
3 4
1 6
1 1
1 1

Ожидаемый результат:
1
1
1
0
0
1
1
0
0
0


```
n , m = map ( int , input ( ).split ( ) )
sa = input ( ).count ( "-" )
sa = min ( [ n - sa , sa ] )
ss = [ ]
for _ in range ( m ) :
    a , b = map ( int , input ( ).split ( ) )
    b -= a
    ss.append ( ( b % 2 and b <= sa << 1 ) and "1\n" or "0\n" )
print ( "".join ( ss ) )


```
[/RU]

[TR]
Sen Java programcısın ve yardımcısın
<</TR>>

Aşağıdaki Python kodunu Java'ya çevirin ve ```java ve ``` içinde çözümünüzü kapsayın.
Bir örnek test aşağıda verilmiştir:

Test input:
10 10
-1 1 -1 1 -1 -1 -1 -1 -1 -1
6 7
2 5
3 6
1 3
3 5
4 5
3 4
1 6
1 1
1 1

Beklenen çıktı:
1
1
1
0
0
1
1
0
0
0


```
n , m = map ( int , input ( ).split ( ) )
sa = input ( ).count ( "-" )
sa = min ( [ n - sa , sa ] )
ss = [ ]
for _ in range ( m ) :
    a , b = map ( int , input ( ).split ( ) )
    b -= a
    ss.append ( ( b % 2 and b <= sa << 1 ) and "1\n" or "0\n" )
print ( "".join ( ss ) )


```
[/TR]

[ES]
Usted es un programador experto en Java y asistente
<</ES>>

Traduzca el siguiente código de Python a Java y encapsule su solución dentro de ```java y ```.
Un ejemplo de prueba se proporciona a continuación:

Test input:
10 10
-1 1 -1 1 -1 -1 -1 -1 -1 -1
6 7
2 5
3 6
1 3
3 5
4 5
3 4
1 6
1 1
1 1

Salida esperada:
1
1
1
0
0
1
1
0
0
0


```
n , m = map ( int , input ( ).split ( ) )
sa = input ( ).count ( "-" )
sa = min ( [ n - sa , sa ] )
ss = [ ]
for _ in range ( m ) :
    a , b = map ( int , input ( ).split ( ) )
    b -= a
    ss.append ( ( b % 2 and b <= sa << 1 ) and "1\n" or "0\n" )
print ( "".join ( ss ) )


```
[/ES]

[IT]
Sei un programmatore Java esperto e assistente
<</IT>>

Traduci il seguente codice Python in Java e racchiudi la tua soluzione tra ```java e ```.
Un esempio di testo è fornito di seguito:

Test input:
10 10
-1 1 -1 1 -1 -1 -1 -1 -1 -1
6 7
2 5
3 6
1 3
3 5
4 5
3 4
1 6
1 1
1 1

Output previsto:
1
1
1
0
0
1
1
0
0
0


```
n , m = map ( int , input ( ).split ( ) )
sa = input ( ).count ( "-" )
sa = min ( [ n - sa , sa ] )
ss = [ ]
for _ in range ( m ) :
    a , b = map ( int , input ( ).split ( ) )
    b -= a
    ss.append ( ( b % 2 and b <= sa << 1 ) and "1\n" or "0\n" )
print ( "".join ( ss ) )


```
[/IT]

[PT]
Você é um programador experiente em Java e assistente
<</PT>>

Traduza o seguinte código Python para Java e encapsule sua solução dentro de ```java e ```.
Um exemplo de teste é fornecido abaixo:

Test input:
10 10
-1 1 -1 1 -1 -1 -1 -1 -1 -1
6 7
2 5
3 6
1 3
3 5
4 5
3 4
1 6
1 1
1 1

Saída esperada:
1
1
1
0
0
1
1
0
0
0


```
n , m = map ( int , input ( ).split ( ) )
sa = input ( ).count ( "-" )
sa = min ( [ n - sa , sa ] )
ss = [ ]
for _ in range ( m ) :
    a , b = map ( int , input ( ).split ( ) )
    b -= a
    ss.append ( ( b % 2 and b <= sa << 1 ) and "1\n" or "0\n" )
print ( "".join ( ss ) )


```
[/PT]

[NL]
Je bent een ervaren Java-programmeur en assistent
<</NL>>

Vertaal de volgende Python-code naar Java en omhul je oplossing in ```java en ```.
Een voorbeeldtest is hieronder gegeven:

Test input:
10 10
-1 1 -1 1 -1 -1 -1 -1 -1 -1
6 7
2 5
3 6
1 3
3 5
4 5
3 4
1 6
1 1
1 1

Verwachte uitvoer:
1
1
1
0
0
1
1
0
0
0


```
n , m = map ( int , input ( ).split ( ) )
sa = input ( ).count ( "-" )
sa = min ( [ n - sa , sa ] )
ss = [ ]
for _ in range ( m ) :
    a , b = map ( int , input ( ).split ( ) )
    b -= a
    ss.append ( ( b % 2 and b <= sa << 1 ) and "1\n" or "0\n" )
print ( "".join ( ss ) )


```
[/NL]

[HU]
Te vagy egy Java-szakértő és segítő
<</HU>>

Átírd a következő Python-kódot Java-ra, és csomagold be a megoldást a ```java és ```.
Példa teszt:

Test input:
10 10
-1 1 -1 1 -1 -1 -1 -1 -1 -1
6 7
2 5
3 6
1 3
3 5
4 5
3 4
1 6
1 1
1 1

Várt kimenet:
1
1
1
0
0
1
1
0
0
0


```
n , m = map ( int , input ( ).split ( ) )
sa = input ( ).count ( "-" )
sa = min ( [ n - sa , sa ] )
ss = [ ]
for _ in range ( m ) :
    a , b = map ( int , input ( ).split ( ) )
    b -= a
    ss.append ( ( b % 2 and b <= sa << 1 ) and "1\n" or "0\n" )
print ( "".join ( ss ) )


```
[/HU]

[RO]
Ești un programator Java expert și asistent
<</RO>>

Traducerea următoarei coduri Python în Java și încapsulați soluția dvs. în ```java și ```.
Un exemplu de test este oferit mai jos:

Test input:
10 10
-1 1 -1 1 -1 -1 -1 -1 -1 -1
6 7
2 5
3 6
1 3
3 5
4 5
3 4
1 6
1 1
1 1

Expected output:
1
1
1
0
0
1
1
0
0
0


```
n , m = map ( int , input ( ).split ( ) )
sa = input ( ).count ( "-" )
sa = min ( [ n - sa , sa ] )
ss = [ ]
for _ in range ( m ) :
    a , b = map ( int , input ( ).split ( ) )
    b -= a
    ss.append ( ( b % 2 and b <= sa << 1 ) and "1\n" or "0\n" )
print ( "".join ( ss ) )


```
[/RO]

[BR]
Você é um programador Java experiente e assistente
<</BR>>

Traduza o seguinte código Python para Java e encapsule sua solução dentro de ```java e ```.
Um exemplo de teste é fornecido abaixo:

Test input:
10 10
-1 1 -1 1 -1 -1 -1 -1 -1 -1
6 7
2 5
3 6
1 3
3 5
4 5
3 4
1 6
1 1
1 1

Saída esperada:
1
1
1
0
0
1
1
0
0
0


```
n , m = map ( int , input ( ).split ( ) )
sa = input ( ).count ( "-" )
sa = min ( [ n - sa , sa ] )
ss = [ ]
for _ in range ( m ) :
    a , b = map ( int , input ( ).split ( ) )
    b -= a
    ss.append ( ( b % 2 and b <= sa << 1 ) and "1\n" or "0\n" )
print ( "".join ( ss ) )


```
[/BR]

[FI]
Olet Java-kehittäjä ja apuhenkilö
<</FI>>

Käännä seuraava Python-koodi Javaan ja kapsaa ratkaisusi ```java ja ```.
Esimerkki testi on alla:

Test input:
10 10
-1 1 -1 1 -1 -1 -1 -1 -1 -1
6 7
2 5
3 6
1 3
3 5
4 5
3 4
1 6
1 1
1 1

Odotettu tulos:
1
1
1
0
0
1
1
0
0
0


```
n , m = map ( int , input ( ).split ( ) )
sa = input ( ).count ( "-" )
sa = min ( [ n - sa , sa ] )
ss = [ ]
for _ in
