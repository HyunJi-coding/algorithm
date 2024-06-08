def is_group_word(word):
    visited = set()
    last_char = ''
    
    for char in word:
        if char != last_char:
            if char in visited:
                return False
            visited.add(char)
            last_char = char
    
    return True

def count_group_words():
    n = int(input().strip())
    words = [input().strip() for _ in range(n)]
    
    count = 0
    for word in words:
        if is_group_word(word):
            count += 1
    
    return count

if __name__ == "__main__":
    print(count_group_words())