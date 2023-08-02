function solution(n, arr1, arr2) {
    let answer = [];

    for (let i = 0; i < n; i++) {
        let binarySum = (arr1[i] | arr2[i]).toString(2).padStart(n, '0');
        let rowString = '';

        for (let j = 0; j < n; j++) {
            rowString += binarySum[j] === '1' ? '#' : ' ';
        }

        answer.push(rowString);
    }

    return answer;
}
                      