script

'use strict'

const fs = require('fs')

process.stdin.resume()
process.stdin.setEncoding('utf-8')

let inputString = ''
let currentLine = 0

process.stdin.on('data', inputStdin => {
    inputString += inputStdin
})

process.stdin.on('end', _ => {
    inputString = inputString.trim().split('\n').map(string => {
        return string.trim()
    })

    main()
})

function readLine() {
    return inputString[currentLine++]
}

function sum(k) {
    let ret = 0
    let pw = 10
    let len = 1
    while (true) {
        let cur = Math.min(pw - 1, k)
        let prev = pw / 10
        ret += (cur - prev + 1) * len
        if (pw - 1 >= k) {
            break
        }
        len += 1
        pw *= 10
    }
    return ret
}

function main() {
    const ws = readLine().split(' ')
    const w = parseInt(ws[0], 10)
    const m = parseInt(ws[1], 10)
    const k = parseInt(ws[2], 10)

    let lo = 0
    let hi = 1e18
    while (hi - lo > 1) {
        let md = Math.floor((lo + hi) / 2)
        let c = sum(m + md - 1) - sum(m - 1)
        if (c * k <= w) {
            lo = md
        } else {
            hi = md
        }
    }
    console.log(lo)
}