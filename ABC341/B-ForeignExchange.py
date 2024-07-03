"""
n国分の各通貨money
i国のmoneyをs使うとi+1国の通貨をtもらえる
n国のmoneyの最大値
"""

n = int(input())
money = list(map(int,input().split()))
st = [list(map(int,input().split())) for _ in range(n-1)]
reward = 0 # 引き継ぐお金
for i in range(n):
    money[i] += reward
    if i == n-1:
        break
    count = money[i] // st[i][0] # 各支払回数
    reward = count * st[i][1]
print(money[-1])