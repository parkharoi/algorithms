function solution(age) {
    let answer = []
    let english = ['a','b','c','d','e','f','g','h','i','j']
    let str = age.toString().split("")
    let num = str.map(Number)
    for (let i=0; i<num.length; i++) {
        answer.push(english[num[i]])
    }
    return answer.join('')
} 