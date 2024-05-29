def solution(n, k):
    answer = []
    i = 1
    n2 = 0
    while True:
        n2 = k*i
        i = i+1
        
        if n2 > n:
            break;
        answer.append(n2)
        
        
        
    return answer