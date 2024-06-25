"""
10で割った値以上で、最小の整数
"""

value = int(input())
quotient = value // 10
remainder = value % 10

if remainder != 0:
    quotient += 1

print(quotient)

"""
お手本3通り
①
print((int(input()) + 9) // 10)

②
x = int(input())
print(-(-x // 10))

③
x = int(input())
print((x-1)//10+1)
"""