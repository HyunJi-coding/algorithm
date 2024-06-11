def solution(s: str) -> list:
    count_transforms = 0
    count_zeros_removed = 0
    
    while s != "1":
        count_zeros_removed += s.count('0')
        s = s.replace('0', '')
        s = bin(len(s))[2:]
        count_transforms += 1
        
    return [count_transforms, count_zeros_removed]