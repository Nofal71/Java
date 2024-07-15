/**
 * @param {string[]} words
 * @return {number}
 */
var countPrefixSuffixPairs = function (words) {
    let i = 0, count = 0;
    while (i < words.length - 1) {
        let j = i + 1;
        while (j < words.length) {
            let isPrefix = Prefix(words[i], words[j]);
            if (!isPrefix) {
                j++;
                continue;
            }
            let isSuffix = Suffix(words[i], words[j]);
            if (!isSuffix) {
                j++;
                continue;
            }
            count++;
            j++;
        }
        i++;
    }

    return count;
};

let Prefix = (str1, str2) => {
    let length = str1.length;
    if (length > str2.length) return false;
    for (let k = 0; k < length; k++) {
        if (str2.charAt(k) !== str1.charAt(k)) {
            return false;
        }
    }
    return true;
};

let Suffix = (str1, str2) => {
    let length = str1.length;
    if (length > str2.length) return false;
    for (let k = 0; k < length; k++) {
        if (str2.charAt(str2.length - length + k) !== str1.charAt(k)) {
            return false;
        }
    }
    return true;
};

let words = ["a", "aba", "ababa", "aa"];
console.log(countPrefixSuffixPairs(words)); 
