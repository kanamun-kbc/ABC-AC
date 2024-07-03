n = int(input())
p_list = list(map(int,input().split()))
p = int(input())
for i in range(p):
    a, b = map(int,input().split())
    print(p_list[min(p_list.index(a),p_list.index(b))])