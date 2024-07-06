"""
k番目にxを挿入
"""
n, k, x = map(int,input().split())
a_list = list(map(int,input().split()))
a_list.insert(k,x)
print(*a_list)