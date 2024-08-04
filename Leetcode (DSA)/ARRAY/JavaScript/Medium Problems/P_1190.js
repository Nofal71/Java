/**
 * @param {string} s
 * @return {string}
 */
var reverseParentheses = function (s) {
    
    while (s.includes('(')) {
        let rightBracket = 0, leftBracket = 0;

        for (let j = 0; j < s.length; j++) {
            if (s.charAt(j) == ')') {
                leftBracket = j;
                break;
            }
        }
        for (let j = leftBracket; j >= 0; j--) {
            if (s.charAt(j) == '(') {
                rightBracket = j;
                break;
            }
        }
        let sub = s.substring(rightBracket + 1, leftBracket);
        let reverse = sub.split('').reverse().join('');
        s = s.slice(0, rightBracket) + reverse + s.slice(leftBracket + 1);
    }
        
    return s
};

let s = "ta()usw((((a))))"
console.log(reverseParentheses(s));

