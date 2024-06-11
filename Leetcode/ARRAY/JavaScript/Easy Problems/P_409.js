
var longestPalindrome = function (s) {
    let arr = [];
    let length = 0;

    for (let i = 0; i < s.length ; i++) {
        if (arr.includes(s.charAt(i))) {
            arr.splice(i, 1);
            length += 2;
        } else {
            arr.push(s.charAt(i));
        }
    }
    
    if(!(arr.length == 0)){
        length += 1;
    }
    
    return length;

};