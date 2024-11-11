T = int(input())
for test_case in range(1, T + 1):
    # 주차 공간 수 n, 차량 수 m 입력
    n, m = map(int, input().split())
    
    # 단위 무게당 요금 Ri 입력
    rates = [int(input()) for _ in range(n)]
    
    # 차량 무게 Wi 입력
    weights = [int(input()) for _ in range(m)]
    
    # 주차장 상태와 대기열 초기화
    parking_lot = [None] * n  # None은 빈 주차 공간을 의미
    waiting_queue = []
    
    # 총 비용 초기화
    total_income = 0
    
    # 차량 입출력 처리
    for _ in range(2 * m):
        x = int(input())
        if x > 0:  # 차량 입장
            vehicle_index = x - 1
            parked = False
            for i in range(n):
                if parking_lot[i] is None:  # 빈 공간 찾기
                    parking_lot[i] = vehicle_index
                    total_income += rates[i] * weights[vehicle_index]
                    parked = True
                    break
            if not parked:  # 빈 공간이 없으면 대기열에 추가
                waiting_queue.append(vehicle_index)
        else:  # 차량 퇴장
            vehicle_index = -x - 1
            for i in range(n):
                if parking_lot[i] == vehicle_index:  # 해당 차량 위치 찾기
                    parking_lot[i] = None
                    if waiting_queue:  # 대기 중인 차량이 있다면 입장 처리
                        next_vehicle = waiting_queue.pop(0)
                        parking_lot[i] = next_vehicle
                        total_income += rates[i] * weights[next_vehicle]
                    break

    print(f'#{test_case} {total_income}')