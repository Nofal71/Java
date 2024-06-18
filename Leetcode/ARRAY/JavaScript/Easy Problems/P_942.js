
var diStringMatch = function (s) {
    let ss = s.split('');
    let n = s.length;
    let prem = [];
    let ind = ss.map((e, index) => {
        return index;
    })
    ind.push(n);
    for (let i = 0; i < n; i++) {
        if (s.charAt(i) == "I") {
            let max = n;
            ind.forEach(element => {
                if (max > element) {
                    max = element;
                }
            });
            ind.splice(ind.indexOf(max), 1);
            prem[i] = max;
        } else {
            let max = 0;
            ind.forEach(element => {
                if (max < element) {
                    max = element;
                }
            });
            ind.splice(ind.indexOf(max), 1);
            prem[i] = max;
        }
    }
    prem.push(ind[0]);
    return prem;
};

let s = "III";
console.log(diStringMatch(s));