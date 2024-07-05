"""
クエリ1:リストにvalue追加
クエリ2:リストの最後からvalue番目を参照
"""
n = int(input())
l = []
for i in range(n):
    key, value = map(int,input().split())
    match key:
        case 1:
            l.append(value)
        case 2:
            print(l[-value])