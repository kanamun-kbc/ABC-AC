"""
初項a, 末項b, 公差d
"""
a, b, d = map(int,input().split())
n = (b - a) // d + 1
list_a = [a + i * d for i in range(n)]
print(*list_a)