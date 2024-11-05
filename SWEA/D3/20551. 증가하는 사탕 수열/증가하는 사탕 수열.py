T = int(input())
for test_case in range(1, T + 1):
    arr = list(map(int, input().split()))
    cnt = 0
    
    while arr[2] <= arr[1]:
        arr[1] -= 1
        cnt += 1

    while arr[1] <= arr[0]:
        arr[0] -= 1
        cnt += 1
        
    if arr[0] == 0 or arr[1] == 0 or arr[2] == 0:
        cnt = - 1
        
    print(f'#{test_case} {cnt}')
        