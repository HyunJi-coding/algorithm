def solution(n):
    number_list = [int(digit) for digit in str(n)]
    number_list.sort(reverse=True)
    return int(''.join(map(str, number_list)))