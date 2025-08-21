script

var l = [];
var limit = 10000000000;
function gen(number, four, seven) {
    if (number > limit) {
        return;
    }
    if (number > 0 && four ==