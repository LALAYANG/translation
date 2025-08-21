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
    const n = parseInt(readline(), 10);
    const number = readline().split(' ').map(Number);
    let h1 = 0;
    let h2 = 0;
    let x = 0;
    for (let i = 0; i < n; i++) {
        if (number[i] !== 4 && number[i] !== 7) {
            console.log('NO');
            x += 1;
            break;
        }
        if (i < n / 2) {
            h1 += number[i];
        } else {
            h2 += number[i];
        }
    }
    if (x === 0) {
        if (h1 === h2) {
            console.log('YES');
        } else {
            console.log('NO');
        }
    }
}