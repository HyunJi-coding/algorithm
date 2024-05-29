def solution(start, end_num):
    answer = []
    
    while True:
        
        if start == end_num-1:
            break;
        else:
            answer.append(start)
            
        start = start-1
    return answer