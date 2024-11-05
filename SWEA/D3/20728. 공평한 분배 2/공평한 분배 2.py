T=int(input())

for test_case in range(1,T+1):
    N, K = map(int,input().split())
    candy = list(map(int,input().split()))
    candy.sort()
    answer=100000000000
    for i in range(0,N-K+1):
        diff = candy[i+K-1]-candy[i] 
        answer = min(diff,answer)
    print(f"#{test_case}",answer)

