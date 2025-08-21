script
function compareStringCounts(s, t) {
    const sortedSourceCounts = [...s].sort((a, b) => a.localeCompare(b)).reduce((acc, cur) => {
        if (cur === 'c') {
            acc[0]++;
        } else if (cur === 'e') {
            acc[1]++;
        } else if (cur === 'a') {
            acc[2]++;
        } else if (cur === 'd') {
            acc[3]++;
        } else if (cur === 'f') {
            acc[4]++;
        } else if (cur === 'b') {
            acc[5]++;
        }
        return acc;
    }, [0, 0, 0, 0, 0, 0]);
    const sortedTargetCounts = [...t].sort((a, b) => a.localeCompare(b)).reduce((acc, cur) => {
        if (cur === 'c') {
            acc[0]++;
        } else if (cur === 'e') {
            acc[1]++;
        } else if (cur === 'a') {
            acc[2]++;
        } else if (cur === 'd') {
            acc[3]++;
        } else if (cur === 'f') {
            acc[4]++;
        } else if (cur === 'b') {
            acc[5]++;
        }
        return acc;
    }, [0, 0, 0, 0, 0, 0]);
    return sortedSourceCounts.join('') === sortedTargetCounts.join('') ? 'Yes' : 'No';
}

function main() {
    const s = readLine();
    const t = readLine();
    console.log(compareStringCounts(s, t));
}