def solution(k, tangerine):
    size_count_map = {}
    
    for size in tangerine:
        if size in size_count_map:
            size_count_map[size] += 1
        else:
            size_count_map[size] = 1
    
    count_list = sorted(size_count_map.values(), reverse=True)
    
    total = 0
    kinds = 0
    
    for count in count_list:
        total += count
        kinds += 1
        if total >= k:
            return kinds

    return kinds