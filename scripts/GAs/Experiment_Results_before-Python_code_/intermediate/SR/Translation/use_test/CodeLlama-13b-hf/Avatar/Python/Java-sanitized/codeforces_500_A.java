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
    const t = parseInt(readline(), 10);
    const s = readline().split(' ').map(x => parseInt(x, 10));
    let currentCell = 0;
    while (currentCell <= t) {
        currentCell += s[currentCell - 1];
        if (currentCell === t) {
            console.log('YES');
            return;
        }
    }
    console.log('NO');
}