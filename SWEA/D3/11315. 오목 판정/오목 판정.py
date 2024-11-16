T = int(input())
for test_case in range(1, T + 1):
    n = int(input())
    arr = [list(input()) for _ in range(n)]
    answer = "NO"

    for i in range(n):
        for j in range(n):
            if arr[i][j] == 'o':
                # 세로 방향 (아래로 5칸)
                if i + 4 < n:
                    cnt = 0
                    for k in range(5):
                        if arr[i + k][j] == 'o':
                            cnt += 1
                    if cnt == 5:
                        answer = "YES"
                        break

                # 가로 방향 (오른쪽으로 5칸)
                if j + 4 < n:
                    cnt2 = 0
                    for k in range(5):
                        if arr[i][j + k] == 'o':
                            cnt2 += 1
                    if cnt2 == 5:
                        answer = "YES"
                        break

                # 대각선 방향 (우하향 대각선, 오른쪽 아래로 5칸)
                if i + 4 < n and j + 4 < n:
                    cnt3 = 0
                    for k in range(5):
                        if arr[i + k][j + k] == 'o':
                            cnt3 += 1
                    if cnt3 == 5:
                        answer = "YES"
                        break

                # 반대 대각선 방향 (우상향 대각선, 오른쪽 위로 5칸)
                if i - 4 >= 0 and j + 4 < n:
                    cnt4 = 0
                    for k in range(5):
                        if arr[i - k][j + k] == 'o':
                            cnt4 += 1
                    if cnt4 == 5:
                        answer = "YES"
                        break
      

    print(f"#{test_case} {answer}")