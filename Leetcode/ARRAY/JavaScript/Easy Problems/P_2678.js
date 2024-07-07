/**
 * @param {string[]} details
 * @return {number}
 */
var countSeniors = function (details) {
    let ages = details.map(e => {
        let f = e.charAt(e.length - 3)
        let s = e.charAt(e.length - 4)
        return s + f;
    })

    let count = ages.filter(e => e > 60)
    return count.length
};



let details = ["7868190130M7522", "5303914400F9211", "9273338290F4010"];
console.log(countSeniors(details));