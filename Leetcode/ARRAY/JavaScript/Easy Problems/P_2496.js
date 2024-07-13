/**
 * @param {string[]} strs
 * @return {number}
 */
var maximumValue = function (strs) {
    let maxValue = 0
    for (let i = 0; i < strs.length; i++) {
        let str = strs[i];
        let haveAlphabet = false;
        for (let j = 0; j < str.length; j++) {
            let char = str.charAt(j);
            if (isNaN(char)) {
                haveAlphabet = true;
                break;
            }
        }
        if (haveAlphabet) value = strs[i].length;
        else value = parseFloat(strs[i])
        if (maxValue < value) maxValue = value
    }
    return maxValue
};


let strs = ["alic3", "bob", "3", "4", "00000"]
console.log(maximumValue(strs));