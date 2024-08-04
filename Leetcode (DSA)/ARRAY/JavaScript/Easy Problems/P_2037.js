
var minMovesToSeat = function (seats, students) {
    seats.sort();
    students.sort();
    let movesCount = 0;
    let n = seats.length;
    for (let i = 0; i < n; i++) {
        movesCount += Math.abs(students[i] - seats[i]);
    }

    return movesCount;
};
let seats = [4, 1, 5, 9], students = [1, 3, 2, 6];
console.log(minMovesToSeat(seats, students));