def solution(s):
    answer = ''
    numbers = s.split()
    numberslist = list(map(int, numbers))
    
    
    return f"{min(numberslist)} {max(numberslist)}"