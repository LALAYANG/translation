
[ENG]
You are an expert Java programmer and assistant
<</ENG>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
2
7 1

Expected output:
0


```
def main ( ) :
    input ( )
    return nPairsWithCommonFX ( map ( int , input ( ).split ( ) ) )
def nPairsWithCommonFX ( sequence ) :
    storage = { }
    FXs = [ ]
    for value in sequence :
        y = f ( value )
        if y not in storage :
            storage [ y ] = [ value ]
            FXs.append ( y )
        else :
            storage [ y ].append ( value )
    return ( sum ( len ( storage [ y ] ) * len ( storage [ y ] ) for y in FXs ) - sum ( len ( storage [ y ] ) for y in FXs ) ) // 2
def f ( n ) :
    y = 1
    while n != 1 :
        if n % 2 :
            y += 1
        n //= 2
    return y
if __name__ == '__main__' :
    print ( main ( ) )


```
[/ENG]

[/JP]

[/RU]

[/ZH]

[/CZ]

[/PL]

[/BG]

[/DE]

[/RO]

[/PT]

[/ES]

[/FR]

[/IT]

[/NL]

[/HU]

[/TR]

[/SV]

[/FI]

[/NO]

[/DA]

[/PT_BR]

[/SK]

[/SL]

[/SR]

[/HR]

[/HE]

[/AR]

[/EL]

[/CA]

[/KO]

[/JA]

[/LT]

[/VI]

[/TH]

[/ID]

[/MS]

[/MY]

[/KA]

[/GU]

[/TA]

[/TE]

[/ML]

[/SI]

[/SW]

[/KN]

[/MR]

[/HI]

[/GL]

[/AF]

[/BN]

[/CA]

[/ZH_TW]

[/JA_JP]

[/KO_KR]

[/ZH_CN]

[/ZH_HK]

[/ZH_MO]

[/ZH_SG]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH_TW]

[/ZH
