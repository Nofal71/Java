var numberOfSubarrays = function (nums, k) {
    let Arr = nums.map((e) => e % 2 === 0 ? 0 : 1);
    let n = Arr.length , ans = 0;
    let cnt = new Array(n + 1).fill(0);
    cnt[0] = 1;
    let oddCount = 0;
    for (let i = 0; i < n; i++) {
        oddCount += Arr[i];
        if (oddCount >= k) {
            ans += cnt[oddCount - k];
        }
        cnt[oddCount]++;
    }

    return ans;
};

const nums = [2, 2, 2, 1, 2, 2, 1, 2, 2, 2];
const k = 2;
console.log(numberOfSubarrays(nums, k)); 
