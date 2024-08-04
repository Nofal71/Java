

var plusOne = function (digits) {

    let ans = ++digits[digits.length - 1]
    ans = ans.toString().includes('0')
    if (!ans) return digits
    let a = digits[digits.length - 1]
    digits.pop()
    let n = a.toString().split('').map(Number);
    n.forEach(e => digits.push(e))
    return digits

};



const digits = [4, 3, 2, 9]
console.log(plusOne(digits));

