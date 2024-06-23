var maxSatisfied = function (customers, grumpy, minutes) {
    let sat = customers.filter((e, index) => grumpy[index] != 1);
    let satisfied = 0;
    sat.forEach(element => {
        satisfied += element;
    });
    let max = 0;
    for (let index = 0; index <= customers.length - minutes; index++) {
        let gain = 0;
        for (let i = index; i < index + minutes; i++) {
            if (grumpy[i] === 1) {
                gain += customers[i];
            }
        }
        if (max < gain) {
            max = gain;
        }
    }
    return satisfied + max;
};

let customers = [1, 0, 1, 2, 1, 1, 7, 5], grumpy = [0, 1, 0, 1, 0, 1, 0, 1], minutes = 3;
console.log(maxSatisfied(customers, grumpy, minutes)); 
