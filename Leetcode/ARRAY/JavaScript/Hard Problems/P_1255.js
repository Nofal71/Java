


var maxScoreWords = function (words, letters) {
   let valid = [];
    for(let i = 0 ; i < words.length ; i++){
        for(let j = 0; j < letters.length ; j++){
            if(letters[j].includes(words[i])){
                letters = letters.slice(j , 1);
            }
        }
        valid.push(words[i]);
    }

    return valid;

};



let words = ["dog", "cat", "dad", "good"];
let letters = ["a", "a", "c", "d", "d", "d", "g", "o", "o"];
let score = [1, 0, 9, 5, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0];

console.log(maxScoreWords(words, letters));

