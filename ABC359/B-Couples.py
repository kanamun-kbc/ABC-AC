"""
1個空きのペアが何個あるか
"""
n = int(input())
a_list = list(map(int,input().split()))
res = 0
for i in range(2*n-2):
    if a_list[i] == a_list[i+2]:
        res += 1
print(res)