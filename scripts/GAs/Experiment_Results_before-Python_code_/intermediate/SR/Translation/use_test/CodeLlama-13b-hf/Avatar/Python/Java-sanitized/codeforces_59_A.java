script

var txt = readline();
var cu = 0;
var cl = 0;
for (var i = 0; i < txt.length; i++) {
    if (txt[i] >= 'a' && txt[i] <= 'z') {
        cl++;
    } else {
        cu++;
    }
}
if (cu > cl) {
    out = txt.toUpperCase();
} else {
    out = txt.toLowerCase();
}
print(out);