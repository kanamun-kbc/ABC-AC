n, x, y, z = map(int,input().split())
a = x - z
b = y - z
if (a > 0 and b > 0) or (a < 0 and b < 0):
    print("No")
else:
    print("Yes")