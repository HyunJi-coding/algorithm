T = int(input())
# 여러개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
for test_case in range(1, T + 1):
    # ///////////////////////////////////////////////////////////////////////////////////
    x, y, n = map(int, input().split())
    operations = 0
    while x <= n and y <= n:
        if x < y:
            x += y
        else:
            y += x
        operations += 1  
    

    print(f"{operations}")
        
        
    # ///////////////////////////////////////////////////////////////////////////////////
