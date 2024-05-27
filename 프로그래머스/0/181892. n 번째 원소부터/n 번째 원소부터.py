def solution(num_list, n):
    answer = []
    i = n-1
    while True:
        if i == len(num_list):
            break;
        answer.append(num_list[i])
        i = i +1
    return answer