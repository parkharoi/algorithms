function solution(arr)
{
    const uniqueArr = []
    for (let i = 0; i<arr.length; i++){
        if (arr[i-1] !== arr[i]) {
            const count = uniqueArr.push(arr[i])
        }
    }
    return uniqueArr
}