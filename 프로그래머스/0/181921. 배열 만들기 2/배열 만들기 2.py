
def is_composed_of_5_and_0(number):
    number_str = str(number)
    for char in number_str:
        if char != '5' and char != '0':
            return False
    return True

def solution(l, r):
    result = []
    for number in range(l, r + 1):
        if is_composed_of_5_and_0(number):
            result.append(number)
    
    if not result:
        return [-1]
    
    return result

