"""
正整数Mが与えられ、N個の3進数で表す。3に対する指数部分も列挙
"""
M = int(input())
A = []
while M > 0:
    a = 0
    while 3 ** (a + 1) <= M:
        a += 1
    A.append(a)
    M -= 3**a
print(len(A))
print(*A)

"""
お手本1: pythonの進数変換でのやり方
import numpy as np

M = int(input())
t = np.base_repr(M,3)[::-1]
A = []
for i in range(len(t)):
    for _ in range(int(t[i])):
        A.append(i)
print(len(A))
print(*A)
"""