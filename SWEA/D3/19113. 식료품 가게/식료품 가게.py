T = int(input())
# 여러개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
for test_case in range(1, T + 1):
    n = int(input())
    arr = list(map(int, input().split()))
    cnt = 0
    i = 0
    index = 0
    arr = arr[::-1]
    answer = []

    while 1:
        if n == cnt:
            break

        if arr[i] * 0.75 in arr and arr[i] != 0:
            arr[arr.index(arr[i] * 0.75)] = 0
            answer.append(int(arr[i] * 0.75))
            i += 1
            cnt += 1

        else:
            i += 1
            continue
    answer = answer[::-1]
    print(f'#{test_case}', end=' ')
    print(' '.join(map(str, answer)))

