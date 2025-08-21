
[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
115044
787430935 930572076
43293210 80222462
544493048 609541870
412754672 483376059
780622034 989357009
93681885 935237112
306850579 938607106
378774953 480709097
199784654 957170958
284499920 410154651
384984093 875737736
25220448 377189387
150920760 791475176
89273309 536110671
554904908 579287997
32428902 928194403
303050212 747191613
529396104 989591906
230052756 364631710
587252351 937463357
824706857 989715942
101176768 867225143
181947606 214386621
175612007 676265585
19349844 982226250

Expected output:
825123302


```
def resolve ( ) :
    n = int ( input ( ) )
    low = [ ]
    high = [ ]
    for i in range ( n ) :
        a , b = map ( int , input ( ).split ( ) )
        low.append ( a )
        high.append ( b )
    low.sort ( )
    high.sort ( )
    if n % 2 :
        print ( high [ ( n + 1 ) // 2 - 1 ] - low [ ( n + 1 ) // 2 - 1 ] + 1 )
    else :
        hh = ( high [ ( n ) // 2 - 1 ] + high [ ( n ) // 2 ] ) / 2
        ll = ( low [ ( n ) // 2 - 1 ] + low [ ( n ) // 2 ] ) / 2
        print ( int ( ( hh - ll ) * 2 ) + 1 )
if __name__ == "__main__" :
    resolve ( )


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
115044
787430935 930572076
43293210 80222462
544493048 609541870
412754672 483376059
780622034 989357009
93681885 935237112
306850579 938607106
378774953 480709097
199784654 957170958
284499920 410154651
384984093 875737736
25220448 377189387
150920760 791475176
89273309 536110671
554904908 579287997
32428902 928194403
303050212 747191613
529396104 989591906
230052756 364631710
587252351 937463357
824706857 989715942
101176768 867225143
181947606 214386621
175612007 676265585
19349844 982226250

Expected output:
825123302


```
def resolve ( ) :
    n = int ( input ( ) )
    low = [ ]
    high = [ ]
    for i in range ( n ) :
        a , b = map ( int , input ( ).split ( ) )
        low.append ( a )
        high.append ( b )
    low.sort ( )
    high.sort ( )
    if n % 2 :
        print ( high [ ( n + 1 ) // 2 - 1 ] - low [ ( n + 1 ) // 2 - 1 ] + 1 )
    else :
        hh = ( high [ ( n ) // 2 - 1 ] + high [ ( n ) // 2 ] ) / 2
        ll = ( low [ ( n ) // 2 - 1 ] + low [ ( n ) // 2 ] ) / 2
        print ( int ( ( hh - ll ) * 2 ) + 1 )
if __name__ == "__main__" :
    resolve ( )


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
115044
787430935 930572076
43293210 80222462
544493048 609541870
412754672 483376059
780622034 989357009
93681885 935237112
306850579 938607106
378774953 480709097
199784654 957170958
284499920 410154651
384984093 875737736
25220448 377189387
150920760 791475176
89273309 536110671
554904908 579287997
32428902 928194403
303050212 747191613
529396104 989591906
230052756 364631710
587252351 937463357
824706857 989715942
101176768 867225143
181947606 214386621
175612007 676265585
19349844 982226250

Expected output:
825123302


```
def resolve ( ) :
    n = int ( input ( ) )
    low = [ ]
    high = [ ]
    for i in range ( n ) :
        a , b = map ( int , input ( ).split ( ) )
        low.append ( a )
        high.append ( b )
    low.sort ( )
    high.sort ( )
    if n % 2 :
        print ( high [ ( n + 1 ) // 2 - 1 ] - low [ ( n + 1 ) // 2 - 1 ] + 1 )
    else :
        hh = ( high [ ( n ) // 2 - 1 ] + high [ ( n ) // 2 ] ) / 2
        ll = ( low [ ( n ) // 2 - 1 ] + low [ ( n ) // 2 ] ) / 2
        print ( int ( ( hh - ll ) * 2 ) + 1 )
if __name__ == "__main__" :
    resolve ( )


```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
115044
787430935 930572076
43293210 80222462
544493048 609541870
412754672 483376059
780622034 989357009
93681885 935237112
306850579 938607106
378774953 480709097
199784654 957170958
284499920 410154651
384984093 875737736
25220448 377189387
150920760 791475176
89273309 536110671
554904908 579287997
32428902 928194403
303050212 747191613
529396104 989591906
230052756 364631710
587252351 937463357
824706857 989715942
101176768 867225143
181947606 214386621
175612007 676265585
19349844 982226250

Expected output:
825123302


```
def resolve ( ) :
    n = int ( input ( ) )
    low = [ ]
    high = [ ]
    for i in range ( n ) :
        a , b = map ( int , input ( ).split ( ) )
        low.append ( a )
        high.append ( b )
    low.sort ( )
    high.sort ( )
    if n % 2 :
        print ( high [ ( n + 1 ) // 2 - 1 ] - low [ ( n + 1 ) // 2 - 1 ] + 1 )
    else :
        hh = ( high [ ( n ) // 2 - 1 ] + high [ ( n ) // 2 ] ) / 2
        ll = ( low [ ( n ) // 2 - 1 ] + low [ ( n ) // 2 ] ) / 2
        print ( int ( ( hh - ll ) * 2 ) + 1 )
if __
