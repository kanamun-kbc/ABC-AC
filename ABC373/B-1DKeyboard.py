"""
A～Zの文字でできた文字列、AからZへ順番に指差していったら合計の距離は？
"""
s = list(input())
print(sum(abs(s.index(chr(65+i)) - s.index(chr(66+i))) for i in range(25)))