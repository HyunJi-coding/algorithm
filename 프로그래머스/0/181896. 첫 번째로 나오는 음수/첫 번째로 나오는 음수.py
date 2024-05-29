def solution(num_list):
    answer = 0
    for i in range(len(num_list)):
        if num_list[i]<0:
            answer = i+1
            break;
    
    if answer == 0:
        answer = -1
    
    if answer != -1:
        answer = answer-1
    return answer