def solution(numer1, denom1, numer2, denom2):
    denom = denom1 * denom2
    numer = numer1 * denom2 + numer2 * denom1
    
    def gcd(a,b) :
        while b :
            a, b = b, a % b
        return a

    common = gcd(numer, denom)

    return [numer//common, denom//common ]