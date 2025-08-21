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
    const s = parseInt(readline(), 10);
    let c = 0;
    for (let i = 0; i < n; i++) {
        const [f, t] = readline().split(' ').map(x => parseInt(x, 10));
        const x = t - (s - f);
        if (x > c) {
            c = x;
        }
    }
    console.log(s + c);
}