def solution(s):
    cnt = 0
    i = 0
    
    while True:
        
        if cnt < 0:
            return False
            
        if s[i] == "(":
            cnt = cnt + 1
        if s[i] == ")":
            cnt = cnt - 1
            
        i = i + 1
        if i >= len(s):
            break;
        
    
    if cnt != 0:
        return False
    else:
        return True