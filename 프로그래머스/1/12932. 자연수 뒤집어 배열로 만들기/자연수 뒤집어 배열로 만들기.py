def solution(n):
    answer = []
    n = str(n)
    n_list = list(n)
    
    for i in n_list[::-1]:
        answer.append(int(i))
        
    return answer