var maxFrequencyElements = function (nums) {

    let frequencies = [];

       let index = 0;
    for (let i = 0; i < nums.length; i++) {

        let freq = 0;
        for (let j = 0; j < nums.length; j++) {
            if (nums[i] == nums[j]) {
                freq++;
            }
        }
        let remove = nums.indexOf(nums[i]);
        nums.splice(remove, 1);
        frequencies[index] = freq;
        index++;

    }


    let max = 0;

    for (let i = 0; i < frequencies.length; i++) {
        if (max < frequencies[i]) {
            max = frequencies[i];
        }
    }

    let sum = 0;

    for (let i = 0; i < frequencies.length; i++) {
        if (max == frequencies[i]) {
            sum += frequencies[i];
        }
    }

    return frequencies;

};


let nums = [1, 2, 2, 3, 1, 4];

console.log(maxFrequencyElements(nums));