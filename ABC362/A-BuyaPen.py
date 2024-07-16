"""
RGB色のペンの値段を渡され、C色以外で最小の値段
"""
rgb_money = list(map(int,input().split()))
color = ["Red","Green","Blue"]
rgb_money.pop(color.index(input()))
print(min(rgb_money))

"""
a = list(map(int, input().split()))
a.pop("RGB".index(input()[0]))
print(min(a))
"""