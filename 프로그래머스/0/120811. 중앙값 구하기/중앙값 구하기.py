def solution(array):
    array.sort()
    answer = array[len(array) // 2]
    if answer == -1 :
        answer = 0 
           
    return answer