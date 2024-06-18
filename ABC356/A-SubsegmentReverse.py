n, l, r = list(map(int, input().split()))

# nは値の最大値
# lは値が変わる初めの数
# rは値が変わり終わる数
result = []
dist = r - l
x = 0
for i in range(1,n+1,1):
    if l <= i and i <= r and dist != -1:
        # print(f'dist確認--{dist}')
        result.append(r - x)
        x+=1
        dist-=1
    else:
        result.append(i)

# print(f'確認--{result}')

for j in range(0, n, 1):
    if j==n-1:
        print(result[j])
    else:
        print(f'{result[j]}',end=' ')
