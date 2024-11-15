T = int(input())
# 여러개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
for test_case in range(1, T + 1):
    n = int(input())
    arr = list(input().split())

    if len(arr) % 2 == 0:
        h = n // 2
    else:
        h = (n // 2) + 1
    arr1 = arr[:h]
    arr2 = arr[h:]
    result = []
    for i in range(h):
        try:
            result.append(arr1[i])
        except IndexError:
            continue
        try:
            result.append(arr2[i])

        except IndexError:
            continue
    print(f'#{test_case}', end= ' ')
    print(' '.join(result))