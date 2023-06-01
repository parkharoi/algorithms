function solution(s1, s2) {
    array = s1.filter(it=> s2.includes(it))
    return array.length
}