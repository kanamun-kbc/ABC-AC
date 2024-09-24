"""
n人の人がt以上の髪の長さになるのがp人以上になる日後
1日ごとに1ずつ増える
"""

n, t, p = map(int,input().split())
l_list = list(map(int,input().split()))
result = 0
count = len(list(filter(lambda x: x >= t, l_list)))
if count >= p:
    print(0)
    exit()
while 1:
    result += 1
    l_list = [l + 1 for l in l_list]
    count = len(list(filter(lambda x: x >= t, l_list)))
    if count >= p:
        break
print(result)