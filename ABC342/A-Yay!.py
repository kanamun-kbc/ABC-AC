# 文字列 S の入力を受け取る
s = input()

# 文字列の各文字をチェックする
for i in range(len(s)):
    # 異なる文字の位置を特定
    if s.count(s[i]) == 1:
        print(i + 1)
        break
