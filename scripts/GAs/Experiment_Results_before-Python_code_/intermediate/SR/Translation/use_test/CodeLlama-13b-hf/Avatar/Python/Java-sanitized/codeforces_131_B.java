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
    const w = readline().split(' ').map(Number);
    let c = 0;
    for (let i = 0; i < n; i++) {
        if (w[i] === 0) {
            c += w[i] * (w[i] - 1);
        } else {
            if (w.indexOf(-w[i]) !== -1) {
                c += w[i] * w[w.indexOf(-w[i])];
            }
        }
    }
    console.log(c / 2);
}