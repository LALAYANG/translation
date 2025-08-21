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
    const arr = readline().split(' ').map(x => parseInt(x, 10));
    for (let i = 0; i < n; i++) {
        for (let j = 0; j < n; j++) {
            if (i === j) {
                continue;
            }
            for (let k = 0; k < n; k++) {
                if (arr[k] !== arr[j] && arr[k] !== arr[i] && arr[k] === arr[i] + arr[j]) {
                    console.log(k + 1, j + 1, i + 1);
                    process.exit(0);
                }
            }
        }
    }
    console.log(-1);
}