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
    const t = parseInt(readline(), 10);

    for (let i = 0; i < t; i++) {
        const n = parseInt(readline(), 10);
        console.log(solve(n));
    }
}

function solve(n) {
    let s = (1 + n) * n / 2;
    let t = 1;
    while (t <= n) {
        s -= 2 * t;
        t *= 2;
    }
    return s;
}