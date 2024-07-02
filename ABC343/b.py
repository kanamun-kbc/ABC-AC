n = int(input())
list = [list(map(int,input().split())) for _ in range(n)]
for i in range(n):
    list2 = [j+1 for j in range(n) if list[i][j]]
    print(*list2)