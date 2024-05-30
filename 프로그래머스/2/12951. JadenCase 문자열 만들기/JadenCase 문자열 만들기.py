def solution(s):
    words = s.split(' ')
    jaden_case_words = []
    
    for word in words:
        if word:
            jaden_case_word = word[0].upper() + word[1:].lower()
        else:
            jaden_case_word = word
        jaden_case_words.append(jaden_case_word)
    
    return ' '.join(jaden_case_words)