def solution(num_list, n):
    answer = []
    i = 0
    while True:
        if i == n:
            break;
        answer = num_list[1:] + [num_list[0]]
        num_list = answer
        i=i+1
    return answer