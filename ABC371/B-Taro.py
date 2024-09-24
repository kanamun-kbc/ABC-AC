"""
長男かどうか
"""
n, m = map(int,input().split())
house = [0] * n
for i in range(m):
    a, b = map(str,input().split())
    if b == "F":
        print("No")
        continue
    if house[int(a)-1] == 1:
        print("No")
    else:
        print("Yes")
        house[int(a)-1] = 1