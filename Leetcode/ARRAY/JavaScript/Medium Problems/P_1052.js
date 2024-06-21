var maxSatisfied = function(customers, grumpy, minutes) {
    let satisfied = 0;
    
    for (let i = 0; i < customers.length; i++) {
        if (grumpy[i] === 0) {
            satisfied += customers[i];
        }
    }
    
    let max = 0;
    let index = 0;
    while (index <= customers.length - minutes) {
        let gain = 0;
        
        for (let i = index; i < index + minutes; i++) {
            if (grumpy[i] === 1) {
                gain += customers[i];
            }
        }
        
        if (max < gain) {
            max = gain;
        }
        
        index++;
    }
    
    return max + satisfied;
};

let  customers = [1,0,1,2,1,1,7,5], grumpy = [0,1,0,1,0,1,0,1], minutes = 3;
console.log(maxSatisfied(customers, grumpy, minutes)); 
