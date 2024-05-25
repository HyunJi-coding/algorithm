def solution(num_list, n):
    answer = []
    i = 0
    while True:

        answer.append(num_list[i])
        i = i + n
        if i >= len(num_list):
            break;
        
    return answer