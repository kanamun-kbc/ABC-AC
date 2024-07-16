"""
3点の(x,y)座標が与えられ、その点をつないでできた三角形が直角三角形かどうか
"""
x1, y1 = map(int,input().split())
x2, y2 = map(int,input().split())
x3, y3 = map(int,input().split())
dist_pow = sorted([(x1-x2)**2 + (y1-y2)**2, (x1-x3)**2 + (y1-y3)**2, (x2-x3)**2 + (y2-y3)**2])
# print(dist_pow)
b = dist_pow[0] + dist_pow[1] == dist_pow[2]
print("Yes" if b else "No")