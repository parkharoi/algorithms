function solution(n, m) {
    // 최대 공약수 계산
    function gcd(a, b) {
        if (b === 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    // 최소 공배수 계산
    function lcm(a, b) {
        return (a * b) / gcd(a, b);
    }

    // 최대 공약수와 최소 공배수 계산 및 배열에 담기
    var answer = [gcd(n, m), lcm(n, m)];
    
    return answer;
}

