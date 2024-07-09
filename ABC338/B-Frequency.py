"""
英小文字の入力から、頻出回数の一番多い文字の出力
"""
s = input()
f = [0] * 26
for c in s:
    f[ord(c)-ord('a')] += 1

c_index = f.index(max(f))
c_result = chr(c_index + ord('a'))
print(c_result)