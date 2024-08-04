
var maxFrequencyElements = function (nums) {

    let mostFrequency = 0;
    let removeDuplicates = [];
    let sum = 0;

    for (let i = 0; i < nums.length; i++) {

        let isPresent = removeDuplicates.includes(nums[i]);

        if (!(isPresent)) {
            let frequency = 0;
            for (let j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    frequency++;
                }
            }
            removeDuplicates.push(nums[i]);
            if (mostFrequency < frequency) {
                mostFrequency = frequency;
            }
        }
    }

    
    for(let i = 0 ; i < removeDuplicates.length ; i++){
        let current = removeDuplicates[i];
        let count = 0;

        for(let j = 0 ; j < nums.length ; j++){
            if(current == nums[j]){
                count++;
            }
        }
        if(count == mostFrequency){
            sum += count;
        }
    }

    return sum;

};