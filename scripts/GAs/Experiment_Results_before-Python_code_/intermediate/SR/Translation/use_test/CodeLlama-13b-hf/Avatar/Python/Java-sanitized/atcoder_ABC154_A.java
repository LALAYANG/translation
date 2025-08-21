script
'use strict';

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', inputStdin => {
    inputString += inputStdin;
});

process.stdin.on('end', _ => {
    inputString = inputString.trim().split('\n').map(string => {
        return string.trim();
    });

    main();
});

function readline() {
    return inputString[currentLine++];
}

function main() {
    const S = readline();
    const T = readline();
    const A = parseInt(readline(), 10);
    const B = parseInt(readline(), 10);
    const U = readline();
    if (S === U) {
        A--;
    }
    if (T === U) {
        B--;
    }
    console.log(A + ' ' + B);
}